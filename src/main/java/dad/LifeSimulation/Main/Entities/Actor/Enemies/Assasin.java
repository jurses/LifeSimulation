package dad.LifeSimulation.Main.Entities.Actor.Enemies;

import dad.LifeSimulation.Main.Entities.Actor.Actor;
import dad.LifeSimulation.Main.Utils.Coordinates;
import dad.LifeSimulation.Main.Utils.Dimension;
import dad.LifeSimulation.Main.Utils.Statistics;

public class Assasin extends Actor {
	private boolean hostilToPlayers;

	public Assasin(Coordinates _coordinates, Dimension _dimension, Boolean _tangible, Statistics _statistics,
			Boolean hostilToOthers, Boolean _hostilToPlayers) {
		super(_coordinates, _dimension, _tangible, _statistics, hostilToOthers);
		this.hostilToPlayers = _hostilToPlayers;

	}

	public void update() {
		// TODO Auto-generated method stub
		
	}



}