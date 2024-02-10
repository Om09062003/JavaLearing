package Strings;

import java.util.Scanner;

public class BasicStrings {

    public static void printLetter(String fullname){
        for(int i=0; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args){
        /* char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz"); */

        //String is IMMUTALBE

        /* Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length()); */

        String firstname = "Om";
        String lastname = "Ugale";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname.charAt(0));

        printLetter(fullname);
    }
}
