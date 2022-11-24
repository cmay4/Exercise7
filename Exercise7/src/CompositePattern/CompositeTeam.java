package CompositePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeTeam implements OlympicTeams {

	private final List<OlympicTeams> teams = new ArrayList<>();
	String name;
	
	public CompositeTeam(String name, OlympicTeams... olympicTeams) {
		this.name = name;
		teams.addAll(Arrays.asList(olympicTeams));
	}

	public void add(OlympicTeams team) {
		teams.add(team);
	}

	public void remove(OlympicTeams team) {
		teams.remove(team);
	}

	@Override
	public void printAthletes() {
		System.out.println(this.name);
		for (OlympicTeams team : teams) {
			team.printAthletes();
		}
		System.out.println();
	}

	@Override
	public void printGold() {
		System.out.println(this.name);
		for (OlympicTeams team : teams) {
			team.printGold();
		}
		System.out.println();
	}

}
