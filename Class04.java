import java.io.*;

public class Class04 {
    public static void main(String[] argv) throws IOException {
        char a[] = new char[100]; // 可讀入100個字
        // 讀入文字檔 中文為亂碼
        FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Java14\\abc.txt");

        int num = fr.read(a); // 計數
        String s = new String(a, 0, num); // (String,int,int) (字串,第1位,末位)
        System.out.println("Characters read = " + num);
        System.out.println(s);

        fr.close();
    }
}
