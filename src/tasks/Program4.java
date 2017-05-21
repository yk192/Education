//Найти наибольшее число из 4 чисел
package tasks;

import java.text.NumberFormat;
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		
			try{
				Scanner sc = new Scanner (System.in);
				System.out.print("Введите первое число: ");
				int a1 = sc.nextInt();
				System.out.print("Введите второе число: ");
				int a2 = sc.nextInt();
				System.out.print("Введите третье число: ");
				int a3 = sc.nextInt();
				System.out.print("Введите четвертое число: ");
				int a4 = sc.nextInt();
				
				if(a1>a2 & a1>a3 & a1>a4 ){
					System.out.println("Наибольшее число первое = "+a1);
				}
				if(a2>a1 & a2>a3 & a2>a4){
					System.out.println("Наибольшее число втрое = "+a2);
				}
				if(a3>a1 & a3>a2 & a3>a4){
					System.out.println("Наибольшее число третье = "+a3);
				}
				if(a4>a1 & a4>a2 & a4>a3){
					System.out.println("Наибольшее число четвертое = "+a4);
				}
			
			}
			catch (NumberFormatException e){
				System.out.println("Неверный формат числа!");
			}
		}
		}