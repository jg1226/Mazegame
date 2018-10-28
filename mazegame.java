package mazegame;

import java.util.Scanner;

public class mazegame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user;
		int loop = 1, status = 1, location = 1;
		
		if(loop < 5) {
			System.out.println("Welcome to Maze Game!");
			System.out.println("This game is played by typing word commands keep them lower case for maximum user satisfaction.");
			System.out.println("It is recommended you make a map as you go but to each their own.");
			
			while(loop < 10) {
				System.out.println("Type 'enter' to begin.");
				System.out.println("Type 'controls' for the command list.");
				System.out.println("Enter a command:");
				user = input.nextLine();
				user.toLowerCase();
		
				if(user.contains("controls")) {
					controls();
					loop = 6;
				}
				else if(user.contains("enter")){
					game(status);
					loop = 666;
				}
			}
		}
		if(loop == 666) {
			status = 2;
			game(status);
		}
		
	}// end of main
	
	public static void controls() {// controls menu
		Scanner input = new Scanner(System.in);
		clear();
		String back = "";
		int loop = 1, count = 0;
		
		System.out.println("Movement commands: 'up', 'down', 'left', 'right'");
		
		while(loop < 10) {
		System.out.println("type 'back' to return");
		System.out.println("Enter a command:");
		
		back = input.nextLine();
		back.toLowerCase();
		
		if(back.contains("back")) {
		loop = 20;
		}

		}
		
	}// end of from game controls menu
	
	public static String error(String user) {// input error
		
		if(user.contains("up")||user.contains("down")||user.contains("right")||user.contains("left")
		  ||user.contains("controls")||user.contains("inventory")) {
		}
		
		else {
		System.out.println("Incorrect command input");
		}
		
		user = "resolved";
		return user;
	}// end of error
	
	public static void clear() {// clear the console
		
		for(int clear = 0; clear < 30; clear++) {
		    System.out.println("") ;
		}
	}// end of clear
	
	public static int game(int loop) {// welcome to the game_____________________
		Scanner input = new Scanner(System.in);
		String user = "error";
		int room = -1, check = 1, gold = 0, weapons = 0;
		int SpawnRate = (int) (Math.random() * 10), combat = 0;
		int room0[] = {1, 2, 3, 4}, room1[] = {7, 0, 6, 8}, room2[] = {0, 2, 5, 9}, room3[] = {3, 5, 3, 0}, room4[] = {8, 9, 0, 4};
		int room5[] = {3, 11, 5, 2}, room6[] = {6, 6, 35, 1}, room7[] = {7, 1, 33, 7}, room8[] = {29, 4, 1, 8}, room9[] = {4, 9, 2, 10};
		
		int room10[] = {10, 10, 9, 10}, room11[] = {5, 11, 11, 12}, room12[] = {12, 13, 11, 15}, room13[] = {12, 13, 14, 13}, room14[] = {14, 14, 14, 13};
		int room15[] = {15, 16, 12, 15}, room16[] = {15, 17, 16, 16}, room17[] = {16, 21, 42, 18}, room18[] = {18, 20, 17, 19}, room19[] = {24, 19, 18, 19};
		
		int room20[] = {18, 20, 21, 20}, room21[] = {17, 21, 22, 20}, room22[] = {22, 23, 22, 21}, room23[] = {22, 23, 23, 23}, room24[] = {25, 19, 24, 24};
		int room25[] = {26, 24, 25, 25}, room26[] = {26, 25, 27, 26}, room27[] = {27, 27, 28, 26}, room28[] = {28, 29, 31, 27}, room29[] = {28, 8, 29, 30};
		
		int room30[] = {30, 30, 29, 30}, room31[] = {31, 31, 32, 28}, room32[] = {32, 33, 32, 31}, room33[] = {32, 33, 34, 7}, room34[] = {34, 34, 34, 33};
		int room35[] = {35, 36, 35, 6}, room36[] = {35, 37, 36, 36}, room37[] = {36, 38, 37, 37}, room38[] = {37, 39, 45, 38}, room39[] = {38, 40, 39, 39};
		
		int room40[] = {39, 40, 45, 41}, room41[] = {41, 41, 40, 42}, room42[] = {42, 42, 41, 17}, room43[] = {44, 43, 47, 40}, room44[] = {45, 43, 44, 44};
		int room45[] = {46, 44, 45, 38}, room46[] = {46, 45, 46, 46}, room47[] = {48, 47, 47, 43}, room48[] = {49, 47, 48, 48};
		
		if(loop == 1) {
		clear();
		System.out.println("If needed type 'controls' at any time to see command menu");
		System.out.println("You've been woke looking around you are in the intersection of 2 hallways built from stone");
		System.out.println("The only light source is what appearce to be a small glowing ember flouting above your head");
		System.out.println("You can't see clearly down the hallways your vision is obscured by the darkness what will you do?");
		System.out.println("You are the * symbol on the map");
		Map0();
			while(check < 10) {
				System.out.println("please type 'ready' when you want the game to begin");
				user = input.nextLine();
				user.toLowerCase();
				
				if(user.contains("ready")) {
					room = 0;
					check = 20;
				}
		
			}
		
		}
		
		while(loop < 10) {
		
		if(room == 0) {// check map in note book
			Map1();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room0[0];
			}
			if(user.contains("down")) {
				room = room0[1];
			}
			if(user.contains("right")) {
				room = room0[2];
			}
			if(user.contains("left")) {
				room = room0[3];
			}

		}
		
		if(room == 1) {
			Map1();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room1[0];
			}
			if(user.contains("down")) {
				room = room1[1];
			}
			if(user.contains("right")) {
				room = room1[2];
			}
			if(user.contains("left")) {
				room = room1[3];
			}
		}
		
		if(room == 2) {
			Map3();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room2[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room2[1];
			}
			if(user.contains("right")) {
				room = room2[2];
			}
			if(user.contains("left")) {
				room = room2[3];
			}
		}
		
		if(room == 3) {
			Map6();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room3[0];
			}
			if(user.contains("down")) {
				room = room3[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room3[2];
			}
			if(user.contains("left")) {
				room = room3[3];
			}
		}
		
		if(room == 4) {
			Map5();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room4[0];
			}
			if(user.contains("down")) {
				room = room4[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room4[2];
			}
			if(user.contains("left")) {
				room = room4[3];
			}
		}
		
		if(room == 5) {
			Map4();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room5[0];
			}
			if(user.contains("down")) {
				room = room5[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room5[2];
			}
			if(user.contains("left")) {
				room = room5[3];
			}
		}
		
		if(room == 6) {
			Map9();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room6[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room6[1];
			}
			if(user.contains("right")) {
				room = room6[2];
			}
			if(user.contains("left")) {
				room = room6[3];
			}
		}
		
		if(room == 7) {
			Map7();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room7[0];
			}
			if(user.contains("down")) {
				room = room7[1];
			}
			if(user.contains("right")) {
				room = room7[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room7[3];
			}
		}
		
		if(room == 8) {
			Map5();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room8[0];
			}
			if(user.contains("down")) {
				room = room8[1];
			}
			if(user.contains("right")) {
				room = room8[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room8[3];
			}
		}
		
		if(room == 9) {
			Map3();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room9[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room9[1];
			}
			if(user.contains("right")) {
				room = room9[2];
			}
			if(user.contains("left")) {
				room = room9[3];
			}
		}
		
		if(room == 10) {
			Map12();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room10[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room10[1];
			}
			if(user.contains("right")) {
				room = room10[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room10[3];
			}
		}
		
		if(room == 11) {
			Map11();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {				
				room = room11[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room11[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room11[2];
			}
			if(user.contains("left")) {
				room = room11[3];
			}
		}
		
		if(room == 12) {
			Map2();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room12[0];
			}
			if(user.contains("down")) {
				room = room12[1];
			}
			if(user.contains("right")) {
				room = room12[2];
			}
			if(user.contains("left")) {
				room = room12[3];
			}
		}
		
		if(room == 13) {
			Map10();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room13[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room13[1];
			}
			if(user.contains("right")) {
				room = room13[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room13[3];
			}
		}
		
		if(room == 14) {
			Map13();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room14[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room14[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room14[2];
			}
			if(user.contains("left")) {
				room = room14[3];
			}
		}
		
		if(room == 15) {
			Map7();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room15[0];
			}
			if(user.contains("down")) {
				room = room15[1];
			}
			if(user.contains("right")) {
				room = room15[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room15[3];
			}
		}
		
		if(room == 16) {
			Map8();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room16[0];
			}
			if(user.contains("down")) {
				room = room16[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room16[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room16[3];
			}
		}
		
		if(room == 17) {
			Map1();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room17[0];
			}
			if(user.contains("down")) {
				room = room17[1];
			}
			if(user.contains("right")) {
				room = room17[2];
			}
			if(user.contains("left")) {
				room = room17[3];
			}
		}
		
		if(room == 18) {
			Map2();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room18[0];
			}
			if(user.contains("down")) {
				room = room18[1];
			}
			if(user.contains("right")) {
				room = room18[2];
			}
			if(user.contains("left")) {
				room = room18[3];
			}
		}
		
		if(room == 19) {
			Map10();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room19[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room19[1];
			}
			if(user.contains("right")) {
				room = room19[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room19[3];
			}
		}
		
		if(room == 20) {
			Map10();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room20[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room20[1];
			}
			if(user.contains("right")) {
				room = room20[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room20[3];
			}
		}
		
		if(room == 21) {
			Map3();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room21[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room21[1];
			}
			if(user.contains("right")) {
				room = room21[2];
			}
			if(user.contains("left")) {
				room = room21[3];
			}
		}
		
		if(room == 22) {
			Map6();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room22[0];
			}
			if(user.contains("down")) {
				room = room22[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room22[2];
			}
			if(user.contains("left")) {
				room = room22[3];
			}
		}
		
		if(room == 23) {
			Map14();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room23[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room23[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room23[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room23[3];
			}
		}
		
		if(room == 24) {
			Map8();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room24[0];
			}
			if(user.contains("down")) {
				room = room24[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room24[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room24[3];
			}
		}
		
		if(room == 25) {
			Map8();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room25[0];
			}
			if(user.contains("down")) {
				room = room25[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room25[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room25[3];
			}
		}
		
		if(room == 26) {
			Map7();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room26[0];
			}
			if(user.contains("down")) {
				room = room26[1];
			}
			if(user.contains("right")) {
				room = room26[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room26[3];
			}
		}
		
		if(room == 27) {
			Map9();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room27[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room27[1];
			}
			if(user.contains("right")) {
				room = room27[2];
			}
			if(user.contains("left")) {
				room = room27[3];
			}
		}
		
		if(room == 28) {
			Map2();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room28[0];
			}
			if(user.contains("down")) {
				room = room28[1];
			}
			if(user.contains("right")) {
				room = room28[2];
			}
			if(user.contains("left")) {
				room = room28[3];
			}
		}
		
		if(room == 29) {
			Map4();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room29[0];
			}
			if(user.contains("down")) {
				room = room29[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room29[2];
			}
			if(user.contains("left")) {
				room = room29[3];
			}
		}
		
		if(room == 30) {
			Map12();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room30[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room30[1];
			}
			if(user.contains("right")) {
				room = room30[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room30[3];
			}
		}
		
		if(room == 31) {
			Map9();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room31[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room31[1];
			}
			if(user.contains("right")) {
				room = room31[2];
			}
			if(user.contains("left")) {
				room = room31[3];
			}
		}
		
		if(room == 32) {
			Map6();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room32[0];
			}
			if(user.contains("down")) {
				room = room32[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room32[2];
			}
			if(user.contains("left")) {
				room = room32[3];
			}
		}
		
		if(room == 33) {
			Map3();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room33[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room33[1];
			}
			if(user.contains("right")) {
				room = room33[2];
			}
			if(user.contains("left")) {
				room = room33[3];
			}
		}
		
		if(room == 34) {
			Map13();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room34[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room34[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room34[2];
			}
			if(user.contains("left")) {
				room = room34[3];
			}
		}
		
		if(room == 35) {
			Map6();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room35[0];
			}
			if(user.contains("down")) {
				room = room35[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room35[2];
			}
			if(user.contains("left")) {
				room = room35[3];
			}
		}
		
		if(room == 36) {
			Map8();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room36[0];
			}
			if(user.contains("down")) {
				room = room36[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room36[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room36[3];
			}
		}
		
		if(room == 37) {
			Map8();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room37[0];
			}
			if(user.contains("down")) {
				room = room37[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room37[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room37[3];
			}
		}
		
		if(room == 38) {
			Map5();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room38[0];
			}
			if(user.contains("down")) {
				room = room38[1];
			}
			if(user.contains("right")) {
				room = room38[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room38[3];
			}
		}
		
		if(room == 39) {
			Map8();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room39[0];
			}
			if(user.contains("down")) {
				room = room39[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room39[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room39[3];
			}
		}
		
		if(room == 40) {
			Map3();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room40[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room40[1];
			}
			if(user.contains("right")) {
				room = room40[2];
			}
			if(user.contains("left")) {
				room = room40[3];
			}
		}
		
		if(room == 41) {
			Map9();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room41[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room41[1];
			}
			if(user.contains("right")) {
				room = room41[2];
			}
			if(user.contains("left")) {
				room = room41[3];
			}
		}
		
		if(room == 42) {
			Map9();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room42[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room42[1];
			}
			if(user.contains("right")) {
				room = room42[2];
			}
			if(user.contains("left")) {
				room = room42[3];
			}
		}
		
		if(room == 43) {
			Map3();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room43[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room43[1];
			}
			if(user.contains("right")) {
				room = room43[2];
			}
			if(user.contains("left")) {
				room = room43[3];
			}
		}
		
		if(room == 44) {
			Map8();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room44[0];
			}
			if(user.contains("down")) {
				room = room44[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room44[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room44[3];
			}
		}
		
		if(room == 45) {
			Map4();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room45[0];
			}
			if(user.contains("down")) {
				room = room45[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room45[2];
			}
			if(user.contains("left")) {
				room = room45[3];
			}
		}
		
		if(room == 46) {
			Map15();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				System.out.println("You hit a wall");
				room = room46[0];
			}
			if(user.contains("down")) {
				room = room46[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room46[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room46[3];
			}
		}
		
		if(room == 47) {
			Map11();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room47[0];
			}
			if(user.contains("down")) {
				System.out.println("You hit a wall");
				room = room47[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room47[2];
			}
			if(user.contains("left")) {
				room = room47[3];
			}
		}
		
		if(room == 48) {
			Map8();
			System.out.print("Enter a command:");
			user = input.nextLine();
			user.toLowerCase();
			
			if(user.contains("up")) {
				room = room48[0];
			}
			if(user.contains("down")) {
				room = room48[1];
			}
			if(user.contains("right")) {
				System.out.println("You hit a wall");
				room = room48[2];
			}
			if(user.contains("left")) {
				System.out.println("You hit a wall");
				room = room48[3];
			}
		}
		
		if(room == 49) {
			System.out.println("You've made it out of the maze congrats!!!!!");
			System.exit(0);;
		}
		
		if(user.contains("controls")) {
			controls();
		}
		else {
			error(user);
		}
		
		}// end of loop
		
		return loop;
	}// end of game
	
	public static void Map0() {
		System.out.println("    |   |    ");
		System.out.println(" ___|   |___ ");
		System.out.println(" ___  *  ___ ");
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
	}// end of Map0
	
	public static void Map1() {
		clear();
		System.out.println("    |   |    ");
		System.out.println(" ___|   |___ ");
		System.out.println(" ___  *  ___ ");
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
	}// end of Map1
	
	public static void Map2() {
		clear();
		System.out.println("             ");
		System.out.println(" ___________ ");
		System.out.println(" ___  *  ___ ");
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
	}// end of Map2
	
	public static void Map3() {
		clear();
		System.out.println("    |   |    ");
		System.out.println(" ___|   |___ ");
		System.out.println("      *      ");
		System.out.println(" ___________ ");
		System.out.println("             ");
	}// end of Map3
	
	public static void Map4() {
		clear();
		System.out.println("    |   |    ");
		System.out.println(" ___|   |    ");
		System.out.println(" ___  * |    ");
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
	}// end of Map4
	
	public static void Map5() {
		clear();
		System.out.println("    |   |    ");
		System.out.println("    |   |___ ");
		System.out.println("    | *  ___ ");
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
	}// end of Map5
	
	public static void Map6() {
		clear();
		System.out.println("             ");
		System.out.println(" _______     ");
		System.out.println(" ___  * |    ");
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
	}// end of Map6
	
	public static void Map7() {
		clear();
		System.out.println("             ");
		System.out.println("     _______ ");
		System.out.println("    | *  ___ ");
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
	}// end of Map7
	
	public static void Map8() {
		clear();
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
		System.out.println("    | * |    ");
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
	}// end of Map8
	
	public static void Map9() {
		clear();
		System.out.println("             ");
		System.out.println(" ___________ ");
		System.out.println("      *      ");
		System.out.println(" ___________ ");
		System.out.println("             ");
	}// end of Map9
	
	public static void Map10() {
		clear();
		System.out.println("    |   |    ");
		System.out.println("    |   |___ ");
		System.out.println("    | *      ");
		System.out.println("    |_______ ");
		System.out.println("             ");
	}// end of Map10
	
	public static void Map11() {
		clear();
		System.out.println("    |   |    ");
		System.out.println(" ___|   |    ");
		System.out.println("      * |    ");
		System.out.println(" _______|    ");
		System.out.println("             ");
	}// end of Map11
	
	public static void Map12() {
		clear();
		System.out.println("             ");
		System.out.println(" ___________ ");
		System.out.println("|     *      ");
		System.out.println("|___________ ");
		System.out.println("             ");
	}// end of Map12
	
	public static void Map13() {
		clear();
		System.out.println("             ");
		System.out.println(" ___________ ");
		System.out.println("     *      |");
		System.out.println(" ___________|");
		System.out.println("             ");
	}// end of Map13
	
	public static void Map14() {
		clear();
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
		System.out.println("    | * |    ");
		System.out.println("    |   |    ");
		System.out.println("    |___|    ");
	}// end of Map14
	
	public static void Map15() {
		clear();
		System.out.println("     ___     ");
		System.out.println("    |   |    ");
		System.out.println("    | * |    ");
		System.out.println("    |   |    ");
		System.out.println("    |   |    ");
	}// end of Map15
	
	
}// end of class

	
	
	
	

