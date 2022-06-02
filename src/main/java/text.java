import java.io.*;
public class text {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        byte b;
        String str = br.readLine();
        b = Byte.parseByte(str);
        System.out.println(b);
        b = Byte.parseByte(str);
        System.out.println(b);

    }
}

