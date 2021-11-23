package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StudentInboundService {
    public Student[] getStudentData(String filePath) throws Exception {
        File file = new File(filePath);
         FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        Student student = null;
        Student[] students = new Student[30];
        int index = 0;
        while (((line=bufferedReader.readLine()) != null) && index < students.length){
         String[] data = line.split(",");
         student = new Student(data[0],data[1],data[2],data[3]);
         students[index] =student;
         index++;

        }
        return students;
    }
}
