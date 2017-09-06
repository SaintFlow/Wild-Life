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
    public static final List<Animal> ITEMS = new ArrayList<>();
    public static final List<Animal> MAMMALS = new ArrayList<>();
    public static final List<Animal> BIRDS = new ArrayList<>();
    public static final List<Animal> FISH = new ArrayList<>();
    public static final List<Animal> REPTILES = new ArrayList<>();
    public static final List<Animal> AMPHIBIANS = new ArrayList<>();
    public static final List<Animal> ANTHROPODS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Animal> ITEM_MAP = new HashMap<>();

    public static final Map<String, Animal> MAMMALS_MAP = new HashMap<>();
    public static final Map<String, Animal> BIRDS_MAP = new HashMap<>();
    public static final Map<String, Animal> FISH_MAP = new HashMap<>();
    public static final Map<String, Animal> REPTILES_MAP = new HashMap<>();
    public static final Map<String, Animal> AMPHIBIANS_MAP = new HashMap<>();
    public static final Map<String, Animal> ANTHROPODS_MAP = new HashMap<>();

    public static final SparseArray<Map<String, Animal>> animalMapClasses =
            new SparseArray<>();
    public static final SparseArray<List<Animal>> animalClasses =
            new SparseArray<>();

    static {

        // Add some current Animals and their contents
        // Should use SQLite instead? Not sure what the best way is

        Animal beaver = new Animal("1", "North American Beaver", "test1", R.drawable.beaver);
        beaver.setAnimalClass("mammal");
        beaver.setSpecies("Castor canadensis");

        Animal coyote = new Animal("2", "Coyote", "test1", R.drawable.coyote);
        coyote.setAnimalClass("mammal");
        coyote.setSpecies("Canis latrans");

        Animal easternChipmunk = new Animal("3", "Eastern Chipmunk", "test3",
                R.drawable.eastern_chipmunk);
        easternChipmunk.setAnimalClass("mammal");
        easternChipmunk.setSpecies("Tamias striatus");

        Animal groundhog = new Animal("4", "Groundhog", "test3", R.drawable.groundhog);
        groundhog.setAnimalClass("mammal");
        groundhog.setSpecies("Marmota monax");

        Animal mink = new Animal("5", "American Mink", "test1", R.drawable.mink);
        mink.setAnimalClass("mammal");
        mink.setSpecies("Neovison vison");

        Animal opossum = new Animal("6", "Virginia Opossum", "test1", R.drawable.opossum);
        opossum.setAnimalClass("mammal");
        opossum.setSpecies("Didelphis virginiana");

        Animal raccoon = new Animal("7", "Raccoon", "test1", R.drawable.raccoon);
        raccoon.setAnimalClass("mammal");
        raccoon.setSpecies("Procyon lotor");

        Animal redFox = new Animal("8", "Red Fox", "test1", R.drawable.red_fox);
        redFox.setAnimalClass("mammal");
        redFox.setSpecies("Vulpes vulpes");

        Animal seagull = new Animal("9", "Seagull", "test3", R.drawable.seagull);
        seagull.setAnimalClass("bird");

        Animal skunk = new Animal("10", "Striped Skunk", "test3", R.drawable.skunk);
        skunk.setAnimalClass("mammal");
        skunk.setSpecies("Mephitis mephitis");

        Animal squirrel = new Animal("11", "Eastern Gray Squirrel", "test2", R.drawable.squirrel);
        squirrel.setAnimalClass("mammal");
        squirrel.setSpecies("Sciurus carolinensis");

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

        Animal bluejay = new Animal("15", "Blue Jay", "test3", R.drawable.blue_jay);
        bluejay.setAnimalClass("bird");
        bluejay.setSpecies("Cyanocitta cristata");

        Animal northAmericanPorcupine = new Animal("16", "North American Porcupine", "test3",
                R.drawable.north_american_porcupine);
        northAmericanPorcupine.setAnimalClass("mammal");
        northAmericanPorcupine.setSpecies("Erethizon dorsatum");

        Animal canadaGoose = new Animal("17", "Canada Goose", "test3", R.drawable.canada_goose);
        canadaGoose.setAnimalClass("bird");
        canadaGoose.setSpecies("Branta canadensis");

        Animal americanBlackBear = new Animal("18", "American Black Bear", "test3",
                R.drawable.american_black_bear);
        americanBlackBear.setAnimalClass("mammal");
        americanBlackBear.setSpecies("Ursus americanus");

        Animal meadowVole = new Animal("19", "Meadow Vole", "test3", R.drawable.meadow_vole);
        meadowVole.setAnimalClass("mammal");
        meadowVole.setSpecies("Microtus pennsylvanicus");

        Animal wolverine = new Animal("20", "Wolverine", "test3", R.drawable.wolverine);
        wolverine.setAnimalClass("mammal");
        wolverine.setSpecies("Gulo gulo");

        Animal bobcat = new Animal("21", "Bobcat", "test3", R.drawable.bobcat);
        bobcat.setAnimalClass("mammal");
        bobcat.setSpecies("Lynx rufus");

        Animal littleBrownBat = new Animal("22", "Little Brown Bat", "test3",
                R.drawable.little_brown_bat);
        littleBrownBat.setAnimalClass("mammal");
        littleBrownBat.setSpecies("Myotis lucifugus");

        Animal fiveLinkedSkink = new Animal("23", "Five-linked Skink", "test3",
                R.drawable.five_linked_skink);
        fiveLinkedSkink.setAnimalClass("reptile");
        fiveLinkedSkink.setSpecies("Plestiodon fasciatus");

        Animal americanMartin = new Animal("24", "American Marten", "test3",
                R.drawable.american_pine_marten);
        americanMartin.setAnimalClass("mammal");
        americanMartin.setSpecies("Martes americana");

        Animal grayTreeFrog = new Animal("25", "Gray Tree Frog", "test3",
                R.drawable.gray_tree_frog);
        grayTreeFrog.setAnimalClass("amphibian");
        grayTreeFrog.setSpecies("Hyla versicolor");

        Animal elk =  new Animal("26", "Elk", "test3", R.drawable.elk);
        elk.setAnimalClass("mammal");
        elk.setSpecies("Cervus canadensis");

        Animal riverOtter = new Animal("27", "Northern River Otter", "test3",
                R.drawable.north_american_river_otter);
        riverOtter.setAnimalClass("mammal");
        riverOtter.setSpecies("Lontra canadensis");

        Animal paintedTurtle = new Animal("28", "Painted Turtle", "test3",
                R.drawable.painted_turtle);
        paintedTurtle.setAnimalClass("reptile");
        paintedTurtle.setSpecies("Chrysemys picta");

        Animal snowshoeHare = new Animal("29", "Snowshoe Hare", "test3", R.drawable.snowshoe_hare);
        snowshoeHare.setAnimalClass("mammal");
        snowshoeHare.setSpecies("Lepus americanus");

        Animal barred_owl = new Animal("30", "Barred Owl", "test3", R.drawable.barred_owl);
        barred_owl.setAnimalClass("bird");
        barred_owl.setSpecies("Strix varia");

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
        addItem(americanBlackBear);
        addItem(meadowVole);
        addItem(wolverine);
        addItem(bobcat);
        addItem(littleBrownBat);
        addItem(fiveLinkedSkink);
        addItem(americanMartin);
        addItem(grayTreeFrog);
        addItem(elk);
        addItem(riverOtter);
        addItem(paintedTurtle);
        addItem(snowshoeHare);
        addItem(barred_owl);

        //Adding Mammals to their associated class lists
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
            if (animal.getAnimalClass().equals("reptile"))
            {
                addReptileItem(animal);
            }
            if (animal.getAnimalClass().equals("amphibian"))
            {
                addAmphibianItem(animal);
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

    private static void addReptileItem(Animal item)
    {
        REPTILES.add(item);
        REPTILES_MAP.put(item.id, item);
    }

    private static void addAmphibianItem(Animal item)
    {
        AMPHIBIANS.add(item);
        AMPHIBIANS_MAP.put(item.id, item);
    }

    /*private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }*/

    /*private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }*/


}
