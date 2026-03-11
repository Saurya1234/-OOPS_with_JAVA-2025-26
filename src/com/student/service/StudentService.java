package com.student.service;

import com.student.model.Student;
import com.student.util.InvalidMarksException;
import java.io.*;

public class StudentService {

    public void addStudent(Student s) throws InvalidMarksException {

        if (s.getMarks() > 100 || s.getMarks() < 0) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }

        try {
            FileWriter fw = new FileWriter("students.txt", true);
            fw.write(s.toString() + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void displayStudents() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}