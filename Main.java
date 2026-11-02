import java.util.ArrayList;
import java.util.List;

/**
 * Main execution class for the UI/UX Prototyping & Usability Evaluation System.
 * Author: Farrah Irwayu
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== UNIMAS UI/UX Prototyping & Usability Evaluation System ===");
        
        List<UsabilityTask> testCases = new ArrayList<>();
        testCases.add(new UsabilityTask("T001", "User Navigation & Menu Discovery", 12.5, "Success"));
        testCases.add(new UsabilityTask("T002", "Checkout Flow Completion Time", 45.2, "Success"));
        testCases.add(new UsabilityTask("T003", "Accessibility Contrast Verification", 5.0, "Needs Revision"));

        for (UsabilityTask task : testCases) {
            task.displayTaskReport();
        }
    }
}