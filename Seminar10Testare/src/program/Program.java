package program;

import clase.Student;

public class Program {

	public static void main(String[] args) {
		Student student=new Student(9, "Popescu");
		try {
			student.calculeazaMedie(7, 8, 8.5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(student.getMedie());

	}

}
