import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class projectThing {
	public static void main(String[] args) {

		File classCSV = new File("class.csv");

		String[] names = new String[31];

		try{
			Scanner reader = new Scanner(classCSV);

			for (int i = 0;reader.nextLine() != null; i++) {
				names[i] = reader.nextLine();
			}

			for (int i = 0; i < 31;i++ ) {
				System.out.println(names[i]);
			}
		}

		catch (FileNotFoundException e) {
			System.out.println("Cannot find file");
		}
		
	}
}