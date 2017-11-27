//This is my own work Brandon Johnson
package draftProject;

public abstract class NFL_Player {

	// profile
	private String name = new String();
	private String position = new String();
	private String college = new String();
	private Integer jerseyNum = 0;
	private Integer age = 0;
	private String height = new String();
	private String weight = new String();
	// stats
	private Integer gamesPlayed = 0;
	private Integer gamesStarted = 0;

	// constructor with parameters
	protected NFL_Player(String name, String position, String college, int age, int jerseyNum, String height,
			String weight, int gamesPlayed, int gamesStarted) {
		this.name = name;
		this.position = position;
		this.college = college;
		this.jerseyNum = jerseyNum;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gamesPlayed = gamesPlayed;
		this.gamesStarted = gamesStarted;
	}

	// constructor with no parameters
	protected NFL_Player() {
		name = "-";
		position = "-";
		college = "-";
		jerseyNum = 00;
		age = 18;
		height = "-" + " feet &" + "-" + " inches";
		weight = "-" + " lbs";
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
		return "\n //Profile//\n name: " + name + "\n position: " + position + "\n college: " + college
				+ "\n jerseyNum: " + jerseyNum + "\n age: " + age + "\n height: " + height + "\n weight: " + weight
				+ "\n //Stats// \n" + " gamesPlayed: " + gamesPlayed + "\n" + " gamesStarted: " + gamesStarted + "\n";
	}

}
