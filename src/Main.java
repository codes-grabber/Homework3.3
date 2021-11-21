import java.util.*;

public class Main {
    public static void main(String[] args) {

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
// из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(
                "Дима",
                "Вася",
                "Дима",
                "Петя",
                "Катя",
                "Борис",
                "Алла",
                "Дима",
                "Катя",
                "Валерий"
        ));

        Map<String, Integer> dublicate = new HashMap<>();

        words.forEach(name ->
                dublicate.put(name, dublicate.getOrDefault(name, 0) + 1 ));
        System.out.println(dublicate);

// 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер
// телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов, тогда при запросе такой
// фамилии должны выводиться все телефоны.

        Phonebook.add("Shcherbinin", "9171400798");
        Phonebook.add("Krahmalni", "9175548");
        Phonebook.add("Krahmalni", "000000000");

        System.out.println(Phonebook.phonebook);

        Phonebook.get("Krahmalni");

    }


}

