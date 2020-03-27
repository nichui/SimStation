package sims;

import simstation.*;
import java.util.*;

public class BoidSimulation {

}

class BoidFactory extends SimulationFactory {
	public Model make Model() {
		return new BoidSimulation;
	}
}

//this declares how many agents and what kind of agents 
public class BoidSimulation extends Simulation {
	public void populate() {
		for(int i =0; i< 50; i++) {  //total 50 birds/agents
			addAgent(new Boid()); //addAgent comes from Simulation
		}
	}
	
	public static void main(String[] args) {
		AppPanel panel = new SimulationPanel (new BoidFactory);
		panel.display();
	}
}