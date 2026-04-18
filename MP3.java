
/**
 * The MP3 class represents an MP3 in a Gadget Shop.
 * It extends the Gadget superclass and stores information
 * about the amount of memory available on the MP3 player.
 * It also allows information about the MP3 player's attributes to be accessed from elsewhere in the
 * programme.
 * It also plays a part in producing information to be printed to the terminal window
 * and to a log area in the graphical user interface.
 * 
 * Author: John Kirk
 * Date: 2026
 */
public class MP3 extends Gadget
{
private int memory; //attribute or field - and is an instance variable
/**constructor method which accepts a model name,model price,model weight,model size,and amount of
 * MP3 memory as parameters.*/
public MP3(String model, double price, int weight, String size, int memory)
    {
     /*the super keyword calls the constructor of the Gadget superclass and passes the local variable 
      * name as a parameter*/
     super(model,price,weight,size);
     System.out.println("Constructing an MP3 memoryinGB "+memory);
     /*the 'this' keyword differentiates the instance variable memory (this.memory), 
      * from the local memory variable that is passed as a parameter by the constructor method 
      * (memory). The purpose of this is to provide the initial value of the memory instance
      * variable.*/
     this.memory=memory;
     System.out.println("finished constructing an MP3 memoryinGB "+memory);
    }
   
    /**instance method which takes the parameters, the song track number and MP3 Memory and uses them to add
     * music to the MP3 player.*/
    double AddTrack(int number, int memory)
    {
        switch(number)
        {
        /*messages which are used to inform the user of the MP3 player that the MP3 player memory is
         * either full or almost full.*/
        case 0: System.out.println("MP3 Memory Full");break;
        case 1: System.out.println("Memory almost Full");break;
        default: System.out.println("some other value than 0 or 1"); break;
        
    }
    System.out.println(model+"AddTrack"+memory);
    if (number<=0 || number>=memory)
    {
        if (number<=memory)
        {
        /*prints these messages to the terminal if the song track size is less than or equal to the
         * MP3 memory space.*/
        System.out.println("tracks added" + number);
        System.out.println("Memory Space"+memory+number);
        }
        if (number>=memory)
        {
        /*prints this message to the terminal if the song track size is greater than or equal to the
         * MP3 memory space.*/
        System.out.println("insufficient memory space" +number);
        }
    }
    /**method which returns the current amount of MP3 memory instance variable*/
    return memory;
}
}

