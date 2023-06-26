package com.testt.test.service;

import com.testt.test.model.JiraActivation;
import com.testt.test.repository.JiraActivationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JiraActivationService {
    
    @Autowired
    JiraActivationRepository jiraActivationRepository;
    
    public JiraActivation findByCredentials(String credentials) {
        return jiraActivationRepository.findByCredentials(credentials);
    }
    
    public void saveJiraActivation(JiraActivation jiraActivation) {
        jiraActivationRepository.saveJiraActivation(jiraActivation);
    }
    
    public void deleteJiraActivation(JiraActivation jiraActivation) {
        jiraActivationRepository.deleteJiraActivation(jiraActivation);
    }
    
    public boolean isJiraActivated(String credentials) {
        return jiraActivationRepository.isJiraActivated(credentials);
    }
}