package io.github.mat3e.model.projection;

import io.github.mat3e.model.Task;
import io.github.mat3e.model.TaskGroup;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupReadModel {
    private String description;

    // Deadline from the latest task in group
    private LocalDateTime deadline;
    private Set<GroupTaskReadModel> tasks;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public Set<GroupTaskReadModel> getTasks() {
        return tasks;
    }

    public void setTasks(Set<GroupTaskReadModel> tasks) {
        this.tasks = tasks;
    }

    public GroupReadModel(TaskGroup souce){
        description = souce.getDescription();
        souce.getTasks().stream()
                .map(Task::getDeadline)
                .max(LocalDateTime::compareTo)
                .ifPresent(date ->deadline = date);
        tasks = souce.getTasks().stream()
                .map(GroupTaskReadModel::new)
                .collect(Collectors.toSet());
    }
}
