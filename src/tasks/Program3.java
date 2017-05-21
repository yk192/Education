//Максимальное и минимальное сило из 4 чисел

package tasks;

import java.util.*; 

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try{
			System.out.print("Введите первое число: ");
			int a1 = sc.nextInt();
			System.out.print("Введите второе число: ");
			int a2 = sc.nextInt();
			System.out.print("Введите третье число: ");
			int a3 = sc.nextInt();
			System.out.print("Введите четвертое число: ");
			int a4 = sc.nextInt();
			
			int b = Math.min(Math.min(a1, a2), Math.min(a3, a4));
			int z = Math.max(Math.max(a1, a2), Math.max(a3, a4));
			System.out.println("Минимальное число: "+b);
			System.out.println("Максимальное число: "+z);
 		}
		
		catch(InputMismatchException e){
			System.out.println("Вы вводите не число!!!");
		}

	}

}