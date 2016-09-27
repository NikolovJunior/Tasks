package Task2;

public class StudentGroup {
	final int FREE_PLACES = 5;
	static String groupSubject;
	Student[] students;
	static int freePlaces;

	StudentGroup() {
		this.students = new Student[FREE_PLACES];
		this.freePlaces = FREE_PLACES;
	}

	StudentGroup(String subject) {
		this();
		if (subject != null && !subject.equals("")) {
			this.groupSubject = subject;
		}
	}
	
	void addStudent(Student s){
		if(s.subject.equalsIgnoreCase(this.groupSubject) && this.freePlaces > 0){
			this.freePlaces -= 1;
			students[freePlaces] = s;
			System.out.println("New student is added.");
		}else{
			System.out.println("There is no free places for new members.");
		}
	}
	
	void emptyGroup(){
		this.students = new Student[FREE_PLACES];
		this.freePlaces = FREE_PLACES;
	}
	
	void theBestStudent(){
		double maxGrade = 0.0;
		String nameOfTheExellentStudent = " ";
		for(int index = 1 ; index < students.length ; index++){
			if(students[index].grade > maxGrade){
				maxGrade = students[index].grade;
				nameOfTheExellentStudent = students[index].name;
			}
		}
		System.out.println("Name of the exellent student is: " + nameOfTheExellentStudent
				+ " and his/her grade is " + maxGrade + " .");
	}
	void printStudentsInGroup(){
		for(int index = 1; index < students.length ; index++){
			System.out.println("Students name: " + students[index].name +
					", Age: " + students[index].age + 
					", Grade: " + students[index].grade +
					", Subject: " + students[index].subject +
					", Course: " + students[index].yearInCollege +
					", Scholarship money: " + students[index].money
					);
		}
	}
	
}
