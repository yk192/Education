//время года
package tasks;
import java.util.*;
public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Введите месяц: ");
		int a = sc.nextInt();
		String month;
		switch(a){
			case(1):
				month = "Зима";
				break;
			case(2):
				month = "Зима";
				break;
			case(3):
				month = "Весна";
				break;
			case(4):
				month = "Весна";
				break;
			case(5):
				month = "Весна";
				break;
			case(6):
				month = "Лето";
				break;
			case(7):
				month = "Лето";
				break;
			case(8):
				month = "Лето";
				break;
			case(9):
				month = "Осень";
				break;
			case(10):
				month = "Осень";
				break;
			case(11):
				month = "Осень";
				break;	
			case(12):
				month = "Зима";
				break;
			default:
				month = "Неизвестная пора года!";
				break;
			
		}
		
	System.out.println(month);

	}

}
