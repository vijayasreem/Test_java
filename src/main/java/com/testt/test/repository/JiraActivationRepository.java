import org.springframework.data.jpa.repository.JpaRepository;

public interface JiraActivationRepository extends JpaRepository<JiraActivation, Long> {
    
    JiraActivation findByCredentials(String credentials);
    
    void saveJiraActivation(JiraActivation jiraActivation);
    
    void deleteJiraActivation(JiraActivation jiraActivation);
    
    boolean isJiraActivated(String credentials);
}