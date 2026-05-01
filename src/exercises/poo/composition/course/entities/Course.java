package exercises.poo.composition.course.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Instructor instructor;

    private List<Module> modules = new ArrayList<>();

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public void removeModule(Module module) {
        modules.remove(module);
    }

    public Integer totalHours() {
        int sum = 0;
        for (Module m : modules) {
            sum += m.getWorkload();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Course: "
                + name
                + instructor
                + "\nModules:";
    }
}