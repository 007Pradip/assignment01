import java.util.Scanner;
public class Practice_If {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt(); //it's take input of the user
        if (a>0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    }

}
