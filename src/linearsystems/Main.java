

package linearsystems;

import java.io.PrintStream;
import java.util.Scanner;

import Jama.Matrix;


public class Main {

	private static int equationCount = -1;
	private static final PrintStream OUT = System.out;

	public static void main(String... args) {
		OUT.println("Remember, your equation must be formatted like so: "
				+ "\ncoefficient(variable) + coef(var) = constant\n");
		parseInput(new Scanner(System.in));
	}

	strictfp private static void parseInput(Scanner scanner) {
		OUT.println("How many equations?");
		equationCount = scanner.nextInt();
		scanner.nextLine();
		if (equationCount <= 1) {
			OUT.println("Not a linear system.");
			parseInput(scanner);
			return;
		}
		OUT.println("Enter variable names in alphabetical order.");
		String[] varNames = new String[equationCount];
		double[][] coefs = new double[equationCount][equationCount];
		double[] constants = new double[equationCount];
		for (int i = 0; i < equationCount; i++) {
			OUT.println("Variable name " + (i + 1) + ":");
			varNames[i] = scanner.nextLine();
		}
		for (int i = 0; i < equationCount; i++) {
			for (int j = 0; j < equationCount; j++) {
				OUT.println("Enter variable " + varNames[i]
						+ " coefficient in equation " + (j + 1));
				coefs[j][i] = scanner.nextDouble();
				scanner.nextLine();
			}
		}
		for (int i = 0; i < equationCount; i++) {
			OUT.println("Enter constant in equation " + (i + 1));
			constants[i] = scanner.nextDouble();
			scanner.nextLine();
		}
		Matrix coefMatrix = new Matrix(coefs).inverse();
		Matrix constMatrix = new Matrix(constants, constants.length);
		Matrix resultMatrix = coefMatrix.times(constMatrix);
		for (int i = 0; i < varNames.length; i++) {
			String element = varNames[i];
			Double result = resultMatrix.get(i, 0);
			System.out.println(element + " = " + result);
		}
	}
}
