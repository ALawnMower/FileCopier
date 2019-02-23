import java.io.*;
import java.util.Random;
import java.io.Console;
import java.util.Scanner;

public class FileCopier {

   public static void main(String args[]) throws IOException {
	   
	   
	   int num = ToolBox.randNum(10);// Random of 10 questions
	   //System.out.println("DEBUG main: " + num);
       String[] lines = ToolBox.readLines("input.txt");
       System.out.println(lines[num]);
	   
	   // Gets user input answer
	   System.out.println("Enter your answer: ");
       Scanner scanner = new Scanner(System.in);
       String answer = scanner.nextLine();
       //System.out.println("Your answer is: " + answer);
	   
	   // Write to file
	   ToolBox.writeLine("output.txt", lines[num]);
       ToolBox.writeLine("output.txt", answer);

	   
	   

      } // End Of Static Void
   } // End Of Public Class