#!/usr/bin/env python3
"""Extract WSDL type schemas using only Python's standard library."""
from pathlib import Path
from xml.dom import minidom

root = Path(__file__).resolve().parents[1] / 'specs' / '26.06' / 'wsdl'
for path in sorted(root.rglob('*.wsdl')):
    document = minidom.parse(str(path))
    for index, schema in enumerate(document.getElementsByTagNameNS(
            'http://www.w3.org/2001/XMLSchema', 'schema')):
        # Preserve namespace declarations inherited from wsdl:definitions.
        ancestor = schema.parentNode
        while ancestor.nodeType == ancestor.ELEMENT_NODE:
            for name, value in ancestor.attributes.items():
                if (name == 'xmlns' or name.startswith('xmlns:')) and not schema.hasAttribute(name):
                    schema.setAttribute(name, value)
            ancestor = ancestor.parentNode
        notices = ''.join(node.toxml() for node in document.childNodes
                          if node.nodeType == node.COMMENT_NODE)
        output = path.with_name(f'binding-{path.stem}-{index}.xsd')
        output.write_text('<?xml version="1.0" encoding="UTF-8"?>\n' + notices + '\n'
                          + schema.toxml() + '\n', encoding='utf-8')
