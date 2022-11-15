package BetMore_Game;

public class Game_Chair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player computer = new Player("Computer");
		Player player_2 = new Player ("Player_2");
		BetMore_Game bet = new BetMore_Game(computer,player_2);
		Shuffle s = new Shuffle();
		
		computer.start();
		computer.x = s.pick_card(computer);
		
		player_2.start();
		player_2.x = s.pick_card(player_2);
		
		bet.FindWinner(computer, player_2);
	}

}
