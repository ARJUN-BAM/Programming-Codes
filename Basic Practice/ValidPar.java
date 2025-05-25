/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

1.Open brackets must be closed by the same type of brackets.
2.Open brackets must be closed in the correct order.
3.Every close bracket has a corresponding open bracket of the same type.
 

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: fasle

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'. */




/*


import java.util.Scanner;
class ValidPar
{
    public static void main(String[] args) {
        System.out.print("Enter a string of Paranthesis : ");
        String str = new Scanner(System.in).next();




    }
}


*/






import java.util.Scanner;
class ValidPar
{
    public static void main(String[] args) {
        System.out.print("Enter a string of Paranthesis : ");
        String str = new Scanner(System.in).next();
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)=='a') 
            {
                continue;
            }
            else if(str.charAt(i)=='(')
            {
                int j;
                int cnt=0;
                for( j = i+1;j<str.length();j++)
                {
                    if(str.charAt(j)==')'&&cnt%2==0)
                    {
                        str = str.substring(0, j) + 'a'+ str.substring(j + 1);
                        System.out.println(str);
                        break;
                    }

                    cnt++;
                }
                if(j==str.length())
                {
                    System.out.println(false);
                    System.exit(0);
                   
                }
            }
            else if(str.charAt(i)=='[')
            {
                int j;
                int cnt=0;
                 for(j = i+1;j<str.length();j++)
                {
                    if(str.charAt(j)==']'&&cnt%2==0)
                    {
                       str = str.substring(0, j) + 'a'+ str.substring(j + 1);
                        System.out.println(str);

                        break;
                    }
                    cnt++;


                }
                if(j==str.length())
                {
                    System.out.println(false);
                    System.exit(0);
               
                }
            }
            else if(str.charAt(i)=='{')
            {
                int j;
                int cnt =0;
                 for(j = i+1;j<str.length();j++)
                {
                    if(str.charAt(j)=='}'&&cnt%2==0)
                    {
                       str = str.substring(0, j) + 'a'+ str.substring(j + 1);
                        System.out.println(str);
                        break;
                    }
                    cnt++;


                }
                if(j==str.length())
                {
                    System.out.println(false);
                    System.exit(0);
                 
                }
            }
            else
            {
                System.out.println(false);
                System.exit(0);
            }
        }
        System.out.println(true);

    }
}