public class LoadingMethod {

	public static void main(String[] args) {
		Person[] array = new Person[10];
		Person personOne = new Person("Tisho",25,true);
		Person personTwo = new Person("Martin",20,true);
		Student studentOne = new Student("Krasimir", 22, true, 4.0);
		Student studentTwo = new Student("Veronika", 21, false, 5.0);
		Employee employeeOne = new Employee("Petar", 24, true, 55.5);
		Employee employeeTwo = new Employee("Dani", 30, false, 84.2);
		array[0] = personOne;
		array[1] = personTwo;
		array[2] = studentOne;
		array[3] = studentTwo;
		array[4] = employeeOne;
		array[5] = employeeTwo;
		
		// Предполагам, че има по-добър начин за обхождане на цикъла array и с по-добро условие.
		// Ако е така, ще ми го обясниш ли в коментара?
		for (int index = 0; index < array.length; index++) {
			if (array[index].getClass() == Person.class) {
				array[index].showPersonInfo();
			}
			if (array[index].getClass() == Student.class) {
				((Student) array[index]).showStudentInfo();
			}
			if (array[index].getClass() == Employee.class) {
				((Employee) array[index]).showEnployeeInfo();
			}
		}
		for(int index = 0; index < array.length ; index++){
			if(array[index].getClass() == Employee.class){
				((Employee) array[index]).calculateOvertime(2);
			}
		}
		
	}

}
