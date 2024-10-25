package Part_C;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Laptop> laptopSet = new HashSet<>();

        Laptop laptop1 = new Laptop("Dell", "XPS 13", 13.3);
        Laptop laptop2 = new Laptop("Apple", "MacBook Air", 13.3);
        Laptop laptop3 = new Laptop("Dell", "XPS 13", 13.3);


        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);


        System.out.println("Laptops in the set:");
        for (Laptop laptop : laptopSet) {
            System.out.println(laptop);
        }


        System.out.println("Total number of unique laptops: " + laptopSet.size());
    }
}
