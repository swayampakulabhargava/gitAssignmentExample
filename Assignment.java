import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String user_name = obj.nextLine();
    System.out.println("Hello " +  user_name);
  }
}