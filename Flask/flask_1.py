#!flask/bin/python
from flask import Flask

app =Fask(__name__)
@app.route('/')
def index():
    return"Bonjour Monsieur"
if __name__ == '__main':
    app.run(debug=true)