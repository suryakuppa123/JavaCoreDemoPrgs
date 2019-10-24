/*
 * Enter the Value 1 for UpperCase  Int Conversion
Enter the Value 1 for LowerCase Int Conversion
2
a--> 97
b--> 98
c--> 99
d--> 100
e--> 101
f--> 102
g--> 103
h--> 104
i--> 105
.....
......

 */
package com.abc;

import java.util.Scanner;

class UpperCase
{
	public void show()
	{
		char a = 'A';
		int i;
		while(a<='Z')
		{
			i=a;
			System.out.println(a + "--> "+ i);
			a++;
		}
	}
}
class LowerCase extends UpperCase
{
	public void superShow()
	{
		super.show();
	}
	public void show() 
	{
		char a = 'a';
		int i;
		while(a<='z')
		{
			i=a;
			System.out.println(a + "--> "+ i);
			a++;
		}
		
	}
}
public class CharInt {

	public static void main(String[] args) {
		LowerCase obj = new LowerCase();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value 1 for UpperCase  Int Conversion");
		System.out.println("Enter the Value 1 for LowerCase Int Conversion");
		int count = scan.nextInt();
		if(count == 1)
		{
			obj.superShow();
		}
		else if(count ==2)
		{
			obj.show();
		}
		

	}

}
