//Вводить с клавиатуры числа и считать их сумму.
//Если пользователь ввел -1, вывести на экран сумму и завершить программу.
//-1 должно учитываться в сумме

package tasks;
import java.util.*;
public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	       
        int sum = 0;
        
        for(int i = 0;;i++){
             int a = sc.nextInt();
             sum = sum+a;
             if(a==-1) break;
             
        }
        System.out.println(sum);
	}

}
