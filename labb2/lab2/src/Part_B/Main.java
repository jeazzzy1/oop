package Part_B;

public class Main {
    public static void main(String[] args) {
        DVD dvd1 = new DVD("Inception", "Christopher Nolan", 2010, 148);
        DVD dvd2 = new DVD("Shrek", "William Steig", 2001, 100);

        System.out.println("\nDVD Details:");
        System.out.println(dvd1.toString());
        System.out.println("Is suitable for children: " + dvd1.forChildren());

        System.out.println("\nDVD Details:");
        System.out.println(dvd2.toString());
        System.out.println("Is suitable for children: " + dvd2.forChildren());
    }
}
