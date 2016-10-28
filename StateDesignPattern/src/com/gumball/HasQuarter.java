/**
 * 
 */
package com.gumball;

/**
 * @author Bav
 *
 */
public class HasQuarter implements GumballState {

	GumballMahcine gumballmachine;

	/**
	 * @param gumballmachine
	 */
	public HasQuarter(GumballMahcine newgumballmachine) {

		gumballmachine = newgumballmachine;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gumball.GumballState#insertQuarter()
	 */
	@Override
	public void insertQuarter() {
		System.out.println("Already Inserted!! One Quarter at a time. Please");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gumball.GumballState#ejectQuarter()
	 */
	@Override
	public void ejectQuarter() {
		System.out.println("Quarter is Ejected");
		gumballmachine.setGumballState(gumballmachine.getnoQuarterState());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gumball.GumballState#requestBalls(int)
	 */
	@Override
	public void requestBalls(int ballstoeject) {
		if (ballstoeject > 50) {
			System.out.println("No Balls Ejected");
			gumballmachine.setGumballState(gumballmachine.getnoBallState());
		} else {

			System.out.println(ballstoeject + " is provided by the machine");

			gumballmachine.setballsInMachine(gumballmachine.ballsInMachine - ballstoeject);
		
			gumballmachine.setGumballState(gumballmachine.getnoQuarterState());

		}

	}
}
