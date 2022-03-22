package exception_Test;

import java.util.*;

public class Exception_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		
		Scanner scann = new Scanner(System.in);
		
		System.out.println("나눌 정수를 입력하세요.(젯수)");
		
		int b = scann.nextInt();
		
		try {
			int ret = a / b; //0으로 나눌경우 에러
			System.out.println(ret);
		}
		catch (ArithmeticException e) {
			System.out.println("0나누기 에러입니다!!"); //예외 처리
		}
	
		int arr[] = new int[5];
		
		try {
			arr[7] = 10;
			System.out.println(arr[7]);
		}
		catch (Exception e) { //모든 예외처리
			System.out.println("배열 인덱스 오류입니다!!");
		}
		
		finally {
			arr[0] = 10;
		}
		
		
		scann.close();
		System.out.println("프로그렘을 종료합니다.");
	}

}
