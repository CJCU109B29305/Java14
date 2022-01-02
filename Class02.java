import java.util.*;

public class Class02 {
    public static void main(String[] argv) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入一個字串: ");
        s = sc.nextLine();
        System.out.println("轉大寫: " + s.toUpperCase());
        sc.close();
    }
}