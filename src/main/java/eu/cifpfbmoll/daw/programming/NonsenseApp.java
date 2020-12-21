package eu.cifpfbmoll.daw.programming;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class NonsenseApp {
    private static final String EXIT_KEY="9";
    public static void main(String[] args) {
        boolean aux=StringUtils.equals("a","A");
        System.out.println("hola mundo:"+aux);
        //Using scanner for getting input from user
        Scanner in=new Scanner(System.in);
        boolean isExit=false;
        while(!isExit){
            String s=in.nextLine();
            System.out.println("You entered string"+s);
            isExit=StringUtils.equals(s,EXIT_KEY);
        }

        System.out.println("-END-");
    }
}
