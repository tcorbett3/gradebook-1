package gradebook.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CourseTests {
    @Test
    public void testingCourseParameters() {
        Course newCourse = new Course();
        newCourse.setCourseSubject("CS");
        newCourse.setCourseNumber("1332");
        newCourse.setCourseName("Data Structures and Algorithms");

        Course oldcourse = new Course();
        oldcourse.setCourseSubject("CS");
        oldcourse.setCourseNumber("1331");
        oldcourse.setCourseName("Intro to Java");

        Course oldcourse2 = new Course();
        oldcourse2.setCourseSubject("CS");
        oldcourse2.setCourseNumber("1301");
        oldcourse2.setCourseName("THAT ROBOT CLASS");

        newCourse.setPrereqCourses(oldcourse);
        newCourse.setPrereqCourses(oldcourse2);

        assertEquals("CS", newCourse.getCourseSubject());
        assertEquals("1332", newCourse.getCourseNumber());
        assertEquals(2, newCourse.getPrereqCourses().size());
    }

    @Test
    public void gettingPrereqCourses() {
        Course newCourse = new Course();
        newCourse.setCourseSubject("CS");
        newCourse.setCourseNumber("1332");
        newCourse.setCourseName("Data Structures and Algorithms");

        Course oldcourse = new Course();
        oldcourse.setCourseSubject("CS");
        oldcourse.setCourseNumber("1331");
        oldcourse.setCourseName("Intro to Java");

        Course oldcourse2 = new Course();
        oldcourse2.setCourseSubject("CS");
        oldcourse2.setCourseNumber("1301");
        oldcourse2.setCourseName("THAT ROBOT CLASS");

        newCourse.setPrereqCourses(oldcourse);
        newCourse.setPrereqCourses(oldcourse2);

        assertEquals(2, newCourse.getPrereqCourses().size());
        assertEquals("1331", newCourse.getPrereqCourses().get(0)
                .getCourseNumber());
        assertEquals("1301", newCourse.getPrereqCourses().get(1)
                .getCourseNumber());
    }

    @Test
    public void gettingListOfClasses() {
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

        Student s3 = new Student("John", "Johnson");
        GradebookItem a12 = new GradebookItem("Heaps", 100);
        GradebookItem a22 = new GradebookItem("Regular Expressions", 80);
        s3.setAssignmentList(a12);
        s3.setAssignmentList(a22);

        Student s4 = new Student("Hideyoshi", "Toyotomi");
        GradebookItem a13 = new GradebookItem("Heaps", 40);
        GradebookItem a23 = new GradebookItem("Regular Expressions", 70);
        s4.setAssignmentList(a13);
        s4.setAssignmentList(a23);

        Section csSection = new Section("BR");
        csSection.setStudentList(s1);
        csSection.setStudentList(s2);

        Section csSection2 = new Section("FL");
        csSection2.setStudentList(s3);
        csSection2.setStudentList(s4);

        Class cs1332 = new Class("CS 1332");
        cs1332.setSectionList(csSection);
        cs1332.setSectionList(csSection2);
        newCourse.setClasses(cs1332);
        
        assertEquals(1, newCourse.getClasses().size());
    }

    @Test
    public void settingUpCourseGrades() {
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

        Student s3 = new Student("John", "Johnson");
        GradebookItem a12 = new GradebookItem("Heaps", 100);
        GradebookItem a22 = new GradebookItem("Regular Expressions", 80);
        s3.setAssignmentList(a12);
        s3.setAssignmentList(a22);

        Student s4 = new Student("Hideyoshi", "Toyotomi");
        GradebookItem a13 = new GradebookItem("Heaps", 40);
        GradebookItem a23 = new GradebookItem("Regular Expressions", 70);
        s4.setAssignmentList(a13);
        s4.setAssignmentList(a23);

        Section csSection = new Section("BR");
        csSection.setStudentList(s1);
        csSection.setStudentList(s2);

        Section csSection2 = new Section("FL");
        csSection2.setStudentList(s3);
        csSection2.setStudentList(s4);

        csSection.getSectionAverageGrade();
        assertEquals(88, csSection.getSectionAverageGrade());

        csSection2.getSectionAverageGrade();
        assertEquals(72, csSection2.getSectionAverageGrade());

        Class cs1332 = new Class("CS 1332");
        cs1332.setSectionList(csSection);
        cs1332.setSectionList(csSection2);

        newCourse.setClasses(cs1332);

        assertEquals(80, newCourse.getCourseAverageGrade());
    }
}
