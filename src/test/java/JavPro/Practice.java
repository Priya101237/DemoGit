package JavPro;

import java.util.Arrays;
import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
		
		//String Reverse
		/*
		String Str="Priya";
		String rev=" ";
		for(int i=Str.length()-1; i>=0; i--)
		{
			rev = rev+Str.charAt(i);
		} 
		
		System.out.println(rev);*/

		//StringBuffer
		String Str2= "Priyanka";
		StringBuffer input= new StringBuffer(Str2);
		input.reverse();
		System.out.println(input);
		
		//StringBuilder
		String Str3= "priya1012";
		StringBuilder input2 = new StringBuilder();
		input2.append(Str3);
		input2.reverse();
		System.out.println(input2);
		
		//String Duplicates
		
		String St="Automation";
		St.toUpperCase();
		int count=0;
		char[] ch1= St.toCharArray();
		for(int i=0;i<ch1.length; i++)
		{
			for(int j=i+1; j<ch1.length;j++)
			{
				if(ch1[i]==ch1[j]) 
				{
			     System.out.println("Number of duplicate characters :" +ch1[j]);
				count++;
				}
			}
		}
		System.out.println("Duplicate Characters count " +count);
		
		//Array Reverse
		
		int a[]= {10, 20, 30 ,40};
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
		//Array Duplicates
		
		int a1[] = {10, 20 , 3, 3,3,4 ,5,8,7,4,4};
		int count1=0;
		for(int i=0;i<a1.length;i++)
		{
			for(int j=i+1; j<a1.length; j++)
			{
				if(a1[i]==a1[j])
				{
					System.out.println("Number of Duplicate Arrays: " +a1[j]);
					count1++;
				}
			}
		}
		System.out.println("Number of Array Duplicate Count :" +count1);
		
		//Vowels Count
		String vowels="Priyanka";
		int count2=0;
		for(int i=0 ; i<vowels.length(); i++)
		{
			if(vowels.charAt(i)=='a'||vowels.charAt(i)=='e'||vowels.charAt(i)=='i'||vowels.charAt(i)=='o'||vowels.charAt(i)=='u')
			{
				count2++;
			}
		}
		
		System.out.println("Number of Vowels count :" + count2);
		
		//LowerCasec&Uppercase
		String lu= "AUTOMAtion";
		int upper=0, lower=0;
		for(int i=0; i<lu.length();i++)
		{
			char ch3 =lu.charAt(i);
			if(ch3>65 && ch3<90)
			{
				lower++;
			}
			else
			{
				upper++;
			}
	
		}
		System.out.println("Number of uppercase : " +upper);
      	System.out.println("Number of lowecase : " +lower);

		//Odd &&Even	
      	
      	int a3[]= {2,4,6,7,8,9,10,12,14};
      	int odd=0,even=0;
      	for(int i=0; i<a3.length;i++)
      	{
      		if(a3[i]%2==0)
      		{
      			even++;
      		}
      		
      		else 
      		{
      			odd++;
      		}
      	}
      	System.out.println("Number of even : " +even);
      	System.out.println("Number of odd : " +odd);
      	
      	//Palindrome
      	int num=434;
      	int reverse=0;
      	int temp=num;
      	while(num>0)
      	{
      		int d=num%10;
      		reverse= reverse*10+d;
      		num=num/10;
      		
      	}
      	if(temp==reverse)
      	{
      		System.out.println("the given number is Palindrome:" + temp);
      	}
      	else
      	{
      		System.out.println("the given number isnot Palindrome:" + temp);
      	}
      	
      	//primeNumber
      	int num2=20;
      	int count4;
        for(int i=1; i<=num2; i++)      	
        {
        	count=0;
        {
        	for(int j=2; j<=i/2; j++)
        	{
        		if(i%j==0)
        		{
        			count++;
        			break;
        		}
        	}
        }
        if(count==0) {
        System.out.println("Number of primeNumber count" +i);
       }
        
		}
        
       //String Concatination 
        
        String s1="Automation";
        String s2="Selenium";
        String s3="Framework";
        String s4=s1.concat(s2).concat(s3);
        System.out.println(s4);
        
        //Swapping of two String with using Third varaibles
        String s5="Automation";
        String s6="Framework";
        
        System.out.println("Before swapping of S5:" + s5);
        System.out.println("Before swapping of S6:" + s6);
       String temp1=s5;
       s5=s6;
       s6=temp1;
       System.out.println("After swapping of S5:" + s5);
       System.out.println("After swapping of S6:" + s6);
       
       //Swapping of two String without using Third varaibles
       String s7="priya";
       String s8="Girl";
       System.out.println("Before swapping of S7:" + s7);
       System.out.println("Before swapping of S8:" + s8);
       s7= s7+s8;
       s8=s7.substring(0,(s7.length()-s8.length()));
       s7=s7.substring(s8.length());
       System.out.println("After swapping of S7:" + s7);
       System.out.println("After swapping of S8:" + s8);
       
       //Swapping of Two Numbers 
       
       int x=10;
       int y=20;
       System.out.println("Before swapping of x"+ x);
       System.out.println("Before swapping of y "+y);
       x=x+y;
       y=x-y;
       x=x-y;
       System.out.println("After swapping of x"+ x);
       System.out.println("After swapping of y "+y);
       
       //Unique Array
       int a4[]= {2,2,4,4,5,5,6};
       int sum=0;
       HashSet<Integer> set= new HashSet();
       for(int i=0; i<a4.length;i++) {
    	   if(set.contains(a4[i]))
    	   {
    		   sum=sum+a4[i];
    		   System.out.println(a4[i]);
    	   }
    	   set.add(a4[i]);
       }
       
       String rep ="priya";
       String s11= rep.replaceAll("priya", "priyanka");
       System.out.println(s11);
       
       String rep2 ="priya";
       String s12= rep2.replace("y", "s");
       System.out.println(s12);
       String s13=rep2.replaceFirst("p", "r");
       System.out.println(s13);
       
       //Each Character 2 times 
       String sty="pri";
      char[] ch=  sty.toCharArray();
      char[] ch2 =new char[ch.length*2];
      for(int i=0; i<ch.length;i++)
      {
    	  ch2[2*i]=ch[i];
    	  ch2[2*i+1]=ch[i];
    	  
      }
      String res= new String(ch2);
      System.out.println(res);
      
      //Anagram
      
      String an1="race";
      String an2="care";
      
      an1.toUpperCase();
      an2.toUpperCase();
      if(an1.length()!=an2.length())
      {
    	  System.out.println("the given string length is not same");
    	  
      }
      
      else 
      {
    	 char[] an3= an1.toCharArray();
    	 char[] an4= an2.toCharArray();
    	 Arrays.sort(an3);
    	 Arrays.sort(an4);
    	 
    	 if(Arrays.equals(an3, an4)==true)
    	 {
    		 System.out.println("the given string are anagram");
    	 }
    	 
    	 else
    	 {
    		 System.out.println("the given string are not anagram");
    	 }
    	 
      }
      
      
      
      
       
       
       
       
       
       
       
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        }
		
        }	
		
	


