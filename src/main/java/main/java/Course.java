package main.java;

import java.util.*;

public class Course {

    private int id;

    private String department;

    private int catalogNum;

    private List<Review> reviews = new ArrayList<>();

    private List<Student> students = new ArrayList<>();

    public Course(String department, int catalogNum) {
//        this.id = id;
        this.department = department;
        this.catalogNum = catalogNum;
    }

    public Course() {
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getDepartment() {return department;}

    public void setDepartment(String department) {this.department = department;}

    public int getCatalogNum() {return catalogNum;}

    public void setCatalogNum(int catalogNum) {this.catalogNum = catalogNum;}

    public String getFullCourseName() {
        String name = this.department + this.catalogNum;
        return name;
    }
    public void addStudents(List<Student> studentList) {
        for (Student s: studentList) {
            students.add(s);
        }
    }

    public void addReviews(List<Review> reviewList) {
        for (Review r: reviewList) {
            reviews.add(r);
        }
    }
}
