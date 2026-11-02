/**
 * Represents an individual usability testing task applying OOP principles.
 */
public class UsabilityTask {
    private String taskId;
    private String taskDescription;
    private double completionTimeSeconds;
    private String status;

    // Constructor
    public UsabilityTask(String taskId, String taskDescription, double completionTimeSeconds, String status) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.completionTimeSeconds = completionTimeSeconds;
        this.status = status;
    }

    // Display Method
    public void displayTaskReport() {
        System.out.println("--------------------------------------------------");
        System.out.println("Task ID: " + taskId);
        System.out.println("Description: " + taskDescription);
        System.out.println("Completion Time: " + completionTimeSeconds + " seconds");
        System.out.println("Evaluation Status: " + status);
    }
}