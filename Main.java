import java.util.Scanner;
/**
 *
 * @author David 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a variable to keep track of what number we are on
    int count = 1;
    int total = 1;
    while(count <= 5){
      // multlpie the numbers as we go into total
      total = total * count;
      // multlpie 1 to increase it
      count = count + 1;
    }
    // print to screen total
    System.out.println("The total is" + total);
    
  }
}
