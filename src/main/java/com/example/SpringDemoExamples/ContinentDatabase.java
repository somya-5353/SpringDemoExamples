package com.example.SpringDemoExamples;

import java.util.HashMap;

public class ContinentDatabase {

    HashMap<String, String> database = new HashMap<>();

    public ContinentDatabase() {

        database.put("India", "Asia");
        database.put("Germany", "Europe");
        database.put("Australia","Australia");
        database.put("South Africa","Africa");
        database.put("USA","North America");
    }

    public String getContinent(String c) {
        return database.get(c);
    }
}
