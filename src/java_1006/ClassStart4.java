package java_1006;

public class ClassStart4 {
	public static void main(String[] args) {

		Student student1 = new Student();  //X001
		System.out.println(student1);  
		
		student1.age = 15;
		student1.grade = 90;
		student1.name = "학생1";
		
		
		Student student2 = new Student();	//X002
		System.out.println(student2); 
		student2.age = 15;
		student2.grade = 90;
		student2.name = "학생2";
		
		System.out.println("이름 : " + student1.name +"| 나이 : " + student1.age+ "| 점수 : "+ student1.grade);
		System.out.println("이름 : " + student2.name +"| 나이 : " + student2.age+ "| 점수 : "+ student2.grade);
		
//		Student 객체를 담을 수 있는 사이즈 2의 배열을 생성
//		해당 배열에 Student1, Student1 인스턴스 참조값을 담는다. 배열을 클레스로 다룬다고 생각하면 편하다.
		Student[] students = new Student[2];
		students[0] = student1; // s001 참조 주소값을 읽고 > "복사" 해서 > "베열"변수에 데입
		students[1] = student2;
		
		
		
//		자바에서 모든 변수의 대입은 항상 값을 복사해서 전달한다.
		int a = 10;
		int b = 20;
		int tmp = 0;
		
		tmp = a; //a 값을 tmp에 복사하여 원 데이터 값에는 지장이 없다. 
		b = a;
		
	}
}
