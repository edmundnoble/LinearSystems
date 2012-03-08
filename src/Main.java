import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Integer> equation1, equation2;
	private static ArrayList<String> vars = new ArrayList<String>();

	public static void main(String... args) {
		parseInput();
		int tempint = 0;
		for (Object obj : equation1.toArray()) {
			int integer = (Integer) obj;
			tempint += integer;
		}
		for (Object obj : equation2.toArray()) {
			int integer = (Integer) obj;
			tempint -= integer;
		}
		String[] vararray = (String[]) vars.toArray();
		for (int i = 0; i < vararray.length; i++) {

			String string = vararray[i];
			if (string.length() > 2) {
				try {
					String[] parsableString = new String[5];
					for (int l = 0; l < vararray.length; l++) {
						if (l != i) {
							try {
								parsableString[l] = vararray[l];
							} catch (NumberFormatException e) {

							}
						}
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void parseInput() {
		equation1 = new ArrayList<Integer>();
		equation2 = new ArrayList<Integer>();

		System.out.println("First equation:");

		String[] temp = scanner.nextLine().split(" ");
		for (String element : temp) {
			try {
				equation1.add(Integer.parseInt(element));
			} catch (NumberFormatException e) {
				vars.add(element);
			}
		}
		System.out.println("Second equation:");
		temp = scanner.nextLine().split(" ");
		for (String element : temp) {
			try {
				equation2.add(Integer.parseInt(element));
			} catch (NumberFormatException e) {
				vars.add(element);
			}
		}
	}
}
