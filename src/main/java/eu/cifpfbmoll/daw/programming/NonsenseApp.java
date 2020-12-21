package eu.cifpfbmoll.daw.programming;

import java.util.Scanner;

public class NonsenseApp {
    public static void main(String[] args) {
        //Using scanner for getting input from user
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println("You entered string"+s);
        System.out.println("-END-");
    }
}
