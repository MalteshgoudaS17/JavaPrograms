import java.util.Scanner;
class ArmStrong
{
   public static void main(String[] args)
   {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Number");
    int no;
     no=s.nextInt();
    int t1=no;
    int length=0;
    
    while(t1!=0)
    {
     length=length+1;
     t1=t1/10;
       
    }

   int t2=no;
   int rem;
  
   int arm=0;
   
    while(t2!=0)
    {
     int mul=1;
     rem=t2 % 10;
      for(int i=1;i<=length;i++)
      {
        mul=mul*rem;
      
      }
     arm=arm+mul;
        t2=t2/10;
    }
    if(arm==no)
    {
       System.out.println("this is Armstrong  number");
    }
    else
    {
     System.out.println("this is not Armstrong  number");
    }
   }
}