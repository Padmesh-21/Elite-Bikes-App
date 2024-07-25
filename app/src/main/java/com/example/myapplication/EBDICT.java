package com.example.myapplication;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EBDICT {
    // mail,ph no,password
    private static Map<String, String[]> dict;
    static {
        dict = new HashMap<>();
        dict.put("EBAI", new String[]{"abc@gmail.com", "4206942069", "12345678","a","b","c"});
        dict.put("Mohan", new String[]{"gmohan@gmail.com", "9384629418", "12345678","a","b","c"});
        dict.put("Padmesh", new String[]{"vapadmesh@gmail.com", "8122966082", "12345678","a","b","c"});
        dict.put("Pranav", new String[]{"vpranav@gmail.com", "9840985025", "12345678","a","b","c"});

    }
    public static Map<String, String[]> getDictionary() {
        return dict;
    }
    public static void putValue(String key, String[] value) {
        dict.put(key, value);
    }

    // Public method to remove an entry from the dictionary
    public static void removeValue(String key) {
        dict.remove(key);
    }
    public static String[] getValue(String key) {
        return dict.get(key);
    }
    public static boolean containsK(String key){
        return dict.containsKey(key);
    }
    public static boolean containsv(String key){
        for (Map.Entry<String, String[]> entry : dict.entrySet()) {
            if (Arrays.asList(entry.getValue()).contains(key)) {
                return true;
            }
        }
        return false;
    }


}
