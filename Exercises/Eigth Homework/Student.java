public class Student extends Person {
	private final byte MAX_GRADE = 6;
	private final byte MIN_GRADE = 2;
	private final short MAX_AGE = 120;
	private double score;
	
	/* ������� �� �������:
	 * ���������� � ������������ � ���� Student �� � ������ , ��� ���� � ���� ������ �� ����� 
	 * ���������� ���� ������������ �� ������������ � ���� Person(����� �������). 
	 * �� �� ���� ������ ������������ � ���� Student, �� ������������ � ���� Person
	 * ���� ������ �� ���� ������. �������������� ���� � �� ���� Employee. 
	 */
	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		if (name != null && !name.equals("") && name.length() > 1) {
			this.name = name;
		}
		if (age > 0 && age < MAX_AGE) {
			this.age = age;
		}
		if (isMale == true && isMale == false) {
			this.isMale = isMale;
		}
		if (score >= MIN_GRADE && score <= MAX_GRADE) {
			this.score = score;
		}
	}

	void showStudentInfo() {
		showPersonInfo();
		System.out.println("Score: " + this.score);
	}
}
