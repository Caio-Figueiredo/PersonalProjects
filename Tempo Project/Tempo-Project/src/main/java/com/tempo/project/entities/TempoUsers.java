package com.tempo.project.entities;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;


@Entity
public class TempoUsers implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String displayName;
    @Column
    private String avatarUrl;
    @Column
    private String location;

    private Integer roleId;

    public Integer getRoles() {
        return roleId;
    }

    public void setRoles(Integer roles) {
            this.roleId = roles;

    }

    public TempoUsers(){}

    public TempoUsers(Long userId, String firstName, String lastName, String displayName, String avatarUrl, String location) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.avatarUrl = avatarUrl;
        this.location = location;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
