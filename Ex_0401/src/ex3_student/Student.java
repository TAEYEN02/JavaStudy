package ex3_student;

public class Student {
	String name;
	int age;
	int studentID;
	//this
	//객제 자기 자신을 스스로 참조
	//this 참조변수는 객체가 자기 자신을 참조하는데 사용하는 병수
	//this를 필드에 붙여서 사용하면 중괄호 안에서도 같은이름의 
	//매개변수와 필드를 구분해서 사용할 수 있다
	
	public Student(String name, int age, int studentID) {
		this.name = name;
		this.age = age;
		this.studentID = studentID;
	}
}
