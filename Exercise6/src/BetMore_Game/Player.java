package BetMore_Game;

public class Player {
	
	
	int x; 
	private String name; 
	private Boolean user_selected = false;
	
	public Player(String name) {
		this.name=name;
	}
	
	public void start() {
		//BetMore_Game.play();
		System.out.println("The " +this.getName()+ " starts the game..");
	}

	public String getName() {
		return name;
	}


	public Boolean getUser_selected() {
		return user_selected;
	}

	public void setUser_selected(Boolean user_selected) {
		this.user_selected = user_selected;
	}
	
	
}
