import java.util.Scanner;
class complex
{
 int real,img;
 complex()
 {
  real=img=0;
 }
 complex(int r,int i)
 {
  real =r;
  img =i;
 }
 
 void display()
 {
  System.out.print(real+"+i("+img+")");
 }

 complex add(complex c3)
 {
  complex res = new complex();
  res.real = this.real+c3.real;
  res.img= this.img+c3.img;
  return res;
 }
 complex sub(complex c3)
 {
  complex res2 = new complex();
  res2.real = this.real-c3.real;
  res2.img=this.img-c3.img;
  return res2;
 }
}
class compara
{
  public static void main (String args[])
  {
   complex c1 = new complex(1,2);
   complex c2 = new complex(3,4);
   System.out.print("Enter 1st complex number : \n");
   
   System.out.print("Enter 2nd complex number : \n");
   
   System.out.print(" 1st complex number : \n");
   c1.display();
   System.out.print(" 2nd complex number : \n");
   c1.display();
   System.out.print("\n");
   System.out.print(" \nSum of c1&c2 = \n");
   complex s = c1.add(c2);
   s.display();
   System.out.print("\nSubtraction of c1&c2= \n");
   s= c1.sub(c2);
   s.display();
  }
}
