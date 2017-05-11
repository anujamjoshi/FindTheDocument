package edu.csupomona.cs.cs141.prog_assgnmntFINAL;

/**
 * Of course every entity is simply a cute little ball of energy. This interface is implemented across all 
 * objects that will otherise be using these methods that will allow for easier understanding of how similar 
 * these objects are.
 * @author cmgarcia
 *
 */
public interface BallOfEnergy
{

	/**
	 * 
	 * @param x - the row location of the object.
	 * @param y - the col location of the object.
	 */
	public void getLocation(int x, int y);

	/**
	 * Return the row location of the object.
	 * @return row - the row coordinate of the object in a grid.
	 */
	public int getRow();
	
	/**
	 * Return the coloumn location of the object.
	 * @return col - the coloumn coordinate of the object in a grid.
	 */
	public int getCol();
	
	/**
	 * Returns the symbol of the object.
	 * @return symbol - the symbol representing the object.
	 */	
}
