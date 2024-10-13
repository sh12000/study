package java_1006Ex;

public class Overloading {
//	두 정수값 받아서 더하는 add 메서드 (값반환)
//	두 정수값 받아서 곱하는 multi 메서드 (값반환)
//	곱하고 더하는 사칙연산을 하는 add 메서드 작성
//	더한 합값과 곱한값을 한 문장에 출력하는 메서드
	
	int a = 0;
	int b = 0;
	
	
	
	 int add(int a, int b) {
			return a + b;
	 }
			
	
	 int multi(int a, int b) {
		return a + b;
	}
	
	 String printOut(int a, int b) {
		 
		 add(a,b);
		 multi(a,b);
		 return "sum :" + ",";
	 }
}
