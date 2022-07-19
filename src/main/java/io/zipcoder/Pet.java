package io.zipcoder;
import java.lang.Comparable;
import java.util.Comparator;

public class Pet implements Comparable<Pet>, Comparator<Pet>{

    String name;
    public Pet (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String speak () {
        return "asdfasfdasf";
    }
    public int compareTo(Pet o) {
        return o.name.compareTo(this.name);
    }
    public int compare(Pet o1, Pet o2) {
        return o2.compareTo(o1);
    }
}
