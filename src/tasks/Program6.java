//количество дней в месяце

package tasks;

public class Program6 {

	public static void main(String[] args) {
		int a = 0;
		String []  [] days = {{"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"},
				             {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}};
		for (int i = 0; i<11; i++){
		System.out.println(days[1][i]+" has "+days[0][i]);
	}
	}
}