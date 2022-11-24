package CompositePattern;

public class SpecificTeam implements OlympicTeams{
	
	protected String name;
	protected int numberAthletes;
	protected int numberGold;
	
	public SpecificTeam(String name, int athletes, int gold) {
		this.name=name;
		this.numberAthletes=athletes;
		this.numberGold=gold;
	}



	@Override
	public void printAthletes() {
		// TODO Auto-generated method stub
		
		System.out.println("Team: "+name + ", Number of Athletes: "+numberAthletes);
		
	}

	@Override
	public void printGold() {
		// TODO Auto-generated method stub
		System.out.println("Team: "+name + ", Number of Gold Medals: "+numberAthletes);
	}
	
}
