import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value :");
        int firstValue = sc.nextInt();
        System.out.print("Enter the second value :");
        int secondValue = sc.nextInt();
        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;
        firstValue = firstValue - secondValue;
        System.out.println(firstValue);
        System.out.println(secondValue);
    }
}
