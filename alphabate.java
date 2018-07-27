import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 char ch;
	 Scanner sc=new Scanner(System.in);
	 ch=sc.next().charAt(0);
	 if(ch=='q'||ch=='w'||ch=='r'||ch=='e'||ch=='t'||ch=='y'||ch=='u'||ch=='i'||ch=='o'||ch=='p'||ch=='a'||ch=='s'||ch=='d'||ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='k'||ch=='l'||ch=='z'||ch=='x'||ch=='c'||ch=='v'||ch=='b'||ch=='n'||ch=='m')
	 {
	 	System.out.println("Alphabet");
	 }
	 else
	 {
	            System.out.println("No");	
	}
	}
}
