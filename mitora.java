package alcala;
import java.util.Arrays;
public class Arrangingnumbers {

  public static void main(String[] args) {
  
     
int [] array = new int [] {2,1,4,3,5};  

Arrays.sort(array);   
System.out.println("Elements of array sorted in ascending order.");  
System.out.println("OUTPUT:");

for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}