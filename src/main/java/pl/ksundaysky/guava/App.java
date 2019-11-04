package pl.ksundaysky.guava;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class App {

    public static void main(String[] args) {
        simpleJoiner();
        simpleJoinerWithNulls();
        mapJoiner();
    }

    private static void simpleJoiner(){
        List<String> strings = List.of("java","google","guava","training");
        String result = Joiner.on(",").skipNulls().join(strings);
        String expected = "java,google,guava,training";
        assertEquals(expected,result);
    }
    private static void simpleJoinerWithNulls(){
        List<String> strings = new ArrayList<>();
        strings.add("java");
        strings.add("google");
        strings.add("guava");
        strings.add(null);
        strings.add("training");
        String result = Joiner.on(",").useForNull("null value").join(strings);
        String expected = "java,google,guava,null value,training";
        assertEquals(expected,result);
    }


    private static void mapJoiner() {
        // Initialising Guava LinkedHashMap Collection
        Map<String, String> myMap = Maps.newLinkedHashMap();
        myMap.put("Microsoft", "Bill Gates");
        myMap.put("Apple", "Steve Jobs");
        String delimiter = "#";
        String separator = "=";
        String result = Joiner.on(delimiter).withKeyValueSeparator(separator).join(myMap);
        String expected = "Microsoft=Bill Gates#Apple=Steve Jobs";
        assertEquals(result,expected);
    }
}
