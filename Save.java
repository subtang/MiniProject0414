package com.pcwk.ehr.projectcrud;

import java.io.*;
import java.util.*;
import org.apache.logging.log4j.*;

import com.pcwk.ehr.ed01.*;

//Savecode
public class Save {
	static final Logger LOG=LogManager.getLogger(Main.class);
	public String getResName() {
		return getResName();
	}

	public double getRating() {
		return getRating();
	}

	public String getRmenuName() {
		return getRmenuName();
	}

	public int getRmenuCost() {
		return getRmenuCost();
	}

	public int getDistance() {
		return getDistance();
	}

	public String getBreakDay() {
		return getBreakDay();
	}

	public static void saveRestaurants(String filename, List<Restaurant> restaurantList) {
		filename = "D:\\JAP_20250317\\01_JAVA\\workspace\\JMember\\data\\restaurantListHong_edit - 시트1 (1).csv";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

			bw.write("resName,RmenuName,RmenuCost,rating,distance,breakDay");
			bw.newLine();

			for (Restaurant r : restaurantList) {
				String line = String.format("%s,%s,%d,%.2f,%d,%s", r.getResName(), r.getRmenuName(), r.getRmenuCost(),
						r.getRating(), r.getDistance(), r.getBreakDay());
				bw.write(line);
				bw.newLine();
			}
			System.out.println("저장 완료!");
		} catch (IOException e) {
			LOG.error("파일 저장 오류: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


