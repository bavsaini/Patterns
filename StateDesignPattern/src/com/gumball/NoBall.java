/**
 * 
 */
package com.gumball;

/**
 * @author Bav
 *
 */
public class NoBall implements GumballState {

	GumballMahcine gumballMachine;
	/**
	 * @param gumballMachine
	 */
	public NoBall(GumballMahcine newgumballMachine) {
		
		gumballMachine = newgumballMachine;
	}

	/* (non-Javadoc)
	 * @see com.gumball.GumballState#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		System.out.println("Please Insert Quarter to eject ball");
		
	}

	/* (non-Javadoc)
	 * @see com.gumball.GumballState#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		System.out.println("Please Insert Quarter to eject ball");
		System.out.println("Please !!!");
	}

	/* (non-Javadoc)
	 * @see com.gumball.GumballState#requestBalls(int)
	 */
	@Override
	public void requestBalls(int ballstoeject) {
		System.out.println("No ball to eject: Out of order");
		
	}

}
