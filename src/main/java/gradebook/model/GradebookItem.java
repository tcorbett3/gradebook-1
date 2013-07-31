package gradebook.model;

/**
 * GradebookItems are assignments given to Students. They are given names and
 * scores for Students' grades.
 */

public class GradebookItem extends GradebookAbstract {
    private String nameOfItem;
    private int score;

    public GradebookItem(String nameOfItem, int score) {
        this.nameOfItem = nameOfItem;
        this.score = score;
    }

    public void setName(String name) {
        this.nameOfItem = name;
    }

    public void setScoreOrWeight(int score) {
        this.score = score;
    }

    public String getName() {
        return nameOfItem;
    }

    public int getScoreOrWeight() {
        return score;
    }
}
