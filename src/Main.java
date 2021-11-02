/*
 * @Description: 
 * @version: 
 * @Author: 张怡健
 * @Date: 2021-11-02 08:45:23
 * @LastEditors: 张怡健
 * @LastEditTime: 2021-11-02 08:46:30
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
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
