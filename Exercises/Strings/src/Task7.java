import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
          int numb = 8;
		  int count = 1;
		  for (int row = 1; row <= numb; row++) {
		   if (count <= numb) {
		    if (row == 1) {
		     for (int space = 0; space < numb - count; space++) {
		      System.out.print(" ");
		     }
		     System.out.print(count);
		     System.out.println();
		     count++;
		    } else {
		     for (int space = 0; space < numb - count; space++) {
		      System.out.print(" ");
		     }
		     System.out.print(count);

		     for (int z = 0; z < 2 * count - 3; z++) {
		      System.out.print("*");
		     }

		     System.out.print(count);
		     System.out.println();
		     count++;
		    }
		   }
		  }
		  int count2 = numb - 1;

		  for (int row1 = 1; row1 <= numb - 1; row1++) {
		   if (row1 == numb - 1) {
		    for (int space = 0; space < numb - 1; space++) {
		     System.out.print(" ");
		    }
		    System.out.print("1");
		    System.out.println();
		   } else {
		    for (int space = 0; space < numb - count2; space++) {
		     System.out.print(" ");
		    }
		    System.out.print(count2);

		    for (int z = 0; z < 2 * count2 - 3; z++) {
		     System.out.print("*");
		    }

		    System.out.print(count2);
		    System.out.println();
		    count2--;
		   }
		  }
	}

}
