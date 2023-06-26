package com.testt.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JiraActivation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String credentials;
    private boolean activated;

    public JiraActivation() {
    }

    public JiraActivation(String credentials, boolean activated) {
        this.credentials = credentials;
        this.activated = activated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

}