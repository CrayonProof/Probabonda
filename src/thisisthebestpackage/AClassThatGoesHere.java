package thisisthebestpackage;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class AClassThatGoesHere {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("a: ");
		int a = s.nextInt();
		System.out.println("b: ");
		int b = s.nextInt();
		
		int sum;
		
		ArrayList springboi = new ArrayList();
		
		int len = a*b;
		
		int[] all = new int[len];
		int[] alltemp = new int[len];;
		
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < b; j++)
			{
				klina clardy = new klina(i + 1, j + 1);
				sum = clardy.sum(i + 1, j + 1);
				all[j] = sum;
				alltemp[j] = sum;
				System.out.println(all[j]);
			}
		}
		int test;
		
		for (int i = 0; i < len; i++)
		{
			
			for (int k = 0; k < a; k++)
			{
				for (int l = 0; l < b; l++)
				{
					klina clardy = new klina(k + 1, l + 1);
					sum = clardy.sum(k + 1, l + 1);
					alltemp[l] = sum;
				}
			}
			
			test = alltemp[i];
			alltemp[i] = 999999999;
			if (Arrays.asList(alltemp).contains(test))
			{
				System.out.println("yes");
			} 
			else
			{
				System.out.println("no");
			}
		}
		
		int count;
		int stan;
		int comp;
		
		for (int i = 0; i < len; i++)
		{
			count = 0;
			for (int j = (i + 1); j < len; j++)
			{
				stan = all[i];
				comp = all[j];
				if (stan == comp)
				{
					count++;	
				}
			}
			System.out.println(all[i] + ": " + count);
		}
	}

}
