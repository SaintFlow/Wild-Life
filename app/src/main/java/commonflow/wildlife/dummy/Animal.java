package commonflow.wildlife.dummy;


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

    /**
     * Constructor for the Animal class
     * @param id The unique id number that matches with the animal.
     * @param content Extra information of the animal
     * @param details Detail information of the animal
     * @param image Refers to the image file found in the project drawable folder. Each animal
     *              must be referenced with an existing file.
     */
    public Animal(String id, String content, String details, int image) {
        this.id = id;
        this.content = content;
        this.details = details;
        this.image = image;
        animalClass = "";
        setSpecies("");
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String a)
    {
        animalClass = a;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return content;
    }

}
