
/**
 * The Mobile class represents a mobile phone in a Gadget Shop.
 * It extends the Gadget superclass and stores information
 * about the amount of calling credit available on the mobile.
 * It also allows information about the mobile phone's attributes to be accessed from elsewhere in the
 * programme.
 * It also plays a part in producing information to be printed to the terminal window
 * and to a log area in the graphical user interface.
 * 
 * Author: John Kirk
 * Date: 2026
 */
public class Mobile extends Gadget
{
    private int callingcredit; //attribute or field - and is an instance variable
    /**constructor method which accepts a model name,model price,model weight,model size,and amount of
     * callingcredit as parameters.*/
    public Mobile(String model, double price, int weight, String size, int callingcredit)
    {
        /*the super keyword calls the constructor of the Gadget superclass and passes the local variable 
         * name as a parameter*/
        super(model,price,weight,size);
        System.out.println("Constructing a Mobile "+ callingcredit);
        /*the 'this' keyword differentiates the instance variable callingcredit (this.callingcredit), 
         * from the local callingcredit variable that is passed as a parameter by the constructor method 
         * (callingcredit). The purpose of this is to provide the initial value of the callingcredit
         * instance variable.*/
        this.callingcredit=callingcredit;
        System.out.println("finished constructing a Mobile "+callingcredit);
    }

    /**modifier method which takes as a parameter a new amount of calling credit to be added and adds this to
     * the existing calling credit*/
    public void addcallingcredit(int amount){
        if (amount > 0){
            /*if no calling credit amount is entered in the addcallingcredit field we skip to the
            code after the 'else' statement.*/
            callingcredit += amount; 
            System.out.println(amount + "number of callingminutes added Updated Balance: " +
                callingcredit + " minutes ");
            /*the value of the local callingcredit variable is passed as a parameter of the
            addcallingcredit method and this represents the calling credit being added. The value
            is then added to the current amount of calling credit in the instance variable
            (this.callingcredit)*/
        }else{
            /*prints a message to the terminal asking the user to add the amount of calling credit
            on the mobile phone.*/
            System.out.println("Enter the amount of calling credit on phone");
        }
    }

    /**instance method which takes the parameters, the phone number and call duration to produce information
     * about the length of time a mobile phone user had called a number for.*/
    double MakeCall(String phonenumber, int callduration){
        if (callduration<=0 || callduration>=callingcredit)
        {
        if (callduration<=callingcredit)
        {    
            /*prints these messages to the terminal if the call duration is less than or equal to
             * the calling credit.*/
            System.out.println("Dialling" + phonenumber + "for" + callduration + "minutes");
            System.out.println("Calling Credit left" + callingcredit + "minutes");
        }
        if (callduration>=callingcredit)
        {
            /*prints this message to the terminal if the call duration is greater than or equal to
             * the calling credit.*/
            System.out.println("Not enough calling credit to dial this number for" + callduration +
            "minutes");
        }
        }
        /**method which returns the current amount of calling credit instance variable*/
        return callingcredit;
    }
}

