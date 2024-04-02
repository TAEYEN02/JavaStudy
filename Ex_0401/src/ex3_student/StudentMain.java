package ex3_student;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student("제임스", 20, 20240001);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.studentID);
	}
}
