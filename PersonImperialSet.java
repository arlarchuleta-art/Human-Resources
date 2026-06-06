/*
Adam Archuleta
June 21, 2026
Purpose: Custom child set handling standard metric to imperial conversion steps.
Sources:HumanResources_part2_of_2 guidelines.
*/

public class PersonImperialSet extends PersonSet 
{
    public PersonImperialSet() 
    {
        super();
    }

    @Override
    public void add(Person p) 
    {
        if (!people.contains(p)) 
        {
            double impHeight = convertHeight(p.getHeight());
            double impWeight = convertWeight(p.getWeight());
            Person impPerson = new Person(p.getName(), impHeight, impWeight);
            super.add(impPerson);
        }
    }

    private double convertHeight(double cm) 
    {
        return cm / 2.54; // Centimeters to Inches
    }

    private double convertWeight(double kg) 
    {
        return kg * 2.20462; // Kilograms to Pounds
    }
}