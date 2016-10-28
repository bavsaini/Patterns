/**
 * 
 */
package com.gumball;

/**
 * @author Bav
 *
 */
public class NoQuarter implements GumballState {
	
	GumballMahcine gumballMachine;

	/**
	 * @param gumballMachine
	 */
	public NoQuarter(GumballMahcine newgumballMachine) {
		gumballMachine = newgumballMachine;
	}

	/* (non-Javadoc)
	 * @see com.gumball.GumballState#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		System.out.println("Quarter Inserted");
	gumballMachine.setGumballState(gumballMachine.getyesQuarterState());
		
	}

	/* (non-Javadoc)
	 * @see com.gumball.GumballState#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		System.out.println("No Quarter, Insert Quarter First");	
	}

	/* (non-Javadoc)
	 * @see com.gumball.GumballState#requestBalls(int)
	 */
	@Override
	public void requestBalls(int ballstoeject) {
		
		System.out.println("Insert Quarter First");
		
	}

}
