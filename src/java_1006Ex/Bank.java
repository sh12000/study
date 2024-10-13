package java_1006Ex;

import java.util.Scanner;

public class Bank {
   
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      
      int flag = 1;
      while(flag == 1) {
      
         
         System.out.println("\n--------------------------------------");
         System.out.println(" 1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
         System.out.println("--------------------------------------\n");

         System.out.printf("선택 : ");
         int select = sc.nextInt();
         

         if(select == 1) {
            System.out.printf("입금액을 입력하세요 : ");
            int money = sc.nextInt();
            deposit(money);
         }else if(select == 2) {
            System.out.printf("출금액을 입력하세요 : ");
            int money = sc.nextInt();
            withdraw(money);
         }else if(select == 3) {
            myAccount();
         }else if(select == 4) {
            System.out.println("시스템을 종료합니다.");
            flag = 0;
         }else {
            System.out.println("잘못된 입력입니다.");
         }
         
      }
   }
   
   
   static int account;
   
   static void deposit(int money) {
      account += money;
      System.out.println(money + "원을 입금하였습니다. 현재 잔액 : " + account + "원");
   }
   
   
   static void withdraw(int money) {
      if(account >= money) {
         account -= money;
         System.out.println(money + "원을 출금하였습니다. 현재 잔액 : " + account + "원");
      }else {
         System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
      }
   }
   
   
   static void myAccount() {
      System.out.println("현재 잔액 : " + account + "원");
   }
   
   
   
   
   
}
