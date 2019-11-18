package Sevice;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryIpm implements Dictionary {
    public static Map<String, String> dictionary = new HashMap<>();

    public static {
        dictionary.put("hello", "xin chao");
        dictionary.put("book", "sach");
        dictionary.put("cat", "meo");
    }


    @Override
    public String translate(String eng) {
        /*need handle exception here*/
        return dictionary.get(eng);
    }
}
