import java.io.*;

public class inputStream {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(reader);
        try {
            System.out.print("Enter your text: ");
            String input = stdin.readLine();
            System.out.println("------------------");
            System.out.println("Your text is \"" + input + "\"");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
