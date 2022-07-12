from flask import request

@app.route('/todo/api/v1.0/task',methos=['POST'])
def create_task():
    if not request.json or not 'title' in request.json:
        abort(400)
    task = {
        'id':tasks[-1]['id']+1,
        'title': request.json['title'],
        'desicriptio': request.json.get('description',""),
        'done':False
                                   
    }
    tasks.apperd(task)
    return jsonify({'task': tasks}),201