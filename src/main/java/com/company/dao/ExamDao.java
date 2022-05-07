package com.company.dao;

import com.company.model.Exam;
import com.company.model.Student;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExamDao {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int st;

    public int insert(Exam exam) {
        con = ConnectionFactory.getConnection();
        try {
            String query = "insert into exam(subject, teacher, date) " +
                    "values (?,?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, exam.getSubject());
            ps.setString(2, exam.getTeacher());
            ps.setDate(3, exam.getDate());
            st = ps.executeUpdate();
            System.out.println("inserted exams " + st);
        } catch (MySQLIntegrityConstraintViolationException e) {
            st = -1;
            e.printStackTrace();
        } catch (Exception e) {
            st = -2;
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return st;
    }

    public int update(Exam exam) {
        con = ConnectionFactory.getConnection();
        try {
            String query = "update exam set teacher=?,date=? "
                    + "where subject=?";
            ps = con.prepareStatement(query);
            ps.setString(1, exam.getTeacher());
            ps.setDate(2, exam.getDate());
            ps.setString(3, exam.getSubject());
            st = ps.executeUpdate();
            System.out.println("updated exam " + st);
        } catch (Exception e) {
            st = -2;
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return st;
    }

    public List<Exam> fetchByTeacher(String teacher) {
        List<Exam> examList = new ArrayList<>();
        con = ConnectionFactory.getConnection();
        try {
            String query = "select * from exam where teacher = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, teacher);
            rs = ps.executeQuery();
            while (rs.next()) {
                Exam exam = new Exam();
                exam.setId(rs.getLong("id"));
                exam.setSubject(rs.getString("subject"));
                exam.setTeacher(rs.getString("teacher"));
                exam.setDate(rs.getDate("date"));
                examList.add(exam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return examList;
    }
}
