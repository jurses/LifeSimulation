package dad.lifesimulation.main.entities.actor;

import dad.lifesimulation.main.entities.Entity;
import dad.lifesimulation.main.utils.Coordinates;
import dad.lifesimulation.main.utils.Dimension;
import dad.lifesimulation.main.utils.Statistics;

public abstract class Actor extends Entity {
	protected Statistics statistics;
	protected Boolean hostilToOthers;

	public Actor(Coordinates _coordinates, Dimension _dimension, Boolean _tangible, Statistics _statistics,
			Boolean hostilToOthers) {
		super(_coordinates, _dimension, _tangible);
		this.statistics = _statistics;
		this.hostilToOthers = hostilToOthers;
	}

	public Statistics getStatistics() {
		return statistics;
	}

}