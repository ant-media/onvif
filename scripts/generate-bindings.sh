#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
python3 scripts/extract-schemas.py
mvn -B -Pgenerate-bindings generate-sources "$@"
python3 - <<'PY'
from pathlib import Path
source = Path('src/main/java')
generated = Path('target/generated-bindings')
if not list(generated.rglob('*.java')):
    raise SystemExit('No generated bindings found')
# Remove obsolete ONVIF model classes; leave handwritten client code alone.
for path in (source / 'org/onvif').rglob('*.java'):
    if not (generated / path.relative_to(source)).exists():
        path.unlink()
for path in generated.rglob('*.java'):
    destination = source / path.relative_to(generated)
    destination.parent.mkdir(parents=True, exist_ok=True)
    text = path.read_text(encoding="utf-8")
    destination.write_text("\n".join(line.rstrip() for line in text.splitlines()) + "\n", encoding="utf-8")
PY
