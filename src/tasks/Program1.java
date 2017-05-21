//Четные и не четные элементы массива
package tasks;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Количество элементов массива: ");
		int a = sc.nextInt(); 
		int mas [] = new int[a]; 
//Заполнение массива
		System.out.print("Массив: ");
		for (int i = 0; i<mas.length; i++){
			mas[i] = (int)( Math.random()*10);
			System.out.print(mas[i]+" ");
		}
//Четные элементы массива
		System.out.print("\nЧетные элементы массива: ");
		for (int i = 0; i<mas.length; i++){
		if (mas[i]%2==0){
			System.out.print(mas[i]+" ");
			}}
//Не четные элементы массива		
		System.out.print("\nНе четные элементы массива: ");
		for (int i = 0; i<mas.length; i++){
		if (mas[i]%2!=0){
			System.out.print(mas[i]+" ");
			}
			
		}
		}
	}