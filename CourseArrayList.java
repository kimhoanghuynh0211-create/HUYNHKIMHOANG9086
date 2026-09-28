
package huynhkimhoang_9086;


import java.util.ArrayList;

public class CourseArrayList {
   
    private ArrayList<COURSE> courses = new ArrayList<>();


    public void addCourseToArrayList(COURSE course) {
        courses.add(course);
        System.out.println("THEM KHOA HOC THANH CONG!");
    }

   
    public void updateCourseById(String id) {
        for (COURSE c : courses) {
            if (c.getId().equals(id)) { 
                System.out.println("DA TIM THAY KHOA HOC, TIEN HANH CAP NHAT...");
                c.updateCourse();
                System.out.println("CAP NHAT THANH CONG!");
                return;
            }
        }
        System.out.println("KHONG TIM THAY KHOA HOC VOI ID NAY!");
    }

 
    public void deleteCourseById(String id) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId().equals(id)) {
                courses.remove(i);
                System.out.println("DA XOA KHOA HOC THANH CONG!");
                return;
            }
        }
        System.out.println("KHONG TIM THAY KHOA HOC DE XOA!");
    }

 
    public void displayAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("DANH SACH KHOA HOC DANG TRONG!");
            return;
        }
        for (COURSE c : courses) {
            c.displayDetails(); 
       
        }
    }

 
    public void displayAvailableCourses() {
        boolean found = false;
        System.out.println("Cac khoa hoc dang mo dang ky:");
        for (COURSE c : courses) {
            if (c.isAvailable()) { 
                c.displayDetails();
               
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co khoa hoc nao dang mo dang ky hien tai.");
        }
    }

  
    public double calculateTotalFees() {
        if (courses.isEmpty()) {
            return 0; 
        }
        double sum = 0;
        for (COURSE c : courses) {
            sum += c.calculateTotalFee();
        }
        return sum;
    }
}