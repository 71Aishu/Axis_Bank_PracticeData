// 4. What will be the output of the following program?

package com.assignment;

public class Question_4 
{
	public static void main(String s[])
    {
        for(int i = 10; i <= 5; i-- )
        {
            System.out.println("i = " + i );
        }
    }
}
 /* The for loop in the program initializes the variable i with a value of 10. 
The loop condition i <= 5 is already false because 10 is not less than or equal to 5. 
Therefore, the loop body will not be executed, and only the initial value of i will be printed, which is 10. 
*/