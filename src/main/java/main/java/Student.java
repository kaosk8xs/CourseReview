package main.java;

import java.util.*;

public class Student {

    private int id;

    private String username;

    private String password;

    private List<Course> courses = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public void addCourses(List<Course> courseList) {
        for (Course c: courseList) {
            courses.add(c);
        }
    }
    public void addReviews(List<Review> reviewList) {
        for (Review r: reviewList) {
            reviews.add(r);
        }
    }
}

