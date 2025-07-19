public package com.taskmanager.service;

import com.taskmanager.model.Task;
import com.taskmanager.model.User;
import com.taskmanager.repository.TaskRepository;
import com.taskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired private TaskRepository taskRepo;
    @Autowired private UserRepository userRepo;

    public Task addTask(Task task, Long userId) {
        User user = userRepo.findById(userId).orElse(null);
        task.setUser(user);
        return taskRepo.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }
}
 {
    
}
