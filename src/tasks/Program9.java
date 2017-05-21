//Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
//Если такая пара существует, вывести на экран числа через пробел.
//Если все три числа равны между собой, то вывести все три.

package tasks;

import java.io.*;

public class Program9 {

	public static void main(String[] args) throws Exception {
//Ввод чисел с клавиатуры		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите первое число: ");
		String s = reader.readLine();
		System.out.print("Введите второе число: ");
		String s1 = reader.readLine();
		System.out.print("Введите третье число: ");
		String s2 = reader.readLine();
//Преобразование String в int		
		int a = Integer.parseInt(s);
		int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);        
//Условия        
        
        if((a==a1) & (a==a2) & (a1==a2)){
            System.out.println(a+" "+a1+" "+a2);
            
        }
        else{
        	if(a==a1){
                System.out.println(a+" "+a1);
            }
            else if(a==a2){
                System.out.println(a+" "+a2);
            }
            else if(a1==a2){
                System.out.println(a1+" "+a2);
            }
        }
    }
}