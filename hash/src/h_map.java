import java.util.*;
public class h_map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("us", 30);
        map.put("russia", 20);
        System.out.println(map);


//        if(map.containsKey("us")){
//            System.out.println("present");
//        }else{
//            System.out.println("absent");
//        }

//        System.out.println(map.get("us"));
//        System.out.println(map.get("china"));
        // for (int val: arr){
//    }
//        for(Map.Entry<String , Integer> e:map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
        Set<String> keys= map.keySet();
        for(String key: keys){
            System.out.println(key+ " "+map.get(key));
        }
    }

    



}
