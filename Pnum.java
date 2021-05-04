import java.util.Scanner; 
class Prime 
 { 
           public static void main(String args[]) 
              { 
                   int num,b,c; 
                   Scanner sc=new Scanner(System.in); 
                   System.out.println("Enter a Number"); 
                   num=sc.nextInt(); 
                   b=1; 
                   c=0; 
                    while(b<=num) 
                       { 
                           if((num%b)==0) 
                              c=c+1; 
                              b++; 
                       } 
                        if(c==2) 
                        System.out.println(num +" is a prime number"); 
                        else 
                        System.out.println(num +" is not a prime number"); 
              } 
 } 
