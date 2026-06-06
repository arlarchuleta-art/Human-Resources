/*
Adam Archuleta
June 21, 2026
Purpose: Custom child set handling standard metric to imperial conversion steps.
Sources: HumanResources_part2_of_2 guidelines.
*/

public class PersonImperialSet extends PersonSet {
    public void add(Person p) {
        super.add(new Person(p.getName(), p.getHeight() / 2.54, p.getWeight() * 2.20462));
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Person p : people) {
            s.append(p.toString(true)).append("\n");
        }
        return s.toString();
    }
}