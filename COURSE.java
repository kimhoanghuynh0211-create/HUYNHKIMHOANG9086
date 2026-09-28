package huynhkimhoang_9086;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public abstract class COURSE implements ICOURSE {

    private String id;
    private double feePerStudent;
    private Date startDate;
    private boolean isAvailable;
    private int enrolledStudents;

    public COURSE() {
    }

    public COURSE(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrolledStudents = enrolledStudents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public void addCourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP ID: ");
        setId(sc.nextLine());
        System.out.print("NHAP HOC PHI TREN MOI SINH VIEN (feePerStudent): ");
        setFeePerStudent(Double.parseDouble(sc.nextLine()));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("NHAP NGAY BAT DAU (startDate) - DINH DANG dd/MM/yyyy: ");
        String dateString = sc.nextLine();
        try {
           
            setStartDate(sdf.parse(dateString));
        } catch (ParseException e) {
            System.out.println("SAI DINH DANG NGAY THANG! VUI LONG KIEM TRA LAI.");
        }
        
        System.out.print("KHOA HOC CON MO DANG KY KHONG (isAvailable - true/false): ");
       
        setAvailable(Boolean.parseBoolean(sc.nextLine()));
        
        System.out.print("NHAP SO LUONG SINH VIEN DA DANG KY (enrolledStudents): ");
   
        setEnrolledStudents(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public void updateCourse() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP HOC PHI MOI TREN MOI SINH VIEN: ");
        setFeePerStudent(Double.parseDouble(sc.nextLine()));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("NHAP NGAY BAT DAU MOI (dd/MM/yyyy): ");
        String dateString = sc.nextLine();
        try {
            setStartDate(sdf.parse(dateString));
        } catch (ParseException e) {
            System.out.println("SAI DINH DANG NGAY THANG! VUI LONG KIEM TRA LAI.");
        }
        
        System.out.print("CAP NHAT TRANG THAI DANG KY (true/false): ");
        setAvailable(Boolean.parseBoolean(sc.nextLine()));
        
        System.out.print("CAP NHAT SO LUONG SINH VIEN: ");
        setEnrolledStudents(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public void displayDetails() {
     
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = (startDate != null) ? sdf.format(startDate) : "N/A";
        
        System.out.println("--- THONG TIN KHOA HOC ---");
        System.out.println("ID: " + getId() 
                + " | HOC PHI: " + getFeePerStudent() 
                + " | NGAY BAT DAU: " + formattedDate 
                + " | CON HAN DANG KY: " + isAvailable() 
                + " | SO SV DANG KY: " + getEnrolledStudents());
    }
}