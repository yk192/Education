//Сумма элементов массива и среднее арифметическое.

package tasks;
import java.util.*;
public class Program5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner (System.in);
		System.out.print("Количество элементов массива: ");
		int a = sc.nextInt();
		double result = 0;
		int [] mas = new  int [a];
		System.out.print("Массив: ");
		
		
		for (int i = 0; i < mas.length; i++ ){
			mas[i] =(int)( Math.random()*10);
			System.out.print(mas[i]+" ");
			result +=mas[i];
		}
		System.out.println();
		System.out.println("Сумма элементов массива: "+result);
		System.out.println("Среднее арифметическое: "+result/mas.length);
	}

}
