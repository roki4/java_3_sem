package practice_19;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
// сохраняет содержимое каталога в список и выводит первые 5 элементов на экран
public class DirectoryLister {
    public static void main(String[] args) {
        String directoryPath = "C:/Users/etern/test_java";
        List<String> fileList = listDirectory(directoryPath);
        for (int i = 0; i < 5 && i < fileList.size(); i++) {
            System.out.println(fileList.get(i));
        }
    }

    public static List<String> listDirectory(String directoryPath) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    fileList.add(file.getName());
                }
            }
        }
        return fileList;
    }
}
