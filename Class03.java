import java.io.*; //java.io類別庫

public class Class03 {
    public static void main(String args[]) throws IOException { // * 對應需求
        BufferedReader b;
        String s;
        int n, sum = 0;
        b = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("1 + 2 + .... + n 請輸入n值:");
        s = b.readLine(); // * 對應需求
        n = Integer.parseInt(s);
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1 + 2 + .... + " + n + " = " + sum);
    }
}
