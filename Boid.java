package sims;

import mvc.*;
import simstation.*;


public class Boid extends Agent{

	private int speed;
	
	public Boid() {
		super();
		speed = Utilities.rng.nextInt(5) + 1;
	}


	public void update() {
	
		Boid neighbor = (Boid)world.getNeighbor(this, 20.0);
	
	//if agent has no neighbor, it continues to move at its normal speed and normal heading
	//sometimes there can be 2 flocks of birds, because the birds in one flock may not have 
	//been close to the 2nd flock of birds
	
		if (neighbor != null) {
		heading = neighbor.getHeading();
		speed = neighbor.getSpeed();

		}
	
		move(speed);
	
	public int getSpeed() {
		return speed;
	}
}
