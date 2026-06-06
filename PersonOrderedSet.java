/*
Adam Archuleta
June 21, 2026
Purpose: Alphabetically organized set container for sorting objects.
Sources: HumanResources_part2_of_2 guidelines.
*/

import java.util.Collections;

public class PersonOrderedSet extends PersonSet {
    public void add(Person p) {
        super.add(p);
        Collections.sort(people);
    }
}