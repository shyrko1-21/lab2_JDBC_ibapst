package com.company.action;


import com.company.dao.ExamDao;
import com.company.model.Exam;
import com.company.model.Student;

import java.util.List;

public class ExamAction {
    ExamDao dao = new ExamDao();
    int st;

    public void insert(Exam exam) {
        st = dao.insert(exam);
        if (st == 1) {
            System.out.println("Exam Inserted Successfully");
        } else if (st == -1) {
            System.out.println("Exam Already exists");
        } else {
            System.out.println("Unable to Insert Exam");
        }
    }

    public void update(Exam exam) {
        st = dao.update(exam);
        if (st == 1) {
            System.out.println("Exam Updated Successfully");
        } else {
            System.out.println("Unable to update Exam");
        }
    }

    public void fetchByTeacher(String teacher) {
        List<Exam> examList = dao.fetchByTeacher(teacher);
        if (examList.isEmpty()) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Exam Details are :");
            for (Exam exam : examList) {
                System.out.println(exam);
            }
        }
    }
}
