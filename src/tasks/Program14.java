//Ввести с клавиатуры два числа m и n.
//Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
package tasks;
import java.util.*;
public class Program14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for (int i = 0; i<m; i++){
			for(int j = 1; j<n; j++){
				System.out.print(8);
			}
			
			System.out.println(8);
		}
	}

}
