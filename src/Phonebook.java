import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public static List get(String secondName){
        List <String> getNumbers = new ArrayList<>();
        phonebook.forEach((key, value) ->
                {
                    if (value == secondName) {
                        getNumbers.add(key);
                    }
                }
                );
        return getNumbers;

    }
}
