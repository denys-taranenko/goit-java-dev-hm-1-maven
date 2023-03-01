package org.goit;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main {
    public static void main( String[] args ) {

        String name = "Denys";
        String lastName = "Taranenko";

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("lastName", lastName);

        Gson gson = new Gson();
        String json = gson.toJson(jsonObject);

        System.out.println(json);
    }
}
