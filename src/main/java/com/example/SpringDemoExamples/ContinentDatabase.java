package com.example.SpringDemoExamples;

import java.util.*;

public class ContinentDatabase {

    HashMap<String, String> database = new HashMap<>();
    ArrayList<User> users = new ArrayList<>();

    public ContinentDatabase() {

        database.put("India", "Asia");
        database.put("Germany", "Europe");
        database.put("Australia","Australia");
        database.put("South Africa","Africa");
        database.put("USA","North America");

        users.add(new User(1,"George",31));
        users.add(new User(2,"Lily",21));

    }

    public String getContinent(String c) {
        return database.get(c);
    }

    public boolean addUser(User u) {
        users.add(u);
        return true;
    }

    public List<User> getAllUsers() {
        return users;
    }
}
