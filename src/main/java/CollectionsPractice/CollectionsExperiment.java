package CollectionsPractice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class CollectionsExperiment{
    public static void main(String[] args) {
        Collection<Animal> animals = new ArrayList<Animal>();
        Animal tabby = new Animal("Tabby", "Kitchen");
        Animal betaFish = new Animal("Crescent Moon", "Thailand");
        Animal ant = new Animal("Bullet Ant", "Asia");
        animals.add(tabby);
        animals.add(betaFish);
        animals.add(ant);

        Collection<Animal> pets = new ArrayList<Animal>();
        pets.add(tabby);
        pets.add(betaFish);
        pets.add(ant);
        final Iterator<Animal> animalIterator = animals.iterator();

        for(Animal animal : animals){
            if (animal.getHabitat().equals("Asia")){
               /* animalIterator.remove(); ERROR illegalStateException
                   cant do .add, .clear . remove(obj) in for each because
                   you are changing the collection as you iterate through it
                   you have to use the iterator for those. Can't use a for each loop
                */
            }
            else
            {
                System.out.println(animal.getClass().getSimpleName());
            }
        }

        System.out.println(animals);

        while(animalIterator.hasNext()){
            if (!animalIterator.next().equals(tabby)){
                System.out.println(tabby.getClass().getSimpleName());
            }
            else
            {
                animalIterator.remove(); //Good
            }
        }
        System.out.println(animals.getClass().getSimpleName());

        System.out.println(animals.size());
        System.out.println(animals.contains(tabby));
        System.out.println(animals.containsAll(pets));
        System.out.println(animals.hashCode());
        System.out.println(animals.isEmpty());
        System.out.println(animals.toArray());
        animals.removeAll(pets);
        System.out.println(animals);
    }

    //Sublists are views over ranges of lists

}

/* all collections extend java.util.Collection
Lists have order and indexing
sets- collection that has distinct elements that you can't index into
SortedSet also have sort order
Queue- FIFO
Deque have FIFO and LIFO

MAP - interfaces that define collections of pairs that are Key,Value Pairs
Sorted Map

everything is based on performance and there are specific things

iterable; collections big brother is iterable. Defines comething
*/