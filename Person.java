/*
Adam Archuleta
June 21, 2026
Purpose: Blueprint representing unique character records and sorting capabilities.
Sources: HumanResources_part2_of_2 guidelines.
*/

public class Person implements Comparable<Person> 
{
    private String name;
    private double height;
    private double weight;

    public Person(String name, double height, double weight) 
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() { return name; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }

    @Override
    public String toString() 
    {
        return String.format("%s\t%.2f\t%.2f", name, height, weight);
    }

    @Override
    public boolean equals(Object o) 
    {
        if (o == null) return false;
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return this.name.equalsIgnoreCase(p.name);
    }

    @Override
    public int compareTo(Person p) 
    {
        return this.name.compareToIgnoreCase(p.name);
    }
}