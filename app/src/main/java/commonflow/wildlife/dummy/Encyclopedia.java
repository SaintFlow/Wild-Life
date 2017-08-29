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
        final  String coyote7 = "They can live alone, or in pairs. And when they are up against a " +
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
        final  String coyote12 = "Coyotes pose danger to livestock such as sheep. Coyotes have " +
                "been hunted by men, and the death tolls can reach 500 000 per yer. Remarkably," +
                "the coyote have still successfully survived, unlike wolf populations";
        final  String coyote13 = "Pups instinctively become limp when picked up. They are carried " +
                "to the den when danger arrives, or when the pack needs to go home.";
        final String coyote14 = "Coyotes and badgers have been known to work as a team and " +
                "hunt cooperatively when hunting small rodents. The badger is a much better and " +
                "faster digger, while the coyote has much butter hearing for finding rodents " +
                "underground";

        //Seagull strings, from Wikipedia;
        // http://www.softschools.com/facts/animals/seagull_facts/695/
        final  String seagull1 = "Sea gulls like freshwater, but they’ll drink sea water. " +
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

        //Raccoon strings, taken from livescience.com; https://onekindplanet.org/animal/raccoon/
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

        ency.put("Squirrel", squirrels);

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
        groundhogs.add(groundhog1); groundhogs.add(groundhog2); groundhogs.add(groundhog3);
        groundhogs.add(groundhog4); groundhogs.add(groundhog5); groundhogs.add(groundhog6);
        groundhogs.add(groundhog7); groundhogs.add(groundhog8); groundhogs.add(groundhog9);
        groundhogs.add(groundhog10); groundhogs.add(groundhog11); groundhogs.add(groundhog12);
        groundhogs.add(groundhog13); groundhogs.add(groundhog14); groundhogs.add(groundhog15);
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
        americanMinks.add(americanMink1); americanMinks.add(americanMink2);
        americanMinks.add(americanMink3); americanMinks.add(americanMink4);
        americanMinks.add(americanMink5); americanMinks.add(americanMink6);
        americanMinks.add(americanMink7); americanMinks.add(americanMink8);
        americanMinks.add(americanMink9); americanMinks.add(americanMink10);
        americanMinks.add(americanMink11); americanMinks.add(americanMink12);
        americanMinks.add(americanMink13); americanMinks.add(americanMink14);
        ency.put("Mink", americanMinks);

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
        opossums.add(opossum1); opossums.add(opossum2); opossums.add(opossum3);
        opossums.add(opossum4); opossums.add(opossum5); opossums.add(opossum6);
        opossums.add(opossum7); opossums.add(opossum8); opossums.add(opossum9);
        opossums.add(opossum10); opossums.add(opossum11); opossums.add(opossum12);
        opossums.add(opossum13);
        ency.put("Opossum", opossums);

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
        redFoxes.add(redFox1); redFoxes.add(redFox2); redFoxes.add(redFox3);
        redFoxes.add(redFox4); redFoxes.add(redFox5); redFoxes.add(redFox6);
        redFoxes.add(redFox7); redFoxes.add(redFox8); redFoxes.add(redFox9);
        redFoxes.add(redFox10); redFoxes.add(redFox11); redFoxes.add(redFox12);
        redFoxes.add(redFox13); redFoxes.add(redFox14);

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
        skunks.add(skunk1); skunks.add(skunk2); skunks.add(skunk3); skunks.add(skunk4);
        skunks.add(skunk5); skunks.add(skunk6); skunks.add(skunk7); skunks.add(skunk8);
        skunks.add(skunk9); skunks.add(skunk10); skunks.add(skunk11); skunks.add(skunk12);

        ency.put("Skunk", skunks);
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
