package java_1006;

public class ClassStart3 {
	public static void main(String[] args) {
//		객체 생성 왜하는지
//		"클래스가 가진 필드 값들을 조작하기 위함"
//		조작 : 변수에 데이터 값을 넣을 수 도 있고 뺄 수도 있고
		
		Student student1 = new Student();
//		클래스에 접근할수 있는 코드 작성 다른 코드에 참조 하겠다는 함수 학생 타입 데이터들을 담아둘수 있는 변수 선언
		System.out.println(student1); //객체의 참조주소 
		student1.age = 15;
		student1.grade = 90;
		student1.name = "학생1";
		
		
		Student student2 = new Student();
//		학생 타입 데이터들을 담아둘수 있는 변수 선언
		System.out.println(student2); 
//		참조 주소가 세로 생성된다. 같은 함수이지만 참조하는 클래스와 변수는 같고 데이터가 저장된 주소는 다른 형태를 나타낸다. 
		student2.age = 15;
		student2.grade = 90;
		student2.name = "학생2";
		
		System.out.println("이름 : " + student1.name +"| 나이 : " + student1.age+ "| 점수 : "+ student1.grade);
//		다른 클레스에 있는 함수를 참조하여 배열로 초기화 하고 배열로 할당된 값을 출력 하였다.
		System.out.println("이름 : " + student2.name +"| 나이 : " + student2.age+ "| 점수 : "+ student2.grade);
//	`	사용자 정의 타입 성성자를 만들면 class를 만들면 설계도를 만든다고 생각하면된다. 설계도를 보고 인태리어를 다르게 한 느낌으로 받아들이면 된다.
		
		
	
	}
}
