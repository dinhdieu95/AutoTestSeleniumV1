package run.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> populationByCity = new LinkedHashMap<>();

        // Thêm cặp khóa-giá trị vào LinkedHashMap
        populationByCity.put("New York", 8537673);
        populationByCity.put("Los Angeles", 3979576);
        populationByCity.put("Chicago", 2704958);

        // Truy xuất giá trị bằng khóa
        int population = populationByCity.get("Los Angeles");
        System.out.println("Dân số của Los Angeles là: " + population);

        // Xóa một cặp khóa-giá trị
        populationByCity.remove("Chicago");

        // Duyệt qua các cặp khóa-giá trị trong LinkedHashMap
        for (Map.Entry<String, Integer> entry : populationByCity.entrySet()) {
            String city = entry.getKey();
            int cityPopulation = entry.getValue();
            System.out.println("Dân số của " + city + " là: " + cityPopulation);
        }
    }
}
