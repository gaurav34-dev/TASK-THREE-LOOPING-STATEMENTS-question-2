import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   int value;
    int sum=0;
Scanner scan = new Scanner(System.in);
for (int i = 0; i < 10; i++) {
   System.out.print("Enter a number:");
   value = scan.nextInt();
  sum = sum + value;
}
    System.out.println(sum);
    System.out.println(sum/2.0);
  }
}


