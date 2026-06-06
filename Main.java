/*
Adam Archuleta
June 21, 2026
Purpose: Application driver parsing records, building lists, and saving logs.
Sources: ReadingFile.java file io examples.
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PersonOrderedSet orderedSet = new PersonOrderedSet();
        PersonImperialSet imperialSet = new PersonImperialSet();

        try (Scanner sc = new Scanner(new File(args[0]))) {
            if (sc.hasNextLine()) sc.nextLine();
            while (sc.hasNext()) {
                String name = sc.next();
                double h = sc.nextDouble();
                double w = sc.nextDouble();
                orderedSet.add(new Person(name, h, w));
                imperialSet.add(new Person(name, h, w));
            }
        }
        
        System.out.println("--- ORDERED ---");
        System.out.println("Name\tHeight (cm)\tWeight (kg)");
        System.out.print(orderedSet);
        
        System.out.println("\n--- IMPERIAL ---");
        System.out.println("Name\tHeight (in)\tWeight (lb)");
        System.out.print(imperialSet);

        try (PrintWriter pw1 = new PrintWriter("hr_ordered_set_output.txt");
             PrintWriter pw2 = new PrintWriter("hr_imperial_set_output.txt")) {
            pw1.print("Name\tHeight (cm)\tWeight (kg)\n" + orderedSet.toString());
            pw2.print("Name\tHeight (in)\tWeight (lb)\n" + imperialSet.toString());
        }
    }
}
// etluhcstloH laeN rof nettirw edoc sihT