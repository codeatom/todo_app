package todo.app.model;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {
    private final int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine) {
        this.id = id;
        this.setTitle(title);
        this.taskDescription = taskDescription;
        this.setDeadLine(deadLine);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (isNullOrEmpty(title)) {
            this.title = "Title missing";
        }
        else {
            this.title = title;
        }
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null) {
            this.deadLine = LocalDate.now().plusDays(7);
        }
        else {
            this.deadLine = deadLine;
        }
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public boolean isOverdue(){
        LocalDate date = LocalDate.now();
        return date.isAfter(deadLine);
    }

    public String getSummary() {
        return  "id: " + this.id +"\n"
                + "creator: " + this.creator +"\n"
                + "title: " + this.title +"\n"
                + "taskDescription: " + this.taskDescription +"\n"
                + "deadline: " + this.deadLine +"\n"
                + "done: " + this.done +"\n";
    }

    public boolean isNullOrEmpty(String str) {
        if(str == null) { return true; }

        return str.trim().length() == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done && title.equals(todoItem.title) && Objects.equals(taskDescription, todoItem.taskDescription) && deadLine.equals(todoItem.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, taskDescription, deadLine, done);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                '}';
    }
}
