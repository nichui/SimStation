package sims;

import simstation.*;

interface CooperateStrategy {
	public boolean cooperate();
}

class Prisoner extends Agent {
	CooperateStrategy strategy;
	int fitness = 0;
	public boolean cooperate() {
		return strategy.cooperate();
	}
}

public class PDTournament extends Simulation {

	@Override
	public void populate() {
		super.populate();
		
		for(int i = 0; i <25; i++) {
			addAgent(newPrisoner(new AlwaysCheatStrategy()()));
		}
	}
	
	@Override
	public String[] getStats() {
		
		public void getStats() {
			
		}
	}
	
}
