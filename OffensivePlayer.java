//This is my own work, Brandon Johnson
package draftProject;

public class OffensivePlayer extends NFL_Player {
	private int yards;
	private int touchdowns;

	public OffensivePlayer(String name, String position, String college, int age, int jerseyNum, String height,
			String weight, int yards, int touchdowns, int gamesPlayed, int gamesStarted) {
		super(name, position, college, age, jerseyNum, height, weight, gamesPlayed, gamesStarted);
		setName(name);
		setPosition(position);
		setCollege(college);
		setAge(age);
		setJerseyNum(jerseyNum);
		setHeight(height);
		setWeight(weight);
		this.yards = yards;
		this.touchdowns = touchdowns;
		setGamesPlayed(gamesPlayed);
		setGamesStarted(gamesStarted);
	}

	public OffensivePlayer(int yards, int touchdowns) {
		this.yards = yards;
		this.touchdowns = touchdowns;

	}

	public OffensivePlayer() {
		yards = 0;
		touchdowns = 0;
	}

	/**
	 * @return the yards
	 */
	public int getYards() {
		return yards;
	}

	/**
	 * @param yards
	 *            the yards to set
	 */
	public void setYards(int yards) {
		this.yards = yards;
	}

	/**
	 * @return the touchdowns
	 */
	public int getTouchdowns() {
		return touchdowns;
	}

	/**
	 * @param touchdowns
	 *            the touchdowns to set
	 */
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OffensivePlayer" + super.toString() + "yards=" + yards + ", touchdowns=" + touchdowns;
	}

}
