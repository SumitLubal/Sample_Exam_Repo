package transpose;


//new comments added
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Keyed 
{

	public static void main(String[] args) throws IOException
	{
		
		String str;
		int blk_size;
		
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the plain text");
		
		str=br.readLine().replaceAll(" ","");
		
	
		
		System.out.println("Enter the block size");
		
		
		blk_size=sc.nextInt();
		
		int key[]=new int[blk_size];
		
	System.out.println("Enter the key  ");
		for(int i=0;i<blk_size;i++)
		{
			key[i]=sc.nextInt();
		}
		if(str.length()%blk_size!=0)
		{
			for(int i=0;i<((str.length()%blk_size));i++)
			{
				str+='Q';
			}
		}
		int a=0;
		
		char ch[][]=new char[str.length()/blk_size][blk_size];
		for(int i=0;i<str.length()/blk_size;i++)
		{
			for(int j=0;j<blk_size;j++)
			{
				Character c=str.charAt(a);
				if((int )c==32)
					a=a+1;
				ch[i][j]=c;
				a++;
			}
		}
	
		String opr[]=new String[blk_size];
		for(int i=0;i<str.length()/blk_size;i++)
		{
			for(int j=0;j<blk_size;j++)
			{
				System.out.print(" "+ch[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<blk_size;i++)
		{
			opr[i]="";
		}
			for(int i=0;i<blk_size;i++)
			{
				for(int j=0;j<str.length()/blk_size;j++)
				{
					opr[i]+=" "+ch[j][i];
				}
				
			}
		for(int i=0;i<blk_size;i++)
		{
			System.out.println(""+opr[i]);
		}
		

		String encrypt[]=new String[blk_size];
		for(int i=0;i<blk_size;i++)
		{
			int x=key[i];
			encrypt[i]=opr[x-1];
		}
		
		System.out.println("\nCipher Text is :");
		for(int i=0;i<blk_size;i++)
		{
			System.out.print(""+encrypt[i]);
		}
		
		
		
	}
}
	 
	 

