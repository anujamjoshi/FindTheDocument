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


import java.io.*;

/**
 * This class is intended to save a progress of the game that the player currently is in, and to 
 * load the saved game upon starting up the program again. At this point, the program is to save the current state of
 * the engine, which will then be returned and reassigned back into the program once it is called again.
 * 
 * @author Mario Garcia,   Anuja Joshi,   Michelle Duong, Matthew Musquiz, Kristin Adachi
 *
 */

public class SaveLoad
{
	/**
	 * Saves the game engine that is in its current state.
	 * @param filename - name of the file to load.
	 * @param engine - the engine object that is to be stored.
	 */
    public void save(String filename, Engine engine)
    {
        // put your code here
        try 
        {
        	FileOutputStream fos = new FileOutputStream(filename + ".dat");
        	ObjectOutputStream oos = new ObjectOutputStream(fos);
        	oos.writeObject(engine);
        	oos.close();
        }
        catch (FileNotFoundException e)
        {
        	System.err.println("NO SAVE BY THAT NAME " + e.getMessage());
//        	e.printStackTrace();
        }
        catch (IOException e)
        {
        	e.printStackTrace();
        }

    }
    
    /**
     * loads the game engine back into the program. Engine is reassigned back.
     * @param filename - name of the file to load.
     * @return engine - the engine that is loaded from the file.
     */
    public Engine load(String filename)
    {
    	Engine engine = null;
    	try
    	{
    		FileInputStream fis = new FileInputStream(filename + ".dat");
    		ObjectInputStream ois = new ObjectInputStream(fis);
        
    		Engine loadedEngine = (Engine) ois.readObject();
    		engine = loadedEngine;
    		ois.close();
    	}
    	catch (FileNotFoundException e)
    	{
    		System.err.print( filename + ".dat is not found.");
    		engine = null;
    	}
    	catch (IOException e)
    	{
    		e.printStackTrace();
    	} 
    	catch (ClassNotFoundException e)
    	{
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	return engine;
    }
}