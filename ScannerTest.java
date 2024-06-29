package LocalRepo;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
            System.out.println("Welcome to Scanner test file\n");
            System.out.print("Please enter your name : ");
            String name = input.next();
            System.out.print("Please enter your age : ");
            int age = input.nextInt();
            System.out.printf("Hello Mr./Mrs. %s, Your age is %d",name,age);
    }
    
}
