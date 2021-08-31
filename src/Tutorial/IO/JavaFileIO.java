package Tutorial.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFileIO {
    public static void main(String[] args) {
        //write value to file
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\VINH\\IdeaProjects\\File\\output.txt"));
            bw.write("hello\n");
            bw.write("world");
            bw.close();
        }catch(Exception ex) {
            return;
        }
        //read File
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\VINH\\IdeaProjects\\File\\outputread.txt"));
            String s;
            while((s = br.readLine()) != null ) {
                System.out.println(s);
            }
            br.close();
        }catch (Exception ex) {
            return;
        }
        // Copy File
        try {
            BufferedWriter bwCopy = new BufferedWriter(
                    new FileWriter("C:\\Users\\VINH\\IdeaProjects\\File\\outputread-copy.txt"));
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\VINH\\IdeaProjects\\File\\outputread.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                bwCopy.write(s + "\n");
            }
            br.close();
            bwCopy.close();
        }catch(Exception ex) {
            return;
        }
    }
}
