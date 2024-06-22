package io.smartir.leetcode.DSA.easy;

import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public interface App {
    ConcurrentHashMap<String, Long> list = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        Stream.generate(System::nanoTime)
                .limit(1_000_000)
                .parallel()
                .forEach(App::add);

        var jsonString = """
                    {
                    "payload":"jimi"
                    }            
                """.transform(App::toJSON);
        var json = new JSONObject(jsonString);
        System.out.println(jsonString);

    }

    static void add(long number){
        list.computeIfAbsent("the-one", (k) -> number);
    }

    static JSONObject toJSON(String given) {
        return new JSONObject(given);
    }

}
