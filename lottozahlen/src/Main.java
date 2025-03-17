public class Main {
    public static void main(String[] args) {
      int lottozahl1 = (int) ((Math.random() * 49) +1);
      int lottozahl2 = (int) ((Math.random() * 49) +1);
      int lottozahl3 = (int) ((Math.random() * 49) +1);
      int lottozahl4 = (int) ((Math.random() * 49) +1);
      int lottozahl5 = (int) ((Math.random() * 49) +1);
      int lottozahl6 = (int) ((Math.random() * 49) +1);

      System.out.println("Heutige Lottozahlen:");
      System.out.println(lottozahl1);
      System.out.println(lottozahl2);
      System.out.println(lottozahl3);
      System.out.println(lottozahl4);
      System.out.println(lottozahl5);
      System.out.println(lottozahl6);
    }
}