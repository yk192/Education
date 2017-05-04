//элементы массива которые дел€тс€ на 3 или на 9
//элементы массива которые дел€тс€ на 5 или на 10
package lesson1;

import java.util.*;

public class number {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("¬ведите количество элементов массива: ");
		int a = sc.nextInt();
		int mas[] = new int[a];
//заполнение и вывод массыва		
		System.out.print("Ёлементы массива: ");
		for (int i = 0; i<mas.length; i++){
			mas[i] = (int)(Math.random()*100);
			System.out.print(mas[i]+" ");
		}
//¬ывод элементов массыва которые дел€тс€ 3 или на 9		
		System.out.print("\nЁлементы массыва которые дел€тс€ на 3 или на 9: ");
		for (int i = 0; i<mas.length; i++){
			if(mas[i]%3==0 || mas[i]%9==0){
				System.out.print(mas[i]+" ");
			}		
		}
//¬ывод элементов массыва которые дел€тс€ 3 или на 9		
		System.out.print("\nЁлементы массыва которые дел€тс€ на 5 или на 10: ");
		for (int i = 0; i<mas.length; i++){
			if(mas[i]%5==0 || mas[i]%10==0){
				System.out.print(mas[i]+" ");
			}
		}
	}

}
