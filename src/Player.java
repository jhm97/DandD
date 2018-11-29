import java.util.Scanner;

public class Player {
	private String name;
	private double health;
	private double damage;
	private int position;
	private int xp;
	private boolean game = false;
	private String playAgain;
	
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isGame() {
		return game;
	}
	public void setGame(boolean game) {
		this.game = game;
	}
	
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public boolean playagain() {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System. in);
		System.out.println("[DUNGEON MASTER] WOULD YOU LIKE TO PLAY AGAIN?...");
		playAgain = keyboard.nextLine();
		if(playAgain.equalsIgnoreCase("Y"))
			return true;
		else return false;
	}
	
	public double xpUp(int health, int xp) {
		health = health + ((xp/health)*100);
		return health;
	}
	
	public String getPlayAgain() {
		return playAgain;
	}
	public void setPlayAgain(String playAgain) {
		this.playAgain = playAgain;
	}
	public void playerStart() {
		damage = 100;
		health = 100;
		position = 1;
		xp=0;
	}
	public void playerDead(double d) {
		 if(d < 1) {
			game = true;
		}
	}
	
	public String playerInfo() {
		return "[PLAYER 1] Name: " + name + " Health: " + health + " Damage: " + damage + " Room: " + position;
	}

}
