package huynhkimhoang_9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseArrayList courseManager = new CourseArrayList();

        while (true) {
            System.out.println("\n==== (COURSE MANAGEMENT) ====");
            System.out.println("1. Them khoa hoc (Add an OnlineCourse or OfflineCourse)");
            System.out.println("2. Cap nhat khoa hoc bang ID (Update a course by ID)");
            System.out.println("3. Xoa khoa hoc bang ID (Delete a course by ID)");
            System.out.println("4. Hien thi tat ca khoa hoc (Display all courses)");
            System.out.println("5. Hien thi khoa hoc dang mo dang ky (Display available courses)");
            System.out.println("6. Tinh tong so tien (Calculate total fees)");
            System.out.println("0. Thoat (Exit)");
            System.out.print("Moi em chon chuc nang (0-6): ");

            int choice = -1;
            try {
               
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("LOI: VUI LONG CHI NHAP SO NGUYEN!");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("CHON LOAI KHOA HOC (1: Online | 2: Offline): ");
                    String type = sc.nextLine();
                    if (type.equals("1")) {
                        System.out.println("--- THEM KHOA HOC ONLINE ---");
                        OnlineCourse online = new OnlineCourse();
                        online.addCourse();
                        courseManager.addCourseToArrayList(online); 
                    } else if (type.equals("2")) {
                        System.out.println("--- THEM KHOA HOC OFFLINE ---");
                        OfflineCourse offline = new OfflineCourse();
                        offline.addCourse();
                        courseManager.addCourseToArrayList(offline); 
                    } else {
                        System.out.println("Lua chon khong hop le!");
                    }
                    break;
                case 2: 
                    System.out.print("NHAP ID KHOA HOC CAN CAP NHAT: ");
                    String idUpdate = sc.nextLine();
                    courseManager.updateCourseById(idUpdate);
                    break;
                case 3: 
                    System.out.print("NHAP ID KHOA HOC CAN XOA: ");
                    String idDelete = sc.nextLine();
                    courseManager.deleteCourseById(idDelete);
                    break;
                case 4:
                    System.out.println("\n--- TAT CA KHOA HOC ---");
                    courseManager.displayAllCourses();
                    break;
                case 5: 
                    System.out.println("\n--- KHOA HOC DANG MO DANG KY ---");
                    courseManager.displayAvailableCourses();
                    break;
                case 6:
                    System.out.println("\n--- TONG SO TIEN THU DUOC TREN TOAN HE THONG ---");
                    double total = courseManager.calculateTotalFees();
                    System.out.println("TONG TIEN (TOTAL FEES): " + total);
                    break;
                case 0:
                    System.out.println("CAM ON DA SU DUNG CHUONG TRINH! TAM BIET!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("LUA CHON KHONG HOP LE, VUI LONG NHAP TU 0 DEN 6.");
            }
        }
    }
}