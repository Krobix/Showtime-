package showtime;

import java.util.*;

public class Showtime {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<String> res;
		String[] arr;
		int[] n = new int[3];
		
		while(true) {
			res = new ArrayList<String>();
			System.out.println("Enter time");
			String in = scn.nextLine();
			in = in.strip();
			arr = in.split(":");
			for(int i=0; i<arr.length; i++) {
				n[i] = Integer.parseInt(arr[i]);
			}
			res = getAllCombos(n[0], n[1], n[2]);
			for(String i:res) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
	
	public static ArrayList<String> getAllCombos(int h, int m, int s){
		Clock base = new Clock(h, m, s);
		ArrayList<String> combos = new ArrayList<String>();
		char[] letters = {'r', 'b', 'g', 'y', 'm', 'c', 'w', 'k'};
		char[] currentCombo = {'r', 'r', 'r', 'r', 'r'};
		Clock tmp = new Clock(-1, -1, -1);
		
		for(int i=0; i<letters.length; i++) {
			for(int j=0; j<letters.length; j++) {
				for(int k=0; k<letters.length; k++) {
					for(int l=0; l<letters.length; l++) {
						for(int n=0; n<letters.length; n++) {
							currentCombo[0] = letters[n];
							currentCombo[1] = letters[l];
							currentCombo[2] = letters[k];
							currentCombo[3] = letters[j];
							currentCombo[4] = letters[i];
							tmp.setTime(String.valueOf(currentCombo));
							if(base.equals(tmp)) combos.add(String.valueOf(currentCombo));
						}
					}
				}
			}
		}
		
		return combos;
	}
	
}
