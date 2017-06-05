package tasks;
import java.io.*;
public class Program17 {

	public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        
        int a = Integer.parseInt(s);
        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);
        
        int b = (a+a1+a2)/3;
        System.out.println(b);
        if(a==a1 && a==a2){
            System.out.println(a);
        }
    }
}