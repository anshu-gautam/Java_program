import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    int a, b, c, tot;
    float per;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter total marks :");
    a = input.nextInt();
    if (a > 90 && a <= 100)
      System.out.println("Grade : O");
    else {
      if (a >= 80 && a < 90)
        System.out.println("Grade : E");
      else {
        if (a >= 70 && a < 80)
          System.out.println("Grade : A");
        else {
          if (a >= 60 && a < 70)
            System.out.println("Grade : B");
          {
            if (a >= 50 && a < 60)
              System.out.println("Grade : C");
            else {
              if (a >= 35 && a < 50)
                System.out.println("Grade : D");
              else
                System.out.println("Grade : F");
            }
          }
        }
      }
    }
  }
}
