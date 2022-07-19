package io.zipcoder;


import java.util.Scanner;

public class Application {
    public static void main (String [] pets) {

        System.out.println("How many pets do you have?");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Pet [] petty = new Pet[num];
        for (int x = 0; x<num; x++) {
            System.out.println("Is pet number " + x + " a dog, cat, or fish?");
            String ss = scan.next().toLowerCase();
            String name = "";
            if ("dog".equals(ss)) {
                System.out.println("What is the dog's name?");
                name = scan.next().toLowerCase();
                petty[x] = new Dog(name);
            } else if ("cat".equals(ss)) {
                System.out.println("What is the cat's name?");
                name = scan.next();
                petty[x] = new Cat(name);
            } else if ("fish".equals(ss)) {
                System.out.println("What is the fish's name?");
                name = scan.next();
                petty[x] = new Fish(name);
            } else {
                System.out.println("Not my pet...");
            }
        }
        for (Pet pet : petty) {
            System.out.println(pet.getName()+ " says " +pet.speak());
        }





    }


}
