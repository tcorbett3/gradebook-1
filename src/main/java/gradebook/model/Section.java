package gradebook.model;

import java.util.ArrayList;

/**
 * The Section class divides up the classes and takes in individual Students. It
 * can report back the average grade and letter grade for the whole section of
 * students.
 */

public class Section extends GradingScheme {
    private String sectionID;
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private String sectionLG;
    private int averageGradeForSection;

    public Section(String sectionID) {
        this.sectionID = sectionID;
    }

    public Section(String sectionID, ArrayList<Student> listOfStudents) {
        this.sectionID = sectionID;
        this.listOfStudents = listOfStudents;
    }

    public void setStudentList(Student students) {
        this.listOfStudents.add(students);
    }

    public ArrayList<Student> getStudentList() {
        return listOfStudents;
    }

    public String getSectionID() {
        return sectionID;
    }

    public int getSectionAverageGrade() {
        averageGradeForSection = GradingScheme
                .computeSectionAverageGrade(listOfStudents);
        return averageGradeForSection;
    }

    public String getSectionLetterGrade() {
        sectionLG = GradingScheme.computeLetterGrade(averageGradeForSection);
        return sectionLG;
    }
}
