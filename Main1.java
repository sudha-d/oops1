package Com.Company;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //StudentInboundService studentInboundService = new StudentInboundService();
        //Student[] studentList = studentInboundService.getStudentData;//
        // ("C:\\Users\\sudharshan\\IdeaProjects\\MYPROJECTS\\src\\com\\company\\student");//
        StudentRepository studentRepository = new StudentRepository();
        System.out.println("#########################welcome to registration portal#################");
        //Student student = new Student("60","shush","IT","SIST");
        //studentRepository.saveV2(student);
        while(true) {
            System.out.println("1.to Register student");
            System.out.println("2.search");
            System.out.println("3.update");
            System.out.println("4.delete");
            System.out.println("5.to view all  student Details");
            System.out.println("please enter your choice");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("please enter student details for Registration");
                System.out.println("please enter the student ID");
                String id = scanner.next();
                System.out.println("please enter the student Name");
                String Name = scanner.next();
                System.out.println("please enter the student Branch");
                String Branch = scanner.next();
                System.out.println("please enter the student College");
                String College = scanner.next();
                Student student = new Student(id, Name, Branch, College);
                studentRepository.save(student);
                System.out.println("Registration done Successfully");

            } else if (choice == 2) {
                System.out.println("please enter student Id to search");
                String id = scanner.next();
                Student student = studentRepository.getStudentByID(id);
                if (student != null) {
                    System.out.println("student exist with this ID");
                    System.out.println("student ID = " + student.getId());
                    System.out.println("student Name = " + student.getName());
                    System.out.println("student Branch = " + student.getBranch());
                    System.out.println("student College = " + student.getCollege());

                } else {
                    System.out.println("student does not exist with this id");
                }

            } else if (choice == 3) {


            } else if (choice == 4) {
                System.out.println("please enter the student id to delete");
                String id = scanner.next();
                boolean result = studentRepository.deleteByID(id);
                if (result) {
                    System.out.println("deleted successfully");
                } else {
                    System.out.println("student does not exist with this id=" +id);
                }
            } else if (choice == 5) {
                studentRepository.getAllStudents();
            } else {
                break;
            }
        }
        System.out.println("application is terminated");

        }


        /*for (int i = 0; i <= studentList.length; i++)
        {
            if(studentList[i] != null) {
                studentRepository.save(studentList[i]);
            }
        }*/
       // studentRepository.getStudentByID("106");
       // studentRepository.deleteByID("53");


    }
