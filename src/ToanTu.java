import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        double num1,num2;
        char pt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu 1: ");
        num1 = scanner.nextDouble();
        System.out.println("Nhap so thu 2: ");
        num2 = scanner.nextDouble();
        System.out.println("Nhap phep toan: ");
        pt = scanner.next().charAt(0);
        switch (pt){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                if (num2!=0){
                    System.out.println((double) num1/num2);
                }else{
                    System.out.println("so bi chia pahi kahc khong");
                }
        }

    }
}
