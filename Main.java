/*
Adam Archuleta
June 16, 2026
Purpose: Application driver parsing records, building lists, and saving logs.
Sources: HumanResources_part1_of_2 instructions.
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println();
		
		// 5.A: Instantiate a single Person object as a test
		Person testPerson = new Person("TestMario", 100.0, 50.0);
		System.out.println("Test Person Created: " + testPerson.toString());
		
		// 5.B: Instantiate a PersonSet object as a test
		PersonSet testSet = new PersonSet();
		testSet.add(testPerson);
		
		// 5.C: Read data in from the file hr.txt and display it
		if (args.length == 0) 
		{
			System.out.println("Please provide the filename: java Main hr.txt");
			return;
		}

		File file = new File(args[0]);

		try (Scanner fileReader = new Scanner(file)) 
		{
			// Skip the first row of character info labels
			if (fileReader.hasNextLine()) 
			{
				fileReader.nextLine();
			}

            // Using the exact simplified logic provided in the starter file
			while (fileReader.hasNext()) 
			{
				String name = fileReader.next();
				double height = fileReader.nextDouble();
				double weight = fileReader.nextDouble();

				Person character = new Person(name, height, weight);
				testSet.add(character);
			}
		} 
		catch (IOException e) 
		{
			System.out.println("Error reading file: " + e.getMessage());
			return;
		}

		// Display clean database output to the command prompt
		System.out.println("\n--- NINTENDO HR DATABASE (PART 1) ---");
		System.out.print(testSet.toString());
	}
}