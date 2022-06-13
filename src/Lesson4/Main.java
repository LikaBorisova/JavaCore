package Lesson4;

import java.util.*;

public class Main {

    public static String s = "apple apple orange fruit apple grapefruit apple kiwi banan banan banan lemon apple pearch ananas";
    public static String[] words = s.split("\\W+");
    public static List<String> stringArrayList = Arrays.asList(words);

    public static void main(String[] args) {

        System.out.println("List size=  " + stringArrayList.size());
        HashSet<String> targetSet = new HashSet<>(stringArrayList);
        System.out.println("Set size=  " + targetSet.size());

        HashMap<String,Integer> result = new HashMap<>();
        for(String str: targetSet){
            result.put(str,count(str));
        }
        System.out.println(result);
    }

    public static Integer count(String str){
        Integer result = 0;
        for(String strThis : stringArrayList){
            if(strThis.equals(str)) result++;
        }
        return result;
    }
}
