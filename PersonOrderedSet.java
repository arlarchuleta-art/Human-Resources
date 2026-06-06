/*
Adam Archuleta
June 21, 2026
Purpose: Alphabetically organized set container for sorting objects.
Sources: HumanResources_part2_of_2 guidelines.
*/

import java.util.Collections;

public class PersonOrderedSet extends PersonSet 
{
    public PersonOrderedSet() 
    {
        super();
    }

    @Override
    public void add(Person p) 
    {
        if (!people.contains(p)) 
        {
            super.add(p);
            sort();
        }
    }

    private void sort() 
    {
        Collections.sort(people);
    }
}