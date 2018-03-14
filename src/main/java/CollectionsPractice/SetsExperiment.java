package CollectionsPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExperiment {
    /*
    Sets are collections of distinct elements. NO DUPLICATES
     */

    public static void main(String[] args) {
        Set<Animal> hashSet = new HashSet<Animal>();
        /*
        -calls hashCode on element and looks up location
        -good general purpose and resize
        -requirement that hashcode of object has to equal hashcode of other object
        -you have to make your own custom own equals method
            ex: result * result + obj,hashCode();
         */

        Set<Animal> treeSet = new TreeSet<Animal>();
        /*
        Based upon tree map, uses binary tree with a required sort order
        keeps elements in given order: see sortedSet and navigableSet
         */
        Set<Animal> enumSet = new Enum<Animal>();// wont work need enums

    }
}
