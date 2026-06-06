/*
Adam Archuleta
June 21, 2026
Purpose: Blueprint representing unique character records and sorting capabilities.
Sources: HumanResources_part2_of_2 guidelines.
*/

public class Person implements Comparable<Person> {
    private String name;
    private double height, weight;
    
    public Person(String n, double h, double w) { 
        name = n; 
        height = h; 
        weight = w; 
    }
    
    public String getName() { return name; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }
    
    @Override
    public String toString() { 
        return toString(false); 
    }
    
    public String toString(boolean isImperial) {
        if (isImperial) {
            return String.format("%s\t%.2f\t%.2f", name, height, weight);
        }
        return String.format("%s\t%.0f\t%.0f", name, height, weight);
    }
    
    @Override
    public boolean equals(Object o) {
        Person p = (Person) o;
        return name.equalsIgnoreCase(p.name);
    }
    
    public int compareTo(Person p) { 
        return name.compareToIgnoreCase(p.name); 
    }
}