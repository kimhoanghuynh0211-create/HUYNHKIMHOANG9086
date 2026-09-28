
package huynhkimhoang_9086;

import java.util.Scanner;


public class OfflineCourse extends COURSE {
    private String classroomnumber;
    private double materialFeePerStudent;

    public OfflineCourse(String classroomnumber, double materialFeePerStudent) {
        this.classroomnumber = classroomnumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public OfflineCourse() {
    }

    public String getClassroomnumber() {
        return classroomnumber;
    }

    public void setClassroomnumber(String classroomnumber) {
        this.classroomnumber = classroomnumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
     System.out.println("CLASSROOM: " + classroomnumber + " | MATERIAL FEE: " + materialFeePerStudent);
    }

    @Override
    public void updateCourse() {
        super.updateCourse(); 
         Scanner sc = new Scanner(System.in);
        System.out.println("CAP NHAP SO PHONG HOC : ");
        setClassroomnumber(sc.nextLine());
        System.out.println("CAP NHAP PHI TAI LIEU TREN MOI SINH VIEN : ");
        setMaterialFeePerStudent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void addCourse() {
        super.addCourse(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP SO PHONG HOC : ");
        setClassroomnumber(sc.nextLine());
        System.out.println("NHAP PHI TAI LIEU TREN MOI SINH VIEN : ");
        setMaterialFeePerStudent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public double calculateTotalFee() {
        return (getFeePerStudent() + materialFeePerStudent) * getEnrolledStudents();
    }
    
    
}
