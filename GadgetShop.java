/**imports the components which allow the JavaFX Application to function.*/
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class GadgetShop extends Application {
    /**Creates various text fields for the input features.*/
    private final TextField modelField1 = new TextField();
    private final TextField modelField2 = new TextField();
    //Field1 indicates the MP3 while Field2 indicates the Mobile.
    //These are text fields for the model name.
    private final TextField priceField1 = new TextField();
    private final TextField priceField2 = new TextField();
    //These are text fields for the model price.
    private final TextField weightField1 = new TextField();
    private final TextField weightField2 = new TextField();
    //These are text fields for the model weight.
    private final TextField sizeField1 = new TextField();
    private final TextField sizeField2 = new TextField();
    //These are text fields for the model size.
    private final TextField memoryField1 = new TextField();
    private final TextField memoryField2 = new TextField();
    //These are text fields for the MP3's memory and Mobile's calling credit.
    private final TextField phonenumberField = new TextField();
    //This is the text field for the phone number associated with the mobile model.
    private final TextField calldurationField = new TextField();
    //This is the text field for the length of the phone call made using the mobile model.
    private final TextField downloadsizeField = new TextField();
    //This is the text field for the size of the music track downloaded to the MP3 model.
    private final TextField displaynumberField = new TextField();
    //This is the text field for the display number.
    private final TextArea logArea = new TextArea();
    //This is the text field for the log area.
    private final TextArea outputArea = new TextArea();
    //This is the text field for the output area.
    private final ArrayList<Gadget> gadgets = new ArrayList<>();
    //The array list which stores all the gadgets created in the programme.
    
    @Override
    public void start(Stage stage){
        /**A pane layout is made where the buttons,labels and textfields are positioned based on co-ordinates
         * given */
        Pane root = new Pane();
        
        Label modelLabel1 = new Label("MP3 model:");
        modelLabel1.setLayoutX(20);
        modelLabel1.setLayoutY(5);
        modelField1.setLayoutX(125);
        modelField1.setLayoutY(0);
        //The components for the MP3 model text box and label.
        Label modelLabel2 = new Label("Mobile model:");
        modelLabel2.setLayoutX(295);
        modelLabel2.setLayoutY(5);
        modelField2.setLayoutX(390);
        modelField2.setLayoutY(0);
        //The components for the Mobile model text box and label.
        Label priceLabel1 = new Label("MP3 price:");
        priceLabel1.setLayoutX(20);
        priceLabel1.setLayoutY(30);
        priceField1.setLayoutX(125);
        priceField1.setLayoutY(25);
        //The components for the MP3 price text box and label.
        Label priceLabel2 = new Label("Mobile price:");
        priceLabel2.setLayoutX(295);
        priceLabel2.setLayoutY(30);
        priceField2.setLayoutX(390);
        priceField2.setLayoutY(25);
        //The components for the Mobile price text box and label.
        Label weightLabel1 = new Label("MP3 weight:");
        weightLabel1.setLayoutX(20);
        weightLabel1.setLayoutY(55);
        weightField1.setLayoutX(125);
        weightField1.setLayoutY(50);
        //The components for the MP3 weight text box and label.
        Label weightLabel2 = new Label("Mobile weight:");
        weightLabel2.setLayoutX(295);
        weightLabel2.setLayoutY(55);
        weightField2.setLayoutX(390);
        weightField2.setLayoutY(50);
        //The components for the Mobile weight text box and label.
        Label sizeLabel1 = new Label("MP3 size:");
        sizeLabel1.setLayoutX(20);
        sizeLabel1.setLayoutY(80);
        sizeField1.setLayoutX(125);
        sizeField1.setLayoutY(75);
        //The components for the MP3 size text box and label.
        Label sizeLabel2 = new Label("Mobile size:");
        sizeLabel2.setLayoutX(295);
        sizeLabel2.setLayoutY(80);
        sizeField2.setLayoutX(390);
        sizeField2.setLayoutY(75);
        //The components for the Mobile size text box and label.
        Label memoryLabel1 = new Label("MP3 memory:");
        memoryLabel1.setLayoutX(20);
        memoryLabel1.setLayoutY(105);
        memoryField1.setLayoutX(125);
        memoryField1.setLayoutY(100);
        //The components for the MP3 memory text box and label.
        Label memoryLabel2 = new Label("Calling credit:");
        memoryLabel2.setLayoutX(295);
        memoryLabel2.setLayoutY(105);
        memoryField2.setLayoutX(390);
        memoryField2.setLayoutY(100);
        //The components for the Mobile calling credit text box and label.
        Label calldurationLabel = new Label("Call Duration:");
        calldurationLabel.setLayoutX(295);
        calldurationLabel.setLayoutY(130);
        calldurationField.setLayoutX(390);
        calldurationField.setLayoutY(125);
        //The components for the Mobile call duration text box and label.
        Label phonenumberLabel = new Label("Phone Number:");
        phonenumberLabel.setLayoutX(295);
        phonenumberLabel.setLayoutY(155);
        phonenumberField.setLayoutX(390);
        phonenumberField.setLayoutY(150);
        //The components for the Mobile phone number text box and label.
        Label downloadsizeLabel = new Label("Download Size:");
        downloadsizeLabel.setLayoutX(20);
        downloadsizeLabel.setLayoutY(130);
        downloadsizeField.setLayoutX(125);
        downloadsizeField.setLayoutY(125);
        //The components for the MP3 song track download size text box and label.
        Label displaynumberLabel = new Label("Display Number:");
        displaynumberLabel.setLayoutX(20);
        displaynumberLabel.setLayoutY(155);
        displaynumberField.setLayoutX(125);
        displaynumberField.setLayoutY(150);
        //The components for the display number text box and label.
        Button addMP3Button = new Button("Add MP3");
        addMP3Button.setLayoutX(25);
        addMP3Button.setLayoutY(185);
        //The components for the Add MP3 button and label.
        Button addMobileButton = new Button("Add Mobile");
        addMobileButton.setLayoutX(105);
        addMobileButton.setLayoutY(185);
        //The components for the Add Mobile button and label.
        Button displayNumberButton = new Button("Display Number");
        displayNumberButton.setLayoutX(200);
        displayNumberButton.setLayoutY(185);
        //The components for the display number button and label.
        Button clearAllFieldsButton = new Button("Clear All Fields");
        clearAllFieldsButton.setLayoutX(312);
        clearAllFieldsButton.setLayoutY(185);
        //The components for the clear all fields button and label.
        Button makeAPhoneCallButton = new Button ("Make A Phone Call");
        makeAPhoneCallButton.setLayoutX(25);
        makeAPhoneCallButton.setLayoutY(215);
        //The components for the make a phone call button and label.
        Button downloadMusicButton = new Button ("Download A Music Track");
        downloadMusicButton.setLayoutX(145);
        downloadMusicButton.setLayoutY(215);
        //The components for the download music button and label.
        Button displayAllButton = new Button("Display All");
        displayAllButton.setLayoutX(295);
        displayAllButton.setLayoutY(215);
        //The components for the display all button and label.
        Button exitButton = new Button("Exit");
        exitButton.setLayoutX(370);
        exitButton.setLayoutY(215);
        //The components for the exit button and label.
        logArea.setLayoutX(5);
        logArea.setLayoutY(250);
        //The components for the log area.
        outputArea.setLayoutX(5);
        outputArea.setLayoutY(440);
        //The components for the output area.
        
        /**The MP3 Object is conditionally created, logged,and displayed on the GUI*/
         addMP3Button.setOnAction(e-> { //triggers the Add MP3 function when clicked.
         if (getModel1().isEmpty()){
            outputArea.appendText("Cannot create an MP3 model with no model name." + System.lineSeparator());
            return; //This message is displayed in the output area if the text submitted in the MP3 model text field is invalid.
        }
        if (priceField1.getText().isEmpty()){
            outputArea.appendText("Cannot create an MP3 model with no model price." + System.lineSeparator());
            return; //This message is displayed in the output area if the text submitted in the MP3 price text field is invalid.
        }    
        if (weightField1.getText().isEmpty()){
            outputArea.appendText("Cannot create an MP3 model with no model weight." + System.lineSeparator());
            return; //This message is displayed in the output area if the text submitted in the MP3 weight text field is invalid.
        }  
        if (sizeField1.getText().isEmpty()){
            outputArea.appendText("Cannot create an MP3 model with no model size." + System.lineSeparator());
            return; //This message is displayed in the output area if the text submitted in the MP3 model size text field is invalid.
        }    
        if (memoryField1.getText().isEmpty()){
            outputArea.appendText("Cannot create an MP3 model with no model memory." + System.lineSeparator());
            return; //This message is displayed in the output area if the text submitted in the MP3 model memory text field is invalid.
        }    
        MP3 m = new MP3(getModel1(),getPrice1(),getWeight1(),getSize1(),getMemory1()); 
        //The add MP3 button uses the inputs in the text fields of the five attributes noted above.
         gadgets.add(m);
         System.out.println("Add MP3 button clicked");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
              //The alert message provides confirmation that a new MP3 has been successfully added.
            alert.setTitle("Message");
              //Outlines the title of the alert message.
            alert.setHeaderText("You successfully added a new MP3");
              //Outlines the header of the alert message.
            alert.setContentText("Click OK to dismiss");
              //Outlines how the user can dismiss the message.
         if(alert.showAndWait().get() == ButtonType.OK) {
             //Allows the user to dismiss the message.
        }
         logArea.appendText("Added:"+ m + System.lineSeparator());
         //How the message of the MP3 being added is displayed in the output area.
         m.display(); 
         });
         
        /**The Mobile Object is conditionally created, logged,and displayed on the GUI*/
        addMobileButton.setOnAction(e-> { //triggers the Add Moblie function when clicked.
        if (getModel2().isEmpty()){
            outputArea.appendText("Cannot create a Mobile model with no model name." + System.lineSeparator());
            return; //This message is displayed in the output area if the text submitted in the Mobile model text field is invalid.
        }
        if (priceField2.getText().isEmpty()){
            outputArea.appendText("Cannot create a Mobile model with no model price." + System.lineSeparator());
            return; //This message is displayed in the output area if the text submitted in the Mobile price text field is invalid.
        }    
        if (weightField2.getText().isEmpty()){
            outputArea.appendText("Cannot create a Mobile model with no model weight." + System.lineSeparator());
            return; //This message is displayed in the output area if the text submitted in the Mobile weight text field is invalid.
        }  
        if (sizeField2.getText().isEmpty()){
            outputArea.appendText("Cannot create a Mobile model with no model size." + System.lineSeparator());
            return; //This message is displayed in the output area if the text submitted in the Mobile size text field is invalid.
        }    
        if (memoryField2.getText().isEmpty()){
            outputArea.appendText("Cannot create a Mobile model with no model calling credit." + System.lineSeparator());
            return; //This message is displayed in the output area if the text submitted in the Mobile calling credit text field is invalid.
        }        
        Mobile m = new Mobile(getModel2(),getPrice2(),getWeight2(),getSize2(),getMemory2());
        //The add Mobile button uses the inputs in the text fields of the five attributes noted above.
         gadgets.add(m);
         System.out.println("Add Mobile button clicked");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            //The alert message provides confirmation that a new Mobile has been successfully added.
            alert.setTitle("Message");
            //Outlines the title of the alert message.
            alert.setHeaderText("You successfully added a new Mobile Phone");
            //Outlines the header of the alert message.
            alert.setContentText("Click OK to dismiss");
            //Outlines how the user can dismiss the message.
         if(alert.showAndWait().get() == ButtonType.OK) {
            //Allows the user to dismiss the message.
        }
         logArea.appendText("Added:"+ m + System.lineSeparator());
          //How the message of the Mobile being added is displayed in the output area.
         m.display();
        });

        /**triggers the Display All function when clicked and outlines how it should be presented on the GUI.*/
        displayAllButton.setOnAction(e->{ //The programme displays all mobiles and MP3s added when clicked. 
         if (gadgets.isEmpty()){
         outputArea.appendText("No gadgets to display"+ System.lineSeparator());
        //How the message of "no gadgets to display" is shown in the output area.
         return;
        }
        outputArea.appendText(" The gadgets are "+ System.lineSeparator());
        //This statement appears in the output area followed by the model names.
        for (Gadget g: gadgets) {
        //Loops every gadget that has been added.
             outputArea.appendText(g.toString() + System.lineSeparator());
        //Allows the programme to display each model in the form of a list.
             g.display();
        }
        });
        
        /**Everytime a phone call is made, it appears in the log area that a call has been made followed by the display number, call duration,
         * and how much calling credit is left. However, a message will appear in the output area asking for the display number to be added in
         * order for the phone call to be made.*/
        makeAPhoneCallButton.setOnAction(e->{ //The programme simulates making a phone call when clicked. 
        int index = getdisplaynumber (); //The display number must be entered for the button to work.
        if(index !=-1){ //Analyses the display number to determine if it is valid.
         try {
            Mobile p = (Mobile) gadgets.get(index);
            // The gadget collected is used to make the phone call.
            int duration = Integer.parseInt(calldurationField.getText());
            // The duration of the call comes from the call duration text field.
            int currentcredit = Integer.parseInt(memoryField2.getText());
            // The current credit comes from the calling credit memory text field. 
            int newcredit = currentcredit - duration;
            // The new credit after the call is made is calculated by subtracting the
            // call duration from the current credit.
            int setcredit = newcredit;
            // The new credit is shown on the GUI.
            if  (currentcredit < duration) {
                output("Not enough calling credit to make this call."); return ;
                // The output area displays this message if there is insufficient calling
                // credit. The return keyword stops the call from being made.
            }
            if (newcredit < 0) {
                newcredit = 0;
                //Ensures the calling credit is always positive.
            }
            logArea.appendText("Phone call made using ");
            logArea.appendText("Model:" + getModel2() + System.lineSeparator());
            logArea.appendText("Display Number:" + index + System.lineSeparator());
            logArea.appendText("Duration:" + duration + System.lineSeparator());
            logArea.appendText("Credit Left: " + setcredit + System.lineSeparator());
            //All the call details are logged in the log area.
        } catch(NumberFormatException a){
            output("Please enter the display number");
            //This message appears in the output area if the display number is incorrect.
        } catch(ClassCastException a){
            output("Wrong gadget has been chosen");
            //This  message appears in the output area if the gadget selected is an MP3.
        }
        }
        });
        
         /**Everytime a music track is downloaded, it appears in the log area that a track has been made downloaded by the display number, download size,
         * and how much MP3 memory is left. However, a message will appear in the output area asking for the display number to be added in
         * order for the music track to be downloaded.*/
        downloadMusicButton.setOnAction(e->{ //The programme simulates downloading a music track when clicked. 
        int index = getdisplaynumber (); //The display number must be entered for the button to work.
        if(index !=-1){ //Analyses the display number to determine if it is valid.
        try{
            MP3 p = (MP3) gadgets.get(index);
            // The gadget collected is used to download the music track.
            int size = Integer.parseInt(downloadsizeField.getText());
            // The download size of the music track comes from the download size text field.
            int MP3memory = Integer.parseInt(memoryField1.getText());
            // The MP3 memory comes from the MP3 memory text field. 
            int newmemory = MP3memory - size;
            // The new MP3 memory after the track has been downloaded is calculated by subtracting the
            // download size from the MP3 memory.
            int setmemory = newmemory;
            // The new MP3 memory is shown on the GUI.
            if  (MP3memory < size) {
                output("Not enough MP3 memory to download music track."); return ;
                // The output area displays this message if there is insufficient MP3
                // memory. The return keyword stops the music track from being downloaded.
            }
            if (newmemory < 0) {
                newmemory = 0;
                //Ensures the MP3 memory is always positive.
            }
            logArea.appendText("Music downloaded onto ");
            logArea.appendText("Model:" + getModel1() +  System.lineSeparator());
            logArea.appendText("Display Number:" + getdisplaynumber() +  System.lineSeparator());
            logArea.appendText("Download Size:" + size + System.lineSeparator());
            logArea.appendText("Memory Left: " + setmemory + System.lineSeparator());
            //All the download details are logged in the log area.
        }catch(NumberFormatException a){
            output("Please enter valid numbers");
            //This message appears in the output area if the display number is incorrect.
        }catch(ClassCastException a){
            output("Wrong gadget has been chosen");
            //This  message appears in the output area if the gadget selected is a Mobile.
        }
        }
        });    
        
        /**Every field that needs to be cleared is outlined
         so that they are removed when the user clicks the Clear All Fields Button.*/
         clearAllFieldsButton.setOnAction(e-> { //triggers Clear All function when clicked.    
         modelField1.clear();
         modelField2.clear();
         //Clears the mobile and MP3 model text fields.
         priceField1.clear();
         priceField2.clear();
         //Clears the mobile and MP3 price text fields.
         weightField1.clear();
         weightField2.clear();
         //Clears the mobile and MP3 weight text fields.
         sizeField1.clear();
         sizeField2.clear();
         //Clears the mobile and MP3 size text fields.
         memoryField1.clear();
         memoryField2.clear();
         //Clears the mobile calling credit and MP3 memory text fields.
         phonenumberField.clear();
         //Clears phone number text field.
         calldurationField.clear();
         //Clears the call duration text field.
         downloadsizeField.clear();
         //Clears the download size text field.
         displaynumberField.clear();
         //Clears the display number text field.
         log("Cleared all fields");
         //Message displayed in the log area when all fields are cleared.
        });
        
        /**The Display Number appears when this button is clicked which is the index number for how many gadgets have
         * been added to the programme.*/
        displayNumberButton.setOnAction(e->{ //triggers Clear All function when clicked. 
           for (int i= 0;i < gadgets.size();i++){//loops every gadget that has been added.
             outputArea.appendText("Display Number:"+ i + System.lineSeparator());
             //Allows the display number to appear in the output area.
             Gadget g = gadgets.get(i);
             g.display();
             outputArea.appendText("");
             //Allows the entries for the gadgets to appear in the form of a list.
            }
        });        
        
        /**the application is closed when the user clicks ok and a confirmation dialog is used to ensure
         * the user is certain they want to close the programme.*/
        exitButton.setOnAction(e-> {//triggers exit function when clicked. 
            System.out.println("Exit button clicked");
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            //The alert message provides the user an option as to whether they want to exit the application.
            alert.setTitle("Exit Application");
            //Outlines the title of the alert message.
            alert.setHeaderText("Are you sure you want to exit?");
            //Outlines the header of the alert message.
            alert.setContentText("Click OK to exit or Cancel to continue.");
            //Outlines how the two options for how the user can dismiss the message.
            if(alert.showAndWait().get() == ButtonType.OK) {
            //Allows the user to dismiss the message.
            Platform.exit();
        }
        });
        
        /**Ensures the buttons, labels and textfields are added to the root pane.*/
        root.getChildren().addAll(
        modelLabel1,
        modelLabel2,
        //Allows the MP3 and Mobile model labels to appear in the GUI.
        modelField1,
        modelField2, 
        //Allows the MP3 and Mobile model text fields to appear in the GUI.
        priceLabel1,
        priceLabel2,
        //Allows the MP3 and Mobile price labels to appear in the GUI.
        priceField1,
        priceField2,
        //Allows the MP3 and Mobile price text fields to appear in the GUI.
        weightLabel1,
        weightLabel2,
        //Allows the MP3 and Mobile weight labels to appear in the GUI.
        weightField1,
        weightField2,
        //Allows the MP3 and Mobile weight text fields to appear in the GUI.
        sizeLabel1,
        sizeLabel2,
        //Allows the MP3 and Mobile size labels to appear in the GUI.
        sizeField1,
        sizeField2,
        //Allows the MP3 and Mobile size text fields to appear in the GUI.
        memoryLabel1,
        memoryLabel2,
        //Allows the MP3 memory and Mobile calling credit labels to appear in the GUI.
        memoryField1,
        memoryField2,
        //Allows the MP3 memory and Mobile calling credit text fields to appear in the GUI.
        phonenumberLabel,
        //Allows the phone number label to appear in the GUI.
        phonenumberField,
        //Allows the phone number text field to appear in the GUI.
        calldurationLabel,
        //Allows the call duration label to appear in the GUI.
        calldurationField,
        //Allows the call duration text field to appear in the GUI.
        downloadsizeLabel,
        //Allows the download size label to appear in the GUI.
        downloadsizeField,
        //Allows the download size text field to appear in the GUI.
        displaynumberLabel,
        //Allows the display number label to appear in the GUI.
        displaynumberField,
        //Allows the display number text field to appear in the GUI.
        addMP3Button,
        //Allows the add MP3 button to appear in the GUI.
        addMobileButton,
        //Allows the add mobile button to appear in the GUI.
        displayAllButton,
        //Allows the display all button to appear in the GUI.
        clearAllFieldsButton,
        //Allows the clear all fields button to appear in the GUI.
        exitButton,
        //Allows the exit button to appear in the GUI.
        displayNumberButton,
        //Allows the display number button to appear in the GUI.
        makeAPhoneCallButton,
        //Allows the make a phone call button to appear in the GUI.
        downloadMusicButton,
        //Allows the download music button to appear in the GUI.
        logArea,
        //Allows the log area to appear in the GUI.
        outputArea);
        //Allows the output area to appear in the GUI.
        stage.setScene(new Scene(root, 560, 640));
        //Calculates the size of the GUI window when it appears on screen.
        stage.setTitle("Gadget Shop GUI");
        //Allows the title of the GUI to appear in the GUI.
        stage.show();
        //Allows the GUI to appear on screen.
    
        }
    /**Try and catch statements help to display text from the model and size fields,
      *and text in the numeric fields are converted into integers.*/    
    private String getModel1() {//Works with the MP3 Model name in the input field.
        try {
            String model = modelField1.getText().trim();
            //Analyses the text in the MP3 Model text field.
            if (model.isEmpty()){
                output("Be advised, your model name is not specified");
                //Checks to see if it is empty.
                return null; //Indicates invalid input.
            }
            return model; //The return keyword prompts the user to rewrite the input.
        } catch (Exception e) {
            output("An error has occurred while processing the model name.");
            //Searches for any errors.
            return null;
        }
    }
    private String getModel2() {//Works with the Mobile Model name in the input field. 
        try {
            String model = modelField2.getText().trim();
            //Analyses the text in the Mobile Model text field.
            if (model.isEmpty()){
                output("Be advised, your model name is not specified");
                //Checks to see if it is empty.
                return null; //Indicates invalid input.
            }
            return model; //The return keyword prompts the user to rewrite the input.
        } catch (Exception e) {
            output("An error has occurred while processing the model name.");
            //Searches for any errors.
            return null;
        }
    }
    private int getPrice1() {//Works with the MP3 Price in the input field.
        try {
            return Integer.parseInt(priceField1.getText().trim());
            //Analyses the text in the MP3 Price text field. 
        } catch (Exception e) {
            output("Be advised, the price is not a number.");
            //Searches for any errors.
            return-1;
        }  
    }    
    private int getPrice2() {//Works with the Mobile Price in the input field.
        try {
            return Integer.parseInt(priceField2.getText().trim());
            //Analyses the text in the Mobile Price text field.
        } catch (Exception e) {
            output("Be advised, the price is not a number.");
            //Searches for any errors.
            return-1;
        }
    }
    private int getWeight1() {//Works with the MP3 Weight in the input field.
        try {
            return Integer.parseInt(weightField1.getText().trim());
            //Analyses the text in the MP3 Weight text field.
        } catch (Exception e) {
            output("Be advised, the weight is not a number.");
            //Searches for any errors.
            return-1;
        }
    }
    private int getWeight2() {//Works with the Mobile Weight in the input field.
        try {
            return Integer.parseInt(weightField2.getText().trim());
            //Analyses the text in the Mobile Weight text field.
        } catch (Exception e) {
             output("Be advised, the weight is not a number.");
            //Searches for any errors.
            return-1;
        } 
    }
    private String getSize1() {//Works with the MP3 Size in the input field.
        try {
            String size = sizeField1.getText().trim();
            //Analyses the text in the MP3 Size text field.
            if (size.isEmpty()){
                output("Be advised, your model size is not specified.");
                //Checks to see if it is empty.
                return null;//Indicates invalid input.
            }
            return size;//The return keyword prompts the user to rewrite the input.
        } catch (Exception e) {
            output("An error has occurred while processing the model size.");
            //Searches for any errors.
            return null;
        }
    }
    private String getSize2() {//Works with the Mobile Size in the input field.
        try {
            String size = sizeField2.getText().trim();
            //Analyses the text in the Mobile Size text field.
            if (size.isEmpty()){
                output("Be advised, your model name is not specified.");
                //Checks to see if it is empty.
                return null;//Indicates invalid input.
            }
            return size;//The return keyword prompts the user to rewrite the input.
        } catch (Exception e) {
            output("An error has occurred while processing the model size.");
            //Searches for any errors.
            return null;
        }
    }
    private int getMemory1() {//Works with the MP3 Memory in the input field.
        try {
            return Integer.parseInt(memoryField1.getText().trim());
            //Analyses the text in the MP3 Memory text field.
        } catch (Exception e) {
             output("Be advised, the MP3 memory is not a number.");
            //Searches for any errors.
            return-1;
        } 
    }
    private int getMemory2() {//Works with the Mobile Calling Credit in the input field.
        try {
            return Integer.parseInt(memoryField2.getText().trim());
            //Analyses the text in the Mobile Calling Credit text field.
        } catch (Exception e){
             output("Be advised, the mobile calling credit is not a number.");
            //Searches for any errors.
            return-1;}     
    }
    private int getdisplaynumber(){//Works with the Display Number in the input field.
        int number = -1;
        try {
            number = Integer.parseInt(displaynumberField.getText());
            //Analyses the text in the Display Number text field.
            if(number < 0 || number >= gadgets.size()){
                output("Incorrect display number");
                //Searches for whether the display number is valid.
                number = -1;}
        } catch(Exception e){
            //Prompts the user to enter a correct display number.
            output("Please enter the display number");}    
        return number;
    }
    private void log(String msg){
        logArea.appendText(msg + System.lineSeparator());
        //Allows messages to be sent to the log area.
        }
    private void output(String msg){
        outputArea.appendText(msg + System.lineSeparator());
        //Allows messages to be sent to the output area.
    }
    /**Allows the JavaFX Application to be launched by the user.*/  
        public static void main(String[] args) { launch(); }
    }

