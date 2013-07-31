package gradebook.model;

import java.util.ArrayList;

/**
 * The Student class contains first and last names for students enrolled in a
 * section of a class. The students have a list of GradebookItems where their
 * assignment grades are kept.
 */

public class Student extends GradingScheme {
    private String firstName;
    private String lastName;
    private int averageGrade;
    private String letterGrade;
    private GradebookItem assignment;
  private ArrayList<GradebookItem> assignments = new ArrayList<GradebookItem>();

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAssignmentList(GradebookItem assignment) {
        this.assignments.add(assignment);
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAssignmentGrade() {
        return assignment.getScoreOrWeight();
    }

    public int getAverageGrade() {
        averageGrade = GradingScheme.computeStudentGrade(assignments);
        return averageGrade;
    }

    public String getClassGrade() {
        letterGrade = GradingScheme.computeLetterGrade(averageGrade);
        return letterGrade;
    }

    public ArrayList<GradebookItem> getAssignmentList() {
        return assignments;
    }

    public void dropLowest() {
        GradingScheme.dropLowestGrade(assignments);
    }
}
