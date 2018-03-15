package CollectionsPractice;

import java.util.Objects;

public class Animal{
    private String species;
    private String habitat;

    public Animal(String species, String habitat){
        this.habitat = habitat;
        this.species = species;
    }


    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }


    // equals and hashcode are used for comparing objects in hashmap/hashset
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(species, animal.species) &&
                Objects.equals(habitat, animal.habitat);
    }

    @Override
    public int hashCode() {
        //returns has of species and habitat
        return Objects.hash(species, habitat);
    }
}