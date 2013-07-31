package gradebook.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTests {
    @Test
    public void settingUpStudentGrades() {
        Course newCourse = new Course();
        newCourse.setCourseSubject("CS");
        newCourse.setCourseNumber("1332");
        newCourse.setCourseName("Data Structures and Algorithms");

        Student s1 = new Student("Tamara", "Corbett");
        GradebookItem assignment1 = new GradebookItem("Heaps", 85);
        GradebookItem assignment2 = new GradebookItem("Regular Expressions",
                100);
        s1.setAssignmentList(assignment1);
        s1.setAssignmentList(assignment2);

        assertEquals(85, assignment1.getScoreOrWeight());
        assertEquals(2, s1.getAssignmentList().size());
        assertEquals(92, s1.getAverageGrade());
    }

    @Test
    public void testingDropLowest() {
        Course newCourse = new Course();
        newCourse.setCourseSubject("CS");
        newCourse.setCourseNumber("1332");
        newCourse.setCourseName("Data Structures and Algorithms");

        Student s1 = new Student("Tamara", "Corbett");
        GradebookItem assignment1 = new GradebookItem("Heaps", 85);
        GradebookItem assignment2 = new GradebookItem("Regular Expressions",
                100);
        GradebookItem assignment3 = new GradebookItem("Binary Tree", 64);
        GradebookItem assignment4 = new GradebookItem("HashTables", 50);
        s1.setAssignmentList(assignment1);
        s1.setAssignmentList(assignment2);
        s1.setAssignmentList(assignment3);
        s1.setAssignmentList(assignment4);

        s1.dropLowest();
        for (int i = 0; i < s1.getAssignmentList().size(); i++) {
            System.out
                    .println(s1.getAssignmentList().get(i).getScoreOrWeight());
        }
        System.out.println(s1.getAverageGrade());
    }
}
