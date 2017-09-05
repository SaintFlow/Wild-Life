package commonflow.wildlife.dummy;

/**
 * Animal Picture class, containing attributes for each Animal picture.
 * Created by Randy on 5/23/2017.
 */
public class AnimalPicture
{

    private String animal_name;

    private String animal_picture_url = "";

    private int animal_id;

    public AnimalPicture()
    {
        animal_name = "";
        animal_picture_url = "";
    }

    /*public AnimalPicture(String name, String url)
    {
        animal_name = name;
        animal_picture_url = url;
    }*/

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getAnimal_picture_url() {
        return animal_picture_url;
    }

    public void setAnimal_picture_url(String animal_picture_url) {
        this.animal_picture_url = animal_picture_url;
    }

    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    //Equal if their URLs are equal
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().equals(AnimalPicture.class)) {
            AnimalPicture newObj = (AnimalPicture) obj;
            return this.getAnimal_picture_url().equals(newObj.getAnimal_picture_url());
        }
        else return false;
    }
}
