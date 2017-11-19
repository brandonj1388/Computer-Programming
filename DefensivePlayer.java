//This is my own work, Brandon Johnson
package draftProject;

public class DefensivePlayer extends NFL_Player {
	private int sacks;
	private int tackles;

	public DefensivePlayer(String name, String position, String college, int age, int jerseyNum, String height,
			String weight, int sacks, int tackles, int gamesPlayed, int gamesStarted) {
		super(name, position, college, age, jerseyNum, height, weight, gamesPlayed, gamesStarted);
		setName(name);
		setPosition(position);
		setCollege(college);
		setAge(age);
		setJerseyNum(jerseyNum);
		setHeight(height);
		setWeight(weight);
		this.sacks = sacks;
		this.tackles = tackles;
		setGamesPlayed(gamesPlayed);
		setGamesStarted(gamesStarted);
	}

	public DefensivePlayer(int sacks, int tackles) {
		this.sacks = sacks;
		this.tackles = tackles;
	}

	public DefensivePlayer() {
	}

	/**
	 * @return the sacks
	 */
	public int getSacks() {
		return sacks;
	}

	/**
	 * @param sacks
	 *            the sacks to set
	 */
	public void setSacks(int sacks) {
		this.sacks = sacks;
	}

	/**
	 * @return the tackles
	 */
	public int getTackles() {
		return tackles;
	}

	/**
	 * @param tackles
	 *            the tackles to set
	 */
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DefensivePlayer [" + super.toString() + ", sacks=" + sacks + ", tackles=" + tackles + "]";
	}

}
