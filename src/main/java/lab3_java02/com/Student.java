/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_java02.com;

/**
 *
 * @author LENOVO T560
 */
public class Student {

    private String name;
    private double marks;
    private String major;

    public Student() {
    }

    public Student(String name, double marks, String major) {
        this.name = name;
        this.marks = marks;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        if (this.marks < 3) {
            return "Kém";
        } else if (this.marks < 5) {
            return "Yếu";
        } else if (this.marks < 6.5) {
            return "Trung Bình";
        } else if (this.marks < 7.5) {
            return "Khá";
        } else if (this.marks < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }

    }

    public boolean isBonus() {
        return this.marks >= 7.5;
    }

    void setText(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
