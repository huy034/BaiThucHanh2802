 import java.util.Scanner;
 
public class slide40 {
 
    public static void main(String[] args) {
        int number;
        String dayOfWeek = "";  
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số bất kỳ (từ 1 đến 7): ");
        number = scanner.nextInt();
         
        switch (number) {
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