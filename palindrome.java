import java.util.Scanner;
public class palindrome{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String :");
String str = sc.nextLine();
String org = str;
String rev = "";
for(int i = str.length()-1 ; i>=0 ; i--){
rev+=str.charAt(i);
}
if(org.equals(rev)){
System.out.println(org+ " is a Palindrome");
}
else{
System.out.println(org+ " is not a Palindrome");
}
}
}
