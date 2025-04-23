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
                String resName = data[0];
                String rmenuName = data[1];
                int rmenuCost = Integer.parseInt(data[2]);
                double rating = Double.parseDouble(data[3]);
                int distance=Integer.parseInt(data[4]);
                String breakday=data[5];

                restaurantList.add(new Restaurant(resName,rmenuName,rmenuCost,rating,distance,breakday));
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
        return restaurantList;
    }
}
