package com.kodilla.hibernate.tasklist;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "TASKLISTS")
public class TaskList {

    int id;
    String listName;
    String description;

    public TaskList(String listName) {
        this.listName = listName;
    }

    public TaskList() {
    }

    @Column (name = "ID")
    @NotNull
    @GeneratedValue
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column (name = "LISTNAME", nullable = false)
    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
    @Column (name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
