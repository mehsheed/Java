import java.util.Scanner;
class bankac
{
 String name;
 int accno;
 double bal;
 static double r;
 static double minbal;
 bankac(String n,int ac,double b)
 {
  
  name = n;
  accno = ac;
  bal = b;
 }
 static 
 {
  r=5.3;
  minbal = 1000;
 }
 
 bankac()
 {
  if (bal < minbal)
  {
   System.out.print("Cannot create account");
   System.exit(0);
   
   
  }
  name = "";
  accno=0;
  bal=0;
 }
 
  void display()
 {
  System.out.print ("Name="+name+"\nBalance ="+bal);
 }
  void withdraw (double amnt)
 {
  if (bal -amnt < minbal)
  {
   System.out.print ("Cannot withdraw \n"+"Current Blance =  "+bal+"\n");
   
  }
  else
 {
   
  bal=bal-amnt;
   System.out.print("\nBalnce after withdrawl = Rs."+bal+"\n");
  
 }
 }
 void deposit(double amnt)
 {
  bal = bal +amnt;
  System.out.print ("\nBlance after deposit= Rs." +bal+"\n");
  
 }
 static void rdisplay()
 {
  System.out.print("\nRate of interest ="+r);
 }
  
     
    

}
class bankm
{
 public static void main (String args[]) 
 {
  Scanner sc = new Scanner(System.in);
  
 
  
  
  
  System.out.println("Enter name,acc.no and balance of customer:");
  String s=sc.nextLine();
  int acc=sc.nextInt();
  double bala=sc.nextDouble();
  bankac b1 = new bankac(s,acc,bala);
  b1.display();
  b1.withdraw(2500);
  
  b1.deposit(1500);
 
  bankac.rdisplay();
  
  
  
  
  
 }
}
  
  
  
  
 
