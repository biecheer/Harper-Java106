 /**
  * Driver used for CIS 106 MidTerm/Final Review....
  *
  * To run/test your code in BlueJ all you have to do is
  *
  * 1.  Compile all classes
  * 2.  Right click on the Java106Driver class
  * 3.  Select the void main{String [] args} method
  * 4.  Click OK
  * 5.  See the results
  * 
  * To clear out the results between runs just select the Options menu and click on Clear.
  * Or Ctrl-K
  * 
  * Also, please remember to not get hung up on the other pieces of code, this is really 
  * meant to review the concept of LOOPs.  However, if you want to see examples of 
  * getters/setters/constructors of classes the State and County class can be reviewed.
  * 
  * Good luck on the midterm !!!!!
  * 
  * @author Bieche 07/20/2011
  */
public class Java106Driver
{
   /**
    * @param args Command line arguments if any...
    */
   public static void main(String[] args)
   {
      // Create an instance of the State of IL
      State state = new State("IL", "Illinois", "Land of Lincoln");
      //StateAnswers state = new StateAnswers("IL", "Illinois", "Land of Lincoln");
      
      // Create some counties of IL with some 'bogus' populations.
      // Note: Expected Total population with this example is 10,000
      County county1 = new County("DeKalb", 1000);
      County county2 = new County("Kane", 2000);
      County county3 = new County("Cook", 3000);
      County county4 = new County("Lake", 4000);

      // Add the countys to the Array
      state.addCountyToArray(county1);
      state.addCountyToArray(county2);
      state.addCountyToArray(county3);
      state.addCountyToArray(county4);

      // Add the countys to the ArrayList
      state.addCountyToArrayList(county1);
      state.addCountyToArrayList(county2);
      state.addCountyToArrayList(county3);
      state.addCountyToArrayList(county4);
      
      // Get the Total Population each of the different ways.
      System.out.println(state + " Population:");
      System.out.println("Using ArrayList and for each loop             = " + state.getPopulationFromArrayListUsingForEachLoop());
      System.out.println("Using ArrayList and for loop                  = " + state.getPopulationFromArrayListUsingForLoopWithIndexes());
      System.out.println("Using ArrayList and while loop                = " + state.getPopulationFromArrayListUsingWhileLoopWithIndexes());
      System.out.println("Using ArrayList and while loop with Iterators = " + state.getPopulationFromArrayListUsingWhileLoopWithIterators());
      System.out.println("Using Array and for each loop                 = " + state.getPopulationFromArrayUsingForEachLoop());
      System.out.println("Using Array and for loop                      = " + state.getPopulationFromArrayUsingForLoop());
      System.out.println("Using Array and while loop                    = " + state.getPopulationFromArrayUsingWhileLoop());
   }//End of main

}//End of Class
