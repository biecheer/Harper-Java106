import java.util.ArrayList;

/**
 * Class that models a single State in the USA.
 *
 * Used to review the concept of looping on an Array and ArrayList
 * by adding each county's population to get the total population
 * of the State.
 *
 * Testing ....
 *
 * For Loop
 *    Array
 *    ArrayList
 * For Each Loop
 *    Array
 *    ArrayList
 * While Loop
 *    Array
 *    ArrayList using indexes
 *    ArrayList using Iterators
 *
 * @author Bieche 07/20/2011
 */
public class State
{
   /**
    * State's two character abbreviation
    */
   private String abbreviation;

   /**
    * State's full name
    */
   private String name;

   /**
    * State's motto
    */
   private String motto;

   /**
    * ArrayList of Counties that make up the State
    */
   private ArrayList<County> countiesAsArrayList;

   /**
    * array of Counties that make up the State
    */
   private County [] countiesAsArray;

   /**
    * Constructor.
    *
    * @param abbrieviation
    * @param name
    * @param motto
    */
   public State(String abbrieviation, String name, String motto)
   {
      this.abbreviation = abbrieviation;
      this.name = name;
      this.motto = motto;

      this.countiesAsArray = new County[10];
      this.countiesAsArrayList = new ArrayList< County >();
   }

   /**
    * @return the abbreviation
    */
   public String getAbbrieviation()
   {
      return abbreviation;
   }

   /**
    * @param abbrieviation the abbreviation to set
    */
   public void setAbbrieviation(String abbrieviation)
   {
      this.abbreviation = abbrieviation;
   }

   /**
    * @return the name
    */
   public String getName()
   {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * @return the motto
    */
   public String getMotto()
   {
      return motto;
   }

   /**
    * @param motto the motto to set
    */
   public void setMotto(String motto)
   {
      this.motto = motto;
   }

   /**
    * @return the countiesAsArrayList
    */
   public ArrayList< County > getCountiesAsArrayList()
   {
      return countiesAsArrayList;
   }

   /**
    * Add a County object to the ArrayList
    * @param county to add
    */
   public void addCountyToArrayList(County county)
   {
      this.countiesAsArrayList.add(county);
   }

   /**
    * @return the countiesAsArray
    */
   public County[] getCountiesAsArray()
   {
      return countiesAsArray;
   }

   /**
    * Add a County object to the Array.  If the array is full then print
    * an error message.
    *
    * @param county to add.
    */
   public void addCountyToArray(County county)
   {
      for(int index = 0; index < countiesAsArray.length; index++)
      {
         if(countiesAsArray[index] == null)
         {
            countiesAsArray[index] = county;
            return;
         }
      }

      System.out.println("Error: Can't add county since array is full: " + county);
   }//End of addCountyToArray

   ////////////////////////////////////////////////////////////////////////
   //////////////////////////////// ARRAY  ////////////////////////////////
   ////////////////////////////////////////////////////////////////////////

   /**
    * @return State's total population by summing up each county's population
    */
   public int getPopulationFromArrayUsingForLoop()
   {
      //TODO - Write code to return the Total State population by
      //       summing up each of it's county's population using
      //       the Array of County objects with a for loop

      return 0;
   }//End of getPopulationFromArrayUsingForLoop

   /**
    * @return State's total population by summing up each county's population
    */
   public int getPopulationFromArrayUsingWhileLoop()
   {
      //TODO - Write code to return the Total State population by
      //       summing up each of it's county's population using
      //       the Array of County objects with a while loop

      return 0;
   }//End of getPopulationFromArrayUsingWhileLoop

   /**
    * @return State's total population by summing up each county's population
    */
   public int getPopulationFromArrayUsingForEachLoop()
   {
      //TODO - Write code to return the Total State population by
      //       summing up each of it's county's population using
      //       the Array of County objects with a for each loop

      return 0;
   }//End of getPopulationFromArrayUsingForEachLoop

   /////////////////////////////////////////////////////////////////////////////////////
   //////////////////////////////////// ARRAY LIST /////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////////////////

   /**
    * @return State's total population by summing up each county's population
    */
   public int getPopulationFromArrayListUsingWhileLoopWithIndexes()
   {
      //TODO - Write code to return the Total State population by
      //       summing up each of it's county's population using
      //       the ArrayList of County objects with a while loop using
      //       indexes

      return 0;
   }//End of getPopulationFromArrayListUsingWhileLoopWithIndexes

   /**
    * @return State's total population by summing up each county's population
    */
   public int getPopulationFromArrayListUsingForLoopWithIndexes()
   {
      //TODO - Write code to return the Total State population by
      //       summing up each of it's county's population using
      //       the ArrayList of County objects with a for loop using
      //       indexes

      return 0;
   }//End of getPopulationFromArrayListUsingForLoopWithIndexes

   /**
    * @return State's total population by summing up each county's population
    */
   public int getPopulationFromArrayListUsingForEachLoop()
   {
      //TODO - Write code to return the Total State population by
      //       summing up each of it's county's population using
      //       the ArrayList of County objects with a for each loop

      return 0;
   }//End of getPopulationFromArrayListUsingForEachLoop

   /**
    * @return State's total population by summing up each county's population
    */
   public int getPopulationFromArrayListUsingWhileLoopWithIterators()
   {
      //TODO - Write code to return the Total State population by
      //       summing up each of it's county's population using
      //       the ArrayList of County objects with a while loop
      //       using an Iterator

      return 0;
   }//End of getPopulationFromArrayListUsingWhileLoopWithIterators

   /**
    * return the String representation of the State object.
    */
   public String toString()
   {
      return "State: " + this.name + " abbr: " + this.abbreviation + " motto: " + this.motto;
   }

}//End of Class
