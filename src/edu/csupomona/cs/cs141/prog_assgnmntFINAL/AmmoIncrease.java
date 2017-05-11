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
import javax.swing.JOptionPane;

/**
 * AmmoIncrease is a subclass of {@link PowerUp}, and its purpose is to add an additional bullet to the player's 
 * ammunition cartridge. 
 * @author Mario Garcia,   Anuja Joshi,   Michelle Duoung, Matthew Musquiz, Kristin Adachi
 *
 */

public class AmmoIncrease extends PowerUp implements Serializable {
	
	private static final long serialVersionUID = 6899766490453485803L;
	/**
	 * ammuntion that the player will recieve, this is set to one by the constructor.
	 */
	private int ammoUp;
	
	public AmmoIncrease()
	{
		super("AMMO INCREASE","A", new JLabel(new ImageIcon("GameImgs/Bullet.jpg")));
		ammoUp = 1;
	}
	
	/**
	 * Access the player object to increase their ammunition
	 * @returns active - the active state of the power up.
	 */
	public boolean activate(Spy spy, Room[] rooms)
	{
		System.out.println(getName() + " POWER UP HAS BEEN ACTIVATED! ( + 1 AMMO )");
		spy.gainBullets(ammoUp);
		return super.activate(spy, rooms);
	}
}