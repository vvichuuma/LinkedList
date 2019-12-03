package com.codeWithMosh;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code heres

        LinkedList<String> locations = new LinkedList<String>();

        locations.add("A");
        locations.add("B");
        locations.add("C");
        locations.add("D");

        ListIterator<String> listIterator = locations.listIterator();

        printInstructions();
        boolean code = true;
        boolean forward = true;
        while(code){

            System.out.println("Please enter an option : ");
            int opt = scanner.nextInt();
            scanner.nextLine();
            switch(opt){
                case 0:
                    code = false;
                    System.out.println("Exiting Bye...");
                    break;
                case 1:
                    if(forward == false){
                       if(listIterator.hasNext()){
                           listIterator.next();
                           System.out.println("Going forward..");
                       }
                       forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now printing .. " + listIterator.next());
                    }else{
                        System.out.println("We reached the end of the List.");
                        forward = false;

                    }
                    break;
                case 2:
                    if(forward == true){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                            System.out.println("Going back..");
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now printing .." + listIterator.previous());
                    }else{
                        System.out.println("We reached the beginning of the list.");
                        forward = true;
                    }
                    break;
            }
        }


    }

    public static void printInstructions(){
        System.out.println("Press 0 - to exit the app");
        System.out.println("Press 1 - to move to next location ");
        System.out.println("Press 2 - to move to previous location");
    }
}
