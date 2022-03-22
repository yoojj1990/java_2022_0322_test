package exception_Test;

import java.util.*;

public class Test_3chapter_3 {

	public static void main(String[] args) {
	
		Scanner scann = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		
		int i = scann.nextInt();
		
		for(int j=i;j>0;j--){
			for(int k=j;k>0;k--) {
			System.out.print("*");	
			}
			System.out.println(" ");
		}
		
		scann.close();
		

		
		
	}
}
