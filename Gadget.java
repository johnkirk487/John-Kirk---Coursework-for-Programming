

public class Gadget
{
  public String model;//An instance variable which identifies the model's name.
  private double price;//An instance variable which identifies the model's price.
  private int weight;//An instance variable which identifies the model's weight.
  private String size;//An instance variable which identifies the model's size.
  
 /**constructor method which accepts a model name,model price,model weight, and model
  * size as parameters.*/
  public Gadget(String model, double price, int weight, String size)
  {
      
      this.model=model;//assignment of user passed model to class variable model.
      this.price=price;//assignment of user passed price to class variable price.
      this.weight=weight;//assignment of user passed weight to class variable weight.
      this.size=size;//assignment of user passed size to class variable size.
  }
  /**Outlines how the model should be shown
   * as a string.*/
  @Override public String toString() {
        return "Gadget{model='"+ model + "'}";//The model should be displayed in this style.
    }
  /**The display method which prints the gadget's model details 
   * in the programme.*/
    public void display()
  {
      System.out.println("Model " +model); //The gadget's model name printed.
      System.out.println("Price £" +price); //The gadget's model price printed.
      System.out.println("Weight kg "+ weight); //The gadget's model weight printed.
      System.out.println("Size" + size);//The gadget's model size printed.
      
  }
}
