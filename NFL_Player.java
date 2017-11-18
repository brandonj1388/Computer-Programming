//This is my own work Brandon Johnson
package draftProject;

public class NFL_Player {
	// profile
	String name = new String();
	String position = new String();
	String college = new String();
	Integer jerseyNum = 0;
	Integer age = 0;
	String height = new String();
	String weight = new String();
	// stats
	Integer yards = 0;
	Integer touchdowns = 0;
	Integer sacks = 0;
	Integer tackles = 0;
	Integer gamesPlayed = 0;
	Integer gamesStarted = 0;

	// constructor with parameters
	public NFL_Player(String name, String position, String college, int age, int jerseyNum, String height,
			String weight, int yards, int touchdowns, int sacks, int tackles, int gamesPlayed, int gamesStarted) {
		this.name = name;
		this.position = position;
		this.college = college;
		this.jerseyNum = jerseyNum;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.yards = yards;
		this.touchdowns = touchdowns;
		this.sacks = sacks;
		this.tackles = tackles;
		this.gamesPlayed = gamesPlayed;
		this.gamesStarted = gamesStarted;
	}

	// constructor with no parameters
	public NFL_Player() {
		name = "-";
		position = "-";
		college = "-";
		jerseyNum = 00;
		age = 18;
		height = "-" + " feet &" + "-" + " inches";
		weight = "-" + " lbs";
		yards = 0;
		touchdowns = 0;
		sacks = 0;
		tackles = 0;
		gamesPlayed = 0;
		gamesStarted = 0;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getJerseyNum() {
		return jerseyNum;
	}

	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getYards() {
		return yards;
	}

	public void setYards(int yards) {
		this.yards = yards;
	}

	public int getTouchdowns() {
		return touchdowns;
	}

	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}

	public int getSacks() {
		return sacks;
	}

	public void setSacks(int sacks) {
		this.sacks = sacks;
	}

	public int getTackles() {
		return tackles;
	}

	public void setTackles(int tackles) {
		this.tackles = tackles;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getGamesStarted() {
		return gamesStarted;
	}

	public void setGamesStarted(int gamesStarted) {
		this.gamesStarted = gamesStarted;
	}

	@Override
	public String toString() {
		return "NFL_Player [\n //Profile//\n name= " + name + "\n position= " + position + "\n college= " + college
				+ "\n jerseyNum= " + jerseyNum + "\n age= " + age + "\n height= " + height + "\n weight= " + weight
				+ "\n //Stats// \n yards= " + yards + " touchdowns= " + touchdowns + ", sacks= " + sacks + ", tackles= "
				+ tackles + " gamesPlayed= " + gamesPlayed + " gamesStarted= " + gamesStarted + "]";
	}

}
