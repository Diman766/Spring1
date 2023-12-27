package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Dmitriy", "Ivanov", 41);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        Person read = gson.fromJson(json, Person.class);
        System.out.println(read);
    }
}