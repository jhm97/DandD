import java.util.Scanner;

public class Dungeon {

	public static void main(String[] args) {
		Player player1 = new Player();
		Map map1 = new Map();
		Attack attack1 = new Attack();
		AsciiArt ascii = new AsciiArt();
		int action;


		Scanner keyboard = new Scanner(System. in);
		System.out.println("input name: ");
		String input = keyboard.nextLine();
		player1.setName(input);//sets players name
		player1.playerStart(); //sets his dameage, health and pos
		map1.mapStart(); //sets key and potions
		System.out.println(ascii.clr());
		System.out.println( "\n" + player1.playerInfo()); // prints the player status
		System.out.println("\n\n\n\n\n" + map1.mapLocation(player1.getPosition())); // gets the map location to be 1
		int count=0; //temp for text
		do {
			System.out.println(ascii.clr());
			if(count > 1) System.out.println("[DUNGEON MASTER] KEEP GOING INTO YOUR NEXT ROOM");
			count++;
			player1.playerDead(player1.getHealth());//checks if the players is dead
			System.out.println(" \n\n\n [DUNGEON MASTER] WOULD YOU LIKE TO MOVE UP, DOWN, LEFT OR RIGHT");
			map1.setMove(keyboard.nextInt());//sets the move of p1
			System.out.println(ascii.clr());
			ascii.door();
			ascii.nap();//nap is a 1 sec break
			player1.setPosition(map1.getMove());//the number they pressed is the room
			map1.mapLocation(player1.getPosition());//the position of p1
			System.out.println(ascii.clr());
			//System.out.println(map1.getKey()); //prints out number of the exit
			map1.checkKey(player1.getPosition());//check player position
			map1.selectMonster(player1.getPosition());//System.out.println(map1.monsterInfo());

			do{ //while monster not dead
				player1.playerDead(player1.getHealth()); // checks if the player died
				//player position = monster
				if(player1.getPosition() == 1) {  //prints out the type of monster
					ascii.Monster1();
				}
				else if(player1.getPosition() == 2) {
					ascii.Monster2();
				}
				else if(player1.getPosition() == 3) {
					ascii.Monster3();
				}
				else if(player1.getPosition() == 4) {
					ascii.Monster4();
				}
				ascii.nap();
				System.out.println(map1.monsterInfo() + "\n"); //shows the info on the moster
				ascii.music(map1.getmSound());
				ascii.warrior(); //show the player ascii
				System.out.println(player1.playerInfo()); //prints the player info
				player1.playerDead(player1.getHealth());//checks if player died
				System.out.println("\n [DUNGEON MASTER] WHAT WOULD YOU LIKE TO DO? \n 1 ATTACK \n 2 POTION (" + map1.getPotionCount() + ")");
				action = keyboard.nextInt(); //selects what to do 1 attack 2 potion
				//make a new class named options for future additions RUN, special attack
				switch(action) {
				case 1:{ //attacks monster
					System.out.println(ascii.clr());
					ascii.attack();
					ascii.nap();
					System.out.println(ascii.clr());
					map1.setmHealth(attack1.attack(map1.getmHealth(), player1.getDamage())); // subtracts the attack from health
					player1.setHealth(attack1.getAttacked(player1.getHealth(), map1.getmDamage())); //subtracts monster attack from p1
					player1.playerDead(player1.getHealth()); // checks if the player is dead
					
					
					if(map1.monsterCheck(map1.getmHealth())) {//sets the xp and life of player
						player1.setXp(player1.getXp() + 1);
						player1.setHealth((int)(player1.getHealth() + ((player1.getXp()/player1.getHealth())*100)));
					}
					map1.monsterCheck(map1.getmHealth());//checks monster life
					break;
				}
				case 2:{ //uses potion
					map1.setPotionCount(map1.getPotionCount() - 1); //subt the potion used
					player1.setHealth(map1.usePotion(player1.getHealth())); // adds the potion to health
					System.out.println("\n" + ascii.clr());
					ascii.potionF();
					ascii.nap();
					System.out.println(ascii.clr());
					ascii.potionE();
					ascii.nap();
					break;
				}
				}
			}while(map1.monsterCheck(map1.getmHealth()) == false && !player1.isGame());//end while

			if( player1.getHealth() <= 0) { //if the players health is lower than 1 shows player lost 
				ascii.Death();
				System.out.println("[DUNGEON MASTER] YOU DIED!");
				ascii.music("playerdied");
				ascii.nap();ascii.nap();ascii.nap();
				
				if(player1.playagain()) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					main(null);
					}
				else System.exit(0);
				
			}
			else if(map1.getmHealth() <= 0) {
				System.out.println("[DUNGEON MASTER] YOU HAVE BEAT THE " + map1.getmName());
				ascii.nap();
			}
		}while(player1.isGame() == false);
		keyboard.close();
	}//end main


}//end class
