package java_1006Ex;

import java.util.Scanner;

public class BankMain2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		int amount = 0;
		int choice = 0;
			
		
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1. 입금 | 2. 출금| 3.잔액 확인| 4. 종료 ");
			System.out.println("----------------------------------");
					
			System.out.println("선택 : ");
			
			choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("입금액입력 >");
			amount += sc.nextInt();
			balance +=amount;
			System.out.println(amount + "를 입력했습니다. 현재잔액 : " + balance);
			
			break;
		case 2:
			System.out.println("출금액 입력 >");
			amount = sc.nextInt();
			balance -=amount;
			if(amount < balance){
				System.out.println(amount + "를 입력했습니다. 현재잔액 : " + balance);
				
			}else 
				System.out.println(balance + "원을 출금할려 했으나 잔액이 부족합니다.");
			
			break;
		case 3:
			System.out.println("현재 잔액은 " + balance);
			break;
		case 4:
			return;
		}
	}
	}
	
}
