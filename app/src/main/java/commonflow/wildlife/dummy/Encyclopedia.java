package commonflow.wildlife.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Encyclopedia class contianing all the descriptions of each species, used by the
 * AnimalDetailFragment class
 * Created by Randy on 5/16/2017.
 */
public class Encyclopedia
{

    private HashMap<String, List<String>> ency;

    public Encyclopedia()
    {
        ency = new HashMap<>();

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
        final String coyote1 = "The average male coyote weighs 8 to 20 kg (18 to 44 lb) and the " +
                "average female 7 to 18 kg (15 to 40 lb). Their fur color is predominantly light" +
                " gray and red or fulvous interspersed with black and white, though it varies " +
                "somewhat with geography.";
        final String coyote2 = "Coyote's are not a fussy feeder. When one source of its food is" +
                "gone, such as geese, it will simply look for another. Other food sources are deer," +
                "rabbits, hares, rodents, reptiles, amphibians, fish and invertebrates";
        final String coyote3 = "Humans aside, cougars and gray wolves are the coyote's only " +
                "serious enemies. Nevertheless, coyotes do sometimes mate with gray, eastern, " +
                "or red wolves, producing hybrids colloquially called \"coywolves\"";
        final String coyote4 = "Coyotes are solitary creatures and mark their territory with " +
                "urine. During the winter, coyotes tend to become more social, though. During " +
                "the cold months, they join forces, creating hunting packs to find food more " +
                "easily.";
        final String coyote5 = "he basic social unit of a coyote pack is a family containing " +
                "a reproductive female. However, unrelated coyotes may join forces for " +
                "companionship, or to bring down prey too large to attack singly. Such " +
                "\"nonfamily\" packs are only temporary, and may consist of bachelor males, " +
                "nonreproductive females and subadult young. Families are formed in midwinter," +
                " when females enter estrus.";
        final String coyote6 = "Both the male and female participate in taking care of the pups. " +
                "The male will bring food to the female and the pups and help protect them " +
                "from predators.";
        final String coyote7 = "They can live alone, or in pairs. And when they are up against a " +
                "large prey, they can hunt in packs just like a pack of wolves";
        final String coyote8 = "By fall, the pups are old enough to hunt for themselves. " +
                "Coyotes are usually ready to mate at 20 to 22 months old. In the wild, coyotes " +
                "live around 14 years.";
        final String coyote9 = "It's also an particularly intelligent carnivore. American Indians" +
                "believed it was endowed with supernatural senses. It is virtually " +
                "indestructible, frequently coming back to life";
        final String coyote10 = "Coyotes are formidable in the field where they enjoy keen " +
                "vision and a strong sense of smell. They can run up to 40 miles an hour. " +
                "In the fall and winter, they form packs for more effective hunting.";
        final String coyote11 = "Unlike otters, coyotes can't catch fish. But through clever" +
                "tactics, coyotes can steal the fish caught by otters by antagonizing them" +
                "until they drop their catch.";
        final String coyote12 = "Coyotes pose danger to livestock such as sheep. Coyotes have " +
                "been hunted by men, and the death tolls can reach 500 000 per yer. Remarkably," +
                "the coyote have still successfully survived, unlike wolf populations";
        final String coyote13 = "Pups instinctively become limp when picked up. They are carried " +
                "to the den when danger arrives, or when the pack needs to go home.";
        final String coyote14 = "Coyotes and badgers have been known to work as a team and " +
                "hunt cooperatively when hunting small rodents. The badger is a much better and " +
                "faster digger, while the coyote has much butter hearing for finding rodents " +
                "underground";

        // Seagull strings, from Wikipedia;
        // http://www.softschools.com/facts/animals/seagull_facts/695/
        final String seagull1 = "Sea gulls like freshwater, but they’ll drink sea water. " +
                "Two glands near their eyes drip the salt in the water so they don’t get sick.";
        final String seagull2 = "Sea gulls make nests simply by hollowing out a soft spot " +
                "in the sand. They try to choose an area near grass, rocks or logs for protection.";
        final String seagull3 = "Sea gulls mate for life, although divorse may occasionally " +
                "occur. During mating, the male brings " +
                "the female food.";
        final String seagull4 = "After chicks hatch, one parent stays with the nest all the " +
                "time. The other parent brings food.";
        final String seagull5 = "Gulls are typically medium to large birds, usually grey or" +
                " white, often with black markings on the head or wings. They typically have" +
                " harsh wailing or squawking calls, stout, longish bills, and webbed feet.";
        final String seagull6 = "Gulls are resourceful, inquisitive and intelligent birds, " +
                "demonstrating complex methods of communication and a highly developed social" +
                " structure. For example, many gull colonies display mobbing behaviour, " +
                "attacking and harassing would-be predators and other intruders.";
        final String seagull7 = "The gulls are generalist feeders. Indeed, they are the least" +
                " specialised of all the seabirds, and their morphology allows for equal" +
                " adeptness in swimming, flying, and walking. They are more adept walking" +
                " on land than most other seabirds, and the smaller gulls tend to be more" +
                " manoeuvrable while walking.";
        final String seagull8 = "Within colonies, gull pairs are territorial, defending an area" +
                " of varying size around the nesting site from others of their species. This" +
                " area can be as large as a 5-m radius around the nest in the herring gull" +
                " to just a tiny area of cliff ledge in the kittiwakes.";
        final String seagull9 = "Lifespan of sea gulls depends on the species. Most sea gulls" +
                " can survive from 10 to 15 years in the wild.";
        final String seagull10 = "They use bread crumbs to attract fish and produce rain-like" +
                " sound with their feet to attract earthworms hidden under the ground. " +
                "Sea gulls transfer all hunting skills and techniques to their offspring.";

        // Raccoon strings, taken from livescience.com; https://onekindplanet.org/animal/raccoon/
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
        final String raccoon5 = "They don’t have opposable thumbs, but that doesn’t stop them" +
                " using their paws and powerful claws to open things, which is where their" +
                " mischievous reputation comes from. They have been known to twist open a" +
                " variety of handles and doorknobs and often break into rubbish bins.";
        final String raccoon6 = "Racoons are native to North and Central America, although" +
                " they have been introduced elsewhere and are now present in parts of Europe" +
                " and Asia. Their preferred habitat includes marshes, swamps and mangrove or" +
                " flooded forests, but they are extremely adaptable.";
        final String raccoon7 = "Sight is not particularly important to raccoons. They have" +
                " poor long-distance vision and are thought to be either colour-blind or at" +
                " least poor at distinguishing colour. Other senses make up for their poor" +
                " sight though, with touch being the most sensitive.";
        final String raccoon8 = "Their paws become more sensitive to touch when wet, so when" +
                " seen rubbing their paws together or ‘washing’ food, they are actually " +
                "taking in information.";
        final String raccoon9 = "Research has shown that not only are they able to solve " +
                "problems but that they can also remember the solution and use it again" +
                " years later.  This causes problems in urban areas as they use their " +
                "problem-solving abilities to break through locks and latches into rubbish" +
                " bins and even houses in search of food and dens.";
        final String raccoon10 = "Mating season takes place from January to mid March. " +
                "Two months later, female will give birth to 3-4 babies. Their tails don't " +
                "have bands, and mask around eyes is still missing.";

        // Gray Squirrel strings, taken from livescience.com
        final String squirrel1 = "Squirrels are nimble, bushy-tailed rodents found all over " +
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
        final String squirrel5 = "Squirrels sometimes use deceptive behavior to prevent other " +
                "animals from retrieving cached food. They will pretend to bury the object if " +
                "they feel that they are being watched. They do this by preparing the spot as" +
                " usual, for instance, digging a hole or widening a crack, miming the placement" +
                " of the food, while actually concealing it in their mouths, and then covering" +
                " up the \"cache\" as if they had deposited the object.";
        final String squirrel6 = "They also hide behind vegetation while burying food or hide " +
                "it high up in trees (if their rival is not arboreal). Such a complex " +
                "repertoire suggests that the behaviors are not innate, and imply theory" +
                " of mind thinking.";
        final String squirrel7 = "The eastern gray squirrel is one of very few mammalian " +
                "species that can descend a tree head-first. It does this by turning its" +
                " feet so the claws of its hind paws are backward-pointing and can grip" +
                " the tree bark.";
        final String squirrel8 = "Eastern gray squirrels build a type of nest, known as" +
                " a drey, in the forks of trees, consisting mainly of dry leaves and " +
                "twigs. The dreys are roughly spherical, about 30~60 cm in diameter" +
                " and are usually insulated with moss, thistledown, dried grass," +
                " and feathers to reduce heat loss.";
        final String squirrel9 = "Normally, one to four young are born in each litter, but" +
                " the largest possible litter size is eight.";
        final String squirrel10 = "Eastern gray squirrels eat a range of foods, such as" +
                " tree bark, tree buds, berries, many types of seeds and acorns, " +
                "walnuts, and other nuts.";

        List<String> squirrels = new ArrayList<>();
        squirrels.add(squirrel1);
        squirrels.add(squirrel2);
        squirrels.add(squirrel3);
        squirrels.add(squirrel4);
        squirrels.add(squirrel5);
        squirrels.add(squirrel6);
        squirrels.add(squirrel7);
        squirrels.add(squirrel8);
        squirrels.add(squirrel9);
        squirrels.add(squirrel10);

        ency.put("Eastern Gray Squirrel", squirrels);

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





        //Seagulls
        List<String> seagulls = new ArrayList<>();
        seagulls.add(seagull1);
        seagulls.add(seagull2);
        seagulls.add(seagull3);
        seagulls.add(seagull4);
        seagulls.add(seagull5);
        seagulls.add(seagull6);
        seagulls.add(seagull7);
        seagulls.add(seagull8);
        seagulls.add(seagull9);
        seagulls.add(seagull10);

        ency.put("Seagull", seagulls);

        List<String> raccoons = new ArrayList<>();
        raccoons.add(raccoon1);
        raccoons.add(raccoon2);
        raccoons.add(raccoon3);
        raccoons.add(raccoon4);
        raccoons.add(raccoon5);
        raccoons.add(raccoon6);
        raccoons.add(raccoon7);
        raccoons.add(raccoon8);
        raccoons.add(raccoon9);
        raccoons.add(raccoon10);

        ency.put("Raccoon", raccoons);

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

        ency.put("North American Beaver", beavers);

        //Coyotes
        List<String> coyotes = new ArrayList<>();
        coyotes.add(coyote1);
        coyotes.add(coyote2);
        coyotes.add(coyote3);
        coyotes.add(coyote4);
        coyotes.add(coyote5);
        coyotes.add(coyote6);
        coyotes.add(coyote7);
        coyotes.add(coyote8);
        coyotes.add(coyote9);
        coyotes.add(coyote10);
        coyotes.add(coyote11);
        coyotes.add(coyote12);
        coyotes.add(coyote13);
        coyotes.add(coyote14);

        ency.put("Coyote", coyotes);

        //Eastern Chipmunks
        List<String> easternChipmunks = new ArrayList<>();
        easternChipmunks.add(easternChipmunk1);
        easternChipmunks.add(easternChipmunk2);
        easternChipmunks.add(easternChipmunk3);
        easternChipmunks.add(easternChipmunk4);
        easternChipmunks.add(easternChipmunk5);
        easternChipmunks.add(easternChipmunk6);
        easternChipmunks.add(easternChipmunk7);
        easternChipmunks.add(easternChipmunk8);
        easternChipmunks.add(easternChipmunk9);
        easternChipmunks.add(easternChipmunk10);
        easternChipmunks.add(easternChipmunk11);

        ency.put("Eastern Chipmunk", easternChipmunks);

        //Groundhogs, from wikipedia
        final String groundhog1 = "The groundhog, also known as a woodchuck or whistlepig, " +
                "is a rodent of the family Sciuridae, belonging to the group of large " +
                "ground squirrels known as marmots. Other names include chuck, wood-shock, " +
                "groundpig, whistler, thickwood badger, Canada marmot, monax, moonack, weenusk, " +
                "and red monk.";
        final String groundhog2 = "Groundhogs measure at 40 to 65 cm long, including a " +
                "15cm tail, and weighing 2 to 4 kg. They can grow up to 80cm and 14kg in " +
                "areas of few predators.";
        final String groundhog3 = "Suited to their temperate habitat, groundhogs are covered " +
                "with two coats of fur: a dense grey undercoat and a longer coat of banded " +
                "guard hairs that gives the groundhog its distinctive “frosted” appearance.";
        final String groundhog4 = "The groundhog prefers open country and the edges of " +
                "woodland, and is rarely far from a burrow entrance. Since the clearing of " +
                "forests provided it with a much more suitable habitat, the groundhog " +
                "population is probably higher now than it was before the arrival of " +
                "European settlers in North America.";
        final String groundhog5 = "In the wild, groundhogs can live up to six years with two " +
                "or three being average. In captivity, groundhogs reportedly live from 9 to " +
                "14 years. Common predators for groundhogs include wolves, cougars, coyotes, " +
                "foxes, bobcats, bears, eagles, and dogs.";
        final String groundhog6 = "Despite their heavy-bodied appearance, groundhogs are " +
                "accomplished swimmers and occasionally climb trees when escaping predators " +
                "or when they want to survey their surroundings.";
        final String groundhog7 = "They prefer to retreat to their burrows when threatened;" +
                " if the burrow is invaded, the groundhog tenaciously defends itself with its" +
                " two large incisors and front claws. Groundhogs are generally agonistic and" +
                " territorial among their own species, and may skirmish to establish dominance.";
        final String groundhog8 = "It is common to see one or more nearly-motionless " +
                "individuals standing erect on their hind feet watching for danger. When " +
                "alarmed, they use a high-pitched whistle to warn the rest of the colony," +
                " hence the name \"whistle-pig\".";
        final String groundhog9 = "David P. Barash wrote he witnessed only two occasions of" +
                " upright play-fighting among woodchucks and that the upright posture of" +
                " play-fighting involves sustained physical contact between individuals and" +
                " may require a degree of social tolerance virtually unknown in M. monax." +
                " He said it was possible to conclude, alternatively, that upright play-fighting" +
                " is part of the woodchuck's behavioral repertory but rarely shown because" +
                " of physical spacing and/or low social tolerance.";
        final String groundhog10 = "Mostly herbivorous, groundhogs eat primarily wild grasses" +
                " and other vegetation, including berries and agricultural crops, when available.";
        final String groundhog11 = "Though groundhogs are the most solitary of the marmots," +
                " several individuals may occupy the same burrow. Groundhog burrows usually" +
                " have two to five entrances, providing groundhogs their primary means of" +
                " escape from predators.";
        final String groundhog12 = "The burrow is used for safety, retreat in bad weather," +
                " hibernating, sleeping, love nest, and nursery. In addition to the nest," +
                " there is an excrement chamber. The nest chamber may be about twenty inches" +
                " to three feet below ground surface.";
        final String groundhog13 = "Groundhogs are one of the few species that enter into " +
                "true hibernation, and often build a separate \"winter burrow\" for this purpose.";
        final String groundhog14 = "As birth of the young approaches in April or May, the male " +
                "leaves the den. One litter is produced annually, usually containing two to " +
                "six blind, hairless and helpless young. Groundhog mothers introduce their " +
                "young to the wild once their fur is grown in and they can see. Now, if at " +
                "all, the father groundhog comes back to the family.";
        final String groundhog15 = "How much wood would a woodchuck chuck if a woodchuck" +
                " could chuck wood? A woodchuck would chuck all the wood he could if a " +
                "woodchuck could cuck wood. The woodchuck refers to the groundhog.";

        List<String> groundhogs = new ArrayList<>();
        groundhogs.add(groundhog1);
        groundhogs.add(groundhog2);
        groundhogs.add(groundhog3);
        groundhogs.add(groundhog4);
        groundhogs.add(groundhog5);
        groundhogs.add(groundhog6);
        groundhogs.add(groundhog7);
        groundhogs.add(groundhog8);
        groundhogs.add(groundhog9);
        groundhogs.add(groundhog10);
        groundhogs.add(groundhog11);
        groundhogs.add(groundhog12);
        groundhogs.add(groundhog13);
        groundhogs.add(groundhog14);
        groundhogs.add(groundhog15);
        ency.put("Groundhog", groundhogs);

        //American Minks, from Wikipedia; livescience.com
        final String americanMink1 = "The American mink is a small, semi-aquatic carnivore " +
                "that feeds on rodents, fish, crustaceans, frogs, and birds. It is the animal " +
                "most frequently farmed for its fur, exceeding the silver fox, sable, marten," +
                " and skunk in economic importance.";
        final String americanMink2 = "Although superficially similar to the European mink, " +
                "studies indicate the American mink's closest relative is the Siberian weasel" +
                " (kolonok) of Asia.";
        final String americanMink3 = "The American mink has a long body, which allows the " +
                "species to enter the burrows of prey. Its streamlined shape helps it " +
                "to reduce water resistance whilst swimming.";
        final String americanMink4 = "The American mink's winter fur is denser, longer, softer," +
                " and more close-fitting than that of the European mink. The winter fur's tone" +
                " is generally very dark blackish-tawny to light-tawny. Colour is evenly" +
                " distributed over all the body, with the lower side being only slightly" +
                " lighter than the upper body.";
        final String americanMink5 = "On land, the American mink moves by a bounding gait, " +
                "with speeds of up to 6.5 km/h (4.0 mph). It also climbs trees and swims " +
                "well. During swimming, the mink propels itself primarily through " +
                "undulating movements of the trunk. When diving, it undergoes a state of " +
                "rapid bradycardia, which is likely an adaptation to conserve oxygen.";
        final String americanMink6 = "The American mink relies heavily on sight when foraging." +
                " Its eyesight is clearer on land than underwater. Its auditory perception " +
                "is high enough to detect the ultrasonic vocalisations (1–16 kHz) of rodent" +
                " prey. Its sense of smell is comparatively weak.";
        final String americanMink7 = "Comparable to skunks, when stressed, the American mink" +
                " can expel the contents of its anal glands at a distance of 12 in (30 cm)." +
                " They are more unbearable than the scent expelled from skunks.";
        final String americanMink8 = "Mink dens typically consist of long burrows in river" +
                " banks, holes under logs, tree stumps, or roots and hollow trees, though " +
                "dens located in rock crevices, drains, and nooks under stone piles and " +
                "bridges are occasionally selected.";
        final String americanMink9 = "The American mink normally only vocalises during close" +
                " encounters with other minks or predators. The sounds it emits include " +
                "piercing shrieks and hisses when threatened and muffled chuckling sounds " +
                "when mating. Kits squeak repeatedly when separated from their mothers.";
        final String americanMink10 = "The American mink is a promiscuous animal that does not" +
                " form pair bonds. The start of mating season ranges from February in its " +
                "southern range to April in the north.";
        final String americanMink11 = "The American mink is a carnivorous animal that feeds on" +
                " rodents, fish, crustaceans, amphibians, and birds. It kills vertebrate prey" +
                " by biting the back of the head or neck. The American mink often kills birds," +
                " including larger species like seagulls and cormorants, by drowning.";
        final String americanMink12 = "The American mink replaces and sometimes kills the" +
                " European mink wherever their ranges overlap. The decline of European mink" +
                " populations seems to coincide with the spread of the American mink.";
        final String americanMink13 = "The mink's fur is very valuable around the world." +
                " Because of this, there are farms that raise minks to harvest their fur.";
        final String americanMink14 = "American minks have been implicated in the decline of" +
                " the water vole in the United Kingdom and linked to the decline of waterfowl" +
                " across their range in Europe. They are now considered vermin in much of " +
                "Europe and are hunted for the purpose of wildlife management.";

        List<String> americanMinks = new ArrayList<>();
        americanMinks.add(americanMink1);
        americanMinks.add(americanMink2);
        americanMinks.add(americanMink3);
        americanMinks.add(americanMink4);
        americanMinks.add(americanMink5);
        americanMinks.add(americanMink6);
        americanMinks.add(americanMink7);
        americanMinks.add(americanMink8);
        americanMinks.add(americanMink9);
        americanMinks.add(americanMink10);
        americanMinks.add(americanMink11);
        americanMinks.add(americanMink12);
        americanMinks.add(americanMink13);
        americanMinks.add(americanMink14);
        ency.put("American Mink", americanMinks);

        // Opossum from Wikipedia for Virginia Opossums;
        // http://www.discover-southern-ontario.com/possum.html
        // https://seaworld.org/Animal-Info/Animal-Bytes/Mammals/Virginia-Opossum
        final String opossum1 = "Opossums originated in South America, and entered North" +
                " America in the Great American Interchange following the connection " +
                "of the two continents.";
        final String opossum2 = "Their unspecialized biology, flexible diet, and " +
                "reproductive habits make them successful colonizers and survivors in diverse " +
                "locations and conditions.";
        final String opossum3 = "Opossums were first named from Stratchey by their \"beast " +
                "in bigness of a pig and in taste alike\", while another discover John Smith" +
                " described them as \"hath an head like a swine … tail like a rat … of " +
                "the bigness of a cat. The name ultimately means \"white dog or dog-like beast\".";
        final String opossum4 = "The litter size can be up to 13 babes, and the mothers feed" +
                " their babes in their pouch for 2-3 months. They are then carried around" +
                " on the mother’s back for another 1-2 months.";
        final String opossum5 = "They have a remarkably robust immune system, and show partial" +
                " or total immunity to the venom of rattlesnakes, cottonmouths, and other pit" +
                " vipers. They are eight times less likely to carry rabies than wild dogs.";
        final String opossum6 = "All living types of possums are opportunistic omnivores" +
                " and will eat insects, snails, rodents, berries, fruit, grass and leaves," +
                " eggs and vegetables.";
        final String opossum7 = "The life time of an opossum is unusually short for a mammal" +
                " of its size, usually only two to four years.";
        final String opossum8 = "Opossums are usually solitary and nomadic, staying in one " +
                "area as long as food and water are easily available. Some families will group" +
                " together in ready-made burrows or even under houses. Though they will " +
                "temporarily occupy abandoned burrows, they do not dig or put much effort " +
                "into building their own. As nocturnal animals, they favor dark, secure areas." +
                " These areas may be below ground or above.";
        final String opossum9 = "When threatened or harmed, they will \"play possum\", " +
                "mimicking the appearance and smell of a sick or dead animal. This " +
                "physiological response is involuntary (like fainting), rather than a " +
                "conscious act. In the case of baby opossums, however, the brain does not " +
                "always react this way at the appropriate moment, and therefore they often " +
                "fail to \"play dead\" when threatened.";
        final String opossum10 = "Threatened opossums (especially males) will growl deeply, " +
                "raising their pitch as the threat becomes more urgent. Males make a " +
                "clicking \"smack\" noise out of the side of their mouths as they wander in " +
                "search of a mate, and females will sometimes repeat the sound in return.";
        final String opossum11 = "The Virginia opossum was once widely hunted and consumed " +
                "in the United States, and opossum farms have been operated in the United" +
                " States in the past. Sweet potatoes were eaten together with the possum.";
        final String opossum12 = "From prehistoric time to modern day, the opossum is " +
                "virtually unchanged. Some scientists refer to it as a living fossil.";
        final String opossum13 = "Opossums have fifty razor sharp teeth; the highest number " +
                "of teeth found in any land mammal.";

        List<String> opossums = new ArrayList<>();
        opossums.add(opossum1);
        opossums.add(opossum2);
        opossums.add(opossum3);
        opossums.add(opossum4);
        opossums.add(opossum5);
        opossums.add(opossum6);
        opossums.add(opossum7);
        opossums.add(opossum8);
        opossums.add(opossum9);
        opossums.add(opossum10);
        opossums.add(opossum11);
        opossums.add(opossum12);
        opossums.add(opossum13);
        ency.put("Virginia Opossum", opossums);

        //Red fox, from Wikipedix; National Geographic
        final String redFox1 = "Red foxes are usually together in pairs or small groups " +
                "consisting of families, such as a mated pair and their young, or a male " +
                "with several females having kinship ties. The young of the mated pair " +
                "remain with their parents to assist in caring for new kits.";
        final String redFox2 = "Red foxes have binocular vision, but their sight reacts " +
                "mainly to movement. Their auditory perception is acute, being able to hear" +
                " black grouse changing roosts at 600 paces, the flight of crows at 0.25–0.5" +
                " kilometres and the squeaking of mice at about 100 metres.";
        final String redFox3 = "Their sense of smell is good, but weaker than that of " +
                "specialised dogs.";
        final String redFox4 = "Red foxes either establish stable home ranges within areas or " +
                "are itinerant with no fixed abode. They use their urine to mark their" +
                " territories. Urine is also used to mark empty cache sites, used to store" +
                " found food, as reminders not to waste time investigating them.";
        final String redFox5 = "Outside the breeding season, most red foxes favour living " +
                "in the open, in densely vegetated areas, though they may enter burrows to " +
                "escape bad weather. Their burrows are often dug on hill or mountain slopes," +
                " ravines, bluffs, steep banks of water bodies, ditches, depressions, gutters," +
                " in rock clefts and neglected human environments.";
        final String redFox6 = "Inquisitive foxes will rotate and flick their ears whilst " +
                "sniffing. Playful individuals will perk their ears and rise on their hind" +
                " legs. Male foxes courting females, or after successfully evicting intruders," +
                " will turn their ears outwardly, and raise their tails in a horizontal" +
                " position, with the tips raised upward. When afraid, red foxes grin in" +
                " submission, arching their backs, curving their bodies, crouching their" +
                " legs and lashing their tails back and forth with their ears pointing" +
                " backwards and pressed against their skulls.";
        final String redFox7 = "When merely expressing submission to a dominant animal, " +
                "the posture is similar, but without arching the back or curving the body." +
                " Submissive foxes will approach dominant animals in a low posture, so " +
                "that their muzzles reach up in greeting. When two evenly matched foxes " +
                "confront each other over food, they approach each other sideways and push" +
                " against each other's flanks, betraying a mixture of fear and aggression " +
                "through lashing tails and arched backs without crouching and pulling their" +
                " ears back without flattening them against their skulls. When launching an" +
                " assertive attack, red foxes approach directly rather than sideways, with " +
                "their tails aloft and their ears rotated sideways.";
        final String redFox8 = "The most commonly heard contact call is a three to five" +
                " syllable barking \"wow wow wow\" sound, which is often made by two" +
                " foxes approaching one another.";
        final String redFox9 = "When hunting mouse-like prey, they first pinpoint their" +
                " prey's location by sound, then leap, sailing high above their quarry," +
                " steering in mid-air with their tails, before landing on target up to" +
                " 5 metres (16 ft) away.";
        final String redFox10 = "In areas in North America where red fox and coyote " +
                "populations are sympatric, fox ranges tend to be located outside coyote" +
                " territories. The principal cause of this separation is believed to be " +
                "active avoidance of coyotes by the foxes. Interactions between the two " +
                "species vary in nature, ranging from active antagonism to indifference.";
        final String redFox11 = "Like a cat's, the fox's thick tail aids its balance, but" +
                " it has other uses as well. A fox uses its tail (or “brush”) as a warm" +
                " cover in cold weather and as a signal flag to communicate with other foxes.";
        final String redFox12 = "The vixen (female) typically gives birth to a litter " +
                "of 2 to 12 pups. At birth, red foxes are brown or gray. A new red coat" +
                " usually grows in by the end of the first month, but some red foxes are" +
                " golden, reddish-brown, silver, or even black.";
        final String redFox13 = "In their unmodified wild state, red foxes are generally " +
                "unsuitable as pets. Many supposedly abandoned kits are adopted by " +
                "well-meaning people during the spring period, though it is unlikely " +
                "that vixens would abandon their young. Actual orphans are rare, and the" +
                " ones that are adopted are likely kits that simply strayed from their den site.";
        final String redFox14 = "They catch small rodents with a characteristic high pounce.  " +
                "This technique is one of the first things cubs learn as they begin to hunt.";

        List<String> redFoxes = new ArrayList<>();
        redFoxes.add(redFox1);
        redFoxes.add(redFox2);
        redFoxes.add(redFox3);
        redFoxes.add(redFox4);
        redFoxes.add(redFox5);
        redFoxes.add(redFox6);
        redFoxes.add(redFox7);
        redFoxes.add(redFox8);
        redFoxes.add(redFox9);
        redFoxes.add(redFox10);
        redFoxes.add(redFox11);
        redFoxes.add(redFox12);
        redFoxes.add(redFox13);
        redFoxes.add(redFox14);

        ency.put("Red Fox", redFoxes);

        //Skunk, from Wikipedia
        final String skunk1 = "The striped skunk (Mephitis mephitis) is a skunk of the " +
                "genus Mephitis that is native to southern Canada, the United States and " +
                "northern Mexico. It is currently listed as least concern by the IUCN on" +
                " account of its wide range and ability to adapt to human-modified environments.";
        final String skunk2 = "The color patterns of the fur vary greatly, but generally " +
                "consist of a black base with a white stripe extending from the head which" +
                " divides along the shoulders, continuing along the flanks to the rump and" +
                " tail. Some specimens have a white patch on the chest, while others bear" +
                " white stripes on the outer surface of the front limbs. Brown or " +
                "cream-colored mutations occasionally occur.";
        final String skunk3 = "The striped skunk inhabits a wide variety of habitats, " +
                "particularly mixed woodlands, brushy corners and open fields interspersed " +
                "with wooded ravines and rocky outcrops. Some populations, particularly in" +
                " northwestern Illinois, prefer cultivated areas over uncultivated ones.";
        final String skunk4 = "While primarily an insectivore, the striped skunk is adaptable" +
                " enough to incorporate other animals and even vegetable matter into its diet." +
                " The most frequently consumed insects include grasshoppers, beetles," +
                " crickets, and caterpillars.";
        final String skunk5 = "Because of its formidable defensive capability, the striped" +
                " skunk has few natural enemies. Mammalian predators typically avoid skunks," +
                " unless they're starving.";
        final String skunk6 = "The striped skunk is one of North America's most sought " +
                "after furbearers, and was once the second most harvested after the " +
                "muskrat. Its fur is intrinsically valuable, being durable and having" +
                " rich luster, though this trait decreases with wear and exposure to sunlight.";
        final String skunk7 = "The striped skunk is easily tamed, and was often kept in " +
                "barns to kill rats and mice during the 19th century. Selective " +
                "breeding has resulted in the emergence of various color mutations, " +
                "including black, chocolate-brown or smokey gray and white, apricot, " +
                "albino, white, lavender, champagne and mahogany.";
        final String skunk8 = "Skunks are not true hibernators in the winter, but do den up" +
                " for extended periods of time. However, they remain generally inactive and" +
                " feed rarely, going through a dormant stage. Over winter, multiple females" +
                " (as many as 12) huddle together; males often den alone. Often, the same" +
                " winter den is repeatedly used.";
        final String skunk9 = "Although they have excellent senses of smell and hearing, " +
                "they have poor vision, being unable to see objects more than about" +
                " 3 m (10 ft) away, making them vulnerable to death by road traffic. " +
                "They are short-lived; their lifespan in the wild can reach seven years," +
                " with most living only up to a year";
        final String skunk10 = "When born, skunk kits are blind, deaf, and covered in a soft" +
                " layer of fur. About three weeks after birth, their eyes open. The kits" +
                " are weaned about two months after birth, but generally stay with their" +
                " mother until they are ready to mate, at about one year of age.";
        final String skunk11 = "Skunks are notorious for their anal scent glands, which they" +
                " can use as a defensive weapon. They are strong enough to temporary ward" +
                " bears";
        final String skunk12 = "Skunks rarely use their anal scent glands. They carry just" +
                " enough of the chemical for five or six uses – about 15 cc – and require" +
                " some ten days to produce another supply.";

        List<String> skunks = new ArrayList<>();
        skunks.add(skunk1);
        skunks.add(skunk2);
        skunks.add(skunk3);
        skunks.add(skunk4);
        skunks.add(skunk5);
        skunks.add(skunk6);
        skunks.add(skunk7);
        skunks.add(skunk8);
        skunks.add(skunk9);
        skunks.add(skunk10);
        skunks.add(skunk11);
        skunks.add(skunk12);

        ency.put("Striped Skunk", skunks);

        //Canadian Lynx, from Wikipedia; interesting-animal-facts.com
        final String canadianLynx1 = "Canada Lynx, or Canadian Lynx have a dense silvery-brown coat" +
                ", ruffed face and tufted " +
                "ears, and it resembles the other species of the mid-sized Lynx genus." +
                " It is slightly larger than the bobcat, with which it shares parts of its range," +
                " and over twice the size of the domestic cat.";
        final String canadianLynx2 = "This lynx is between 80 and 100 centimetres in " +
                "head-and-body length, stands 48–56 centimetres (19–22 in) tall at the shoulder" +
                " and weighs 5–18 kilograms (11–40 lb). At roughly half the size of the " +
                "Eurasian lynx, physical proportions do not vary significantly across its " +
                "range and are probably naturally selected to allow the animal to survive " +
                "on smaller prey.";
        final String canadianLynx3 = "The lynx can feel where it is biting the prey with its " +
                "canines because they are heavily laced with nerves. The lynx also has four " +
                "carnassial teeth that cut the meat into small pieces. In order for the lynx " +
                "to use its carnassials, it must chew the meat with its head to its side.";
        final String canadianLynx4 = "The claws are sharp and completely retractable (capable " +
                "of being drawn within). The paws, broadened by the wide-spaced metatarsals," +
                " can spread as wide as 10 centimetres (3.9 in) and allow the lynx to move " +
                "fast and with ease on the snow.";
        final String canadianLynx5 = "The Canada lynx tends to be nocturnal (active mainly" +
                " at night), like the snowshoe hare, its major prey. Nevertheless, " +
                "activity may be observed during daytime.";
        final String canadianLynx6 = "The Canada lynx is an efficient climber, and will " +
                "dodge predators by climbing high up on trees; however, they hunt only on land." +
                " Canada lynxes are primarily solitary, with minimal social interaction except" +
                " for the mother-offspring bond and the temporary association between males" +
                " and females during the mating season.";
        final String canadianLynx7 = "Exclusively carnivores, the Canadian lynx depends heavily" +
                " on snowshoe hares for food. These hares comprise 35–97% of their diet;" +
                " their occurrence in the diet varies by abundance of hares and the season. They" +
                " consume one hare every one or two days.";
        final String canadianLynx8 = "Canada lynxes hunt around twilight or at night, the time" +
                " when snowshoe hares tend to be active.[18] Lynxes rely on their vision and" +
                " sense of hearing to locate prey.[15] The lynx will roam or wait on certain " +
                "trails where snowshoe hares gather, pounce on a hare and kill it by a bite " +
                "on its head, throat or the nape of its neck.";
        final String canadianLynx9 = "The female attracts a mate by leaving some of her urine " +
                "where the male has marked his territory, and by repeated calling. Mating can" +
                " occur six times in one hour. The female lynx will only mate with one male " +
                "each season, but the male may mate with multiple females.";
        final String canadianLynx10 = "Before birth, the female prepares a maternal den, usually" +
                " in very thick brush, and typically inside thickets of shrubs or trees or " +
                "woody debris. The dens are generally situated mid-slope and face south or" +
                " southwest";
        final String canadianLynx11 = "Litters contain from one to four kittens, and tend to be " +
                "much larger when prey is abundant. This suggests a greater degree of " +
                "reproductive flexibility than in other cats, and females often do not mate " +
                "at all when prey is scarce. When kittens are born in lean years, however," +
                " infant mortality may be as high as 95%";
        final String canadianLynx12 = "Kittens leave the den after about five weeks, and begin" +
                " hunting at between seven and nine months of age. They leave the mother at " +
                "around ten months, as the next breeding season begins, but do not reach the" +
                " full adult size until around two years old.";
        final String canadianLynx13 = "Canada lynx have been reported to live for up to fourteen" +
                " years in captivity although the lifespan is likely much shorter in the wild.";
        final String canadianLynx14 = "The Canada lynx is found in northern and mixed forests " +
                "across Canada and Alaska. It is, however, absent in the relatively treeless " +
                "regions of the Great Plains and the northern coasts, which are outside the " +
                "natural range of the snowshoe hare. Due to human activity, the Canada lynx " +
                "is no longer found on Prince Edward Island or on the mainland of Nova Scotia";
        final String canadianLynx15 = "The Canada Lynx will often cover their prey with a layer" +
                " of snow to be eaten at a later time.";
        final String canadianLynx16 = "After a kill the Lynx has to be cautious of animals, " +
                "such as wolverines, looking to steel the prey. The wolverines aggressive " +
                "nature will force the Canada Lynx to leave its prey.";

        List<String> canadianLynxes = Arrays.asList(canadianLynx1, canadianLynx2, canadianLynx3,
                canadianLynx4, canadianLynx5, canadianLynx6, canadianLynx7, canadianLynx8, canadianLynx9
                , canadianLynx10, canadianLynx11, canadianLynx12, canadianLynx13, canadianLynx14, canadianLynx15,
                canadianLynx16);
        ency.put("Canada Lynx", canadianLynxes);

        // White Tailed Deer, from Wikipedia
        // http://naturemappingfoundation.org/natmap/facts/white-tailed_deer_k6.html
        final String whiteTailedDeer1 = "The white-tailed deer (Odocoileus virginianus), also " +
                "known as the whitetail, is a medium-sized deer native to the United States, " +
                "Canada, Mexico, Central America, and South America as far south as Peru and" +
                " Bolivia.";
        final String whiteTailedDeer2 = "Some taxonomists have attempted to separate " +
                "white-tailed deer into a host of subspecies, based largely in morphological" +
                " differences.30-40 subspecies have been found.";
        final String whiteTailedDeer3 = "The deer's coat is a reddish-brown in the spring and" +
                " summer and turns to a grey-brown throughout the fall and winter. The deer" +
                " can be recognized by the characteristic white underside to its tail. It " +
                "raises its tail when it is alarmed to warn the predator that it has been" +
                " detected.";
        final String whiteTailedDeer4 = "The white-tailed deer is highly variable in size," +
                " generally following Bergmann's rule that the average size is larger" +
                " farther away from the Equator. North American male deer (also known as" +
                " a buck) usually weigh 45 kilograms (100 lb), but in rare cases, bucks in" +
                " excess of 125 kilograms (275 lb) have been recorded.";
        final String whiteTailedDeer5 = "Deer have dichromatic (two-color) vision with blue" +
                " and yellow primaries; humans normally have trichromatic vision. Thus," +
                " deer poorly distinguish the oranges and reds that stand out so well to " +
                "humans. This makes it very convenient to use deer-hunter orange as a safety" +
                " color on caps and clothing to avoid accidental shootings during hunting seasons.";
        final String whiteTailedDeer6 = "Males regrow their antlers every year. About one in " +
                "10,000 females also have antlers, although this is usually associated" +
                " with freemartinism. Bucks without branching antlers are often termed" +
                " \"spikehorn\", \"spiked bucks\", \"spike bucks\", or simply \"spikes/spikers\"";
        final String whiteTailedDeer7 = "The number of points, the length, or thickness of " +
                "the antlers is a general indication of age, but cannot be relied upon for" +
                " positive aging. A better indication of age is the length of the snout and " +
                "the color of the coat, with older deer tending to have longer snouts and " +
                "grayer coats.";
        final String whiteTailedDeer8 = "Although most often thought of as forest animals " +
                "depending on relatively small openings and edges, white-tailed deer can " +
                "equally adapt themselves to life in more open prairie, savanna woodlands," +
                " and sage communities as in the Southwestern United States and northern Mexico.";
        final String whiteTailedDeer9 = "White-tailed deer eat large amounts of food, " +
                "commonly eating legumes and foraging on other plants, including shoots," +
                " leaves, cacti (in deserts), prairie forbs,[25] and grasses. They also" +
                " eat acorns, fruit, and corn. Their special stomachs allow them to eat" +
                " some things humans cannot, such as mushrooms and poison ivy.";
        final String whiteTailedDeer10 = "Though almost entirely herbivorous, white-tailed " +
                "deer have been known to opportunistically feed on nesting songbirds," +
                " field mice, and birds trapped in mist nets, if the need arises.";
        final String whiteTailedDeer11 = "Several natural predators of white-tailed deer occur." +
                " Wolves, cougars, American alligators, jaguars (in the tropics), and humans" +
                " are the most effective natural predators of white-tailed deer. These" +
                " predators frequently pick out easily caught young or infirm deer (which " +
                "is believed to improve the genetic stock of a population), but can and do" +
                " take healthy adults of any size.";
        final String whiteTailedDeer12 = "White-tailed deer typically respond to the presence " +
                "of potential predators by breathing very heavily (also called blowing) and " +
                "fleeing. When they blow, the sound alerts other deer in the area. As they " +
                "run, the flash of their white tails warns other deer. This especially " +
                "serves to warn fawns when their mother is alarmed.";
        final String whiteTailedDeer13 = "Males compete for the opportunity of breeding females." +
                " Sparring among males determines a dominance hierarchy. Bucks attempt to " +
                "copulate with as many females as possible, losing physical condition, since" +
                " they rarely eat or rest during the rut.";
        final String whiteTailedDeer14 = "Females give birth to one to three spotted young, " +
                "known as fawns, in mid- to late spring, generally in May or June. Fawns " +
                "lose their spots during the first summer and weigh from 44 to 77 lb (20 to " +
                "35 kg) by the first winter.";
        final String whiteTailedDeer15 = "For the first four weeks, fawns are hidden in " +
                "vegetation by their mothers, who nurse them four to five times a day. " +
                "This strategy keeps scent levels low to avoid predators. After about " +
                "a month, the fawns are then able to follow their mothers on foraging trip";
        final String whiteTailedDeer16 = "Sign-post marking (scrapes and rubs) is a very " +
                "obvious way white-tailed deer communicate.[68] Although bucks do" +
                " most of the marking, does visit these locations often. To make a" +
                " rub, a buck uses his antlers to strip the bark off small-diameter " +
                "trees, helping to mark his territory and polish his antlers.";
        final String whiteTailedDeer17 = "White-tailed deer are generally solitary, especially" +
                " in summer. The basic social unit is a female and her fawns, although" +
                " does have been observed to graze together in large herds.";
        final String whiteTailedDeer18 = "Most white-tailed deer live about 2 to 3 years." +
                " The maximum life span in the wild is 20 years, but few deer live past" +
                " 10 years old.";

        List<String> whiteTailedDeers = Arrays.asList(whiteTailedDeer1, whiteTailedDeer2,
                whiteTailedDeer3, whiteTailedDeer4, whiteTailedDeer5, whiteTailedDeer6,
                whiteTailedDeer7, whiteTailedDeer8, whiteTailedDeer9, whiteTailedDeer10,
                whiteTailedDeer11, whiteTailedDeer12, whiteTailedDeer13, whiteTailedDeer14,
                whiteTailedDeer15, whiteTailedDeer16, whiteTailedDeer17, whiteTailedDeer18);
        ency.put("White-tailed Deer", whiteTailedDeers);

        //Eastern Cottontail, from Wikipedia;
        // http://www.softschools.com/facts/animals/eastern_cottontail_facts/1474/
        //National Geographic
        final String easternCottentail1 = "The eastern cottontail (Sylvilagus floridanus) " +
                "is a New World cottontail rabbit, a member of the family Leporidae. " +
                "It is one of the most common rabbit species in North America.";
        final String easternCottentail2 = "The eastern cottontail can be found in meadows " +
                "and shrubby areas in the eastern and south-central United States, southern" +
                " Canada, eastern Mexico, Central America and northernmost South America. " +
                "It is abundant in Midwest North America, and has been found in New Mexico" +
                " and Arizona.";
        final String easternCottentail3 = "Optimal eastern cottontail habitat includes" +
                " open grassy areas, clearings, and old fields supporting abundant green" +
                " grasses and herbs, with shrubs in the area or edges for cover.";
        final String easternCottentail4 = "The eastern cottontail home range is roughly " +
                "circular in uniform habitats. Eastern cottontails typically inhabit one home" +
                " range throughout their lifetime, but home range shifts in response to " +
                "vegetation changes and weather are common. Uusually around 5 to 8 acres";
        final String easternCottentail5 = " Eastern cottontails do not dig their own dens " +
                "(other than nest holes) but use burrows dug by other species such as woodchucks.";
        final String easternCottentail6 = "The eastern cottontail is chunky, red-brown or" +
                " gray-brown in appearance, with large hind feet, long ears, and a short," +
                " fluffy white tail. Its underside fur is white. There is a rusty patch on" +
                " the tail. Its appearance differs from that of a hare in that it has a " +
                "brownish-gray coloring around the head and neck";
        final String easternCottentail7 = "The eastern cottontail is a very territorial animal." +
                " When chased, it runs in a zigzag pattern, running up to 18 mph (29 km/h)." +
                " The cottontail prefers an area where it can hide quickly but be out in the open.";
        final String easternCottentail8 = "Eastern cottontail young are born with a very " +
                "fine coat of hair and are blind. Their eyes begin to open by four to seven" +
                " days. Young begin to move out of the nest for short trips by 12 to 16 days" +
                " and are completely weaned and independent by four to five weeks. Litters" +
                " disperse at about seven weeks. Females do not stay in the nest with the " +
                "young but return to the opening of the nest to nurse, usually twice a day.";
        final String easternCottentail9 = "Males will mate with more than one female. " +
                "Female rabbits can have one to seven litters of one to twelve young, " +
                "called kits, in a year; however, they average three to four litters per" +
                " year, and the average number of kits is five";
        final String easternCottentail10 = "Food items include bark, twigs, leaves, fruit, " +
                "buds, flowers, grass seeds, sedge fruits, and rush seeds. There is a " +
                "preference for small material: branches, twigs, and stems up to 0.25 in (0.64 cm)";
        final String easternCottentail11 = "The eastern cottontail has to contend with many" +
                " predators, both natural and introduced. Due to their often large populations" +
                " in Eastern North America, they form a major component of several predators'" +
                " diets. Major predators of eastern cottontail include domestic cats and" +
                " dogs, foxes, coyote, bobcat, weasels, raccoon), mink, great horned owl" +
                ", barred owl, hawks, corvids, and snakes.";
        final String easternCottentail12 = "Eastern cottontail produces two types of feces." +
                " First type is soft and green due to high content of undigested plants. " +
                "Eastern cottontail swallows it again to digest it more thoroughly and to " +
                "extract remaining nutrients.";
        final String easternCottentail13 = "Mother visits the nest each day to nurse the babies." +
                " Young eastern cottontails develop quickly. They begin independent life at" +
                " the age or 4 to 5 weeks and start to breed at the age of 2 to 3 months.";
        final String easternCottentail14 = "Cottontails are plentiful and can be problematic " +
                "for farmers; they are also a popular game animal.";
        final String easternCottentail15 = "It has been estimated that, with no mortality," +
                " one pair of eastern cottontails could potentially produce 350,000" +
                " descendants in just 5 years";

        List<String> easternCottontails = Arrays.asList(easternCottentail1, easternCottentail2,
                easternCottentail3, easternCottentail4, easternCottentail5, easternCottentail6,
                easternCottentail7, easternCottentail8, easternCottentail9, easternCottentail10,
                easternCottentail11, easternCottentail12, easternCottentail13, easternCottentail14,
                easternCottentail15);
        ency.put("Eastern Cottontail", easternCottontails);

        //Blue jay, from Wikipedia, canadiangeographic.ca
        final String blueJay1 = "It is resident through most of eastern and central United States" +
                ", although western populations may be migratory. Resident populations are also" +
                " found in Newfoundland, Canada, while breeding populations can be found in" +
                " southern Canada";
        final String blueJay2 = "The bird's name derives from its noisy, garrulous nature." +
                " It is sometimes called a \"jaybird\".";
        final String blueJay3 = "As with most other blue-hued birds, the blue jay's colouration" +
                " is not derived from pigments but is the result of light interference due to" +
                " the internal structure of the feathers; if a blue feather is crushed, " +
                "the blue disappears because the structure is destroyed. This is referred to as" +
                " structural colouration.";
        final String blueJay4 = "Recently, the range of the blue jay has extended northwestwards" +
                " so that it is now a rare but regularly seen winter visitor along the northern" +
                " US and southern Canadian Pacific Coast.";
        final String blueJay5 = "Thousands of blue jays have been observed to migrate in " +
                "flocks along the Great Lakes and Atlantic coasts. It migrates during the " +
                "daytime, in loose flocks of 5 to 250 birds. Much about their migratory " +
                "behavior remains a mystery.";
        final String blueJay6 = "To date, no one has concretely worked out why they migrate " +
                "when they do. Likely, it is related to weather conditions and how abundant" +
                " the winter food sources are, which can determine whether other northern" +
                " birds will move south.";
        final String blueJay7 = "The blue jay occupies a variety of habitats within its large" +
                " range, from the pine woods of Florida to the spruce-fir forests of northern" +
                " Ontario. It is less abundant in denser forests, preferring mixed woodlands " +
                "with oaks and beeches.";
        final String blueJay8 = "The blue jay can be beneficial to other bird species, as it" +
                " may chase predatory birds, such as hawks and owls, and will scream if it sees" +
                " a predator within its territory. It has also been known to sound an alarm call " +
                "when hawks or other dangers are near, and smaller birds often recognize this " +
                "call and hide themselves away accordingly.";
        final String blueJay9 = "It may occasionally impersonate the calls of raptors, especially" +
                " those of the red-tailed and red-shouldered hawks, possibly to test if a" +
                " hawk is in the vicinity, though also possibly to scare off other birds that may" +
                " compete for food sources.";
        final String blueJay10 = "Jays are very territorial birds, and they will chase others " +
                "from a feeder for an easier meal.";
        final String blueJay11 = "Blue jays, like other corvids, are highly curious and are " +
                "considered intelligent birds. Young individuals playfully snatch brightly " +
                "coloured or reflective objects, such as bottle caps or pieces of aluminum foil," +
                " and carry them around until they lose interest.";
        final String blueJay12 = " Its food is sought both on the ground and in trees and " +
                "includes virtually all known types of plant and animal sources, such as acorns" +
                " and beech mast, weed seeds, grain, fruits and other berries, peanuts, bread," +
                " meat, small invertebrates of many types, scraps in town parks, bird-table" +
                " food and rarely eggs and nestlings.";
        final String blueJay13 = "Blue jays typically form monogamous pair bonds for life. " +
                "Both sexes build the nest and rear the young, though only the female broods " +
                "them. The male feeds the female while she is brooding the eggs. There are" +
                " usually between 3 and 6 (averaging 4 or 5) eggs laid and incubated over " +
                "16–18 days. The young fledge usually between 17–21 days after hatching.";
        final String blueJay14 = "Blue jays have been recorded to live for more than 26 years" +
                " in captivity and one wild jay was found to have been around 17 and a half" +
                " years old. The average lifespan is 7 years.";
        final String blueJay15 = "The blue jay is the provincial bird of the province of Prince " +
                "Edward Island in Canada.";
        final String blueJay16 = "Adult Blue Jays are known for their unusual moulting behaviour." +
                " The birds undergo a complete change of plumage between June and July, and " +
                "are avid ‘anters’ during this period. ‘Anting’ is the process of using ants or" +
                " other materials to preen or clean feathers. Birds have been known to use odd" +
                " materials, including lit cigarettes, to ‘ant.’";

        List<String> blueJays = Arrays.asList(blueJay1, blueJay2, blueJay3, blueJay4, blueJay5,
                blueJay6, blueJay7, blueJay8, blueJay9, blueJay10, blueJay11, blueJay12, blueJay13,
                blueJay14, blueJay15, blueJay16);
        ency.put("Blue Jay", blueJays);

        //North American Porcupine, from wikipedia
        final String northAmericanPorcupine1 = "The beaver is the only rodent in North America " +
                "that is larger than the North American porcupine.";
        final String northAmericanPorcupine2 = "The word \"porcupine\" comes from the middle " +
                "or old French word porcespin, which means quill pig. Its roots derive from the" +
                " Latin words porcus or pig and spina meaning thorns.";
        final String northAmericanPorcupine3 = "Porcupines are usually dark brown or black in " +
                "color, with white highlights. They have a stocky body, a small face, " +
                "short legs, and a short, thick tail.";
        final String northAmericanPorcupine4 = "The porcupine is the only native North American" +
                " mammal with antibiotics in its skin. Those antibiotics prevent infection when " +
                "a porcupine falls out of a tree and is stuck with its own quills upon hitting" +
                " the ground. Porcupines fall out of trees fairly often because they are highly" +
                " tempted by the tender buds and twigs at the ends of the branches.";
        final String northAmericanPorcupine5 = "The porcupine, wolverine, and the skunk are " +
                "the only North American mammals that have black and white colors because they" +
                " are the only mammals that benefit from letting other animals know where and" +
                " what they are in the dark of the night.";
        final String northAmericanPorcupine6 = "An adult porcupine has about 30,000 quills that" +
                " cover all of its body except its underbelly, face, and feet. Quills are " +
                "modified hairs formed into sharp, barbed, hollow spines. They are used " +
                "primarily for defense, but also serve to insulate their bodies during winter.";
        final String northAmericanPorcupine7 = "The barbs at the tip become lodged in the flesh" +
                " of an attacker and are difficult and painful to remove. The quills are " +
                "normally flattened against the body and in this position are less" +
                " easily dislodged.";
        final String northAmericanPorcupine8 = "North American porcupines range from Canada," +
                " Alaska, and into northern Mexico. They are commonly found in coniferous " +
                "and mixed forested areas, but have adapted to harsh environments such as " +
                "shrublands, tundra, and deserts. They make their dens in hollow trees or in" +
                " rocky areas.";
        final String northAmericanPorcupine9 = "During the summer, they eat twigs, roots, " +
                "stems, berries, and other vegetation. In the winter, they mainly eat conifer" +
                " needles and tree bark. Porcupines are selective in their eating; for example" +
                " out of every 1,000 trees in the Catskill Mountains, porcupines will only eat" +
                " from 1-2 linden trees and one bigtoothed aspen.";
        final String northAmericanPorcupine10 = " It has a strong warning odor which it can " +
                "increase when agitated. When threatened, an adult porcupine can bristle its" +
                " quills, displaying a white stripe down its back, and use its teeth to make" +
                " a warning, clacking sound.";
        final String northAmericanPorcupine11 = "Fishers have two advantages that make them " +
                "capable hunters of the porcupine. First, they are agile tree climbers. " +
                "If a fisher locates a porcupine, it cannot hide by fleeing into a tree " +
                "because the fisher can pursue it and force it down to the ground";
        final String northAmericanPorcupine12 = "As it circles the porcupine, every chance it " +
                "gets, it bites the face. After repeated attacks, the porcupine eventually " +
                "weakens, allowing the fisher to bite the porcupine's underbelly, thus killing" +
                " it. The fisher will then consume the porcupine through the chest and abdomen," +
                " avoiding the quills.";
        final String northAmericanPorcupine13 = "Female porcupines give birth to a single young" +
                " and provide all the maternal care. Mother porcupines do not defend their young.";
        final String northAmericanPorcupine14 = "North American porcupines have a relatively " +
                "long life expectancy. Some individuals have been found to live up " +
                "to 30 years of age.";

        List<String> northAmericanPorcupines = Arrays.asList(northAmericanPorcupine1,
                northAmericanPorcupine2, northAmericanPorcupine3, northAmericanPorcupine4,
                northAmericanPorcupine5, northAmericanPorcupine6, northAmericanPorcupine7,
                northAmericanPorcupine8, northAmericanPorcupine9, northAmericanPorcupine10,
                northAmericanPorcupine11, northAmericanPorcupine12, northAmericanPorcupine13,
                northAmericanPorcupine14);

        ency.put("North American Porcupine", northAmericanPorcupines);

        // Canada Goose, from wikipedia
        final String canadaGoose1 = "The Canada goose (Branta canadensis) is a large wild " +
                "goose species with a black head and neck, white patches on the face, " +
                "and a brown body.";
        final String canadaGoose2 = "Extremely successful at living in human-altered areas," +
                " Canada geese have proven able to establish breeding colonies in urban and " +
                "cultivated areas, which provide food and few natural predators, and are well " +
                "known as a common park species. ";
        final String canadaGoose3 = "In recent years, Canada goose populations in some " +
                "areas have grown substantially, so much so that many consider them pests " +
                "for their droppings, bacteria in their droppings, noise, and " +
                "confrontational behavior.";
        final String canadaGoose4 = "Like most geese, the Canada goose is naturally migratory " +
                "with the wintering range being most of the United States. The calls overhead" +
                " from large groups of Canada geese flying in V-shaped formation signal the" +
                " transitions into spring and autumn.";
        final String canadaGoose5 = "Males exhibit agonistic behaviour both on and off breeding" +
                " and nesting grounds. This behavior rarely involves interspecific killing.";
        final String canadaGoose6 = "Canada geese are primarily herbivores, although they " +
                "sometimes eat small insects and fish.[26] Their diet includes green vegetation" +
                " and grains. The Canada goose eats a variety of grasses when on land. It " +
                "feeds by grasping a blade of grass with the bill, then tearing it with a " +
                "jerk of the head.";
        final String canadaGoose7 = "During the second year of their lives, Canada geese " +
                "find a mate. They are monogamous, and most couples stay together all of " +
                "their lives. If one dies, the other may find a new mate.";
        final String canadaGoose8 = "The female lays from two to nine eggs with an average of " +
                "five, and both parents protect the nest while the eggs incubate, but the " +
                "female spends more time at the nest than the male.";
        final String canadaGoose9 = "Its nest is usually located in an elevated area near " +
                "water such as streams, lakes, ponds, and sometimes on a beaver lodge. Its" +
                " eggs are laid in a shallow depression lined with plant material and down.";
        final String canadaGoose10 = "The incubation period, in which the female incubates " +
                "while the male remains nearby, lasts for 24–28 days after laying. As the" +
                " annual summer molt also takes place during the breeding season, the adults" +
                " lose their flight feathers for 20–40 days, regaining flight about the same" +
                " time as their goslings start to fly.";
        final String canadaGoose11 = "While protecting their goslings, parents often violently" +
                " chase away nearby creatures, from small blackbirds to lone humans who approach" +
                ", after warning them by giving off a hissing sound and then attack with bites" +
                " and slaps of the wings if the threat does not retreat or has seized a gosling.";
        final String canadaGoose12 = "Canada geese fly in a distinctive V-shaped flight " +
                "formation, with an altitude of 1 km (3,000 feet) for migration flight. " +
                "The maximum flight ceiling of Canada geese is unknown, but they have " +
                "been reported at 9 km.";
        final String canadaGoose13 = "The lifespan in the wild of geese that survive to " +
                "adulthood ranges from 10 to 24 years.";
        final String canadaGoose14 = "Once they reach adulthood, due to their large size and" +
                " often aggressive behavior, Canada geese are rarely preyed on, although" +
                " prior injury may make them more vulnerable to natural predators.";
        final String canadaGoose15 = "The oldest known wild Canada Goose was a female, and" +
                " at least 33 years, 3 months old when she was shot in Ontario in 2001. " +
                "She had been banded in Ohio in 1969.";

        List<String> canadaGeese = Arrays.asList(canadaGoose1, canadaGoose2, canadaGoose3,
                canadaGoose4, canadaGoose5, canadaGoose6, canadaGoose7, canadaGoose8, canadaGoose9,
                canadaGoose10, canadaGoose11, canadaGoose12, canadaGoose13, canadaGoose14,
                canadaGoose15);
        ency.put("Canada Goose", canadaGeese);

        // American black bear,
        // from http://www.discoverwildlife.com/animals/mammals/10-amazing-black-bear-facts
        // wikipedia, http://www.defenders.org/black-bear/basic-facts
        final String americanBlackBear1 = "The black bear Ursus americanus is the smallest, " +
                "yet most common, of the three bear species found in America (after " +
                "the polar and grizzly). The current population estimate is 750,000 individuals.";
        final String americanBlackBear2 = "Black bears are excellent climbers and are often " +
                "photographed scaling trees. Their claws give them great grip, and the branches" +
                " offer youngsters safety from predators. Cubs can be very adventurous, " +
                "climbing high into the treetops.";
        final String americanBlackBear3 = "Black bears are also good swimmers, and will readily" +
                " enter water in search of fish. Black bear cubs take to the water easily and" +
                " quickly, and one adult is believed to have swum nine miles along the Gulf" +
                " of Mexico.";
        final String americanBlackBear4 = "Despite their name, black bears are not always " +
                "black – they can also be light brown, blond or even grey-blue. A subspecies" +
                " of black bear with white fur, known as the Kermode or spirit bear, lives " +
                "in British Columbia.";
        final String americanBlackBear5 = "Female black bears can give birth to up to six cubs," +
                " and usually breed every other year. Cubs stay with their mother for about" +
                " 18 months.";
        final String americanBlackBear6 = "If you come across a bear at close range, the usual" +
                " advice is to retreat slowly, still facing the bear. Do not run. Bears are" +
                " known to make mock-charges to within a few metres – if they do this, stand" +
                " your ground and shout.";
        final String americanBlackBear7 = "Black bears tend to shuffle along slowly when" +
                " walking, but are able to run at speeds of around 40-50kph. However, they " +
                "cannot maintain this pace for long. Plump bears in heavy winter coats tire " +
                "out particularly quickly.";
        final String americanBlackBear8 = "During their time in hibernation, bears' heart rate " +
                "drops from 40–50 beats per minute to 8 beats per minute, and metabolic rate " +
                "can drop to a quarter of a bear's (non-hibernating) basal metabolic rate (BMR)." +
                " These reductions in metabolic rate and heart rate do not appear to decrease" +
                " the bear's ability to heal injuries during hibernation.";
        final String americanBlackBear9 = "Prior to hibernation, they can put on up to 14 kg" +
                " (30 lb) of body fat to get them through the several months during which they" +
                " fast. Hibernation in black bears typically lasts 3–8 months, depending on" +
                " regional climate.";
        final String americanBlackBear10 = "Up to 85% of the black bear's diet consists of " +
                "vegetation, but they also feed on  insects such as bees, yellow jackets, ants " +
                "and their larvae.";
        final String americanBlackBear11 = "Although black bears do not often engage in active" +
                " predation of other large animals for much of the year, the species will " +
                "regularly prey on mule and white-tailed deer fawns in spring, given the " +
                "opportunity.";
        final String americanBlackBear12 = "Black bears tend to be solitary animals, with the" +
                " exception of mothers and cubs. The bears usually forage alone, but will" +
                " tolerate each other and forage in groups if there is an abundance of food" +
                " in one area.";
        final String americanBlackBear13 = "The American black bear is distributed throughout " +
                "North America, from Canada to Mexico and in at least 40 states in the U.S.";

        List<String> americanBlackBears = Arrays.asList(americanBlackBear1, americanBlackBear2,
                americanBlackBear3, americanBlackBear4, americanBlackBear5, americanBlackBear6,
                americanBlackBear7, americanBlackBear8, americanBlackBear9, americanBlackBear10,
                americanBlackBear11, americanBlackBear12, americanBlackBear13);
        ency.put("American Black Bear", americanBlackBears);

        //Meadow Voles, from wikipedia,
        // http://www.arkive.org/meadow-vole/microtus-pennsylvanicus/
        //  https://www.britannica.com/animal/meadow-vole
        final String meadowVole1 = "The meadow vole is active year-round, usually at night. " +
                "It also digs underground burrows, where it stores food for the winter and " +
                "females give birth to their young. Although these animals tend to live close" +
                " together, they are aggressive towards one another.";
        final String meadowVole2 = "Meadow voles are most commonly found in grasslands, " +
                "preferring moister areas, but are also found in wooded areas.";
        final String meadowVole3 = "Meadow voles are active year-round and day or night, with" +
                " no clear 24-hour rhythm in many areas.";
        final String meadowVole4 = "In Canada, meadow voles are active the first few hours after" +
                " dawn and during the two- to four-hour period before sunset. Most of the " +
                "inactive period is spent in the nest.";
        final String meadowVole5 = "The size and colour of the meadow vole varies depending on" +
                " location, but the species is generally dark brown above and silvery-grey below.";
        final String meadowVole6 = "A prolific species, the meadow vole can produce up to 11 " +
                "young per litter, and more than 10 litters per year.";
        final String meadowVole7 = "Optimal meadow vole habitat consists of moist, dense " +
                "grassland with substantial amounts of plant litter. Habitat selection is " +
                "largely influenced by relative ground cover of grasses and forbs; soil " +
                "temperature, moisture, sodium, potassium, and pH levels; humidity; and " +
                "interspecific competition.";
        final String meadowVole8 = "Meadow voles eat most available species of grasses, sedges" +
                ", and forbs, including many agricultural plant species.";
        final String meadowVole9 = "Weighing less than 50 grams (1.8 ounces), this stout vole " +
                "is 15 to 20 cm (5.9 to 7.9 inches) long, including its short tail (3 to 6 cm).";
        final String meadowVole10 = "The meadow vole is one of 61 species in the genus Microtus." +
                " Its closest living relative is the beach vole (M. breweri) of Muskeget " +
                "Island off the coast of Massachusetts, which evolved from mainland " +
                "populations of the meadow vole only during the last 3,000 years.";
        final String meadowVole11 = "The meadow vole has the largest geographic distribution " +
                "of any species of Microtus in North America. Its range extends through almost" +
                " all of Alaska and Canada southward through the Rocky Mountains to New Mexico" +
                " and eastward across the northern Great Plains to the Atlantic seaboard from" +
                " Maine to Georgia. Isolated populations are found in western Florida and " +
                "northern Chihuahua, Mexico.";

        List<String> meadowVoles = Arrays.asList(meadowVole1, meadowVole2, meadowVole3, meadowVole4
        , meadowVole5, meadowVole6, meadowVole7, meadowVole8, meadowVole9, meadowVole10,
                meadowVole11);
        ency.put("Meadow Vole", meadowVoles);

        // Wolverine, from wikipedia; nationalgeographic
        final String wovlerine1 = "The wolverine, Gulo gulo (Gulo is Latin for \"glutton\"), " +
                "also referred to as the glutton, carcajou, skunk bear, or quickhatch, is the " +
                "largest land-dwelling species of the family Mustelidae. It is a stocky and" +
                " muscular carnivore, more closely resembling a small bear than other mustelids.";
        final String wovlerine2 = "The wolverine is found primarily in remote reaches of " +
                "the Northern boreal forests and subarctic and alpine tundra of the Northern" +
                " Hemisphere, with the greatest numbers in northern Canada, the US state of" +
                " Alaska, the mainland Nordic countries of Europe, and throughout western Russia" +
                " and Siberia.";
        final String wovlerine3 = "Wolverines have thick, dark, oily fur which is highly " +
                "hydrophobic, making it resistant to frost. This has led to its traditional" +
                " popularity among hunters and trappers as a lining in jackets and parkas in" +
                " Arctic conditions. ";
        final String wovlerine4 = "Wolverines are considered to be primarily scavengers. A " +
                "majority of the wolverine's sustenance is derived from carrion, on which they" +
                " depend almost exclusively in winter and early spring.";
        final String wovlerine5 = "Wolverines are also known to follow wolf and lynx trails, " +
                "purportedly with the intent of scavenging the remains of their kills. Whether" +
                " eating live prey or carrion, the wolverine's feeding style appears voracious," +
                " leading to the nickname of \"glutton\" (also the basis of the scientific name).";
        final String wovlerine6 = "Prey species include porcupines, squirrels, chipmunks, " +
                "beavers, marmots, moles, gophers, rabbits, voles, mice, rats, shrews, lemmings," +
                " caribou, roe deer, white-tailed deer, mule deer, sheep, goats, cattle, bison," +
                " moose, and elk.";
        final String wovlerine7 = "Wolverines frequently cache their food during times of " +
                "plenty. This is of particular importance to lactating females in the winter " +
                "and early spring, a time when food is scarce.";
        final String wovlerine8 = "Wolves are thought to be the wolverine's most important" +
                " natural predator, with the arrival of wolves to a wolverine's territory " +
                "presumably leading the latter to abandon the area";
        final String wovlerine9 = "Successful males will form lifetime relationships with two or" +
                " three females, which they will visit occasionally, while other males are left" +
                " without a mate.";
        final String wovlerine10 = "Kits develop rapidly, reaching adult size within the first " +
                "year. The typical longevity of a wolverine in captivity is around 15 to 17 " +
                "years, but in the wild the average lifespan is more likely between 8 and " +
                "10 years.";
        final String wovlerine11 = "The world's total wolverine population is not known. The " +
                "animal exhibits a low population density and requires a very large home range.";
        final String wovlerine12 = "These tough animals are solitary, and they need a lot of " +
                "room to roam. Individual wolverines may travel 15 miles in a day in search" +
                " of food.";
        final String wovlerine13 = "Wolverines eat a bit of vegetarian fare, like plants and " +
                "berries, in the summer season, but this does not make up a major part of their" +
                " diet—they are tenacious predators with a taste for meat.";

        List<String> wolverines = Arrays.asList(wovlerine1, wovlerine2, wovlerine3, wovlerine4,
                wovlerine5, wovlerine6, wovlerine7, wovlerine8, wovlerine9, wovlerine10,
                wovlerine11, wovlerine12, wovlerine13);
        ency.put("Wolverine", wolverines);

        //Bobcat, from wikipedia, nationalgeographic
        final String bobcat1 = "Bobcats are elusive and nocturnal, so they are rarely spotted " +
                "by humans. Although they are seldom seen, they roam throughout much of North" +
                " America and adapt well to such diverse habitats as forests, swamps, deserts," +
                " and even suburban areas.";
        final String bobcat2 = "Bobcats, sometimes called wildcats, are roughly twice as big as " +
                "the average housecat. They have long legs, large paws, and tufted ears similar" +
                " to those of their larger relative, the Canada lynx.";
        final String bobcat3 = "Most bobcats are brown or brownish red with a white underbelly" +
                " and short, black-tipped tail. The cat is named for its tail, which appears to" +
                " be cut or \"bobbed.\"";
        final String bobcat4 = "Fierce hunters, bobcats can kill prey much bigger than " +
                "themselves, but usually eat rabbits, birds, mice, squirrels, and other " +
                "smaller game. The bobcat hunts by stealth, but delivers a deathblow with" +
                " a leaping pounce that can cover 10 feet.";
        final String bobcat5 = "Bobcats are solitary animals. Females choose a secluded den to" +
                " raise a litter of one to six young kittens, which will remain with their " +
                "mother for 9 to 12 months. During this time they will learn to hunt before" +
                " setting out on their own.";
        final String bobcat6 = "In some areas, bobcats are still trapped for their soft, " +
                "spotted fur. North American populations are believed to be quite large, " +
                "with perhaps as many as one million cats in the United States alone.";
        final String bobcat7 = "Though the bobcat prefers rabbits and hares, it hunts insects," +
                " chickens, geese and other birds, small rodents, and deer. Prey selection" +
                " depends on location and habitat, season, and abundance.";
        final String bobcat8 = "There had been debate over whether to classify this species" +
                " as Lynx rufus or Felis rufus as part of a wider issue regarding whether " +
                "the four species of Lynx should be given their own genus, or be placed as a " +
                "subgenus of Felis.The Lynx genus is now accepted, and the bobcat is listed" +
                " as Lynx rufus in modern taxonomic sources.";
        final String bobcat9 = "It keeps on the move from three hours before sunset until " +
                "about midnight, and then again from before dawn until three hours after" +
                " sunrise. Each night, it moves from 2 to 7 mi (3.2 to 11.3 km) along" +
                " its habitual route.";
        final String bobcat10 = "Overall, the population of the bobcat is fairly stable. " +
                "In some areas their numbers are increasing and in other areas the population" +
                " is declining. They are currently listed as a species of least concern.";
        final String bobcat11 = "Its population in Canada is limited due to both snow depth " +
                "and the presence of the Canadian lynx. The bobcat does not tolerate deep " +
                "snow, and waits out heavy storms in sheltered areas;";
        final String bobcat12 = "It has been known to kill deer, especially in winter when " +
                "smaller prey is scarce, or when deer populations become more abundant.";

        List<String> bobcats = Arrays.asList(bobcat1, bobcat2, bobcat3, bobcat4, bobcat5, bobcat6,
                bobcat7, bobcat8, bobcat9, bobcat10, bobcat11, bobcat12);
        ency.put("Bobcat", bobcats);

        //Little Brown bat, from wikipedia
        // http://www.batworlds.com/little-brown-bat/
        final String littleBrownBat1 = "The little brown bat (sometimes called little brown " +
                "myotis) (Myotis lucifugus) is a species of the genus Myotis (mouse-eared " +
                "bats), one of the most common bats of North America. It has been a model" +
                " organism for the study of bats (chiropterology).";
        final String littleBrownBat2 = "The little brown bat lives throughout much of " +
                "North America. It is most common in the northern half of the continental" +
                " United States and southern Canada. Most specimens from the northern ";
        final String littleBrownBat3 = "The little brown bat lives in three different roosting" +
                " sites: day roosts, night roost and hibernation roosts";
        final String littleBrownBat4 = "Bats rest in night roosts after feeding in the evening" +
                " which may serve to keep their feces away from the day roosts and thus less" +
                " noticeable to predators.";
        final String littleBrownBat5 = "The Little Brown Bat sleeps and grooms during the day." +
                " They are fast creatures and hunt by night. They live in caves and mines" +
                " during the winter months. Their hibernation cycle can last from four to" +
                " six months.";
        final String littleBrownBat6 = "Wasps and moths are the majority of their diet in such" +
                " an environment. They can consume up to half of their body weight each night" +
                " when it comes to their eating habits.";
        final String littleBrownBat7 = "Most of the time the Little Brown Bat will consume its" +
                " meals while in flight. They have very sharp molars. They have canines that are" +
                " shaped in a manner that allows them to hold onto their prey while they are in" +
                " flight. They will also use the tip of their wing to capture food.";
        final String littleBrownBat8 = "When a Little Brown Bat doesn’t find enough food to eat" +
                " on a given day, it will have to slow its body rate while sleeping during the " +
                "day. This process allows it to conserve energy.";
        final String littleBrownBat9 = "The female Little Brown Bat is ready to mate from 7 to" +
                " 9 months of age. The males mature later, when they are about 1 year old." +
                " Even though mating occurs in the fall, the females are able to delay the" +
                " fertilization of the sperm and the egg. She won’t allow that to occur" +
                " until spring time.";
        final String littleBrownBat10 = " Typically only one young is born at a time. They grow " +
                "very fast, consuming the milk from their mother’s body. They can’t fly at birth" +
                " so they are vulnerable. They hold onto her midsection and hang there. By the" +
                " time they are a month old though they are already self-sufficient members of" +
                " the colony.";
        final String littleBrownBat11 = "Little brown bats are insectivores, eating moths," +
                " wasps, beetles, gnats, mosquitoes, midges and mayflies, among others";
        final String littleBrownBat12 = "They are particularly good at hunting insects when they" +
                " are at close range and packed together. When hunting, little brown bats " +
                "capture prey both by gleaning and by catching them in the air. When in flight," +
                " bats scoop up the prey with their wings, while prey above water is directly" +
                " grabbed with the mouth.";
        final String littleBrownBat13 = "Brown bats live approximately 6 to 7 years and often" +
                " live well beyond 10 years. Little brown bats are preyed on by a variety of" +
                " animals, including small carnivores, birds, rats and snakes.";

        List<String> littleBrownBats = Arrays.asList(littleBrownBat1, littleBrownBat2,
                littleBrownBat3, littleBrownBat4, littleBrownBat5, littleBrownBat6,
                littleBrownBat7, littleBrownBat8, littleBrownBat9, littleBrownBat10,
                littleBrownBat11, littleBrownBat12, littleBrownBat13);
        ency.put("Liitle Brown Bat", littleBrownBats);

        //Five-linked skink, from wikipedia
        final String fiveLinkedSkink1 = "The (American) five-lined skink (Plestiodon " +
                "fasciatus) is a species of lizard endemic to North America. It is one of the " +
                "most common lizards in the eastern U.S. and one of the seven native species of" +
                " lizards in Canada.";
        final String fiveLinkedSkink2 = "Other common names include blue-tailed skink (for" +
                " juveniles) and red-headed skink (for adults).";
        final String fiveLinkedSkink3 = "oung five-lined skinks are dark brown to black with" +
                " five distinctive white to yellowish stripes running along the body and a" +
                " bright blue tail. The blue color fades to light blue with age, and the " +
                "stripes also may slowly disappear.";
        final String fiveLinkedSkink4 = "The range of the five-lined skink extends in the north" +
                " to southern Ontario, Michigan and eastern New York. The western border is in" +
                " Minnesota, Missouri and eastern Kansas, Nebraska, Oklahoma, Florida, " +
                "Mississippi, Texas, Louisiana and Texas.";
        final String fiveLinkedSkink5 = "The Great Lakes - St. Lawrence population is listed " +
                "as \"special concern\" in Ontario and Canada by COSSARO and COSEWIC, and it is" +
                " illegal to remove skinks from their habitats.";
        final String fiveLinkedSkink6 = "Five-lined skinks are ground-dwelling animals. They" +
                " prefer moist, partially wooded habitat that provides ample cover or inside" +
                " walls of buildings, trees as well as sites to bask in the sun. They can also" +
                " be found in broken, rocky areas at the northern edge of their habitat.";
        final String fiveLinkedSkink7 = "Adult male five-lined skinks exhibit complex courtship" +
                " and aggressive behavior. Although males tolerate juveniles and females" +
                " in their territories, they actively defend these areas against other males.";
        final String fiveLinkedSkink8 = "Females lay two to 15 eggs in the early summer in a " +
                "nest excavated under cover or within a rotting log. Several females may nest " +
                "together and will protect their nest from predators. Females bask in the sun " +
                "and return to the nest to use their bodies to warm their eggs, which hatch in " +
                "late summer.";
        final String fiveLinkedSkink9 = "These lizards eat a wide variety of invertebrates," +
                " such as insects, spiders and worms, and track prey with their keen sense of" +
                " smell.";
        final String fiveLinkedSkink10 = "If a predator catches a skink by the tail, it will " +
                "break off and begin to thrash about. The moving tail distracts the predator" +
                " while the lizard escapes. Although a new tail will grow over time, the skink" +
                " will have lost much of the fat reserves on which it relies to survive the" +
                " winter.";

        List<String> fiveLinkedSkinks = Arrays.asList(fiveLinkedSkink1, fiveLinkedSkink2,
                fiveLinkedSkink3, fiveLinkedSkink4, fiveLinkedSkink5, fiveLinkedSkink6,
                fiveLinkedSkink7, fiveLinkedSkink8, fiveLinkedSkink9, fiveLinkedSkink10);
        ency.put("Five-linked Skink", fiveLinkedSkinks);

        //American Martin, from wikipedia
        // https://www.nature.org/newsfeatures/specialfeatures/animals/mammals/pine-marten.xml
        // http://www.softschools.com/facts/animals/american_marten_facts/1138/
        final String americanMartin1 = "The American marten or American pine marten (Martes " +
                "americana) is a North American member of the family Mustelidae, sometimes " +
                "referred to as the pine marten. The name \"pine marten\" is derived from the" +
                " common but distinct Eurasian species of Martes.";
        final String americanMartin2 = "The marten lives in mature coniferous or mixed forests" +
                " in Alaska and Canada, the Pacific Northwest of the United States and south" +
                " into Northern New England and through the Rocky Mountains and Sierra Nevada.";
        final String americanMartin3 = "The American marten is a long, slender-bodied weasel " +
                "about the size of a mink with relatively large rounded ears, short limbs, and" +
                " a bushy tail. American marten have a roughly triangular head and sharp nose" +
                ". Their long, silky fur ranges in color from pale yellowish buff to tawny" +
                " brown to almost black.";
        final String americanMartin4 = "Sexual dimorphism is pronounced, with males averaging" +
                " about 15% larger than females in length and as much as 65% larger in body" +
                " weight.";
        final String americanMartin5 = "American marten reach sexual maturity by 1 year of age," +
                " but effective breeding may not occur before 2 years of age. In captivity," +
                " 15-year-old females bred successfully. In the wild, 12-year-old females" +
                " were reproductive.";
        final String americanMartin6 = " Females give birth in late March or April to a litter" +
                " ranging from 1 to 5 kits. Annual reproductive output is low according to" +
                " predictions based on body size. Fecundity varies by age and year and may" +
                " be related to food abundance.";
        final String americanMartin7 = "Females prepare a natal den by lining a cavity with " +
                "grass, moss, and leaves. They frequently move kits to new maternal dens" +
                " once kits are 7–13 weeks old. Most females spend more than 50% of their " +
                "time attending dens in both preweaning and weaning periods, with less time" +
                " spent at dens as kits aged.";
        final String americanMartin8 = "They require about 80 cal/day while at rest, " +
                "the equivalent of about 3 voles, which make up the majority of their diet.";
        final String americanMartin9 = "American marten in captivity may live for 15 years. " +
                "The oldest individual documented in the wild was 14.5 years old.";
        final String americanMartin10 = "The fur of the American marten is shiny and luxuriant," +
                " resembling that of the closely related sable. At the turn of the twentieth" +
                " century, the American marten population was depleted due to the fur trade.";
        final String americanMartin11 = "American martens are agile climbers and good swimmers," +
                " but they spend most of their lives on the ground.";
        final String americanMartin12 = "American martens are solitary animals except during" +
                " the mating season which takes place from June to August. " +
                "Males aggressively fight for the attention of females (their" +
                " heads and shoulders are often covered with scars).";
        final String americanMartin13 = "American martens are omnivores. Their diet is based" +
                " on mice, squirrels, hares, small birds, reptiles, insects, fruit and nuts.";
        final String americanMartin14 = "Usually shy and curious, pine martens are also solitary" +
                " and territorial. Neither sex will allow another marten of the same sex in " +
                "their home territory, though males will tolerate the presence of multiple" +
                " females.";

        List<String> americanMartins = Arrays.asList(americanMartin1, americanMartin2,
                americanMartin3, americanMartin4, americanMartin5, americanMartin6, americanMartin7
        , americanMartin8, americanMartin9, americanMartin10, americanMartin11, americanMartin12,
                americanMartin13, americanMartin14);
        ency.put("American Martin", americanMartins);

        //Gray tree frog, from wikipedia
        // http://www.nhptv.org/natureworks/graytreefrog.htm
        final String grayTreeFrog1 = "he gray treefrog (Hyla versicolor) is a species of small" +
                " arboreal frog native to much of the eastern United States and southeastern" +
                " Canada.";
        final String grayTreeFrog2 = "It is sometimes referred to as the eastern gray" +
                " treefrog, common gray treefrog, or tetraploid gray treefrog to distinguish" +
                " it from its more southern, genetically disparate relative, the Cope's" +
                " gray treefrog.";
        final String grayTreeFrog3 = "As the scientific name implies, gray treefrogs are" +
                " variable in color owing to their ability to camouflage themselves from" +
                " gray to green, depending on the substrate where they are sitting.";
        final String grayTreeFrog4 = "They can change from nearly black to nearly white.";
        final String grayTreeFrog5 = "The gray treefrog also has 48 chromosomes (4n), and is" +
                " called tetraploid gray treefrog in scientific circles.";
        final String grayTreeFrog6 = "Gray treefrogs inhabit a wide range, and can be found" +
                " in most of the eastern half of the United States, as far west as central" +
                " Texas and Oklahoma. They also range into Canada in the provinces of " +
                "Quebec, Ontario, and Manitoba, with an isolated population in New Brunswick.";
        final String grayTreeFrog7 = "They prefer to breed in semipermanent woodland ponds" +
                " without fish, but also lay eggs in swamps, vernal pools, man- made " +
                "fountains and water gardens, and even in rainwater filled swimming pool covers.";
        final String grayTreeFrog8 = "These frogs rarely ever descend from high treetops " +
                "except for breeding. They are strictly nocturnal.";
        final String grayTreeFrog9 = "Gray treefrogs may congregate around windows and porch" +
                " lights to eat insects that are attracted to the light. During the day they" +
                " often rest on horizontal tree branches or leaves out in the open, even" +
                " in the sun. ";
        final String grayTreeFrog10 = "In captivity, they become tame and learn to associate" +
                " their owners with food, even to the point of lunging at empty fingers that" +
                " usually contain an insect.";
        final String grayTreeFrog11 = "Mating calls and chorusing are most frequent at night," +
                " but individuals often call during daytime in response to thunder or other" +
                " loud noises.";
        final String grayTreeFrog12 = "The female lays as many as 2000 eggs in groups of 10-40." +
                " The tadpoles hatch in four or five days and will change into froglets in" +
                " about two months.";
        final String grayTreeFrog13 = "The gray treefrog finds its food in the trees and " +
                "shrubs. It eats moths, tree crickets, ants, flies, grasshoppers and " +
                "beetles. It is very acrobatic and will often jump from branch to branch" +
                " to catch its prey.";
        final String grayTreeFrog14 = "These frogs are rarely seen outside the breeding season." +
                " When they are not active, they hide in tree holes, under bark, in rotten logs," +
                " and under leaves and tree roots.";

        List<String> grayTreeFrogs = Arrays.asList(grayTreeFrog1, grayTreeFrog2, grayTreeFrog3,
                grayTreeFrog4, grayTreeFrog5, grayTreeFrog6, grayTreeFrog7, grayTreeFrog8,
                grayTreeFrog9, grayTreeFrog10, grayTreeFrog11, grayTreeFrog12, grayTreeFrog13,
                grayTreeFrog14);
        ency.put("Gray Tree Frog", grayTreeFrogs);

        //Elk, from wikipedia, nationalgeographic
        final String elk1 = "Elk are also called wapiti, a Native American word that" +
                " means \"light-colored deer.\"";
        final String elk2 = "Elk are related to deer but are much larger than most of " +
                "their relatives. A bull (male) elk's antlers may reach 4 feet above its " +
                "head, so that the animal towers 9 feet tall.";
        final String elk3 = "Bull elk lose their antlers each March, but they begin to " +
                "grow them back in May in preparation for the late-summer breeding season.";
        final String elk4 = "In early summer, elk migrate to high mountain grazing grounds" +
                " where the cows (females) will give birth. Each cow typically has a single" +
                " calf, which can stand by the time it is 20 minutes old.";
        final String elk5 = " These powerful animals strip the velvet off their new antlers" +
                " using them in violent clashes that determine who gets to mate with whom. " +
                "Males with the bigger antlers, typically older animals, usually win these" +
                " battles and dominate small herds.";
        final String elk6 = "An elk’s stomach has four chambers: the first stores food," +
                " and the other three digest it";
        final String elk7 = "Only the males have antlers, which start growing in the spring and" +
                " are shed each winter. The largest antlers may be 1.2 metres long and weigh" +
                " 18 kilograms (40 lb). Antlers are made of bone which can grow at a rate " +
                "of 2.5 centimetres (0.98 in) per day.";
        final String elk8 = "Bulls have a loud vocalization consisting of screams known as " +
                "bugling, which can be heard for miles. Females are attracted to the males" +
                " that bugle more often and have the loudest call.";
        final String elk9 = "By the autumn of their second year, females can produce one and," +
                " very rarely, two offspring.";
        final String elk10 = "The offspring will remain with their mothers for almost a year, " +
                "leaving about the time that the next season's offspring are produced.";
        final String elk11 = "Wolf and coyote packs and the solitary cougar are the most " +
                "likely predators, although brown and black bears also prey on elk. Coyote packs" +
                " mostly prey on elk calves, though they can sometimes take a winter-weakened" +
                " adult";
        final String elk12 = "Elk migrate into areas of higher altitude in the spring, " +
                "following the retreating snows, and the opposite direction in the fall.";
        final String elk13 = "Their diets vary somewhat depending on the season, with native" +
                " grasses being a year-round supplement, tree bark being consumed in winter " +
                "and forbs and tree sprouts during the summer.";

        List<String> elks = Arrays.asList(elk1, elk2, elk3, elk4, elk5, elk6, elk7, elk8, elk9,
                elk10, elk11, elk12, elk13);
        ency.put("Elk", elks);

        // North American River Otter, from wikipedia, national geographic
        final String riverOtter1 = "The North American river otter (Lontra canadensis), also " +
                "known as the northern river otter or the common otter, is a semiaquatic mammal" +
                " endemic to the North American continent found in and along its waterways and " +
                "coasts. ";
        final String riverOtter2 = "River otters are active year-round, and are most " +
                "active at night and during crepuscular hours. They become much more nocturnal" +
                " in the spring, summer, and fall seasons, and more diurnal during winter. ";
        final String riverOtter3 = "The tail, which is stout and larger in surface area than " +
                "the limbs, is used for stability while swimming and for short bursts of rapid" +
                " propulsion. While swimming at the surface, the dorsal portion of the river " +
                "otter's head, including nostrils, ears, and eyes, is exposed above water. It" +
                " must remain in motion to maintain its position at the surface.";
        final String riverOtter4 = "River otters are renowned for their sense of play. " +
                "Otter play mostly consists of wrestling with conspecifics. Chasing is also a" +
                " common game. River otters rely upon play to learn survival skills such as" +
                " fighting and hunting. However, playful behavior was found in only 6% of 294" +
                " observations in a study in Idaho, and was limited mostly to immature otters.";
        final String riverOtter5 = "Prey is captured with a quick lunge from ambush, or more" +
                " rarely, after a sustained chase. River otters can remain underwater for " +
                "nearly 4 minutes, swim at speeds approaching 11 km/h (6.8 mph), dive to " +
                "depths nearing 20 m (22 yd), and travel up to 400 m (440 yd) while underwater.";
        final String riverOtter6 = "River otters dry themselves and uphold the insulative " +
                "quality of their fur by frequent rubbing and rolling on grass, bare ground," +
                " and logs.";
        final String riverOtter7 = "Fish are the primary component of the river otter's " +
                "diet throughout the year.";
        final String riverOtter8 = "The North American river otter is more social than " +
                "most mustelids. In all habitats, their basic social group is the family," +
                " consisting of an adult female and her progeny. Adult males also commonly" +
                " establish enduring social groupings, some documented to comprise as many" +
                " as 17 individuals.";
        final String riverOtter9 = "River otters can produce a snarling growl or hissing " +
                "bark when bothered, and a shrill whistle when in pain. When at play or " +
                "traveling, they sometimes give off low, purring grunts. The alarm call," +
                " given when shocked or distressed by potential danger, is an explosive snort," +
                " made by expelling air through the nostrils. River otters also may use a " +
                "birdlike chirp for communication over longer distances, but the most common" +
                " sound heard among a group of otters is low-frequency chuckling.";
        final String riverOtter10 = "In early spring, expectant mothers begin to look for a den" +
                " where they can give birth. The female otters do not dig their own dens; " +
                "instead, they rely on other animals, such as beavers, to provide suitable" +
                " environments to raise their offspring. When the mothers have established " +
                "their domains, they give birth to several kits. Litter size can reach " +
                "five, but usually ranges from one to three.";
        final String riverOtter11 = "The mothers raise their young without aid from adult" +
                " males. When the pups are about two months old and their coats grow in," +
                " their mother introduces them to the water.";
        final String riverOtter12 = "Although commonly called a \"river otter\", the North" +
                " American river otter is found in a wide variety of aquatic habitats, both" +
                " freshwater and coastal marine, including lakes, rivers, inland wetlands," +
                " coastal shorelines, marshes, and estuaries. It can tolerate a great range" +
                " of temperature and elevations";
        final String riverOtter13 = "They also have webbed feet, water repellent fur to keep" +
                " them dry and warm, and nostrils and ears that close in the water. ";
        final String riverOtter14 = "These otters' range has been greatly reduced by habitat" +
                " loss, though they exist in such numbers that they are trapped in some" +
                " locales. Otters are also very sensitive to environmental pollution.";
        final String riverOtter15 = "An otter's tail is called a rudder.";

        List<String> riverOtters = Arrays.asList(riverOtter1, riverOtter2, riverOtter3,
                riverOtter4, riverOtter5, riverOtter6, riverOtter7, riverOtter8, riverOtter9,
                riverOtter10, riverOtter11, riverOtter12, riverOtter13, riverOtter14,
                riverOtter15);
        ency.put("North American River Otter", riverOtters);

        // Painted Turtle, from wikipedia
        final String paintedTurtle1 = "The painted turtle (Chrysemys picta) is the most " +
                "widespread native turtle of North America. It lives in slow-moving fresh" +
                " waters, from southern Canada to Louisiana and northern Mexico, and from the" +
                " Atlantic to the Pacific.";
        final String paintedTurtle2 = "The adult painted turtle female is 10–25 cm (4–10 in)" +
                " long; the male is smaller. The turtle's top shell is dark and smooth, " +
                "without a ridge. Its skin is olive to black with red, orange, or yellow " +
                "stripes on its extremities.";
        final String paintedTurtle3 = "Fossils show that the painted turtle existed 15 " +
                "million years ago. Four regionally based subspecies (the eastern, midland," +
                " southern, and western) evolved during the last ice age.";
        final String paintedTurtle4 = "The turtle eats aquatic vegetation, algae, and small" +
                " water creatures including insects, crustaceans, and fish.";
        final String paintedTurtle5 = "Reliant on warmth from its surroundings, the painted " +
                "turtle is active only during the day when it basks for hours on logs or " +
                "rocks. During winter, the turtle hibernates, usually in the mud at the " +
                "bottom of water bodies. ";
        final String paintedTurtle6 = "The painted turtle hunts along water bottoms. It " +
                "quickly juts its head into and out of vegetation to stir potential victims " +
                "out into the open water, where they are pursued. The turtle holds large prey" +
                " in its mouth and tears the prey apart with its forefeet.";
        final String paintedTurtle7 = "Courtship begins when a male follows a female until he" +
                " meets her face-to-face. He then strokes her face and neck with his elongated" +
                " front claws, a gesture returned by a receptive female. The pair repeat" +
                " the process several times.";
        final String paintedTurtle8 = "While preparing to dig her nest, the female sometimes " +
                "exhibits a mysterious preliminary behavior. She presses her throat against" +
                " the ground of different potential sites, perhaps sensing moisture, warmth," +
                " texture, or smell, although her exact motivation is unknown. She may further" +
                " temporize by excavating several false nests[48] as the wood turtles also do.";
        final String paintedTurtle9 = "The painted turtle is genetically adapted to survive" +
                " extended periods of subfreezing temperatures with blood that can remain" +
                " supercooled and skin that resists penetration from ice crystals in the" +
                " surrounding ground.";
        final String paintedTurtle10 = "All ages bask for warmth, often alongside other " +
                "species of turtle. Sometimes more than 50 individuals are seen on one" +
                " log together.";
        final String paintedTurtle11 = "The turtle starts its day at sunrise, emerging from the" +
                " water to bask for several hours. Warmed for activity, it returns to the water" +
                " to forage. After becoming chilled, the turtle re-emerges for one to two more" +
                " cycles of basking and feeding.[61] At night, the turtle drops to the bottom " +
                "of its water body or perches on an underwater object and sleeps";
        final String paintedTurtle12 = "To thrive, painted turtles need fresh waters with soft" +
                " bottoms, basking sites, and aquatic vegetation. They find their homes in" +
                " shallow waters with slow-moving currents, such as creeks, marshes, ponds," +
                " and the shores of lakes. ";
        final String paintedTurtle13 = "According to a trade data study, painted turtles were" +
                " the second most popular pet turtles after red-eared sliders in the early" +
                " 1990s. As of 2010, most U.S. states allow, but discourage, painted turtle" +
                " pets, although Oregon forbids keeping them as pets, and Indiana prohibits" +
                " their sale.";
        final String paintedTurtle14 = "Painted turtles keep a watch out for predators and" +
                " seek refuge in the water at the first sign of danger. For protection," +
                " they can quickly retract their head and legs into their hard shell.";
        final String paintedTurtle15 = "Female painted turtles are able to store various sets" +
                " of sperm after mating, so a single clutch of eggs may have been fertilised" +
                " by several males.";

        List<String> paintedTurtles = Arrays.asList(paintedTurtle1, paintedTurtle2, paintedTurtle3,
                paintedTurtle4, paintedTurtle5, paintedTurtle6, paintedTurtle7, paintedTurtle8,
                paintedTurtle9, paintedTurtle10, paintedTurtle11, paintedTurtle12, paintedTurtle13,
                paintedTurtle14, paintedTurtle15);
        ency.put("Painted Turtle", paintedTurtles);

        //Snowshoe hare, from wikipedia, national geographic
        final String snowshoeHare1 = "The snowshoe hare (Lepus americanus), also called the " +
                "varying hare, or snowshoe rabbit, is a species of hare found in North America." +
                " It has the name \"snowshoe\" because of the large size of its hind feet. The" +
                " animal's feet prevent it from sinking into the snow when it hops and walks. " +
                "Its feet also have fur on the soles to protect it from freezing temperatures.";
        final String snowshoeHare2 = "For camouflage, its fur turns white during the winter " +
                "and rusty brown during the summer. Its flanks are white year-round. The " +
                "snowshoe hare is also distinguishable by the black tufts of fur on the edge" +
                " of its ears. Its ears are shorter than those of most other hares.";
        final String snowshoeHare3 = "The snowshoe hare may have up to four litters in a year" +
                " which average three to eight young. Males compete for females, and" +
                " females may breed with several males.";
        final String snowshoeHare4 = "Snowshoe hares are primarily found in boreal forests" +
                " and upper montane forests; within these forests, they favor habitats" +
                " with a dense shrub layer.";
        final String snowshoeHare5 = "They are shy and secretive and spend most of the day in" +
                " shallow depressions, called forms, scraped out under clumps of ferns, brush" +
                " thickets, and downed piles of timber. ";
        final String snowshoeHare6 = "Litters average three to five leverets depending on" +
                " latitude, elevation, and phase of population cycle, ranging from one to seven.";
        final String snowshoeHare7 = "Succulent green vegetation is consumed when available " +
                "from spring to fall; after the first frost, buds, twigs, evergreen needles," +
                " and bark form the bulk of snowshoe hare diets until spring greenup. Snowshoe" +
                " hares typically feed at night and follow well-worn forest paths to feed on" +
                " various plants and trees.";
        final String snowshoeHare8 = "The snowshoe hare is a major prey item for a number of " +
                "predators. Major predators include Canada lynx, bobcats, fishers, American " +
                "martens, long-tailed weasels, minks, foxes), coyote, domestic dogs, domestic" +
                " cats, wolves, mountain lions, great horned owls, barred owls, spotted" +
                " owls, other owls, red-tailed hawks, northern goshawks, other hawks, golden" +
                " eagles, and crows and ravens.";
        final String snowshoeHare9 = "Hares are carnivorous under the availability of " +
                "dead animals, and have been known to eat dead rodents such as mice due " +
                "to low availability of protein in a herbivorous diet.";
        final String snowshoeHare10 = "The aptly named snowshoe hare has particularly " +
                "large feet and a winter-white coat. In the summer though, their fur " +
                "turns brown, taking up to ten weeks to change color completely.";
        final String snowshoeHare11 = "These animals are nimble and fast, which is fortunate," +
                " because they are a popular target for many predators.";
        final String snowshoeHare12 = "Young hares, called leverets, require little care from" +
                " their mothers and can survive on their own in a month or less.";
        final String snowshoeHare13 = "They can live up to 3 years in the wild.";

        List<String> snowshoeHares = Arrays.asList(snowshoeHare1, snowshoeHare2, snowshoeHare3,
                snowshoeHare4, snowshoeHare5, snowshoeHare6, snowshoeHare7, snowshoeHare8,
                snowshoeHare9, snowshoeHare10, snowshoeHare11, snowshoeHare12, snowshoeHare13);
        ency.put("Snowshoe Hare", snowshoeHares);

        //Barred Owl, from wikipedia, national geographic
        final String barredOwl1 = "The barred owl (Strix varia), or northern barred owl, " +
                "is a true owl (owls of the family Strigidae) native to eastern North America.";
        final String barredOwl2 = "Adults are large, and are brown to grey with barring on the" +
                " chest.";
        final String barredOwl3 = "Their diet consists mainly of small mammals, but they" +
                " are also known to prey upon other small animals such as birds, reptiles," +
                " and amphibians";
        final String barredOwl4 = "It is the only true owl of the eastern United States" +
                " which has brown eyes; all others have yellow eyes. ";
        final String barredOwl5 = "This widespread woodland owl dozes by day on a well-hidden" +
                " perch but seldom relies on its good camouflage to avoid harm. Instead," +
                " it flies away at the least disturbance, seldom tolerating close approach.";
        final String barredOwl6 = "Flight is heavy and direct, with slow, methodical" +
                " wingbeats; occasionally makes long, direct glides.";
        final String barredOwl7 = "The barred owl is highly vocal, with a wide range of calls." +
                " Much more likely than other owls to be heard in the daytime. Its most " +
                "common vocalization is a rhythmic series of loud hoot or whoo notes: " +
                "who-cooks-for-you, who-cooks-for-you-all.";
        final String barredOwl8 = "When agitated, this species will make a buzzy, rasping " +
                "hiss and click its beak together forcefully. While calls are most common" +
                " at night, the birds do call during the day as well.";
        final String barredOwl9 = "These owls have few predators, but young, unwary owls may" +
                " be taken by cats. The most significant predator of barred owls is the" +
                " great horned owl.";
        final String barredOwl10 = "The barred owl has been known to live up to 10 years" +
                " in the wild and 23 years in captivity.";
        final String barredOwl11 = "If a nest site has proved suitable in the past they " +
                "will often reuse it as the birds are non-migratory.";
        final String barredOwl12 = "On 5 April 2007, White House officials announced a U.S." +
                " Fish and Wildlife Service proposal to shoot barred owls to reduce the" +
                " threat they pose to the spotted owl.";

        List<String> barredOwls = Arrays.asList(barredOwl1, barredOwl2, barredOwl3, barredOwl4,
                barredOwl5, barredOwl6, barredOwl7, barredOwl8, barredOwl9, barredOwl10,
                barredOwl11, barredOwl12);
        ency.put("Barred Owl", barredOwls);

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
