//This is my own work Brandon Johnson
package draftProject;

import java.util.ArrayList;

public class Manager {
	ArrayList<NFL_Player> roster;

	// manage player class
	public Manager() {
		roster = new ArrayList<NFL_Player>();
		createPlayers();
	}

	// create players & add to roster
	public void createPlayers() {
		// player 1
		NFL_Player one = new NFL_Player("Shawn Jones", "Quarterback", "Ohio State", 13, 18, "6 foot, 10 inches",
				"205 lbs", 5025, 36, 0, 0, 45, 40);
		roster.add(one);
		// player 2
		one = new NFL_Player("Patrick Muns", "Running Back", "Michigan", 33, 19, "5 foot, 8 inches", "230 lbs", 2384,
				18, 0, 0, 36, 36);
		roster.add(one);
		// player 3
		one = new NFL_Player("Jason Bog", "Wide Reciever", "LSU", 88, 18, "6 foot, 11 inches", "196 lbs", 3000, 25, 0,
				0, 19, 10);
		roster.add(one);
		// player 4
		one = new NFL_Player("Marcus Lawry", "Conerback", "Alabama", 56, 19, "6 foot, 2 inches", "220 lbs", 0, 0, 6,
				120, 32, 20);
		roster.add(one);
		// player 5
		one = new NFL_Player("Brandon Stevens", "Linebacker", "Clemson", 48, 20, "5 foot, 9 inches", "215 lbs", 0, 0,
				20, 200, 29, 10);
		roster.add(one);
		// player 6
		one = new NFL_Player("Brian Adams", "Safety", "Penn State", 25, 20, "6 foot, 0 inches", "196 lbs", 0, 0, 3, 125,
				20, 0);
		roster.add(one);
	}

	public String toString() {
		String str = "";

		for (int i = 0; i < roster.size(); i++) {
			str += roster.get(i) + "\n";
		}
		return str + "\t";

	}
}