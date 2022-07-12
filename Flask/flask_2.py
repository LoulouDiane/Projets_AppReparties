#!flask/bin/python
from flask import Flask
 
app =Fask(__name__)
tasks=[
    {
        'id':1,
        'title':u'Buy grocerles',
        'description':u'Milk, Cheese, Pizza, fruit, Tylenol',
        'done': False
    },
    {
        'id':2,
        'title':u'Learn Python',
        'description':u'Need to find a good tutorial on the web',
        'done': False
    }
]
@app.route('/todo/api/v1.0/task',method=['GET'])
def get_tasks():
    return jsonify({'task': tasks})

if __name__ == '__main':
    app.run(debug=true)