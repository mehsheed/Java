class msum
{
 public static void main(String args[])
 {
  int a[][] = {{1,2,3},{4,5,6}};
  int b[][] = {{7,4,1},{8,5,2}};
  int c[][] = {}}{;
  int i,j;

  System.out.println("A =");
  for(i=0;i<a.length;i++)
  {
   for(j=0;j<a[i].length;j++)
   {
    System.out.print(a[i][j]+ " ");
   }
   System.out.println();
  }
  System.out.println("B =");
  for(i=0;i<b.length;i++)
  {
   for(j=0;j<b[i].length;j++)
   {
    System.out.print(b[i][j]+ " ");
   }
   System.out.println();
  }
  System.out.println("Sum =");
  for(i=0;i<a.length;i++)
  {
   for(j=0;j<a[i].length;j++)
   {
     c[i][j]=a[i][j]+b[i][j];
   }
   
  }
  System.out.println("C =");
  for(i=0;i<2;i++)
  {
   for(j=0;j<3;j++)
   {
    System.out.print(c[i][j]+ " ");
   }
   System.out.println();
  }
  
 }
}
  
    
