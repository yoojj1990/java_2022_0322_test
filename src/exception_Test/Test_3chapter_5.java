package exception_Test;

import java.util.*;

public class Test_3chapter_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[10];
		
		Scanner scann = new Scanner(System.in);
		

		for(int i=0;i<arr.length;i++) {
			System.out.println("���� ������ 10���� �Է��Ͻÿ�.");
			arr[i] = scann.nextInt();
			}
		
		System.out.println("3�� ���");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 3 == 0) {
				System.out.println(arr[i]);
				
				}
			}			

		scann.close();
	}

}
