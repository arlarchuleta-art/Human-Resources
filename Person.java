/*
Adam Archuleta
June 16, 2026
Purpose: Blueprint representing unique character records and validation tests.
Sources: HumanResources_part1_of_2 instructions.
*/

public class Person 
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

    public String getName() 
    {
        return name;
    }

    public double getHeight() 
    {
        return height;
    }

    public double getWeight() 
    {
        return weight;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    public void setWeight(double weight) 
    {
        this.weight = weight;
    }

    @Override
    public String toString() 
    {
        return String.format("%s\t%.0f\t%.0f", name, height, weight);
    }

    @Override
    public boolean equals(Object o) 
    {
        // Follows the instructor's exact mandatory logic outline
        if (o == null) 
        {
            return false;
        }
        if (o == this) 
        {
            return true;
        }
        if (!(o instanceof Person)) 
        {
            return false;
        }
        
        Person p = (Person) o;
        return this.name.equals(p.name) && 
               this.height == p.height && 
               this.weight == p.weight;
    }
}