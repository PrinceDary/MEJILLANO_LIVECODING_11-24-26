/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mejillano_activity_.pkg2;

/**
 *
 * @author MEJILLANO_CPE113
 */
public class LabGradeRecord {
    private String studentName;
    private int quizScore;
    private int labScore;

    // Constructor
    public LabGradeRecord(String studentName, int quizScore, int labScore) {
        this.studentName = studentName;

        if (isValidScore(quizScore) && isValidScore(labScore)) {
            this.quizScore = quizScore;
            this.labScore = labScore;
        } else {
            this.quizScore = 0;
            this.labScore = 0;
        }
    }

    // Check if score is valid
    private boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }

    // Get student name
    public String getStudentName() {
        return studentName;
    }

    // Calculate final grade
    public double getFinalGrade() {
        return (quizScore * 0.40) + (labScore * 0.60);
    }

    // Check if student is passing
    public boolean isPassing() {
        return getFinalGrade() >= 75.0;
    }

    // Update scores
    public boolean updateScores(int quizScore, int labScore) {
        if (isValidScore(quizScore) && isValidScore(labScore)) {
            this.quizScore = quizScore;
            this.labScore = labScore;
            return true;
        }
        return false;
    }
}
