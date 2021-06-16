import java.util.*;
public class HashMapTest {
    public static void main(String[] args){
        HashMap<String,String>trackList  = new HashMap<String,String>();
            trackList.put("hello","helloowwwwwwwwww");
            trackList.put("hey","heyyyyyyyyyyyyyyy");
            trackList.put("bow","bowwwwwwwwwwwwwww");
            trackList.put("show","showwwwwwwwwwwwww");
            System.out.println(trackList.get("hello"));
            for(String song : trackList.keySet())
                System.out.println("song name :"  + song +"and the lyrics is:"+ trackList.get(song));
    }
}