import java.util.Scanner;

public class ExerciseTen {
	/*
	 * �� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� � ���������
	 * �����. ���������� �� ������ �������, ����� � ���-������ �� ��������
	 * �������� �� ���������� �����. ������: 1,2,3,4,5,6,7 �����: ������
	 * �������� 4, ���-������ �������� 4
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[7];
		int count = 0;
		int numbers;
		for (int index = 0; index <= array.length - 1; index++) {
			System.out.printf("Enter number %1$d: ", count + 1);
			numbers = input.nextInt();
			array[index] = numbers;
			count++;
		}
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];
		}
		double average = sum / array.length;
		System.out.println("Average: " + average);
	
		int min = array[0]; // ���-�������� ����� ��������
		int max = array[0]; // ���-������� ����� �������
		
		for (int index2 = 0; index2 < array.length; index2++) {
			if (array[index2] < min) {
				min = array[index2];
			}
		}
		for(int index2 = 0 ; index2 < array.length; index2++){
			if(array[index2] <= average && array[index2] >= min){
				min = array[index2];
			}
		}
			System.out.println(min);
		for(int index3 = 0 ; index3 < array.length ;index3++){
			if(array[index3]>max){
				max=array[index3];
			}
		}
		for (int index3 = 0; index3 < array.length; index3++) {
			if (array[index3] >= average && array[index3] <= max) {
				max = array[index3];
				
			}
		}

		for (int index = 0; index < array.length; index++) {
			if (array[index] == average) {
				System.out.println("The closest number is: " + average);
				break;
			} else {

				if (max - average > average - min) {
					System.out.println("The closest number is: " + min);
					break;
				}
				if (max - average < average - min) {
					System.out.println("The closest number is: " + max);
					break;
				}
				if(max - average == average - min){
					System.out.println("The closest numbers are: " + min + " and " + max);
					break;
				}
			}
		}
		input.close();
	}

}
