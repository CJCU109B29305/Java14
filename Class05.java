import java.io.*;

public class Class05 {
    public static void main(String[] argv) throws IOException {
        String s;
        FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Java14\\abc.txt");
        BufferedReader bf = new BufferedReader(fr);
        bf.skip(9); // 包含空格
        while ((s = bf.readLine()) != null) {
            System.out.println(s);
        }
        fr.close();
    }
}
