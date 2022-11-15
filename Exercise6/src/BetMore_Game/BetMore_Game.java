package BetMore_Game;

public class BetMore_Game {
	
	int x;
	static Player computer;
	Player player_2;
	Shuffle s;
	Player winner;
	
	public BetMore_Game(Player p1, Player p2) {
		computer = p1;
		player_2 = p2;
		s = new Shuffle();
	}
	
	public static void play() {
		System.out.println(computer+" is playing...");
		
	}

	public Player FindWinner(Player p1, Player p2) {
		if(p1.x<p2.x) {
			System.out.println("The winner is "+p2.getName()+" !!!");
			winner = p2;
		}
		else if(p1.x>p2.x) {
			System.out.println("The winner is "+p1.getName()+" !!!");
			winner = p1;
		}
		else {
			System.out.println("Its a draw!!!");
			winner = null;
		}
		return winner;
	}
	
}
