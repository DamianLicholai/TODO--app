package io.github.mat3e.model;

import org.hibernate.engine.profile.Fetch;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.security.PrivateKey;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tasks_groups")
public class TaskGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Tasks group's description must be not null")
    private String description;
    private boolean done;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private Set<Task> tasks;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Projects projects;

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public TaskGroup() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

     public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskGroup(String description, Set<Task> tasks) {
        this.description = description;
        this.tasks = tasks;
    }
}
