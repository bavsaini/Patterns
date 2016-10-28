/**
 * 
 */
package com.gumball;

/**
 * @author Bav
 *
 */
public class TestGumballMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		GumballMahcine gumballMachine = new GumballMahcine();
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.requestBalls(10);
		gumballMachine.insertQuarter();
		gumballMachine.requestBalls(20);
		gumballMachine.insertQuarter();
		gumballMachine.requestBalls(20);
		gumballMachine.insertQuarter();
		gumballMachine.requestBalls(10);
		
		
		
	}

}
