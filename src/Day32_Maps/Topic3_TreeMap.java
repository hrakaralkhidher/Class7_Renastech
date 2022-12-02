package Day32_Maps;

import java.util.TreeMap;

public class Topic3_TreeMap {
    public static void main(String[] args) {
        //DataType VariableName = new DataType();
        TreeMap<String, Integer> ModelYearOfCars = new TreeMap<>();

        ModelYearOfCars.put("Tesla", 2021);
        ModelYearOfCars.put("Volkwagen", 2020);
        ModelYearOfCars.put("Subaru", 2009);
        System.out.println(ModelYearOfCars);

        System.out.println(ModelYearOfCars.keySet());

        System.out.println("***********************************");
///VERY IMPORTANT FOR THE INTERVIEW
        for (String MyKey: ModelYearOfCars.keySet()) {
            System.out.println("Keys : "+MyKey);
//            get(Key) - Returns the value associated with the specified key. If the key is not found, it returns null.
            System.out.println("Value : "+ModelYearOfCars.get(MyKey));

        }

        System.out.println("***********************************");
        System.out.println(ModelYearOfCars.get("BMW"));//==> this will return null
        System.out.println(ModelYearOfCars.getOrDefault("BMW", -1));//==> this will return -1 cuz the BMW doesn't exist in map

    }
}
