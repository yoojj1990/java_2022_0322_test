package exception_Test;

import java.util.*;

public class Exception_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���.(����)");
		
		int b = scann.nextInt();
		
		try {
			int ret = a / b; //0���� ������� ����
			System.out.println(ret);
		}
		catch (ArithmeticException e) {
			System.out.println("0������ �����Դϴ�!!"); //���� ó��
		}
	
		int arr[] = new int[5];
		
		try {
			arr[7] = 10;
			System.out.println(arr[7]);
		}
		catch (Exception e) { //��� ����ó��
			System.out.println("�迭 �ε��� �����Դϴ�!!");
		}
		
		finally {
			arr[0] = 10;
		}
		
		
		scann.close();
		System.out.println("���α׷��� �����մϴ�.");
	}

}
