package practice;

import java.util.Scanner;

public class characters {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int count[] = new int[128];
		for(char c:input.toCharArray()) {
			count[c]++;}
			for(int i=0;i<count.length;i++) {
				if(count[i]>0) {
					System.out.println("character "+(char)i+"appears"+count[i]+"times");;
				}
			}
			
		}
		
		
	}


