//Простые числа
//Является ли число простым
//(Число простое, когда оно делится на 1 и на себя)
package tasks;
import java.util.*;
public class Program7 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			System.out.print("Введите число: ");
			int number = sc.nextInt();
			boolean isPrime = true;
				
			for(int i = 2; i<number; i++){
				if ((number % i) == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println("Простое число!");
			}
			else{
				System.out.println("Число не простое!");
			}

		}

	}