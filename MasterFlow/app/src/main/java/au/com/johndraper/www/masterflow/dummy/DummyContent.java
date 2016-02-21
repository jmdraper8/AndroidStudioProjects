package au.com.johndraper.www.masterflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    static {
        // Add some sample items.
        addItem(new DummyItem("1", "Google", "http://www.google.com"));
        addItem(new DummyItem("2", "Yahoo", "http://www.yahoo.com"));
        addItem(new DummyItem("3", "CNN", "http://www.cnn.com"));
        addItem(new DummyItem("4", "BBC", "http://www.bbc.com"));
        addItem(new DummyItem("5", "Digg", "http://www.digg.com"));
        addItem(new DummyItem("6", "HackerNews", "http://www.hackernews.com"));


    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String webPageName;
        public final String webPageURL;

        public DummyItem(String id, String webPageName, String webPageURL) {
            this.id = id;
            this.webPageName = webPageName;
            this.webPageURL = webPageURL;
        }

        @Override
        public String toString() {
            return webPageName;
        }
    }
}
