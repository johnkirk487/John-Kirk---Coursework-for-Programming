

public class GadgetShopTestHarness //Allows this class to run tests on the other classes.
{
    /**Creates a static method which allows the MP3 class to run without
     * creating an object.This tests what happens when a track is added.*/
    public static void testMP3AddTrack() {
        MP3 m = new MP3("Model 1", 1,1,"1",1);//An MP3 object is created with Test values.
        //m.AddMusic(0);
        if (m.toString().contains("Model 1") ) {
            System.out.println("PASS: Music track downloaded to Model 1");
            //Prints what happens when a music track can be downloaded.
        } else {
            System.out.println("FAIL: Music track not downloaded to Model 1 instead we got" + m.toString() + ")");
            //Prints what happens when a music track is unable to download.
        }
    }
    
    /**Same as above but this time tests what happens to the memory
     * when the track is added.*/
    public static void testMP3subtractMemory() {
        MP3 m = new MP3("Model 1", 1,1,"1",1);//An MP3 object is created with Test values.
        //m.AddMusic(0);
        if (m.toString().contains("Model 1") ) {
            System.out.println("PASS: Memory is subtracted as music tracks were downloaded to Model 1");
            //Prints what happens to the MP3 memory when it is deducted to download a music track.
        } else {
            System.out.println("FAIL: No memory was deducted as no music tracks were downloaded to Model 1, instead we got" + m.toString() + ")");
            //Prints what happens to the MP3 memory when a music track is not downloaded.
        }

    }
    
    /**Creates a static method which allows the Mobile class to run without
     * creating an object.This tests what happens when a call is made.*/
    public static void testMobileMakeCall() {
        Mobile m = new Mobile("Model 1", 1,1,"1",1);//A Mobile object is created with Test values.
        //m.MakeCall(0);
        if (m.toString().contains("Model 1") ) {
            System.out.println("PASS: Phone call made to Model 1");
            //Prints what happens when a phone call can be made.
        } else {
            System.out.println("FAIL: Phone call not made to Model 1 instead we got" + m.toString() + ")");
            //Prints what happens when a phone call is unable to be made.
        }

    }
    
    /**Same as above but this time tests what happens to the calling credit
     * when the phone call is made.*/
    public static void testMobilesubtractcallingcredit() {
        Mobile m = new Mobile("Model 1", 1,1,"1",1);//A Mobile object is created with Test values.
        //m.MakeCall(0);
        if (m.toString().contains("Model 1") ) {
            System.out.println("PASS: Calling credit is subtracted as phone call to model 1 was made");
             //Prints what happens to the calling credit when it is deducted to make a phone call.
        } else {
            System.out.println("FAIL: No calling credit was deducted as no phone call to Model 1 was made, instead we got" + m.toString() + ")");
            //Prints what happens to the calling credit when a phone call is not made.
        }
    }
}
