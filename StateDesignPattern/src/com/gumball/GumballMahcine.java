/**
 * 
 */
package com.gumball;

/**
 * @author Bav
 *
 */
public class GumballMahcine {

	GumballState hasQuarter;   // variables of the type class GumballState ro set and get the state of the machine 
	GumballState noQuarter;
	GumballState machineoutoforder;
	
	GumballState gumballState; // gumballState 
	
	int ballsInMachine = 50; // intial no. of balls in machine 

	/**
	 * @param hasQuarter
	 * @param noQuarter
	 * @param machineoutoforder
	 * @param gumballState
	 * @param ballsInMachine
	 */
	public GumballMahcine() {
		
		hasQuarter = new HasQuarter(this);  // variables of type states/classes referred to itself 
		noQuarter = new NoQuarter(this);
		machineoutoforder = new NoBall(this);
		
		gumballState = noQuarter; // intial state of gumball machine set to no quarter 
		
		if(ballsInMachine <=0){     //if balls in machine is zero, machien is out of order i.e. no ball 
			
			gumballState = machineoutoforder;
		}
	
	}
	
	void setGumballState( GumballState newGumballState){
		
		gumballState = newGumballState;   // function set gumball state everytime a function/behavior is called  
	}
	
	public void setballsInMachine( int newballsInMachine){
		ballsInMachine = newballsInMachine;				//functions to set no. of balls in machine, everytime balls are requestd, it is updated here 
		
	}
	
	public void insertQuarter(){
		
		gumballState.insertQuarter();  // change to state to insertQuarter when this is called 
	}
	
	public void ejectQuarter()
	{
		gumballState.ejectQuarter();
	}
	
	public void requestBalls(int ballsToEject ){
		gumballState.requestBalls(ballsToEject);
	}
	
	public GumballState getyesQuarterState(){ //get gumballstates, return values in the beggining of the class
		return hasQuarter;
	}
	
	public GumballState getnoQuarterState(){
		return noQuarter;
	}
	
	public GumballState getnoBallState(){
		return machineoutoforder;
	}
	
}
