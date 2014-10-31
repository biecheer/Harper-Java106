/**
 * Class that models a single County in the USA within a State.
 *
 * @author Bieche 07/20/2011
 */
public class County
{
   /**
    * Used to hold the County's name
    */
   private String name;

   /**
    * Used to hold the County's population
    */
   private int population;

   /**
    * Constructor.
    * @param name
    * @param population
    */
   public County(String name, int population)
   {
      this.name = name;
      this.population = population;
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
    * @return the population
    */
   public int getPopulation()
   {
      return population;
   }

   /**
    * @param population the population to set
    */
   public void setPopulation(int population)
   {
      this.population = population;
   }

   /**
    * return a String representation of the County object.
    */
   public String toString()
   {
      return this.name;
   }

}//End of Class
