//Элементы массива, которые делятся на 3 или 9
//Элементы массива, которые делятся на 5 или 10

package tasks;
import java.util.*;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Количество элементов массива: ");
		int a = sc.nextInt();
		int mas[] = new int[a];
//Заполнение массива случайными числами		
		System.out.print("Массив: ");
		for (int i = 0; i<mas.length; i++){
			mas[i] = (int)(Math.random()*100);
			System.out.print(mas[i]+" ");
		}
//Числа, котлорые делятся на 3 или на 9:		
		System.out.print("\nЧисла, котлорые делятся на 3 или на 9: ");
		for (int i = 0; i<mas.length; i++){
			if(mas[i]%3==0 || mas[i]%9==0){
				System.out.print(mas[i]+" ");
			}		
		}
//Числа, котлорые делятся на 5 или на 10:		
		System.out.print("\nЧисла, котлорые делятся на 5 или на 10:: ");
		for (int i = 0; i<mas.length; i++){
			if(mas[i]%5==0 || mas[i]%10==0){
				System.out.print(mas[i]+" ");
			}
		}
	}

}