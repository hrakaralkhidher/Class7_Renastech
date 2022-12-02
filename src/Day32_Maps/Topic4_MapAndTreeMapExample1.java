package Day32_Maps;

import java.util.HashMap;

public class Topic4_MapAndTreeMapExample1 {
    public static void main(String[] args) {


    /*
    Modify and return the given map as follows:
     if the key "a" has a value,
      set the key "b" to have that value,
       and set the key "a" to have the value "".
     Basically "b" is a bully, taking the value and replacing it with the empty string.

    mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}

    mapBully({"a": "candy"}) → {"a": "", "b": "candy"}

    mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
         */
        HashMap<String, String> MyHashMap = new HashMap<>();
        //{"a": "candy", "b": "dirt"}
        MyHashMap.put("a","candy");
        MyHashMap.put("b","carrot");
        MyHashMap.put("c","meh");
        System.out.println(MyHashMap);

//        HashMap<String, String> MybulliedHashMap = mapBully(MyHashMap);//same as the bottom
//        System.out.println(MybulliedHashMap);

        System.out.println("************************");

        System.out.println(mapBully(MyHashMap));
    }
    //please create a method that takes a hashmap as parameter
    //return type = hashmap
    //MethodName = mapBully
    public static HashMap<String, String> mapBully(HashMap<String, String> param1) {
        //        containsKey(Key) - Checks if the specified key K is present in the map or not.
        //if the key "a" has a value
        if(param1.containsKey("a")){
            //set the key "b" to have that value and set the key "a" to have the value "".
            String ValueOfA = param1.get("a");
            param1.put("b",ValueOfA);
            param1.put("a","");
        }
        return param1;
    }
}
