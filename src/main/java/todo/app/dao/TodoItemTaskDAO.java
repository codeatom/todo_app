package todo.app.dao;

import todo.app.model.TodoItemTask;

import java.util.List;

public interface TodoItemTaskDAO {
    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findById(int id);
    List<TodoItemTask> findAll();
    List<TodoItemTask> findByAssignedStatus(boolean status);
    List<TodoItemTask> findByPersonId(int id);
    void remove(int id);
}
