package CompositePattern;

public class Client {

	public static void main(String[] args) {
		
		//left side 
		//China Women
		SpecificTeam teakwando = new SpecificTeam("Women's Teakwando",4,4);
		SpecificTeam waterpolo = new SpecificTeam("Women's Waterpolo",9,5);
		SpecificTeam artistics = new SpecificTeam("Women's Artistic Gymnastics",6,2);
		CompositeTeam chinaw = new CompositeTeam("China-Women");
		chinaw.add(teakwando);
		chinaw.add(waterpolo);
		chinaw.add(artistics);
		
		//China Men
		SpecificTeam shooting = new SpecificTeam("Men's Shooting",8,5);
		CompositeTeam chinam = new CompositeTeam("China-Men");
		chinam.add(shooting);
		
		//China Team 
		CompositeTeam china = new CompositeTeam("China");
		china.add(chinaw);
		china.add(chinam);
		
		//Afghanistan Team
		SpecificTeam afghanistan = new SpecificTeam("Afghanistan Team",0,0);
		
		//Asia 
		CompositeTeam asia = new CompositeTeam("Asia");
		asia.add(china);
		asia.add(afghanistan);
		
		//Africa
		SpecificTeam africa = new SpecificTeam("African Team",0,0);
		
		//right side
		//Germany women
		SpecificTeam cycling = new SpecificTeam("Women's Cycling",9,6);
		SpecificTeam tennis = new SpecificTeam("Women's Tennis",5,4);
		CompositeTeam germanw = new CompositeTeam("Germany-Women");
		germanw.add(cycling);
		germanw.add(tennis);
		
		//Germany men
		SpecificTeam tableTennis = new SpecificTeam("Men's Table Tennis",8,6);
		SpecificTeam footbal = new SpecificTeam("Men's Footbal",16,4);
		CompositeTeam germanm = new CompositeTeam("Germany-Men");
		germanm.add(tableTennis);
		germanm.add(footbal);
		
		//Germany
		CompositeTeam germany = new CompositeTeam("Germany");
		germany.add(germanm);
		germany.add(germanw);
		
		//Italy Women
		SpecificTeam alpine = new SpecificTeam("Women's Alpine Sky",5,3);
		CompositeTeam italyw = new CompositeTeam("Italy-Women");
		italyw.add(alpine);
		
		//Italy Men
		SpecificTeam footbal2 = new SpecificTeam("Men's Footbal",18,3);
		SpecificTeam swimming = new SpecificTeam("Men's Swimming Team",8,7);
		CompositeTeam italym = new CompositeTeam("Italy-Men");
		italym.add(footbal2);
		italym.add(swimming);
		
		//Italy
		CompositeTeam italy = new CompositeTeam("Italy");
		italy.add(italym);
		italy.add(italyw);
		
		//Europa
		CompositeTeam europe = new CompositeTeam("Europe");
		europe.add(germany);
		europe.add(italy);
		
		//South America
		SpecificTeam southAmerica = new SpecificTeam("South America",0,0);
		
		//OlympicTeams
		CompositeTeam olympics = new CompositeTeam("Olympic-Teams");
		olympics.add(asia);
		olympics.add(africa);
		olympics.add(europe);
		olympics.add(southAmerica);
		
		//Prints
		germanm.printAthletes();
		System.out.println("-------------------------------------------------------------------");
		germany.printGold();
		System.out.println("-------------------------------------------------------------------");
		asia.printGold();
		System.out.println("-------------------------------------------------------------------");
		olympics.printAthletes();
		
	}

}
