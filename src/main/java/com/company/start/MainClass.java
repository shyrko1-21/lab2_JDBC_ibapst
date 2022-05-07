package com.company.start;

import com.company.action.ExamAction;
import com.company.action.StudentAction;
import com.company.model.Exam;
import com.company.model.Student;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

public class MainClass {
    StudentAction studentAction = new StudentAction();
    ExamAction examAction = new ExamAction();

    public static void main(String[] args) {
        String DbOperation = "EXIT(0), ADD(1), UPDATE(2), DELETE(3), FETCHBYID(4), FETCHBYEMAIL(5), FETCHBYMOBNO(6), FETCHBYNAME(7),"
                + "FETCHBYCITY(8), FETCHBYSALRANGE(9), FETCHBYDOB(10), FETCHBYDOJRANGE(11), FETCHALL(12), ADD EXAM(13), UPDATE EXAM(14), FETCH EXAM BY TEACHER(15)";

        MainClass mainClass = new MainClass();
        int value = 0;
        do {
            System.out.println("valid operations are");

            System.out.println(DbOperation);
            System.out.println("Enter valid operation number 0-15");
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();
            switch(value) {
                case 1:
                    mainClass.addStudent();
                    break;
                case 2:
                    mainClass.updateStudent();
                    break;
                case 3:
                    mainClass.deleteStudent();
                    break;
                case 4:
                    mainClass.fetchStudentById();
                    break;
                case 5:
                    mainClass.fetchStudentByEmail();
                    break;
                case 6:
                    mainClass.fetchStudentByMobileNo();
                    break;
                case 7:
                    mainClass.fetchStudentByName();
                    break;
                case 8:
                    mainClass.fetchStudentByCity();
                    break;
                case 9:
                    mainClass.fetchStudentBySalaryRange();
                    break;
                case 10:
                    mainClass.fetchStudentByDob();
                    break;
                case 11:
                    mainClass.fetchStudentByDOjRange();
                    break;
                case 12:
                    mainClass.fetchAllStudent();
                    break;
                case 13:
                    mainClass.addExam();
                    break;
                case 14:
                    mainClass.updateExam();
                    break;
                case 15:
                    mainClass.fetchByTeacher();
                    break;
                case 0:
                    System.out.println("Exiting code");
                    break;
                default:
                    System.out.println("Not a valid entry");

            }
        } while (value != 0);


    }

    public void addStudent() {
        Student student = new Student();
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter First Name");
        student.setFname(insert.next());
        System.out.println("Enter Last Name");
        student.setLname(insert.next());
        System.out.println("Enter Address");
        student.setAddress(insert.next());
        System.out.println("Enter Mobile Number");
        student.setMobileNo(insert.next());
        System.out.println("Enter Mail Id");
        student.setMailId(insert.next());
        System.out.println("Enter City");
        student.setCity(insert.next());
        System.out.println("Enter Designation");
        student.setDesignation(insert.next());
        System.out.println("Enter Dob (yyyy-mm-dd)");
        student.setDob(Date.valueOf(insert.next()));
        System.out.println("Enter Doj  (yyyy-mm-dd)");
        student.setDoj(Date.valueOf(insert.next()));
        System.out.println("Enter Salary");
        student.setSalary(insert.nextBigDecimal());
        studentAction.insert(student);
    }

    public void updateStudent() {
        Student student = new Student();
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Id");
        student.setId(insert.nextLong());
        System.out.println("Enter First Name");
        student.setFname(insert.next());
        System.out.println("Enter Last Name");
        student.setLname(insert.next());
        System.out.println("Enter Address");
        student.setAddress(insert.next());
        System.out.println("Enter Mobile Number");
        student.setMobileNo(insert.next());
        System.out.println("Enter Mail Id");
        student.setMailId(insert.next());
        System.out.println("Enter City");
        student.setCity(insert.next());
        System.out.println("Enter Designation");
        student.setDesignation(insert.next());
        System.out.println("Enter Dob (yyyy-mm-dd)");
        student.setDob(Date.valueOf(insert.next()));
        System.out.println("Enter Doj  (yyyy-mm-dd)");
        student.setDoj(Date.valueOf(insert.next()));
        System.out.println("Enter Salary");
        student.setSalary(insert.nextBigDecimal());
        studentAction.update(student);
    }

    public void deleteStudent() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Id");
        long id = insert.nextLong();
        studentAction.delete(id);
    }

    public void fetchStudentById() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Id");
        long id = insert.nextLong();
        studentAction.fetchById(id);
    }

    public void fetchStudentByEmail() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Mail Id");
        String mailId = insert.next();
        studentAction.fetchByEmailId(mailId);
    }

    public void fetchStudentByMobileNo() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Mobile Number");
        String mobileNo = insert.next();
        studentAction.fetchByMobileNo(mobileNo);
    }

    public void fetchStudentByName() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name = insert.next();
        studentAction.fetchByName(name);
    }

    public void fetchStudentByCity() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student City");
        String city = insert.next();
        studentAction.fetchByCity(city);
    }

    public void fetchStudentBySalaryRange() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Salary Start Range");
        BigDecimal salaryRange1 = insert.nextBigDecimal();
        System.out.println("Enter Salary End Range");
        BigDecimal salaryRange2 = insert.nextBigDecimal();
        studentAction.fetchBySalaryRange(salaryRange1, salaryRange2);
    }

    public void fetchStudentByDob() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Date of Birth (yyyy-mm-dd)");
        String dob = insert.next();
        studentAction.fetchByDob(Date.valueOf(dob));
    }

    public void fetchStudentByDOjRange() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Start Date of Joining (yyyy-mm-dd)");
        String dob1 = insert.next();
        System.out.println("Enter End Date of Joining (yyyy-mm-dd)");
        String dob2 = insert.next();
        studentAction.fetchByRangeDoj(Date.valueOf(dob1), Date.valueOf(dob2));
    }

    public void fetchAllStudent() {
        studentAction.fetchAll();
    }

    //-------------------------------------------------------------------
    //Exam

    public void addExam() {
        Exam exam = new Exam();
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter subject");
        exam.setSubject(insert.next());
        System.out.println("Enter teacher");
        exam.setTeacher(insert.next());
        System.out.println("Enter date of exam (yyyy-mm-dd)");
        exam.setDate(Date.valueOf(insert.next()));
        examAction.insert(exam);
    }

    public void updateExam() {
        Exam exam = new Exam();
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter subject");
        exam.setSubject(insert.next());
        System.out.println("Enter teacher");
        exam.setTeacher(insert.next());
        System.out.println("Enter date of exam (yyyy-mm-dd)");
        exam.setDate(Date.valueOf(insert.next()));
        examAction.update(exam);
    }

    public void fetchByTeacher() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter teacher name");
        String teacher = insert.next();
        examAction.fetchByTeacher(teacher);
    }



}
