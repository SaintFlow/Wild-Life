package commonflow.wildlife.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import commonflow.wildlife.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new DummyItem("1", "Beaver", "test1", R.drawable.beaver));
        addItem(new DummyItem("2", "Coyote", "test1", R.drawable.coyote));
        addItem(new DummyItem("3", "Eastern Chipmunk", "test3", R.drawable.eastern_chipmunk));
        addItem(new DummyItem("4", "Groundhog", "test3", R.drawable.groundhog));
        addItem(new DummyItem("5", "Mink", "test1", R.drawable.mink));
        addItem(new DummyItem("6", "Opossum", "test1", R.drawable.opossum));
        addItem(new DummyItem("7", "Raccoon", "test1", R.drawable.raccoon));
        addItem(new DummyItem("8", "Red Fox", "test1", R.drawable.red_fox));
        addItem(new DummyItem("9", "Seagull", "test3", R.drawable.seagull));
        addItem(new DummyItem("10", "Skunk", "test3", R.drawable.skunk));
        addItem(new DummyItem("11", "Squirrel", "test2", R.drawable.squirrel));


    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
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

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final int image;

        public DummyItem(String id, String content, String details, int image) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.image = image;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
