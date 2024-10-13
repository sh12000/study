package java_1006;

public class ClassStart5Ex {
	public static void main(String[] args) {
//		Student 배열 타입으로 바꾸고 
//		각각 값 할당 하고 
//		아래에서 for문 써서 출력
		Student student1 = new Student();  //X001	
		Student student2 = new Student();	//X002
		
		Student[] students ={student1, student2};  //X001	
		
		students[0].name = "학생1";
		students[0].age = 15;
		students[0].grade = 90;
		
		students[1].name = "학생2";
		students[1].age = 16;
		students[1].grade = 80;
		
		for(int i = 0; i < students.length; i++) {
			students[i].name = "학생" + (i+1);			
		}
		
		
		
		
		
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("이름: " + students[i].name + "나이: " + students[i].age + "점수: " + students[i].grade );
		}
//		students[i] 가 하나의 객체이기 때문에 students[i].name으로 작성하여도 값은 출력된다. (지금은 할당된 값이 없다)
//		i는 지역변수이다.
		
		
		
		
		
		
		
		
		
	}
}
