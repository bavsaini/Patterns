/**
 * 
 */
package com.gumball;

/**
 * @author Bav
 *
 */
public interface GumballState {
	
	//these are the expected behavior performed by user for each state of the gumball machine

	public void insertQuarter();
	public void ejectQuarter();
	public void requestBalls(int ballstoeject);  //no. of balls to eject 
}
