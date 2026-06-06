/*
Adam Archuleta
June 21, 2026
Purpose: Application driver parsing records, building lists, and saving logs.
Sources: ReadingFile.java file io examples.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        if (args.length == 0) 
        {
            System.out.println("Error: Missing argument path target.");
            return;
        }

        PersonOrderedSet orderedSet = new PersonOrderedSet();
        PersonImperialSet imperialSet = new PersonImperialSet();

        try (Scanner fs = new Scanner(new File(args[0]))) 
        {
            if (fs.hasNextLine()) fs.nextLine(); // Ignore column title labels

            while (fs.hasNextLine()) 
            {
                String line = fs.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] chunks = line.split("\\t+");
                if (chunks.length >= 3) 
                {
                    String name = chunks[0].trim();
                    double h = Double.parseDouble(chunks[1].trim());
                    double w = Double.parseDouble(chunks[2].trim());

                    // Instantiate two separate objects to protect memory spacing
                    orderedSet.add(new Person(name, h, w));
                    imperialSet.add(new Person(name, h, w));
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Data target missing.");
            return;
        }

        // Print outputs onto console terminal
        System.out.println("--- ORDERED METRIC SET ---");
        System.out.print(orderedSet.toString());
        System.out.println("\n--- IMPERIAL SET ---");
        System.out.print(imperialSet.toString());

        // Save generated collections out into target files
        writeFile("hr_ordered_set_output.txt", "Name\tHeight(cm)\tWeight(kg)\n" + orderedSet.toString());
        writeFile("hr_imperial_set_output.txt", "Name\tHeight(in)\tWeight(lb)\n" + imperialSet.toString());
    }

    private static void writeFile(String filename, String content) 
    {
        try (FileWriter out = new FileWriter(filename)) 
        {
            out.write(content);
        } 
        catch (IOException e) 
        {
            System.out.println("Error writing files out.");
        }
    }
}