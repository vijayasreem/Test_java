package com.testt.test.controller;

import com.testt.test.model.JiraActivation;
import com.testt.test.service.JiraActivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/jira")
public class JiraActivationController {
    
    @Autowired
    JiraActivationService jiraActivationService;
    
    @GetMapping("/activation")
    public ResponseEntity<JiraActivation> findByCredentials(@RequestParam String credentials) {
        JiraActivation jiraActivation = jiraActivationService.findByCredentials(credentials);
        return new ResponseEntity<>(jiraActivation, HttpStatus.OK);
    }
    
    @PostMapping("/activation")
    public ResponseEntity<JiraActivation> saveJiraActivation(@RequestBody JiraActivation jiraActivation) {
        jiraActivationService.saveJiraActivation(jiraActivation);
        return new ResponseEntity<>(jiraActivation, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/activation")
    public ResponseEntity<JiraActivation> deleteJiraActivation(@RequestBody JiraActivation jiraActivation) {
        jiraActivationService.deleteJiraActivation(jiraActivation);
        return new ResponseEntity<>(jiraActivation, HttpStatus.OK);
    }
    
    @GetMapping("/is-activated")
    public ResponseEntity<Boolean> isJiraActivated(@RequestParam String credentials) {
        boolean isActivated = jiraActivationService.isJiraActivated(credentials);
        return new ResponseEntity<>(isActivated, HttpStatus.OK);
    }
}