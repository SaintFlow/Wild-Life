package commonflow.wildlife.dummy;

import android.util.SparseArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import commonflow.wildlife.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 *
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Animal> ITEMS = new ArrayList<Animal>();
    public static final List<Animal> MAMMALS = new ArrayList<Animal>();
    public static final List<Animal> BIRDS = new ArrayList<Animal>();
    public static final List<Animal> FISH = new ArrayList<Animal>();
    public static final List<Animal> REPTILES = new ArrayList<Animal>();
    public static final List<Animal> AMPHIBIANS = new ArrayList<Animal>();
    public static final List<Animal> ANTHROPODS = new ArrayList<Animal>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Animal> ITEM_MAP = new HashMap<>();

    public static final Map<String, Animal> MAMMALS_MAP = new HashMap<String, Animal>();
    public static final Map<String, Animal> BIRDS_MAP = new HashMap<String, Animal>();
    public static final Map<String, Animal> FISH_MAP = new HashMap<String, Animal>();
    public static final Map<String, Animal> REPTILES_MAP = new HashMap<String, Animal>();
    public static final Map<String, Animal> AMPHIBIANS_MAP = new HashMap<String, Animal>();
    public static final Map<String, Animal> ANTHROPODS_MAP = new HashMap<String, Animal>();

    public static final SparseArray<Map<String, Animal>> animalMapClasses =
            new SparseArray<>();
    public static final SparseArray<List<Animal>> animalClasses =
            new SparseArray<>();

    private static final int COUNT = 25;

    static {

        // Add some current Animals and their contents
        // Should use SQLite instead? Not sure what the best way is

        Animal beaver = new Animal("1", "Beaver", "test1", R.drawable.beaver);
        beaver.setAnimalClass("mammal");
        Animal coyote = new Animal("2", "Coyote", "test1", R.drawable.coyote);
        Animal easternChipmunk = new Animal("3", "Eastern Chipmunk", "test3", R.drawable.eastern_chipmunk);
        Animal groundhog = new Animal("4", "Groundhog", "test3", R.drawable.groundhog);
        Animal mink = new Animal("5", "Mink", "test1", R.drawable.mink);
        Animal opossum = new Animal("6", "Opossum", "test1", R.drawable.opossum);
        Animal raccoon = new Animal("7", "Raccoon", "test1", R.drawable.raccoon);
        Animal redFox = new Animal("8", "Red Fox", "test1", R.drawable.red_fox);
        Animal seagull = new Animal("9", "Seagull", "test3", R.drawable.seagull);
        Animal skunk = new Animal("10", "Skunk", "test3", R.drawable.skunk);
        Animal squirrel = new Animal("11", "Squirrel", "test2", R.drawable.squirrel);

        //Add animals to universal animal list
        addItem(beaver);
        addItem(coyote);
        addItem(easternChipmunk);
        addItem(groundhog);
        addItem(mink);
        addItem(opossum);
        addItem(raccoon);
        addItem(redFox);
        addItem(seagull);
        addItem(skunk);
        addItem(squirrel);

        //Adding Mammals to mammal list
        addMammalItem(beaver);
        addMammalItem(coyote);
        addMammalItem(easternChipmunk);
        addMammalItem(groundhog);
        addMammalItem(mink);
        addMammalItem(opossum);
        addMammalItem(raccoon);
        addMammalItem(redFox);
        addMammalItem(skunk);
        addMammalItem(squirrel);

        //Adding birds to bird list
        addBirdItem(seagull);

        //Add Animal Class Lists to SparseArray
        animalClasses.append(1, MAMMALS);
        animalClasses.append(2, BIRDS);
        animalClasses.append(3, FISH);
        animalClasses.append(4, REPTILES);
        animalClasses.append(5, AMPHIBIANS);
        animalClasses.append(6, ANTHROPODS);

        //Add Animal Class Maps to SparseArray
        animalMapClasses.append(1, MAMMALS_MAP);
        animalMapClasses.append(2, BIRDS_MAP);
        animalMapClasses.append(3, FISH_MAP);
        animalMapClasses.append(4, REPTILES_MAP);
        animalMapClasses.append(5, AMPHIBIANS_MAP);
        animalMapClasses.append(6, ANTHROPODS_MAP);
    }

    private static void addItem(Animal item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static void addMammalItem(Animal item)
    {
        MAMMALS.add(item);
        MAMMALS_MAP.put(item.id, item);
    }

    private static void addBirdItem(Animal item)
    {
        BIRDS.add(item);
        BIRDS_MAP.put(item.id, item);
    }

    /*private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }*/

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }


}
