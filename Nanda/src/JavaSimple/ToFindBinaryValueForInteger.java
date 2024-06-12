package JavaSimple;

import java.util.ArrayList;
import java.util.Scanner;

public class ToFindBinaryValueForInteger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Your Number");
		int num = in.nextInt();
		// to call the method
		toFindBinaryValueForInteger(num);
	}

	public static void toFindBinaryValueForInteger(int num) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = num ; i > 0 ; i /= 2) {
			int rem = i % 2 ;
			al.add(rem);
		}
		for (Integer n : al) 
			System.out.print(n);

	}

}
