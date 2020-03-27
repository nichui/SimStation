package simstation;

import java.util.*;

public abstract class Agent implements Serializable, Runnable {
	
	private Thread myThread;
	protected String name;
	protected Simulation world;
	private AgentState state;
	
	//for mobile agents
	protected Heading heading;
	protected int xc, yc;
	
	public Agent (String name) {
		this.name = name;
		state = AgentState.READY;
		myThread = null;
		
		//rng = random number generator
		//rng used to assign a random x and y coordinate for each agent
		xc = Utilities.rng.nextInt(Simulation.SIZE);
		yc = Utilities.rng.nextInt(Simulation.SIZE);
		heading = Heading.random(); //uses static method random to generate random Heading
	}
	
	public Agent() {
		this ("Agent _" + mvc.Utilities.getID());
	}
	
	
	
	

}
