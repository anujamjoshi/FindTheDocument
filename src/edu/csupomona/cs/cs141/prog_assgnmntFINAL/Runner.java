/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;quez
 * 
 * Final Project Programming assignment
 * 
 * For this project, we as a group explored the basics of computer programming, using only simple methods and ways to properly
 * find a solution for this project.
 * 
 * <The Rusty Spoons>
 * <Mario Garcia> <Anuja Joshi> <Michelle Duoung> <Matthew Musquiz> <Kristin Adachi>
 */
package edu.csupomona.cs.cs141.prog_assgnmntFINAL;

import java.util.Scanner;

/**
 * The main class of the game. This class is intended to run the game to its fullest extent.
 * @author Mario Garcia,   Anuja Joshi,   Michelle Duong, Matthew Musquiz, Kristin Adachi
 *
 */
public class Runner 
{	
	/**
	 * The main method to run the class. This method will ask the user if they would like to run the graphical user interface,
	 *  or simply run the text game. Any other button will quit the program.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		char choice;
		System.out.print("T=text game\nG=Graphical User Interface\nAny Key= quit: ");
		choice = kb.nextLine().charAt(0);
		
		if(choice == 'T' || choice == 't')
		{
			UserInterface ui = new UserInterface();
			ui.playGame();
		}
		else if(choice == 'G' || choice == 'g')
		{
			InterfaceGUI gui = new InterfaceGUI();
			gui.play();
		}
		else
		{
			System.out.println("QUIT");
			System.exit(0);
		}
	}
}
