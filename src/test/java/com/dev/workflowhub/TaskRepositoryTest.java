package com.dev.workflowhub;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskRepositoryTest {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    void shouldSaveAndRetrieveTask() {
        Task task = new Task();
        task.setTitle("Repo test");
        task.setDescription("Unit test");
        task.setStatus("TODO");

        Task saved = taskRepository.save(task);
        assertNotNull(saved.getId());

        Task found = taskRepository.findById(saved.getId()).orElse(null);
        assertNotNull(found);
        assertEquals("Repo test", found.getTitle());
    }

    @Test
    void shouldDeleteTask() {
        Task task = new Task();
        task.setTitle("Delete me");
        task.setDescription("Test");
        task.setStatus("TODO");

        Task saved = taskRepository.save(task);
        Long id = saved.getId();

        taskRepository.deleteById(id);

        assertFalse(taskRepository.existsById(id));
    }

    @Test
    void shouldFindAllTasks() {
        Task task1 = new Task();
        task1.setTitle("Task A");
        task1.setDescription("First");
        task1.setStatus("TODO");

        Task task2 = new Task();
        task2.setTitle("Task B");
        task2.setDescription("Second");
        task2.setStatus("DONE");

        taskRepository.save(task1);
        taskRepository.save(task2);

        assertTrue(taskRepository.findAll().size() >= 2);
    }
}
