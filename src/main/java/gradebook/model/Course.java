package gradebook.model;

import java.util.ArrayList;

/**
 * A Course class with Classes inside an ArrayList. Can return the whole
 * course's grade and letter grade.
 */

public class Course extends GradingScheme {
    private String courseSubject;
    private String courseNumber;
    private String courseName;
    private int totalCourseGrade;
    private String letterGrade;
    private ArrayList<Class> listOfClasses = new ArrayList<Class>();
    private ArrayList<Course> prereqList = new ArrayList<Course>();

    public Course(String courseSubject, String courseNumber, String courseName,
            ArrayList<Course> prereqList) {
        this.courseSubject = courseSubject;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.prereqList = prereqList;
    }

   public Course(String courseSubject, String courseNumber, String courseName) {
        this.courseSubject = courseSubject;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
    }

    public Course() {

    }

    public void setCourseSubject(String subject) {
        this.courseSubject = subject;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseGrade(int totalCourseGrade) {
        this.totalCourseGrade = totalCourseGrade;
    }

    public void setCourseLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public void setPrereqCourses(Course prereqs) {
        this.prereqList.add(prereqs);
    }

    public void setClasses(Class classes) {
        this.listOfClasses.add(classes);
    }

    public int getCourseAverageGrade() {
        totalCourseGrade = GradingScheme.computeCoursesGrade(listOfClasses);
        return totalCourseGrade;
    }

    public String getCourseLetterGrade() {
        letterGrade = GradingScheme.computeLetterGrade(totalCourseGrade);
        return letterGrade;
    }

    public String getCourseSubject() {
        return courseSubject;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Course> getPrereqCourses() {
        return prereqList;
    }

    public ArrayList<Class> getClasses() {
        return listOfClasses;
    }
}
