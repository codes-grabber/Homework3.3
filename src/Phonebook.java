import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    String secondName;
    String phone;


    public Phonebook() {
    }

    static Map<String, String> phonebook = new HashMap<>();

    public static void add(String secondName, String phone){
        phonebook.put(phone, secondName);
    }

    public static void get(String secondName){
        phonebook.forEach((key, value) ->
                {
                    if (value == secondName) {
                        System.out.println(key);
                    }
                }
                );

    }
}
