package gradebook.model;

/**
 * The LetterGrade class is meant to take in user input to determine the letter
 * grade of an assignment, category, section, or class.
 */

public class LetterGrade {
    private int aGrade;
    private int bGrade;
    private int cGrade;
    private int dGrade;

    public LetterGrade(int a, int b, int c, int d) {
        this.aGrade = a;
        this.bGrade = b;
        this.cGrade = c;
        this.dGrade = d;
    }

    public LetterGrade() {

    }

    public int getAGrade() {
        return aGrade;
    }

    public int getBGrade() {
        return bGrade;
    }

    public int getCGrade() {
        return cGrade;
    }

    public int getDGrade() {
        return dGrade;
    }

    public void setAGrade(int a) {
        this.aGrade = a;
    }

    public void setBGrade(int b) {
        this.bGrade = b;
    }

    public void setCGrade(int c) {
        this.cGrade = c;
    }

    public void setDGrade(int d) {
        this.dGrade = d;
    }

    public String userInputLetterGrade(int average, int aGrade, int bGrade,
            int cGrade, int dGrade) {
        String grade;

        if (average >= aGrade) {
            grade = "A";
        } else if (average >= bGrade) {
            grade = "B";
        } else if (average >= cGrade) {
            grade = "C";
        } else if (average >= dGrade) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

}
