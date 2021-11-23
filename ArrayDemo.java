package com.company;

public class ArrayDemo {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student s1 = new Student("1", "SUDHARSHAN", "EEE", "SIST");
        Student s2 = new Student("2", "PREM", "ECE", "SIST");
        Student s3 = new Student("3", "SREEKANTH", "CSE", "SIST");
        Student s4 = new Student("4", "GOUSE", "CSE", "SIST");
        Student s5 = new Student( "5","sai","cse","SIST");
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;
        Student s = null;
        for (int i = 0; i < students.length; i++) {
            s = students[i];
            System.out.println(s.getName()+" "+s.getBranch()+" "+s.getCollege()+" "+s.getId()+" ");

        }
    }
}
