/*
Adam Archuleta
June 16, 2026
Purpose: Set implementation using an ArrayList to block duplicate entries.
Sources: HumanResources_part1_of_2 instructions.
*/

import java.util.ArrayList;

public class PersonSet implements PersonList 
{
    protected ArrayList<Person> people;

    public PersonSet() 
    {
        people = new ArrayList<Person>();
    }

    @Override
    public void add(Person p) 
    {
        if (!people.contains(p)) 
        {
            people.add(p);
        }
    }

    @Override
    public Person get(int index) 
    {
        if (index >= 0 && index < people.size()) 
        {
            return people.get(index);
        }
        return null;
    }

    public int size() 
    {
        return people.size();
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        for (Person p : people) 
        {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}