package com.student.model;

public class Student {

    private int StudentId;
    private String name;
    private int marks;

    public Student(int studentId, String name, int marks) {
        this.StudentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return StudentId + "," + name + "," + marks;
    }
}