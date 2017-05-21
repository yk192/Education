//Максимум четырех чисел
//Ввести с клавиатуры четыре числа, и вывести максимальное из них.
//Если числа равны между собой, необходимо вывести любое.

package tasks;
import java.io.*;
public class Program11 {
	public static void main(String[] args) throws IOException {
//Ввод чисел с клавиатуры		
		 BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		 	System.out.print("Введите первое число: ");
	        String  s = reader.readLine();
	        System.out.print("Введите второе число: ");
	        String  s1 = reader.readLine();
	        System.out.print("Введите третье число: ");
	        String  s2 = reader.readLine();
	        System.out.print("Введите четвертое число: ");
	        String  s3 = reader.readLine();
//Преобразование String в int	        
	        int a = Integer.parseInt(s);
	        int a1 = Integer.parseInt(s1);
	        int a2 = Integer.parseInt(s2);
	        int a3 = Integer.parseInt(s3);
	        System.out.println(Program11.max(a, a1));
//Поиск максимального из 4 чисел	        
	        if(Program11.max(a,a1)>Program11.max(a2, a3)){
	            System.out.print(Program11.max(a,a1));
	        }
	        else if (Program11.max(a,a1)==Program11.max(a2, a3)){
	            System.out.print(Program11.max(a,a1));
	        }
	        else{
	            System.out.print(Program11.max(a2, a3));
	        }
	        
	    }
//Статисческий метод для определения максимального из двух чисел
	    public static int max(int a, int b){
	        if(a>b){
	            return a;
	        }
	        else{
	            return b;
	        }
	    }
	}