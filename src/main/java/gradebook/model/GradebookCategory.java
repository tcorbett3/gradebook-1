package gradebook.model;

import java.util.ArrayList;

/**
 * GradebookCategory consists of names, weights, and GradebookItems in an
 * ArrayList. It helps to separate GradebookItems into categories (Homework,
 * Tests, etc.).
 */

public class GradebookCategory extends GradebookAbstract {
    private String nameOfCategory;
    private int weight;
    private int averageGradeOfCategory;
  private ArrayList<GradebookItem> assignments = new ArrayList<GradebookItem>();

    public GradebookCategory(String nameOfCategory, int weight) {
        this.nameOfCategory = nameOfCategory;
        this.weight = weight;
    }

    public void setName(String name) {
        this.nameOfCategory = name;
    }

    public void setScoreOrWeight(int weight) {
        this.weight = weight;
    }

    public void setItemList(GradebookItem assignment) {
        assignments.add(assignment);
    }

    public ArrayList<GradebookItem> getItemList() {
        return assignments;
    }

    public String getName() {
        return nameOfCategory;
    }

    public int getScoreOrWeight() {
        return weight;
    }
}
