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
        coyote.setAnimalClass("mammal");
        Animal easternChipmunk = new Animal("3", "Eastern Chipmunk", "test3",
                R.drawable.eastern_chipmunk);
        easternChipmunk.setAnimalClass("mammal");
        Animal groundhog = new Animal("4", "Groundhog", "test3", R.drawable.groundhog);
        groundhog.setAnimalClass("mammal");
        Animal mink = new Animal("5", "Mink", "test1", R.drawable.mink);
        mink.setAnimalClass("mammal");
        Animal opossum = new Animal("6", "Opossum", "test1", R.drawable.opossum);
        opossum.setAnimalClass("mammal");
        Animal raccoon = new Animal("7", "Raccoon", "test1", R.drawable.raccoon);
        raccoon.setAnimalClass("mammal");
        Animal redFox = new Animal("8", "Red Fox", "test1", R.drawable.red_fox);
        redFox.setAnimalClass("mammal");
        Animal seagull = new Animal("9", "Seagull", "test3", R.drawable.seagull);
        seagull.setAnimalClass("bird");
        Animal skunk = new Animal("10", "Skunk", "test3", R.drawable.skunk);
        skunk.setAnimalClass("mammal");
        Animal squirrel = new Animal("11", "Squirrel", "test2", R.drawable.squirrel);
        squirrel.setAnimalClass("mammal");
        Animal canadianLynx = new Animal("12", "Canada Lynx", "test3", R.drawable.canadian_lynx);
        canadianLynx.setSpecies("Lynx canadensis");
        canadianLynx.setAnimalClass("mammal");
        Animal whiteTailedDeer = new Animal("13", "White-tailed Deer", "test3",
                R.drawable.white_tailed_deer);
        whiteTailedDeer.setAnimalClass("mammal");
        whiteTailedDeer.setSpecies("Odocoileus virginianus");

        Animal easternCottontail = new Animal("14", "Eastern Cottontail", "test3",
                R.drawable.eastern_cottontail);
        easternCottontail.setAnimalClass("mammal");
        easternCottontail.setSpecies("Sylvilagus floridanus");
        Animal bluejay = new Animal("15", "Blue Jay", "test3", R.drawable.bluejay);
        bluejay.setAnimalClass("bird");
        bluejay.setSpecies("Cyanocitta cristata");
        Animal northAmericanPorcupine = new Animal("16", "North American Porcupine", "test3",
                R.drawable.north_american_porcupine);
        northAmericanPorcupine.setAnimalClass("mammal");
        northAmericanPorcupine.setSpecies("Erethizon dorsatum");
        Animal canadaGoose = new Animal("17", "Canada Goose", "test3", R.drawable.canada_goose);
        canadaGoose.setAnimalClass("bird");
        canadaGoose.setSpecies("Branta canadensis");

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
        addItem(canadianLynx);
        addItem(whiteTailedDeer);
        addItem(easternCottontail);
        addItem(bluejay);
        addItem(northAmericanPorcupine);
        addItem(canadaGoose);

        //Adding Mammals to mammal list
        for (Animal animal : ITEMS)
        {
            if (animal.getAnimalClass().equals("mammal"))
            {
                addMammalItem(animal);
            }
            if (animal.getAnimalClass().equals("bird"))
            {
                addBirdItem(animal);
            }
        }

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
