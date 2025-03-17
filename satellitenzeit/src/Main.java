import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int eingabe = myObj.nextInt();
        int days = eingabe/ 86400;
        int hours = (eingabe - (days * 86400)) / 3600;
        int minutes = ((eingabe - (days * 86400) - (hours * 3600)) /60);
        int seconds = eingabe - (days * 86400) - (hours * 3600) - (minutes * 60);

        System.out.println(days+" days");
        System.out.println(hours+" hours");
        System.out.println(minutes+" minutes");
        System.out.println(seconds+" seconds");
    }
}