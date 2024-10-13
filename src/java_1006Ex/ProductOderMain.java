package java_1006Ex;

public class ProductOderMain {
	public static void main(String[] args) {
//		여러 상품의 주문 정보를 담는 배열 생성
//		상품 주문 정보를 po 타입의 변수로 받아 저장
//		상품 주문 정보와 최종 금액 출력		
//		상품명 : 과자, 가격 : 1000, 수량 1
//		상품명 : 사탕, 가격 : 1500, 수량 2
		
//		메인 메소드가 있는 클래스에 객체 생성 및 초기화 
//		여러 상품의 주문정보를 담는 배열 생성
//		상품 주문 정보를 ProductOder 타입의 참조 변수에 저장
//		상품 추문 정보
//		최종 금액 출력
		
		ProductOder po1 = new ProductOder();
		po1.productName = "과자";
		po1.price = 1000;
		po1.quantity = 1;
//		ProductOder 클래스에 객채 하나 하나를 가져와서 초기화 해준다. 선언은 클래스에서 해줬으니
//		ProductOder 클래스에 변수명과 new 라는 연산자와 클래스 연산자를 호출해서 변수를 담을 수 있다. 하드코딩으로 바로 지정이 가능하나 메인 메소드 부분에서 왜 안 하는지 자세히 알려줄 것이다. 	
		
		ProductOder po2 = new ProductOder();
		po2.productName = "사탕";
		po2.price = 1500;
		po2.quantity = 2;
		
//		객체 배열 
		ProductOder[] pos = new ProductOder[2];
		pos[0] = po1;
		pos[1] = po2;
//		클래스를 배열로 담고 하나 하나 배열된 구역에 값을 할당.  
		
//		향상 포문 사용 문자열은 %d 상수는 %s 로 해야 값을 가져온다. 그렇기에 상수 자리에 %d가 들어가면 오류로 실행이 안된다.
		for(ProductOder i : pos) {
			System.out.printf("상품명 : %s, 가격 : %s, 수량 : %s \n ", i.productName, i.price, i.quantity );
		}
		System.out.println(po1.price + po2.price);
//		최종 금액 출력
		
		
		
		
	}
}
