//������ � �������� �����
package lesson1;

import java.util.*;

public class Lesson1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//�������� ������� ��� ����� ������ � ����������
		System.out.print("������� ���������� ��������� �������: ");
		int a = sc.nextInt(); //���� � ���������� ���������� ��������� ������� 
		int mas [] = new int[a]; //�������� ������� �� � ���������
//���������� ������� ���������� �������	
		System.out.print("�������� �������: ");
		for (int i = 0; i<mas.length; i++){
			mas[i] = (int)( Math.random()*10);
			System.out.print(mas[i]+" ");
		}
//������ �������� �������
		System.out.print("\n������ �������� �������: ");
		for (int i = 0; i<mas.length; i++){
		if (mas[i]%2==0){
			System.out.print(mas[i]+" ");
			}}
		
		System.out.print("\n�� ������ �������� �������: ");
		for (int i = 0; i<mas.length; i++){
		if (mas[i]%2!=0){
			System.out.print(mas[i]+" ");
			}
			
		}
		}
	}

