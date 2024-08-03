import java.util.Scanner;
public class Greet {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        //To get the inputs
        System.out.println("Username:");
        String username = scanner.nextLine();
        System.out.println("Pin");
        int userpin = scanner.nextInt();
        System.out.println("Hash:");
        long userhash = scanner.nextLong();

        //To display the inputs
        System.out.println(username);
        System.out.println(userpin);
        System.out.println(userhash);
    }
}
