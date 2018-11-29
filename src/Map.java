import java.util.Random;

public class Map {
	int map[][] = new int[2][2];
	private double mDamage;
	private double mHealth;
	private String mName;
	private String mSound;
	private int key;
	private int move;
	private double potion;
	private int potionCount;
	AsciiArt ascii = new AsciiArt();

	public double getPotion() {
		return potion;
	}
	public void setPotion(double potion) {
		this.potion = potion;
	}
	public void monster1() {
		mName = "MONSTER 1";
		mHealth = 50;
		mDamage = 20;
		mSound = "monster1";
	}
	public String getmSound() {
		return mSound;
	}
	public void setmSound(String mSound) {
		this.mSound = mSound;
	}
	public void monster2() {
		mName = "MONSTER 2";
		mHealth = 80;
		mDamage = 15;
		mSound = "monster2";
	}
	public void monster3() {
		mName = "MONSTER 3";
		mHealth = 30;
		mDamage = 20;
		mSound = "monster3";
	}
	public void monster4() {
		mName = "MONSTER 4";
		mHealth = 60;
		mDamage = 25;
		mSound = "monster4";
	}
	
	public int[][] getMap() {
		return map;
	}
	public void setMap(int[][] map) {
		this.map = map;
	}
	public double getmDamage() {
		return mDamage;
	}
	public void setmDamage(double mDamage) {
		this.mDamage = mDamage;
	}
	public double getmHealth() {
		return mHealth;
	}
	public void setmHealth(double mHealth) {
		this.mHealth = mHealth;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public int getPotionCount() {
		return potionCount;
	}
	public void setPotionCount(int potionCount) {
		this.potionCount = potionCount;
	}
	public void mapStart() {
		Random r = new Random();
		key = r.nextInt((4 - 2) + 1) + 2;
		Random t = new Random();
		potion = t.nextInt((4 - 1) + 1) + 1;
		potionCount = 3;
	}
	public boolean monsterCheck(double life) {
		if(life < 1) {

			return true;
			
		}
		else return false;
	}


	public String mapLocation(int loc) {
		String locationString;
        switch (loc) {
            case 1:  locationString = "YOU ARE IN THE FIRST ROOM!";
            		 monster1();
                     break;
            case 2:  locationString = "YOU ARE IN THE SECOND ROOM!";
            		 monster1();
                     break;
            case 3:  locationString = "YOU ARE IN THE THIRD ROOM!";
            		 monster3();
                     break;
            case 4:  locationString = "YOU ARE IN THE FOURTH ROOM!";
            		 monster4();
                     break;
            default: locationString = "Invalid ROOM";
                     break;
        }
         return locationString;
    }
	public void selectMonster(int sM) {
		switch(sM) {
		case 1: monster1();break;
		case 2: monster2();break;
		case 3: monster3();break;
		case 4: monster4();break;
		}
	}
	public double usePotion(double p) {
		int power;
		if(potionCount >= 0) {
		   power = 15;
		}
		else { 
			power = 0; 
			potionCount=0;
		}
		return power + p;
	}
	public void checkKey(int pPos) {
		if(pPos == key) {
			System.out.println(ascii.clr());
			ascii.exit();
			System.out.println("[DUNGEON MASTER] YOU HAVE FOUND THE KEY! YOU HAVE ESCAPED THE DUNGEON, AND ESCAPED INTO THE DARK FOREST");
			ascii.music("exit");
			System.exit(0);
		}
		else {
			System.out.println("[DUNGEON MASTER] KEY NOT FOUND YET...");
			System.out.println("[DUNGEON MASTER] YOU HAVE ENCOUNTERED A FIERCE MONSTER \n\n\n");
		}
	}
	public String monsterInfo() {
		return "[Monster] name: " + mName + " Damage: " + mDamage + " Health: " + mHealth; 
	}
}
