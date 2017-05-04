//Четные и нечетные числа элементов массыва
package lesson1;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//создание обьекта для ввода данных с клавиатуры
		System.out.print("Введите количество элементов массыва: ");
		int a = sc.nextInt(); //ввод с клавиатуры количества элементов массива 
		int mas [] = new int[a]; //создание массыва из а элементов
//заполненые массыва случайными числами	
		System.out.print("Элементы массыва: ");
		for (int i = 0; i<mas.length; i++){
			mas[i] = (int)( Math.random()*10);
			System.out.print(mas[i]+" ");
		}
//четные элементы массива
		System.out.print("\nЧетные элементы массыва: ");
		for (int i = 0; i<mas.length; i++){
		if (mas[i]%2==0){
			System.out.print(mas[i]+" ");
			}}
//не четные элементы массива		
		System.out.print("\nНе четные элементы массыва: ");
		for (int i = 0; i<mas.length; i++){
		if (mas[i]%2!=0){
			System.out.print(mas[i]+" ");
			}
			
		}
		}
	}

