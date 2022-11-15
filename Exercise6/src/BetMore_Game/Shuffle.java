package BetMore_Game;

import java.util.Random;
import java.util.Scanner;

public class Shuffle {

	static int times=0;;
	static Scanner s = new Scanner(System.in);
	
	public Shuffle() {
		
	}
	
	public int pick_card(Player p) {
		Random r = new Random();
		
		if(p.getName()=="Computer") {
			p.x = r.nextInt(100)+1;
			p.user_selected=true;
			//System.out.println("The Computer picks number: "+p.x);
			System.out.println("Computer picked its number!");
			return p.x;
		}
		else if(p.getName()=="Player_2" ){
			while(p.user_selected==false && times <=5){
				p.x = r.nextInt(100)+1;
				times++;
				System.out.println("Would you like to pick this number "+p.x+" ? - y='YES', n='NO'");
				if(s.next().equals("y")) {
					p.user_selected = true;
				}
			}
			System.out.println("Your number is selected!");
			return p.x;
		}
		return 0;
	}
	
}


