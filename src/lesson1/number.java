//�������� ������� ������� ������� �� 3 ��� �� 9
//�������� ������� ������� ������� �� 5 ��� �� 10
package lesson1;

import java.util.*;

public class number {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("������� ���������� ��������� �������: ");
		int a = sc.nextInt();
		int mas[] = new int[a];
//���������� � ����� �������		
		System.out.print("�������� �������: ");
		for (int i = 0; i<mas.length; i++){
			mas[i] = (int)(Math.random()*100);
			System.out.print(mas[i]+" ");
		}
//����� ��������� ������� ������� ������� 3 ��� �� 9		
		System.out.print("\n�������� ������� ������� ������� �� 3 ��� �� 9: ");
		for (int i = 0; i<mas.length; i++){
			if(mas[i]%3==0 || mas[i]%9==0){
				System.out.print(mas[i]+" ");
			}		
		}
//����� ��������� ������� ������� ������� 3 ��� �� 9		
		System.out.print("\n�������� ������� ������� ������� �� 5 ��� �� 10: ");
		for (int i = 0; i<mas.length; i++){
			if(mas[i]%5==0 || mas[i]%10==0){
				System.out.print(mas[i]+" ");
			}
		}
	}

}
