package commonflow.wildlife.dummy;

import java.util.List;

/**
 * Created by Randy on 7/1/2017.
 */
public class Animal
{

    public final String id;
    public final String content;
    public final String details;
    public final int image;



    private String animalClass;
    private String species;
    public String scientificName = "";
    public String length = "";
    public String weight = "";
    public List<String> otherNames;

    /**
     * Constructor for the Animal class
     * @param id The unique id number that matches with the animal.
     * @param content
     * @param details
     * @param image Refers to the image file found in the project drawable folder. Each animal
     *              must be referenced with an existing file.
     */
    public Animal(String id, String content, String details, int image) {
        this.id = id;
        this.content = content;
        this.details = details;
        this.image = image;
        animalClass = "";
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String a)
    {
        animalClass = a;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return content;
    }

}
