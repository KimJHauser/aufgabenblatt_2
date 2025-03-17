import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Geben Sie erst Ihre Körpergröße in Metern und dann Ihr Krörpergewicht in kg an:");

        Scanner eingabe = new Scanner(System.in);
        double koerpergroesse = eingabe.nextDouble();
        double koerpergewicht = eingabe.nextDouble();
        int bmi = (int) (koerpergewicht / (koerpergroesse * koerpergroesse));

        System.out.println(bmi);



    }
}