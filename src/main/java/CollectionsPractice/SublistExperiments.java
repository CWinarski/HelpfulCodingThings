package CollectionsPractice;

import java.util.ArrayList;
import java.util.List;

public class SublistExperiments {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); //Iterable but is not a collection
        animals.iterator(); // so can call this iterator on the class
        Animal tabby = new Animal("Tabby", "Kitchen");
        Animal betaFish = new Animal("Crescent Moon", "Asia");
        Animal ant = new Animal("Bullet Ant", "Asia");
        Animal dog = new Animal("Shiba Inu", "Kitchen");
        animals.add(tabby);
        animals.add(betaFish);
        animals.add(ant);
        animals.add(dog);

        // can sort by animals.sort();
        // or sort bye Collections.sort;

        List<Animal> firstTwo = animals.subList(0, 2);
        List<Animal> lastTwo = animals.subList(2, animals.size());
        System.out.println(firstTwo);
        System.out.println(lastTwo);
        /* if you modify a sublist ypu have a view of it modifies the the underlying list
         .subList(int fromIndex, int toIndex) fromIndex is inclusive and toIndex is exclusive)

         two key implementations of Lists
         -ArrayList
         -LinkedList


         ArrayList
         index pair
         so at index 0  is tabby so index 0 is tabby

         They are good general purpose implementations
         they are the default choice
         very efficient
         Cache: cpu faster then memory so there is a cache to make up for that
         more CPU cache sympathetic: meaning they don't destroy your cache? very fast


         LinkedList implements list and deque
         doubly linked list meaning each element in the linked list has a pointer to its next element and a pointer to its previous element
         keeps reference to head and tail of linked list
         slower to iterate over because of pointer chasing
         faster with adding to start of list
        */
    }


}
