package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class StudentReader {
    public static void main(String[] args) throws Exception {
        File file = new File("student");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        Student student = null;
        Student[] students = new Student[20];
        int index = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");
            student = new Student(data[0],data[1],data[2],data[3]);
            students[index] = student;
            index++;
        }
        System.out.println("student name");
        Student s;
        for (int i = 0; i < students.length; i++) {
            s = students[i];
            System.out.println(s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getId()+" ");

        }
    }
}

