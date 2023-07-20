import java.io.*;
import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        /*1*/
        File Dir = new File("C:\\Users\\Viktor\\IdeaProjects\\QA-Automation\\Homework13\\TextDir");
        boolean TextDir= Dir.mkdir();
        if(TextDir)System.out.println("TextDir created");
        File file1 = new File("C:\\Users\\Viktor\\IdeaProjects\\QA-Automation\\Homework13\\TextDir\\text1.txt");

        try {
            boolean TestFile = file1.createNewFile();
            if (TestFile) {
                System.out.println("text1 created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter pw = new PrintWriter(file1);
        pw.println("Hello word");
        pw.close();

        FileReader reader = new FileReader(
                "C:\\Users\\Viktor\\IdeaProjects\\QA-Automation\\Homework13\\TextDir\\text1.txt");



        FileWriter file2 = new FileWriter(
                "C:\\Users\\Viktor\\IdeaProjects\\QA-Automation\\Homework13\\TextDir\\text2.txt");

        while (reader.ready()) {
            int c = reader.read();
            file2.write(c);
        }
        reader.close();
        file2.close();


//        if(file1.delete()){
//            System.out.println("File1 delete");
//        }
//
//        boolean success = (new File("C:\\Users\\Viktor\\IdeaProjects\\QA-Automation\\Homework13\\TextDir\\text2.txt")).delete();
//        if (success) {
//            System.out.println("File2 delete");
//        }
//
//        if(Dir.delete()){
//            System.out.println("Dir delete");
//        }

        /*2*/
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cat.data"))) {
//            Cat cat = new Cat("Barsik", 2);
//            oos.writeObject(cat);
//
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }

//        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("cat.data"))) {
//            Cat cat = (Cat) oos.readObject();
//            System.out.println(cat);
//
//        } catch (IOException|ClassNotFoundException e){
//            throw new RuntimeException(e);
//        }

    }
}