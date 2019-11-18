package Sevice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryIpm implements Dictionary {
    static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chao");
        dictionary.put("book", "sach");
        dictionary.put("cat", "meo");
    }


    @Override
    public String translate(String eng) {
        String result = dictionary.get(eng);
        return result;
    }
}
