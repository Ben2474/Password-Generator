package javaapplication45;
import java.util.Scanner;
public class javaapplication45 {
public static final Scanner keyboard = new Scanner(System.in);
public static void main(String[] args) {
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}


 
    
