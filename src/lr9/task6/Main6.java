package src.lr9.task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main6 {

    public static void main(String[] args) {
        HashMap<Integer, String> stringHashMap = new HashMap<>();

        stringHashMap.put(0, "qwe");
        stringHashMap.put(1, "asdfgh");
        stringHashMap.put(2, "asd");
        stringHashMap.put(3, "zxczxxvz");
        stringHashMap.put(4, "zzzzzzz");
        stringHashMap.put(5, "a");
        stringHashMap.put(6, "sss");
        stringHashMap.put(7, "bbvvc");
        stringHashMap.put(8, "tyu");
        stringHashMap.put(9, "mdfbxc");
        stringHashMap.put(10, "24taes");

        Set<Integer> keys = stringHashMap.keySet();
        ArrayList<String> values = new ArrayList<>(stringHashMap.values());
        int total = 1;
        for (int key: keys) {
            String value = stringHashMap.get(key);
            if (key > 5) {
                System.out.printf("%d: %s\n",key, value);
            }
            else if (key == 0) {
                String result = String.join(", ", values);
                System.out.printf("%d: %s\n",key, result);;
            }
            if (value.length() > 5) {
                total *= key;
            }
        }

        System.out.printf("Результат умножения ключей: %d", total);
    }
}

/*
Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ> 5.
Если ключ = 0, вывести строки через запятую.
Перемножить все ключи, где длина строки>5.
*/