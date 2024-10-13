package java_1006Ex;

public class MovieReviewMain {
	public static void main(String[] args) {
//		MovieReview의 메인 메소드 가져와서 배열을 사용하여 리뷰작성 클레스 만들기
//		객체 생성 각각의 필드값 초기화
//		최종 내가 초기화 한 값 출력
		
//		MovieReview 클래스 생성 
//		MovieReview 객체 생성
//		참조 변수로 객체에 "."접근 해서 각각의 필드 초기화 
		
//		MovieReviewmain 클래스의 메인 메서드 안에서 할 작업
//		객체 생성 각각의 필드값 초기화
//		최종 내가 초기화 한 값 출력
		
		MovieReview Movie1 = new MovieReview();
		MovieReview Movie2 = new MovieReview();
		
		Movie1.review = "영화1";
		Movie1.title = "재미있다.";
		
		Movie2.review = "영화2";
		Movie2.title = "재미없다.";
		
//		MovieReview[] Movies = {Movie1, Movie2};
//		System.out.println("영화 제목 : " + Movies[0].review + "영화리뷰: " + Movies[0].title);
//		System.out.println("영화 제목 : " + Movies[1].review + "영화리뷰: " + Movies[1].title);
		
		
		MovieReview[] Movies = new MovieReview[2];
		Movies[0] = Movie1;
		Movies[1] = Movie2;		
				
		for(MovieReview m : Movies) {
			System.out.printf("영화 제목 : %s 영화리뷰: %s \n", m.review, m.title );
		} //스트링이여서 %d 가 아닌 %s 이다. 
		
		
		
		
		
		
		
	}
	
	
}
