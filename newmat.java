import java.util.Scanner;
class matrix
 {	
	int a[][];
   	int r,c;
        int sum =0;
        void insert()
	{
	   Scanner sc = new Scanner(System.in);
           System.out.print("Enter the order of the matrix:");
           r = sc.nextInt();
	   c = sc.nextInt();
           a = new int [r][c];
           int i,j;
             
           System.out.print("Enter the elements now :");
           for (i =0;i<r;i++)
           {
             for(j=0;j<c;j++)
             {
               a[i][j] = sc.nextInt();
             }
           }
        }
           void display()
           {
             int i,j;
             for (i =0;i<r;i++)
           {
             for(j=0;j<c;j++)
             {
               System.out.print(a[i][j]);
             }
               System.out.print("\n");
           }
        }
        void sym()
         {
             if( r==c)
             {
              int i,j;
              for (i =0;i<r;i++)
              {
               for(j=i+1;j<c;j++)
               {
                if(a[i][j] != a[j][i]) 
                break;
               }
                if(j<c)
                break;
              }
               if(i == r)
              { 
                System.out.print(" \n MATRIX IS SYMMETRIC");
              }
              else
              System.out.print("\n NOT SYMMETRIC");
            }
             else 
             System.out.print("Not a Square matrix");
         } 
        void sm()
        {
          int i,j;
          for(i=0;i<r;i++)
          {
             for(j=0;j<c;j++)
             {
               sum = sum + a[i][j];
             }
          }
          System.out.print(" \n Sum ="+ sum);
        }
       
          
           
           
 } 
class newmat
 {  
         public static void main (String args[])
         {
           matrix m = new matrix();
           m.insert();
           m.display();
           m.sym();
           m.sm();
         }
 }
             
           












                  
             



						
	
