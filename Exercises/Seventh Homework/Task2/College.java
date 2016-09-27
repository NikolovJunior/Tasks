package Task2;

public class College {

	public static void main(String[] args) {
		Student st = new Student("Krasimir" , "Statistics" , 21);
		Student st2 = new Student("Niki" , "Statistics" , 21);
		Student st3 = new Student("Kiro" , "Statistics" , 23);
		Student st4 = new Student("Tosho" , "Statistics" , 22);
		Student st5 = new Student("Gosho" , "Statistics" , 24);
		st.upYear();
		st.upYear();
		st2.grade = 5.90;
		System.out.println(st2.receiveScholarShip(5.50,500));
		System.out.println(st.receiveScholarShip(5.50,500));
		
		System.out.println();
		Student stTwo = new Student("Vinetu" ,"Computer Science" , 19);
		stTwo.grade = 5.80;
		stTwo.upYear();
		System.out.println(stTwo.receiveScholarShip(5.50, 500));
		
		StudentGroup  stg = new StudentGroup("Statistics");

		stg.addStudent(st);
		stg.addStudent(st2);
		stg.addStudent(st3);
		stg.addStudent(st4);
		stg.addStudent(st5);
		
		stg.theBestStudent();
		stg.printStudentsInGroup();
		
		stg.emptyGroup();
		
	}

}
