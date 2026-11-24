/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mejillano_activity_.pkg2;

/**
 *
 * @author MEJILLANO_CPE113
 */
public class MEJILLANO_ACTIVITY_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create student records
        LabGradeRecord chaichai =
                new LabGradeRecord("Chaichai", 80, 90);

        LabGradeRecord litoy =
                new LabGradeRecord("Litoy", 101, 85);

        // Test Chaichai
        System.out.println(chaichai.getStudentName());
        System.out.println("Final Grade: " + chaichai.getFinalGrade());
        System.out.println("Passing: " + chaichai.isPassing());

        // Test Litoy
        System.out.println("\n" + litoy.getStudentName());
        System.out.println("Final Grade: " + litoy.getFinalGrade());
        System.out.println("Passing: " + litoy.isPassing());

        // Invalid update for Chaichai
        System.out.println("\nUpdate Chaichai (95, 101): "
                + chaichai.updateScores(95, 101));
        System.out.println("Final Grade: " + chaichai.getFinalGrade());

        // Valid update for Chaichai
        System.out.println("\nUpdate Chaichai (74, 75): "
                + chaichai.updateScores(74, 75));
        System.out.println("Final Grade: " + chaichai.getFinalGrade());
        System.out.println("Passing: " + chaichai.isPassing());

        // Another valid update
        System.out.println("\nUpdate Chaichai (75, 75): "
                + chaichai.updateScores(75, 75));
        System.out.println("Final Grade: " + chaichai.getFinalGrade());
        System.out.println("Passing: " + chaichai.isPassing());

        // Check Litoy again
        System.out.println("\nLitoy's Final Grade: "
                + litoy.getFinalGrade());
        System.out.println("Passing: " + litoy.isPassing());
    }
}


/* QUESTION:
    Why must you validate both new scores before assigning either one?
    Both scores must be validated before assigning either one to prevent partial 
    updates. This ensures that if one score is invalid, both original scores 
    remain unchanged.
*/