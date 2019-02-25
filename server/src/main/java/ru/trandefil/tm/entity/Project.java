package ru.trandefil.tm.entity;

import javax.persistence.*;

@Entity
@Table(name = "projects")
public class Project extends BaseNamedEntity {

    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Project() {
    }

    public Project(String id, String name, String description, User user) {
        super(id, name);
        this.description = description;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}
