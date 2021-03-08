import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class patient
{
  String name;
  int age;
  int hno;
 void input() throws Exception
 {
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter name:");
  name = sc.nextLine();
  System.out.print("Enter age:");
  age = sc.nextInt();
  System.out.print("Enter hospital no :");
  hno= sc.nextInt();
 }
 void display()
 {
  System.out.println("Name: "+name+" age :"+age+" Hospital.no :"+hno);
 }
}
 class Inpatient extends patient
 {
  String dname;
  String rtype;
  Date ad_date; 
  void input() throws Exception
  {
   super.input();
   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter Department name :");
   dname = sc.nextLine();
   System.out.println(" Enter Room type :");
   rtype = sc.nextLine();
   System.out.println(" Enter date:");
   ad_date = sdf.parse(sc.nextLine());
  }
   void display()
   {
    super.display();
    System.out.println("Department name : "+dname+" Room type :"+ rtype+" Admission date :"+ad_date);
   }
  
 }
class Billing extends Inpatient
{
  Scanner sc= new Scanner(System.in);
  
  Date disc;
  void input() throws Exception
  {
   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
    super.input();
    System.out.println(" Enter discharge date:");
    disc = sdf.parse(sc.nextLine());
  }
  
  void display() 
   
  {
   double amt = 0;
   super.display();
   long m1 = ad_date.getTime();
   long m2 = disc.getTime();
   double days = (m2-m1)/(1000*60*60*24);
   if (rtype.equals("Special"))
   {
    amt = (days*1200);
   }
   else if (rtype.equals("SemiSpecial"))
   {
    amt = (days*600);
   }
   else if (rtype.equals("General"))
   {
    amt = (days*150);
   }
   System.out.println("Discharge date : "+disc +" Total Bill = Rs."+amt);
  }

}
    
    
   
  
  
  
 
  
 class pt
 {
    public static void main(String args[]) throws Exception
    {
     Billing p1 = new Billing();
     p1.input();
     p1.display();
     
     
     
     }
 }
     
   
   
  
  
