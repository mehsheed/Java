class ls
{ 
 public static void main(String args[])
 {
  int a[] ={5,-1,2,11,15};
  int i;
  
  System.out.println("Taking the element to be searched from commmand line argument ");
  int key = Integer.parseInt(args[0]);
  for ( i =0;i<a.length;i++)
  {  
     if (a [i] == key)
     { 
       System.out.println("Element found at " + i);
       break;
     }
    
      
  }
 if (i == a.length)  
     {
      System.out.println("Element not found" );
      
  
     }
}
 

}  
