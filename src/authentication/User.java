package authentication;
import java.lang.*;

import java.util.ArrayList;

import todolist.ToDoItem;

public class User {
    private String username;
    private String password;
    private ArrayList<ToDoItem> toDoItems;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.toDoItems = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the to-do items of the user.
     * @return A reference to the list of to-do items.
     */
    public ArrayList<ToDoItem> getToDoItems() {
        return toDoItems;
    }
}
