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

import java.io.Serializable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * A subclass of {@link PowerUp}, this class is used to set the player to an invincible state.
 * @author Mario Garcia,   Anuja Joshi,   Michelle Duoung, Matthew Musquiz, Kristin Adachi
 *
 */

public class Invincibility extends PowerUp implements Serializable {
	
	private static final long serialVersionUID = 8312939686959752383L;
	/**
	 * Intended to construct the Invincibility power up that will be spawned onto the grid.
	 * Constructor method.
	 */
	public Invincibility()
	{
		super("INVINCIBILITY","I", new JLabel(new ImageIcon("GameImgs/Invincibility.jpg")));
	}

	/**
	 * Set the player's invincibility, which is a boolean, to true.
	 * @returns active - the active state of the power up.
	 */
	public boolean activate(Spy spy, Room[] rooms)
	{
		System.out.println(getName() + " POWER UP HAS BEEN ACTIVATED! ( INVINCIBLE FOR 5 TURNS )");
		spy.makeImpenetrable(true);
		return super.activate(spy, rooms);
	}
}