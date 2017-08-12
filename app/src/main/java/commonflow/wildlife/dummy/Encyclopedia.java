package commonflow.wildlife.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Randy on 5/16/2017.
 */
public class Encyclopedia
{

    private HashMap<String, List<String>> ency;

    public Encyclopedia()
    {
        //North American beaver, taken from Wikipedia, sciencekids.co.nz, PBS videos
        final String northAmericanBeaver1 = "The North American Beaver is the largest rodent in " +
                "North America, with the European beaver being the second-largest rodent in " +
                "the world.";
        final String northAmericanBeaver2 = "Beavers are semiaquatic. They have a large, " +
                "flat, paddle-shaped tail and large, webbed hind feet. The unwebbed front " +
                "paws are smaller, with claws.";
        final String northAmericanBeaver3 = "The beaver’s incisors are strengthened with iron." +
                " Their teeth are coloured orange by gnawing through bark to get the sugary" +
                " contents underneath.";
        final String northAmericanBeaver4 = "Beavers are slow on land but using their " +
                "webbed feet, they are very good swimmers. A beaver can stay under water " +
                "for up to 15 minutes.";
        final String northAmericanBeaver5 = "Beavers are active mainly at night. They are " +
                "excellent swimmers and may remain submerged up to 15 minutes. More vulnerable" +
                " on land, they tend to remain in the water as much as possible. They use " +
                "their flat, scaly tail both to signal danger by slapping the surface of " +
                "the water and as a location for fat storage.";
        final String northAmericanBeaver6 = "The purpose of the dam is to create deepwater " +
                "refugia enabling the beaver to escape from predators. When deep water is " +
                "already present in lakes, rivers, or larger streams, the beaver may dwell " +
                "in a bank burrow and bank lodge with an underwater entrance.";
        final String northAmericanBeaver7 = "When building a dam in a pond, the beavers " +
                "first make a pile of sticks and then eat out one or more underwater entrances " +
                "and two platforms above the water surface inside the pile. The first is used " +
                "for drying off. Towards winter, the lodge is often plastered with mud which," +
                " when it freezes, has the consistency of concrete. A small air hole is left " +
                "in the top of the lodge.";
        final String northAmericanBeaver8 = "Early ecologists believed that this " +
                "dam-building was an amazing feat of architectural planning, indicative of the" +
                " beaver's high intellect. This theory was tested when a recording of running " +
                "water was played in a field near a beaver pond. Even though it was on dry land," +
                " the beaver covered the tape player with branches and mud.";
        final String northAmericanBeaver9 = "Beavers usually mate for life. The young beaver " +
                "\"kits\" typically remain with their parents up to two years.";
        final String northAmericanBeaver10 = "North American beaver have one litter per year, " +
                "coming into estrus for only 12 to 24 hours, between late December and May but" +
                " peaking in January. Unlike most other rodents, beaver pairs are monogamous," +
                " staying together for multiple breeding seasons.";
        final String northAmericanBeaver11 = "The large front teeth of the beaver never stop " +
                "growing. The beavers constant gnawing on wood helps to keep their teeth " +
                "from growing too long. They even self-sharpen.";
        final String northAmericanBeaver12 = "They prefer aspen and poplar, but also take birch," +
                " maple, willow, alder, black cherry, red oak, beech, ash, hornbeam," +
                " and occasionally pine and spruce.";
        final String northAmericanBeaver13 = "The beaver is a keystone species, increasing " +
                "biodiversity in its territory through creation of ponds and wetlands. As " +
                "wetlands are formed and riparian habitats enlarged, aquatic plants colonize " +
                "newly available watery habitat. Insect, invertebrate, fish, mammal, and bird " +
                "diversities are also expanded.";
        final String northAmericanBeaver14 = "In the past, beavers were said to be industrious " +
                "to halt the Niagara Falls";
        final String northAmericanBeaver15 = "Their dams have possible to flood hundreds of " +
                "human homes. Anywhere with a rich soil was probably a beaver pond at one " +
                "time. Some consider them a pest.";
        final String northAmericanBeaver16 = "When a beaver sees a predator such as a bear " +
                "or wolf, it slaps the pond with its tail to sound an alarm. The deeper the pond, " +
                "the safer they are to hide and swim in.";
        final String northAmericanBeaver17 = "The secret entrances and exits are the only way " +
                "in or out of the dam, usually located at the bottom of the dam underwater.";
        final String northAmericanBeaver18 = "Beaver court by nuzzling, wrestling, and playing, " +
                "and the act are rarely seen. (Got a picture of a pair of beavers courting?)";


        //Coyotes, from 'Coyote, The Ultimate Survivor'

        //Seagull strings
        final  String seagull1 = "Sea gulls like freshwater, but they’ll drink sea water. " +
                "Two glands near their eyes drip the salt in the water so they don’t get sick.";
        final String seagull2 = "Sea gulls make nests simply by hollowing out a soft spot " +
                "in the sand. They try to choose an area near grass, rocks or logs for protection.";
        final String seagull3 = "Sea gulls mate for life. During mating, the male brings " +
                "the female food.";
        final String seagull4 = "After chicks hatch, one parent stays with the nest all the " +
                "time. The other parent brings food.";

        //Raccoon strings, taken from livescience.com
        final String raccoon1 = "Raccoons are round, fuzzy creatures with bushy tails and a " +
                "black mask of fur that covers their eye area. These animals may look like cute, " +
                "cuddly bandits, but they can be quite fearsome when approached.";
        final String raccoon2 = "Raccoons are about as big as small dogs. They grow to about " +
                "23 to 37 inches (60 to 95 centimeters) and weigh 4 to 23 lbs. (1.8 to 10.4 kilograms)" +
                ", according to National Geographic.";
        final String raccoon3 = "Raccoons are not very social creatures. They are nocturnal and" +
                " sleep during the day. During the winter, they tend to sleep more, but they do not " +
                "hibernate in the traditional sense. They simply sleep while their bodies live off " +
                "stored fat. They lose around 50 percent of their body weight during the winter.";
        final String raccoon4 = "As omnivores, raccoons eat vegetation and meat. The vegetation " +
                "in their diet consists of cherries, apples, acorns, persimmons, berries, peaches, " +
                "citrus fruits, plums, wild grapes, figs, watermelons, beech nuts, corn and walnuts.";

        //Squirrel strings, taken from livescience.com
        final  String squirrel1 = "Squirrels are nimble, bushy-tailed rodents found all over " +
                "the world. They belong to the Sciuridae family, which includes prairie dogs" +
                ", chipmunks and marmots.";
        final String squirrel2 = "There are more than 200 species of squirrels, according to the " +
                "Integrated Taxonomic Information System (ITIS), and they are categorized into " +
                "three types: tree squirrels, ground squirrels and flying squirrels.";
        final String squirrel3 = "These three categories are further broken down into many " +
                "squirrel types, such as Albino, Mountain Tree, Antelope, Spotted, Grey, " +
                "American Red, Douglas, Fox, Pygmy, Northern Flying, Southern, Arizona Gray" +
                ", Idaho, Arctic Ground, Albert’s, Franklin, Richardson, Rock, White and Black " +
                "squirrel.";
        final String squirrel4 = "Grey squirrels, commonly found in North America, are " +
                "medium-size squirrels. They grow to 15 to 20 inches (38.1 to 50.8 cm) in " +
                "length, with their tails adding an extra 6 to 9.5 inches (15.24 to 24.13 cm) " +
                "to their length. They typically weigh about 1 to 1.5 pounds (0.45 to 0.68 kg). ";

        ency = new HashMap<>();
        List<String> seagulls = new ArrayList<String>();
        seagulls.add(seagull1);
        seagulls.add(seagull2);
        seagulls.add(seagull3);
        seagulls.add(seagull4);

        ency.put("Seagull", seagulls);

        List<String> raccoons = new ArrayList<String>();
        raccoons.add(raccoon1);
        raccoons.add(raccoon2);
        raccoons.add(raccoon3);
        raccoons.add(raccoon4);

        ency.put("Raccoon", raccoons);

        //Squirrels
        List<String> squirrels = new ArrayList<String>();
        squirrels.add(squirrel1);
        squirrels.add(squirrel2);
        squirrels.add(squirrel3);
        squirrels.add(squirrel4);

        ency.put("Squirrel", squirrels);

        //Beavers
        List<String> beavers = new ArrayList<String>();
        beavers.add(northAmericanBeaver1);
        beavers.add(northAmericanBeaver2);
        beavers.add(northAmericanBeaver3);
        beavers.add(northAmericanBeaver4);
        beavers.add(northAmericanBeaver5);
        beavers.add(northAmericanBeaver6);
        beavers.add(northAmericanBeaver7);
        beavers.add(northAmericanBeaver8);
        beavers.add(northAmericanBeaver9);
        beavers.add(northAmericanBeaver10);
        beavers.add(northAmericanBeaver11);
        beavers.add(northAmericanBeaver12);
        beavers.add(northAmericanBeaver13);
        beavers.add(northAmericanBeaver14);
        beavers.add(northAmericanBeaver15);
        beavers.add(northAmericanBeaver16);
        beavers.add(northAmericanBeaver17);
        beavers.add(northAmericanBeaver18);

        ency.put("Beaver", beavers);

    }

    public boolean hasAnimal(String animal)
    {
        return ency.containsKey(animal);
    }

    public String getAnimalEntry(String animal, int index)
    {
        return ency.get(animal).get(index);
    }

    public int getAnimalSize(String animal)
    {
        if (ency.containsKey(animal))
        {
            return ency.get(animal).size();
        } else
        {
            return -1;
        }
    }

}
