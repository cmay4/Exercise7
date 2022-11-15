package BetMore_Game;

public class Player {
	
	
	int x; 
	private String name; 
	Boolean user_selected = false;
	
	public Player(String name) {
		setName(name);
	}
	
	public void start() {
		//BetMore_Game.play();
		System.out.println("The " +this.getName()+ " starts the game..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
