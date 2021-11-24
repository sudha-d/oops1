package com.company;

public class Main1 {
    public static void main(String[] args) throws Exception {
        StudentInboundService studentInboundService = new StudentInboundService();
        //Student[] studentList = studentInboundService.getStudentData;//
        // ("C:\\Users\\sudharshan\\IdeaProjects\\MYPROJECTS\\src\\com\\company\\student");//
        StudentRepository studentRepository = new StudentRepository();
       Student student = new Student("53","shash","IT","SIST");
        studentRepository.saveV2(student);

        /*for (int i = 0; i <= studentList.length; i++)
        {
            if(studentList[i] != null) {
                studentRepository.save(studentList[i]);
            }
        }*/
        studentRepository.getStudentByID("106");
        studentRepository.deleteByID("53");....


    }
}
