import java.util.Scanner;

public class thuTrongTuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("Chủ nhật.");
                break;
            case 2:
                System.out.println("Thứ 2.");
                break;
            case 3:
                System.out.println("Thứ 3.");
                break;
            case 4:
                System.out.println("Thứ 4.");
                break;
            case 5:
                System.out.println("Thứ 5.");
                break;
            case 6:
                System.out.println("Thứ 6.");
                break;
            case 7:
                System.out.println("Thứ 7.");
                break;
            default:
                System.out.println("Nhập số không hợp lệ.");
        }
    }
}
