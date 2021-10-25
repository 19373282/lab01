import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        Vector<String> output = new Vector<String>();
        index = 0;
        row = 1;
        String tempString;
        try {

            while ((tempString = stdin.readLine()) != null) {
                    System.out.println(tempString);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
      
    }
}
