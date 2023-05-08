package main.java;

public class Review {

    private String message;
    private int rating;
    private int studentID;
    private int courseID;

    private Student student;
    private Course course;

    public Review(String message, int rating) {
        this.message = message;
        this.rating = rating;
    }
    public Review(int studentID, int courseID, String message, int rating) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.message = message;
        this.rating = rating;
    }

    public void setStudentID(int id) {
        this.studentID = id;
    }
    public void setCourseID(int id) {
        this.courseID = id;
    }
    public int getStudentID() {
        return this.studentID;
    }

    public int getCourseID() {
        return this.courseID;
    }

    public Student getStudent() {
        return this.student;
    }
    public main.java.Course getCourse() {
        return this.course;
    }


    public String getMessage() {
        return this.message;
    }

    public int getRating() {
        return this.rating;
    }



}

