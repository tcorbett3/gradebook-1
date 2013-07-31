package gradebook.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SectionTests {
    @Test
    public void settingUpSectionGrades() {
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

        Student s2 = new Student("Justin", "Corbett");
        GradebookItem a1 = new GradebookItem("Heaps", 70);
        GradebookItem a2 = new GradebookItem("Regular Expressions", 100);
        s2.setAssignmentList(a1);
        s2.setAssignmentList(a2);

        Section csSection = new Section("BR");
        csSection.setStudentList(s1);
        csSection.setStudentList(s2);

        csSection.getSectionAverageGrade();
        assertEquals(88, csSection.getSectionAverageGrade());
    }

}
