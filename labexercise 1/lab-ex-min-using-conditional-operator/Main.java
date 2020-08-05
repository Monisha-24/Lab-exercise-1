/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*****************************************************************************
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
*******************************************************************************/
package worksheet ;
import java.util.Scanner;
public class Main
{
    void getdata()
    int a,b;
    {
        Scanner obj=new Scanner(System .in);
        a=obj.nextInt();
        b=obj.nextInt();
    }
    void mincal()
    {
        if((a<b)?a:b)
        min='a';
        else
        min='b';
    }
    void display()
	{
		System.out.println("Mininum of 2 nos:"+min);
	}
}
