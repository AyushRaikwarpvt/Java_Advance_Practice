package com.parent_Structure.Rivision;

import java.util.List;

public class Subject {

    private List<String> subjects; // ✅ match with XML

    // ✅ No-arg constructor (required by Spring if using setter injection)
    public Subject() {}

    // ✅ Optional: Constructor if you want to use constructor injection
    public Subject(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjects=" + subjects +
                '}';
    }
}
