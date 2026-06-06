/*
Adam Archuleta
June 21, 2026
Purpose: Interface outlining baseline contract methods for character lists.
Sources: HumanResources_part2_of_2 guidelines.
*/

public interface PersonList 
{
    void add(Person p);
    Person get(int index);
}