package CollectionsPractice;

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
}