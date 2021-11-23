package com.company;

public class Student {
   private String id;
    private String name;
    private String branch;
    private String college;
    public Student(String id,String name, String branch,String college)
    {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.college = college;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
