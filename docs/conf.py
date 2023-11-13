# Importowanie modułu Sphinx
import os
import sys

# Dodawanie ścieżki do sys.path (opcjonalne, w zależności od struktury projektu)
sys.path.insert(0, os.path.abspath('.'))

# Ustawienia dla Sphinx
project = 'ad_guziki'
author = 'Jerzy Kisielewski'
version = '1.0'
release = '1.0'

# Rozszerzenia Sphinx (opcjonalne)
extensions = [
    'sphinx.ext.duration',
    'sphinx.ext.doctest',
    'sphinx.ext.autodoc',
    'sphinx.ext.autosummary',
    'sphinx.ext.intersphinx',
]

# Ścieżki do plików źródłowych
source_suffix = ['.rst']
master_doc = 'index'

# Konfiguracja tematu (opcjonalna)
html_theme = 'sphinx_rtd_theme'

# Konfiguracja Read the Docs (opcjonalna)
html_baseurl = 'https://ad_guziki.readthedocs.io/'

# Opcjonalne ustawienia dodatkowe
# ...

# Konfiguracja dla Read the Docs
def setup(app):
    app.add_css_file('custom.css')  # Dodatkowy plik CSS (opcjonalny)
