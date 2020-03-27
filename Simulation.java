package simstation;

import java.util.*;
import mvc.*;

public class Simulation extends Model {
	public static int SIZE = 250;
	protected List<Agent> agents;
	private Timer timer;
	protected int clock;

	
	public Simulation () {
		agents = new LinkedList<Agent>();
		clock = 0;
	}
	
	public void addAgent(Agent a) {
		agents.add(a); //adds agent a to the list
		a.setWorld(this); //sets the agent a World pointer to this simulation
	}
	
	public synchronized Agent getNeighbor(Agent a) {
		Agent neighbor = null;
		boolean found = false;
		int i = Utilities.rng.nextInt(agents.size());
		int start = i;
		
		while (!found) {
			Agent candidate = agents.get(i);
			
			//got cut off
			if (candidate != asker && asker.distance(candidate < ) ) {
				neighbor = agents.get(i);
				found = true;
			} else {
				i = (i + 1) % agents.size();
				if (i== start) break;
			}
		} 
		
		return neighbor;
	}
	
	public void start() {
		agents = new LinkedList<Agent>();
		clock = 0;
		populate();
		timer = new Timer();
		timer.scheduleAtFixedRate(new ClockUpdater(),1000, 1000);
		
		for(Agent a:agents) {
			a.start();
		}
	}
	
	public void stop() {
		 timer.cancel();
		 timer.purge();
	}
	
	/*
	 * override in a subclass,this populate method has no operations 
	 * because only the customizer knows how many agents and 
	 * what kind of agents there should be
	 */
	
	public void populate() {
		
	}
	
	public synchronized void suspend() {
		
		for(Agent a:agents) {
			a.suspend();
		}
		
		timer.cancel();
		timer.purge();
	}
	
	public synchronized void resume() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new ClockUpdater(),1);
		for (Agent a:agents) {
			a.resume();
		}
	}
	
	
}

