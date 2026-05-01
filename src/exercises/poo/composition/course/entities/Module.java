package exercises.poo.composition.course.entities;

import exercises.poo.composition.course.entities.enums.DifficultyLevel;

public class Module {
    private String title;
    private Integer workload;
    private DifficultyLevel difficultyLevel;

    public Module() {
    }

    public Module(String title, Integer workload, DifficultyLevel difficultyLevel) {
        this.title = title;
        this.workload = workload;
        this.difficultyLevel = difficultyLevel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override

    public String toString() {
        return "- "
                + getTitle()
                + ", "
                + getWorkload()
                + " hours. "
                + "Difficulty: "
                + getDifficultyLevel();
    }
}