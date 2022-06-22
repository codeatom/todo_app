package todo.app.model;

public class TodoItemTask {
    private final int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(int id, TodoItem todoItem) {
        this.id = id;
        this.setTodoItem(todoItem);
    }

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(Person assignee) {
       if(assignee != null){
           this.assigned = true;
       }
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null){
            //todoItem id to be changed to a unique id when id generator is available
            this.todoItem = new TodoItem(1, null, null, null);
        }
        else {
            this.todoItem = todoItem;
        }
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public String getSummary() {
        return  "id: " + this.id +"\n"
                + "todoItem: " + this.todoItem +"\n"
                + "assignee: " + this.assignee +"\n"
                + "assigned: " + this.assigned +"\n";
    }
}
