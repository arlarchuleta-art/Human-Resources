/*
Adam Archuleta
June 5, 2026
Purpose: Parent set class implementing standard tracking and duplicate checks.
Sources: Course Syllabus AI Policy; HumanResources_part2_of_2 guidelines.
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
        return people.get(index);
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