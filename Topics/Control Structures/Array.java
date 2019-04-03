

public class Array {

   public static void main(String[] args) {
   
      // declare variable array and initialize it with an array object  
      int[] array = new int[10]; // new creates the array object 
         
/*         
      // initializer list specifies the initial value for each element
      int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};


      final int ARRAY_LENGTH = 10; // constant
      int[] array = new int[ARRAY_LENGTH]; // create array
      // calculate value for each array element
      for (int counter = 0; counter < array.length; counter++)
         array[counter] = 2 + 2 * counter;     


      // add each element's value to total
		int sum = 0;
		for (int counter = 0; counter < array.length; counter++)
         sum += array[counter];
      System.out.printf("Total of array elements: %d%n", sum);
      
      
      int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
      System.out.println("Grade distribution:"); 
      // for each array element, output a bar of the chart
      for (int counter = 0; counter < array.length; counter++) {
         // output bar label ("00-09: ", ..., "90-99: ", "100: ")
         if (counter == 10)
            System.out.printf("%5d: ", 100); 
         else
            System.out.printf("%02d-%02d: ", 
               counter * 10, counter * 10 + 9); 
         // print bar of asterisks
         for (int stars = 0; stars < array[counter]; stars++)
            System.out.print("*");
         System.out.println(); 
      } 

*/            
      
      System.out.printf("%s%8s%n", "Index", "Value"); // column headings
      // output each array element's value 
      for (int counter = 0; counter < array.length; counter++)
         System.out.printf("%5d%8d%n", counter, array[counter]);
         
            
   } 
   
}
