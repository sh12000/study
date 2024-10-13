package java_1006Ex;

public class text {
	public static void main(String[] args) {
		
			String a1 = new String();
			String a2 = a1;
			a1 = "hello";
			a2 = "hi";
			System.out.println(a1);
			System.out.println(a2);
			
			String s1 = "hello";
			String s2 = "hello";

			String ss1 = new String("hello");
			String ss2 = new String("hello");
					
			String a = s1 == s2;
			System.out.println(a);
							
		}
}

