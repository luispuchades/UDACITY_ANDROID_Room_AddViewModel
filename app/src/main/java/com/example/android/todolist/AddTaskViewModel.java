package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

// TODO (5) / COMPLETED: Make this class extend ViewModel
public class AddTaskViewModel extends ViewModel {

    // TODO (6) / COMPLETED: Add a task member variable for the TaskEntry object wrapped in a
    // LiveData
    private LiveData<TaskEntry> task;

    // TODO (8) / COMPLETED: Create a constructor where you call loadTaskById of the taskDao to
    // initialize the tasks variable
    // Note: The constructor should receive the database and the taskId
    public AddTaskViewModel(AppDatabase database, int taskId) {
        task = database.taskDao().loadTaskById(taskId);
    }

    // TODO (7) / COMPLETED: Create a getter for the task variable
    public LiveData<TaskEntry> getTask() {
        return task;
    }
}
