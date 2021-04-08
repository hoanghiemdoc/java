package sessions4;

import java.util.Scanner;

class Student1 {
    String studName;
    int studAge;

//     void initialize()
//     {
//         studName = "James Anderson";
//         studAge = 26;
//     }


    void input()
    {
        System.out.println("Enter Your Name:");
        Scanner scan = new Scanner(System.in);
        studName = scan.nextLine();
        System.out.println("Enter Your Age:");
        studAge = scan.nextInt();
    }

    void  display()
    {
        System.out.println("Student Name:" + studName);
        System.out.println("Student Age:" + studAge);
    }

    public static void main(String[] args) {
        int ques;
//        Student objStudent = new Student();
////        objStudent.initialize();
//        objStudent.input();
//        objStudent.display();
//        System.out.println();
//        Student objStudent1 = new Student();
//        objStudent1.input();
//        objStudent1.display();
        do {
            Student1 objStudent1 = new Student1();
            objStudent1.input();
            objStudent1.display();
            System.out.println("Ban co muon tiep tuc nhap du lieu hoc sinh khong? (1 la Yes/ 0 la No)");
            Scanner scan = new Scanner(System.in);
            ques = scan.nextInt();
        }while (ques != 0);
        System.out.println("Ket thuc nhap du lieu");

    }
}
