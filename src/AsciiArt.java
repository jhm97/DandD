import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class AsciiArt {
	Scanner input = null;
	public void warrior() {
		try {
			input = new Scanner(new File("warrior.rtf"));
		} catch (FileNotFoundException e) {
			// did not find the file
			e.printStackTrace();
		}

		//to get rid of the header
		input.nextLine();
		while(input.hasNextLine()) {

			//System.out.println(input.nextLine());
			String line = input.nextLine();
			System.out.println(line);
		}

	}
	public String clr() {
		return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
	}
	public void Monster1() {
		try {
			input = new Scanner(new File("monster1.rtf"));
		} catch (FileNotFoundException e) {
			// did not find the file
			e.printStackTrace();
		}
		//to get rid of the header
		input.nextLine();
		while(input.hasNextLine()) {

			//System.out.println(input.nextLine());
			String line = input.nextLine();
			System.out.println(line);
		}
	}

	public void Monster2() {
		try {
			input = new Scanner(new File("monster2.rtf"));
		} catch (FileNotFoundException e) {
			// did not find the file
			e.printStackTrace();
		}

		//to get rid of the header
		input.nextLine();

		while(input.hasNextLine()) {

			//System.out.println(input.nextLine());
			String line = input.nextLine();
			System.out.println(line);
		}
	}
	public void Monster3() {
		try {
			input = new Scanner(new File("monster3.rtf"));
		} catch (FileNotFoundException e) {
			// did not find the file
			e.printStackTrace();
		}
		//to get rid of the header
		input.nextLine();
		while(input.hasNextLine()) {
			//System.out.println(input.nextLine());
			String line = input.nextLine();
			System.out.println(line);
		}
	}
	public void Monster4() {
		try {
			input = new Scanner(new File("monster4.rtf"));
		} catch (FileNotFoundException e) {
			// did not find the file
			e.printStackTrace();
		}

		//to get rid of the header
		input.nextLine();
		while(input.hasNextLine()) {

			//System.out.println(input.nextLine());
			String line = input.nextLine();
			System.out.println(line);
		}
	}
		public void Death() {
			try {
				input = new Scanner(new File("death.rtf"));
			} catch (FileNotFoundException e) {
				// did not find the file
				e.printStackTrace();
			}

			//to get rid of the header
			input.nextLine();
			while(input.hasNextLine()) {

				//System.out.println(input.nextLine());
				String line = input.nextLine();
				System.out.println(line);
			}
	}//end AsciiArt
		public void nap() {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		public void potionE() {
			try {
				input = new Scanner(new File("potion empty.rtf"));
			} catch (FileNotFoundException e) {
				// did not find the file
				e.printStackTrace();
			}

			//to get rid of the header
			input.nextLine();
			while(input.hasNextLine()) {

				//System.out.println(input.nextLine());
				String line = input.nextLine();
				System.out.println(line);
			}
	}//end AsciiArt
		public void potionF() {
			try {
				input = new Scanner(new File("potionfull.rtf"));
			} catch (FileNotFoundException e) {
				// did not find the file
				e.printStackTrace();
			}

			//to get rid of the header
			input.nextLine();
			while(input.hasNextLine()) {

				//System.out.println(input.nextLine());
				String line = input.nextLine();
				System.out.println(line);
			}
	}//end AsciiArt
		public void attack() {
			try {
				input = new Scanner(new File("attack.rtf"));
			} catch (FileNotFoundException e) {
				// did not find the file
				e.printStackTrace();
			}

			//to get rid of the header
			input.nextLine();
			while(input.hasNextLine()) {

				//System.out.println(input.nextLine());
				String line = input.nextLine();
				System.out.println(line);
			}
	}//end AsciiArt
		public void door() {
			try {
				input = new Scanner(new File("door.rtf"));
			} catch (FileNotFoundException e) {
				// did not find the file
				e.printStackTrace();
			}

			//to get rid of the header
			input.nextLine();
			while(input.hasNextLine()) {

				//System.out.println(input.nextLine());
				String line = input.nextLine();
				System.out.println(line);
			}
	}//end AsciiArt
		public void music(String audio) 
	    {
			try
		    {
		        Clip clip = AudioSystem.getClip();
		        clip.open(AudioSystem.getAudioInputStream(new File(audio + ".wav")));
		        clip.start();
		    }
		    catch (Exception exc)
		    {
		        exc.printStackTrace(System.out);
		    }
	    }//music end
		
		
		
		
		
		
		public void exit() {
			try {
				input = new Scanner(new File("exit.rtf"));
			} catch (FileNotFoundException e) {
				// did not find the file
				e.printStackTrace();
			}

			//to get rid of the header
			input.nextLine();
			while(input.hasNextLine()) {

				//System.out.println(input.nextLine());
				String line = input.nextLine();
				System.out.println(line);
			}
	}//end AsciiArt
		
} //end class
