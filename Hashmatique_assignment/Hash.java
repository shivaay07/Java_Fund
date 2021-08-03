import java.util.HashMap;
import java.util.Set;
public class Hash {
    public void hashMatique() {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("song1", "lyrics1");
        trackList.put("song2", "lyrics2");
        trackList.put("song3", "lyrics3");
        trackList.put("song4", "lyrics4");
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key  + ":" + trackList.get(key));
            // System.out.println(key);
            // System.out.println(trackList.get(key));
        }
        // System.out.println(trackList.get("song1"));
    }
}