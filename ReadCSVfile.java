package com.pcwk.ehr.projectcrud;
//Read CSVfile Code

import java.util.*;
import java.io.*;

public class ReadCSVfile {

    public static List<Restaurant> loadRestaurants(String filename) {
        List<Restaurant> restaurantList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine(); // 첫 줄 (헤더) 무시
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                double rating = Double.parseDouble(data[1]);
                String menu = data[2];
                int cost = Integer.parseInt(data[3]);

                restaurantList.add(new Restaurant(name, rating, menu, cost));
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
        return restaurantList;
    }
}
