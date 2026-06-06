/*
Adam Archuleta
June 21, 2026
Purpose: Base set container for blocking duplicates.
Sources: HumanResources_part2_of_2 guidelines.
*/

import java.util.ArrayList;

public class PersonSet implements PersonList {
    protected ArrayList<Person> people = new ArrayList<>();
    
    public void add(Person p) { 
        if (!people.contains(p)) people.add(p); 
    }
    
    public Person get(int i) { 
        return people.get(i); 
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Person p : people) {
            s.append(p.toString(false)).append("\n");
        }
        return s.toString();
    }
}