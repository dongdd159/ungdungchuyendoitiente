import java.util.Scanner;
public class ungdungchuyendoitiente {
    public static void main(String[] args) {
        int rate =23000;
        float USD = 0;
        float VND = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD: ");
        USD = scanner.nextFloat();
        VND = USD*rate;
        System.out.println("VND: " + VND);
    }
}
