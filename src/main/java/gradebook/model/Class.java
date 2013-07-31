package gradebook.model;

import java.util.ArrayList;

/**
 * A Class class with different Sections inside an ArrayList. Can return the
 * whole class's grade and letter grade.
 */

public class Class extends GradingScheme {
    private String courseName;
    private ArrayList<Section> sections = new ArrayList<Section>();
    private int averageGradeForClass;
    private String classLG;

    public Class(String course) {
        this.courseName = course;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public ArrayList<Section> getSectionList() {
        return this.sections;
    }

    public void setSectionList(Section sectionID) {
        sections.add(sectionID);
    }

    public int getClassAverageGrade() {
        averageGradeForClass = computeClassAverageGrade(sections);
        return averageGradeForClass;
    }

    public String getClassLetterGrade() {
        classLG = computeLetterGrade(averageGradeForClass);
        return classLG;
    }
}
