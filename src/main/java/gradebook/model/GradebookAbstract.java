package gradebook.model;

/**
 * GradebookAbstract class acts as the outline for the GradebookItem and
 * GradebookCategory classes.
 */

public abstract class GradebookAbstract {
    private String name;
    private int weightOrScore;

    abstract void setName(String name);

    abstract void setScoreOrWeight(int score);

    abstract String getName();

    abstract int getScoreOrWeight();
}
