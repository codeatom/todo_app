package todo.app.model;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TodoItemTaskTest {
    @Test
    void should_Construct_A_TodoItemTask_Object() {
        //Arrange
        int id = 1;
        LocalDate todoDeadline = LocalDate.now();
        TodoItem todoItem = new TodoItem(1, "add test to assignment", "add test to array and string assignment", todoDeadline);

        //Act
        TodoItemTask todoItemTask = new TodoItemTask(1, todoItem);

        //Assert
        assertAll(
                () -> assertEquals(id, todoItemTask.getId()),
                () -> assertEquals(todoItem, todoItemTask.getTodoItem())
        );
    }

    @Test
    void should_Not_Construct_A_TodoItemTask_Object_With_Null_TodoItem() {
        //Arrange
        int id = 1;
        LocalDate todoDeadline = LocalDate.now();

        TodoItem expectedTodoItem = new TodoItem(1, null, null, null);

        //Act
        TodoItemTask todoItemTask = new TodoItemTask(1, null);

        //Assert
        assertAll(
                () -> assertEquals(id, todoItemTask.getId()),
                () -> assertEquals(expectedTodoItem.getId(), todoItemTask.getTodoItem().getId()),
                () -> assertEquals(expectedTodoItem.getTitle(), todoItemTask.getTodoItem().getTitle()),
                () -> assertEquals(expectedTodoItem.getTaskDescription(), todoItemTask.getTodoItem().getTaskDescription()),
                () -> assertEquals(expectedTodoItem.getDeadLine(), todoItemTask.getTodoItem().getDeadLine())
        );
    }

}