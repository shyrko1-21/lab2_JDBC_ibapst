package com.company.model;

import java.sql.Date;

public class Exam {
    private long id;
    private String subject;
    private String teacher;
    private Date date;

    public Exam() {

    }

    public Exam(String subject, String teacher, Date date) {
        this.subject = subject;
        this.teacher = teacher;
        this.date = date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Exam{" + "id=" + id + ", subject=" + subject + ", teacher=" + teacher + ", date=" + date + "}";
    }
}
