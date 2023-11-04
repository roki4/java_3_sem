package practice_19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Тестирование класса ArrayHolder
        Integer[] intArray2 = {0, 1, 2, 3, 4, 5};
        ArrayHolder<Integer> arrayHolder = new ArrayHolder<>(intArray2);
        System.out.println(arrayHolder.getElement(2));
        String[] stringArray2 = {"Hello", "World"};
        ArrayHolder<String> stringArrayHolder = new ArrayHolder<>(stringArray2);
        System.out.println(stringArrayHolder.getElement(1));

        // Тестирование метода arrayToList
        String[] stringArray = {"Hello", "World"};
        List<String> stringList = Solution.arrayToList(stringArray);
        System.out.println(stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = Solution.arrayToList(intArray);
        System.out.println(intList);

        // Тестирование функции listDirectory
        String directoryPath = "C:/Users/etern/test_java";
        List<String> fileList = DirectoryLister.listDirectory(directoryPath);
        for (int i = 0; i < 5 && i < fileList.size(); i++) {
            System.out.println(fileList.get(i));
        }

        // Тестирование вспомогательных методов в классе Solution
        ArrayList<String> stringList2 = Solution_2.newArrayList("Hello", "World");
        System.out.println(stringList2);

        HashSet<Integer> intSet = Solution_2.newHashSet(1, 2, 3, 4, 5);
        System.out.println(intSet);

        HashMap<String, Integer> map = Solution_2.newHashMap("Ключ", 15);
        System.out.println(map);
    }
}