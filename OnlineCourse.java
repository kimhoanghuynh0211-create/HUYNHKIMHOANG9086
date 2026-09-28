package huynhkimhoang_9086;

import java.util.Scanner;

public class OnlineCourse extends COURSE {

    private String platformName;
    private double discountPercent;

    public OnlineCourse(String platformName, double discountPercent) {
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public OnlineCourse() {
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("PLATFORM: " + platformName + " | DISCOUNT: " + discountPercent + "%");
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        Scanner sc = new Scanner(System.in);
        System.out.println("CAP NHAP TEN NEN TANG : ");
        setPlatformName(sc.nextLine());
        System.out.println(" CAP NHAP GIAM GIA : ");
        setDiscountPercent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void addCourse() {
        super.addCourse();
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP TEN NEN TANG : ");
        setPlatformName(sc.nextLine());
        System.out.println("NHAP GIAM GIA : ");
        setDiscountPercent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public double calculateTotalFee() {
        return getFeePerStudent() * getEnrolledStudents() * (1 - (discountPercent / 100.0));
    }
    }


