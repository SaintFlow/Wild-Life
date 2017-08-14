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


        //Coyotes, from 'Coyote, The Ultimate Survivor'; Wikipedia; livescience.com;
        //National Geographic;
        final  String coyote1 = "The average male coyote weighs 8 to 20 kg (18 to 44 lb) and the " +
                "average female 7 to 18 kg (15 to 40 lb). Their fur color is predominantly light" +
                " gray and red or fulvous interspersed with black and white, though it varies " +
                "somewhat with geography.";
        final  String coyote2 = "Coyote's are not a fussy feeder. When one source of its food is" +
                "gone, such as geese, it will simply look for another. Other food sources are deer," +
                "rabbits, hares, rodents, reptiles, amphibians, fish and invertebrates";
        final  String coyote3 = "Humans aside, cougars and gray wolves are the coyote's only " +
                "serious enemies. Nevertheless, coyotes do sometimes mate with gray, eastern, " +
                "or red wolves, producing hybrids colloquially called \"coywolves\"";
        final  String coyote4 = "Coyotes are solitary creatures and mark their territory with " +
                "urine. During the winter, coyotes tend to become more social, though. During " +
                "the cold months, they join forces, creating hunting packs to find food more " +
                "easily.";
        final  String coyote5 = "he basic social unit of a coyote pack is a family containing " +
                "a reproductive female. However, unrelated coyotes may join forces for " +
                "companionship, or to bring down prey too large to attack singly. Such " +
                "\"nonfamily\" packs are only temporary, and may consist of bachelor males, " +
                "nonreproductive females and subadult young. Families are formed in midwinter," +
                " when females enter estrus.";
        final  String coyote6 = "Both the male and female participate in taking care of the pups. " +
                "The male will bring food to the female and the pups and help protect them " +
                "from predators.";
        final  String coyote7 = "They can live alone, or in pairs. And when they are up against a" +
                "large prey, they can hunt in packs just like a pack of wolves";
        final  String coyote8 = "By fall, the pups are old enough to hunt for themselves. " +
                "Coyotes are usually ready to mate at 20 to 22 months old. In the wild, coyotes " +
                "live around 14 years.";
        final  String coyote9 = "It's also an particularly intelligent carnivore. American Indians" +
                "believed it was endowed with supernatural senses. It is virtually " +
                "indestructible, frequently coming back to life";
        final  String coyote10 = "Coyotes are formidable in the field where they enjoy keen " +
                "vision and a strong sense of smell. They can run up to 40 miles an hour. " +
                "In the fall and winter, they form packs for more effective hunting.";
        final  String coyote11 = "Unlike otters, coyotes can't catch fish. But through clever" +
                "tactics, coyotes can steal the fish caught by otters by antagonizing them" +
                "until they drop their catch.";
        final  String coyote12 = "Coyotes pose danger to livestock such as sheep. Coyotes have" +
                "been hunted by men, and the death tolls can reach 500 000 per yer. Remarkably," +
                "the coyote have still successfully survived, unlike wolf populations";
        final  String coyote13 = "Pups instinctively become limp when picked up. They are carried" +
                "to the den when danger arrives, or when the pack needs to go home.";
        final String coyote14 = "Coyotes and badgers have been known to work as a team and" +
                "hunt cooperatively when hunting small rodents. The badger is a much better and" +
                "faster digger, while the coyote has much butter hearing for finding rodents " +
                "underground";

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
                "to their length. They typically weigh about 1 to 1.5 pounds (0.45 to 0.68 kg).";

        //Eeastern Chipmunk from Wikipedia; 'Eastern Chipmunk - Films Nature Web TV';
        //nhptv.org/natureworks; interesting-animal-facts.com;
        final String easternChipmunk1 = "The name \"chipmunk\" comes from the Ottawa word " +
                "ajidamoonh or the Ojibwe word ajidamoo, which translates literally as \"one " +
                "who descends trees headlong.";
        final String easternChipmunk2 = "Eastern Chipmunks can be found in deciduous forests," +
                " bushes, and gardens in eastern Canada and America.";
        final String easternChipmunk3 = "A hyperactive animal, the chipmunk spends most of its" +
                "days collecting seeds. It prefers bulbs, seeds, fruits, nuts, green plants," +
                " mushrooms, insects, worms, and bird eggs. Like other chipmunks, it " +
                "transports food in pouches in its cheeks.";
        final String easternChipmunk4 = "When it is excited or scaled, the chipmunk waves its " +
                "tail and gives out a series of loud chirps.";
        final String easternChipmunk5 = "The eastern chipmunk defends its burrow and lives a " +
                "solitary life, except during mating season. Females usually produce one or two " +
                "litters of three to five young. The two breeding seasons are from February " +
                "to April and from June to August. During the winter, the chipmunk may enter " +
                "long periods of torpor, but does not truly hibernate.";
        final String easternChipmunk6 = "Predators of the eastern chipmunk include hawks, foxes, " +
                "raccoons, weasels, snakes, bobcats, lynx, and domestic cats. On average, " +
                "eastern chipmunks live three or more years in the wild, but in captivity " +
                "they may live as long as eight years.";
        final String easternChipmunk7 = "It can climb trees well, but constructs underground" +
                " nests with extensive tunnel systems, often with several entrances. To hide " +
                "the construction of its burrow, the eastern chipmunk carries soil to a " +
                "different location in its cheek pouches.";
        final String easternChipmunk8 = "The eastern chipmunk doesn't truly hibernate, but it " +
                "does spend a lot of time sleeping. It may wake up every few weeks to eat the " +
                "food it has stored.";
        final String easternChipmunk9 = "The female usually has one litter a year with between " +
                "three and five young. The young will come above ground when they are about six " +
                "weeks old.";
        final String easternChipmunk10 = "Eastern Chipmunks can be territorial and do not like " +
                "other chipmunks entering their territory. The range of their territory is about " +
                "half an acre which often overlaps the territories of other chipmunks; they" +
                " are mostly defensive about areas closest to their burrow.";
        final String easternChipmunk11 = "This rodent has four toes on each of its front feet. " +
                "The back feet have five toes each.";

        ency = new HashMap<>();

        //Seagulls
        List<String> seagulls = new ArrayList<>();
        seagulls.add(seagull1);
        seagulls.add(seagull2);
        seagulls.add(seagull3);
        seagulls.add(seagull4);

        ency.put("Seagull", seagulls);

        List<String> raccoons = new ArrayList<>();
        raccoons.add(raccoon1);
        raccoons.add(raccoon2);
        raccoons.add(raccoon3);
        raccoons.add(raccoon4);

        ency.put("Raccoon", raccoons);

        //Squirrels
        List<String> squirrels = new ArrayList<>();
        squirrels.add(squirrel1);
        squirrels.add(squirrel2);
        squirrels.add(squirrel3);
        squirrels.add(squirrel4);

        ency.put("Squirrel", squirrels);

        //Beavers
        List<String> beavers = new ArrayList<>();
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

        //Coyotes
        List<String> coyotes = new ArrayList<>();
        coyotes.add(coyote1); coyotes.add(coyote2); coyotes.add(coyote3); coyotes.add(coyote4);
        coyotes.add(coyote5); coyotes.add(coyote6); coyotes.add(coyote7); coyotes.add(coyote8);
        coyotes.add(coyote9); coyotes.add(coyote10); coyotes.add(coyote11); coyotes.add(coyote12);
        coyotes.add(coyote13); coyotes.add(coyote14);

        ency.put("Coyote", coyotes);

        //Eastern Chipmunks
        List<String> easternChipmunks = new ArrayList<>();
        easternChipmunks.add(easternChipmunk1); easternChipmunks.add(easternChipmunk2);
        easternChipmunks.add(easternChipmunk3); easternChipmunks.add(easternChipmunk4);
        easternChipmunks.add(easternChipmunk5); easternChipmunks.add(easternChipmunk6);
        easternChipmunks.add(easternChipmunk7); easternChipmunks.add(easternChipmunk8);
        easternChipmunks.add(easternChipmunk9); easternChipmunks.add(easternChipmunk10);
        easternChipmunks.add(easternChipmunk11);

        ency.put("Eastern Chipmunk", easternChipmunks);

        //Groundhogs

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
