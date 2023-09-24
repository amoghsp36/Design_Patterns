package org.example.Generics;

import java.util.ArrayList;
import java.util.List;

public class Simple_To_Do_List {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("task1"));
        taskList.add(new Task("task2"));
        for (Task task : taskList) {
            System.out.println(task.getDescription());   //the output is of type Task
        }
    }
}

class Task{
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
