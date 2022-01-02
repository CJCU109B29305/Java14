import java.io.*;

public class Class07 {
    public static void main(String[] argv) throws IOException {
        int line = 0;
        String s;
        FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Java14\\abc.txt");
        BufferedReader bf = new BufferedReader(fr);

        while ((s = bf.readLine()) != null) {
            if (line == 1)
                bf.skip(14);
            System.out.println(s);
            line++;
        }
        fr.close();
    }
}
