package Lesson4;

import java.math.BigInteger;
import java.util.HashMap;


public class Phonebook {
    private HashMap<String,String> HashMap = new HashMap<>();

    public void add(String phone, String fio){
        HashMap.put(phone,fio);
    }

    public String getPhone(String fio){
        if(HashMap.containsValue(fio)){
            String result = "By FIO - " + fio + ", phone numbers found: ";
            for(String phone: HashMap.keySet()){
                if(HashMap.get(phone).equals(fio)) result = result + phone + ", ";
            }
            return result;
        } else return "No phone numbers in phonebook";

    }

}
