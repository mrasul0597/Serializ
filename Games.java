import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Games {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        File file = new File("D://Game//src");
        File file1 = new File("D://Game//res");
        File file2 = new File("D://Game//savegames");
        File file3 = new File("D://Game//temp");
        if (file.mkdir() & file1.mkdir() & file2.mkdir() & file3.mkdir()) {
            System.out.println(" file созданы ");
            text.append("file созданы; ");
        } else {
            System.out.println("Ошибка в создании file");
            text.append("Ошибка в создании file; ");
        }

        File file4 = new File(file, "main");
        File file5 = new File(file, "test");
        if (file4.mkdir() & file5.mkdir()) {
            System.out.println("file 4 & 5 готовы");
            text.append("file 4 & 5 готовы; ");
        } else {
            System.out.println("file 4 & 5 ошибка");
            text.append("file 4 & 5 ошибка; ");
        }
        File fileJava1 = new File(file4, "Main.java");
        File fileJava2 = new File(file4, "Utils.java");
        try {
            if (fileJava1.createNewFile() & fileJava2.createNewFile()) {
                System.out.println("fileJava были созданы");
                text.append("fileJava были созданы; ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File file6 = new File(file1, "drawables");
        File file7 = new File(file1, "vectors");
        File file8 = new File(file1, "icons");
        if (file6.mkdir() & file7.mkdir() & file8.mkdir()) {
            System.out.println("file 6-8 созданы");
            text.append("file 6-8 созданы; ");
        } else {
            System.out.println("file 6-8 ошибка");
            text.append("file 6-8 ошибка; ");
        }

        File fileTXT = new File(file3, "temp.txt");
        try {
            if (fileTXT.createNewFile()) {
                System.out.println("fileTXT создан");
                text.append("fileTXT создан; ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("fileTXT ошибка");
            text.append("fileTXT ошибка; ");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileTXT))) {
            bw.write(String.valueOf(text));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
