//This is my own work Brandon Johnson
package draftProject;

import java.util.ArrayList;

public class Manager extends NFL_Player {
	public static ArrayList<NFL_Player> roster;

	// manage player class
	public Manager() {
		roster = new ArrayList<NFL_Player>();
		createOffensivePlayers();
		createDefensivePlayers();
	}

	// create players & add to roster
	public void createOffensivePlayers() {
		// player 1
		OffensivePlayer one = new OffensivePlayer("Shawn Jones", "Quarterback", "Ohio State", 18, 13,
				"6 foot, 10 inches", "205 lbs", 5000, 25, 45, 40);
		roster.add(one);

		// player 2
		one = new OffensivePlayer("Patrick Muns", "Running Back", "Michigan", 19, 33, "5 foot, 8 inches", "230 lbs",
				2550, 13, 36, 36);
		roster.add(one);
		// player 3
		one = new OffensivePlayer("Jason Bog", "Wide Reciever", "LSU", 18, 88, "6 foot, 11 inches", "196 lbs", 1830, 18,
				19, 10);
		roster.add(one);
	}

	public void createDefensivePlayers() {
		// player 4
		DefensivePlayer two = new DefensivePlayer("Marcus Lawry", "Conerback", "Alabama", 19, 56, "6 foot, 2 inches",
				"220 lbs", 5, 115, 32, 20);
		roster.add(two);
		// player 5
		two = new DefensivePlayer("Brandon Stevens", "Linebacker", "Clemson", 20, 48, "5 foot, 9 inches", "215 lbs", 15,
				200, 29, 10);
		roster.add(two);
		// player 6
		two = new DefensivePlayer("Brian Adams", "Safety", "Penn State", 20, 25, "6 foot, 0 inches", "196 lbs", 2, 150,
				20, 0);
		roster.add(two);
	}

	public String toString() {
		String str = "";

		for (int i = 0; i < roster.size(); i++) {
			str += roster.get(i) + "\n";
		}
		return str + "\t";

	}
}