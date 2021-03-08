import java.util.Scanner;
class Time1
{
 int hr,min,sec;
 void read()
 {
  Scanner sc = new Scanner(System.in);
  hr = sc.nextInt();
  min = sc.nextInt();
  sec = sc.nextInt();
 }
 void display()
 {
  System.out.print(hr + ":"+min +":"+sec );
 }
 void check()
 {
  if (sec >= 60)
  {
   min = min+sec/60;
   sec = sec % 60;
  }
  if (min >= 60)
  {
   hr = hr+sec/60;
   min = min % 60;
  }
 }
 Time1 add(Time1 t3)
 {
  Time1 res = new Time1();
  res.hr = this.hr+t3.hr;
  res.min = this.min+t3.min;
  res.sec = this.sec+t3.sec;
  res.check();  
  return res;
 }
 private int convert()
 {
  return hr*3600+min*60+sec;
 }
 void equal(Time1 t3)
 {
  Time1 res = new Time1();
   int a = this.convert();
   int b = t3.convert();
   if (a-b == 0)
   {
    System.out.print("\nTimes are equal \n");
   }
 }
 
 Time1 subt(Time1 t3)
 {
  Time1 res = new Time1();
  int a = this.convert();
  int b = t3.convert();
  if (a-b >0)
  {
   res.sec = a-b;
  }
  
  else 
  {
   res.sec = b-a;
  }
  res.check();
  return res;
 }
 
}

class time
{
 public static void main (String args[])   
 {
  Time1 t1 = new Time1();
  Time1 t2 = new Time1();
  System.out.print("Enter details of t1 \n");
  t1.read();


  System.out.print("Enter details of t2 \n");
  t2.read();
  System.out.print("\nTime t1 :\n");
  t1.display();
  System.out.print("\nTime t2 :\n");
  t2.display();
  Time1 r=t1.add(t2);
  System.out.print(" \nSum of t1&t2 = \n");   
  r.display();
  t1.equal(t2);
  r=t1.subt(t2);
  System.out.print("\nSubtraction of t1&t2= \n");
  r.display();
  
 }
}
  
