package Day58;

import java.util.HashSet;
import java.util.Iterator;

class HashSet1
{  
 public static void main(String args[])
 {  
  //Creating HashSet and adding elements  
  HashSet<String> set=new HashSet<String>();  
  set.add("Payal");  
  set.add("Somya");  
  set.add("Payal");  
  set.add("Ankita");
  
  //Traversing elements  
  Iterator<String> itr=set.iterator(); 
  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
 }  
}  
