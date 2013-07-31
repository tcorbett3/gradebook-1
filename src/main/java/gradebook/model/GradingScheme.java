package gradebook.model;

import java.util.ArrayList;

/**
 * GradingScheme is an algorithm class for computing the "average" score and
 * letter grade for a particular student in a particular section of a particular
 * class based on the student's scores on the GradeBookItems for that class.
 */

public class GradingScheme {
    public static int computeCoursesGrade(ArrayList<Class> classes) {
        int tempAvgHolder = 0;
        int finalAverage;
        for (int i = 0; i < classes.size(); i++) {
            tempAvgHolder = tempAvgHolder
                    + classes.get(i).getClassAverageGrade();
        }
        finalAverage = tempAvgHolder / (classes.size());
        return finalAverage;
    }

    public static int computeClassAverageGrade(ArrayList<Section> list) {
        int tempAvgHolder = 0;
        int finalAverage;
        for (int i = 0; i < list.size(); i++) {
            tempAvgHolder = tempAvgHolder
                    + list.get(i).getSectionAverageGrade();
        }
        finalAverage = tempAvgHolder / (list.size());
        return finalAverage;
    }

    public static int computeSectionAverageGrade(ArrayList<Student> list) {
        int tempAvgHolder = 0;
        int finalAverage2;
        for (int i = 0; i < list.size(); i++) {
            tempAvgHolder = tempAvgHolder + list.get(i).getAverageGrade();
        }

        finalAverage2 = tempAvgHolder / (list.size());
        return finalAverage2;
    }

   public static int computeStudentGrade(ArrayList<GradebookItem> assignments) {
        int tempAvgHolder2 = 0;
        for (GradebookItem grade : assignments) {
            tempAvgHolder2 += grade.getScoreOrWeight();
        }
        return tempAvgHolder2 / assignments.size();
    }

    public static String computeLetterGrade(int averageGrade) {
        String letterGradeLetter;
        LetterGrade letterGrade = new LetterGrade();
        letterGradeLetter = letterGrade.userInputLetterGrade(averageGrade,
                letterGrade.getAGrade(), letterGrade.getBGrade(),
                letterGrade.getCGrade(), letterGrade.getDGrade());
        return letterGradeLetter;
    }

    public static void dropLowestGrade(ArrayList<GradebookItem> list) {
        int smallestValue = 0;
        for (int i = 0; i < list.size(); i++) {
            if (smallestValue < list.get(i).getScoreOrWeight()) {
                smallestValue = i;
            }
        }
        list.remove(smallestValue);
    }
}
