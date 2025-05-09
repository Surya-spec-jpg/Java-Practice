import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String input = sc.nextLine();

        char [] cArray = input.toCharArray();
        for(int i = cArray.length-1;i>=0;i--){
            System.out.print(cArray[i]);
        }
    }
}
