package application;


//import java.util.Scanner;
import java.lang.classfile.Label;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderImage;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Simplyface extends Application implements EventHandler<ActionEvent>
{

       Scene scene1,scene2,scene3,scene4,scene5,scene6,scene7,scene8,scene9,scener,sceneA;
       Text Tootal=new Text("");
       Text gpa=new Text("");
       Text perce=new Text("");
       Text resu=new Text("");
       Text overallgrade=new Text("");
       Button back;
       Button result; 
       Button Done;
       Text error=new Text("");
       Button close=new Button("Close");
       TextField semester=new TextField();
       
  public static void main(String[] args) throws Exception 
  {
      launch(args);
  }



  @Override
  public void handle(ActionEvent arg0) 
  {
  
  }
  
  //METHOD TO SET SCENE TO THE STAGE
  
    private void setScene(Scene scene,ActionEvent e)
    {
 
       Node node=(Node) e.getSource();
       Stage stage=(Stage)node.getScene().getWindow();
       stage.setScene(scene);


    }
   //MTHODE TO CREATE SCENE FOR ABOUT SECTION 
    private Scene CreateAboutScene()
    {
    	
      Text text=new Text("About  Me :\r\n" + //
      "________________________________________\r\n" + //
      "This is me Zahid Ali Solangi . I am a First year software Engineering Student at Quaid-e-Awam University of Engineering Science and Technology . \r\n" + //
      "\r\n" + //
      "About Application :\r\n  ________________________________________\r\n" + //
      "This is Desktop based application named <(Grade Calculator)> For Software Engineering Department . In this application you Can get these Four Things in output \r\n" + //
      "•\tTotal Marks\r\n" + //
      "•\tOverall Percentage\r\n" + //
      "•\tGPA\r\n" + //
      "•\tOverall Grade\r\n" + //
      "By Entering your subjects marks From 1 to 8 semester . \r\n" + //
      "");
      
      Done=new Button("Done");
      Done.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
      Done.setTextFill(Color.WHITE);
      Done.setPrefSize(80, 20);
      Done.setOnAction(e->{
         setScene(scene1, e);
      });
      
      text.setWrappingWidth(600);
      text.setFont(Font.font("",FontWeight.BOLD,20));
      text.setFill(Color.BLACK);
      
      AnchorPane pane=new AnchorPane();
      
      pane.getChildren().addAll(text,Done);
      pane.setTopAnchor(text, 50.0);
      pane.setBottomAnchor(text, 50.0);
      pane.setRightAnchor(text, 50.0);
      pane.setLeftAnchor(text, 180.0);
      pane.setBottomAnchor(Done, 50.0);
      pane.setRightAnchor(Done, 50.0);

      pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));

      Scene scene=new Scene(pane,1000,530);
      
     return scene;
    }


 //THE STAART METHOD FORM WHERE APPLICATION START RUNNING 
   @Override
   public void start(Stage stage) throws Exception 
   {

     scene1=CreateFor1ststage(); 
     scene2=CreateFor1stsemester();
     scene3=CreateFor2ndsemester();
     scene4=CreateFor3rdsemester();
     scene5=CreateFor4thsemester();
     scene6=CreateFor5thsemester();
     scene7=CreateFor6thsemester();
     scene8=CreateFor7thsemester();
     scene9=CreateFor8thsemester();
     scener=CreateForResult();
     sceneA=CreateAboutScene();

     stage.setScene(scene1);
     stage.setTitle("Grade Calculator ");
     stage.setX(150);
     stage.setY(70);
     stage.setResizable(false);
     stage.show(); 
     close.setOnAction(e->{
     stage.close();
     });

    }
   
   // METHOD TO CREATE THE HOME SCREEN OF APPLICATION 
   private Scene CreateFor1ststage()
   {   

     semester.setPromptText("Enter The Semester ( 1 To 8 )");
     semester.setFocusTraversable(false);
     semester.setPrefSize(300, 40);
     semester.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

    Text text=new Text(" WELCOME TO GRADE CALCULATOR ");
    text.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,50));
    DropShadow ds=new DropShadow();
    text.setEffect(ds);

    Text tex=new Text("~~<Department Of Software Engineering>~~");
    tex.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,25));
    tex.setEffect(ds);
    text.setUnderline(true);

    Button About=new Button("About");
    About.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));
    About.setTextFill(Color.BLACK);
    About.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,18));
    About.setPrefSize(80, 20);
    About.setOnAction(e->{
    setScene(sceneA, e);
    });


    Button next=new Button("Next");
    next.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
    next.setTextFill(Color.WHITE);
    next.setPrefSize(80, 20);
    next.setOnAction(e->{
   String semesterNum=semester.getText();
// CONDITIONS FOR SEMESTER
   if(semesterNum.equals("1")){
    setScene(scene2, e);  
    error.setText("");
   }else if(semesterNum.equals("2")){
   setScene(scene3, e);
   error.setText("");
   }else if(semesterNum.equals("3")){
    setScene(scene4, e);
    error.setText("");
   }else if(semesterNum.equals("4")){
    setScene(scene5, e);
    error.setText("");
   }else if(semesterNum.equals("5")){
    setScene(scene6, e);
    error.setText("");
   }else if(semesterNum.equals("6")){
       setScene(scene7, e);
       error.setText("");
   }else if(semesterNum.equals("7")){
    setScene(scene8, e);
    error.setText("");
   }else if(semesterNum.equals("8")){
    setScene(scene9, e);
    error.setText("");

  }else{
    error.setText("Please Enter Valid  Semester No:");
    error.setFont(Font.font("Roboto",FontWeight.BOLD,25));
    error.setFill(Color.RED);
    setScene(scene1, e);

  }
  });

  close.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  close.setTextFill(Color.WHITE);
  close.setPrefSize(80, 18);



  AnchorPane pane=new AnchorPane();

  pane.getChildren().addAll(text,semester,next,close,tex,error,About);
  pane.setTopAnchor(text, 30.0);
  pane.setLeftAnchor(text, 80.0);
  pane.setTopAnchor(semester, 250.0);
  pane.setLeftAnchor(semester, 350.0);
  pane.setTopAnchor(next, 300.0);
  pane.setLeftAnchor(next, 570.0);
  pane.setTopAnchor(close, 300.0);
  pane.setLeftAnchor(close, 353.0);
  pane.setTopAnchor(tex, 93.0);
  pane.setRightAnchor(tex, 200.0);
  pane.setBottomAnchor(error, 50.0);
  pane.setLeftAnchor(error, 300.0);
  pane.setRightAnchor(About, 2.0);
  pane.setTopAnchor(About, 1.0);
  pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));
  Scene scene=new Scene(pane,1000,530);
  return scene;

}

   //METHO TO CREATE THE SCREE FOR FIRST SEMESTER 
   private Scene CreateFor1stsemester()
   {

    Text text=new Text("1st Semester ");
    text.setFont(Font.font("Roboto",FontWeight.BOLD,25));
    text.setFill(Color.valueOf("#9E0059"));

    Text sub1=new Text(" Programming Fundamentals :");
    sub1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
    Text sub2=new Text(" Computer Fundamentals :");
    sub2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
    Text sub3=new Text(" Applied Calculus :");
    sub3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
    Text sub4=new Text(" Occupational Health & Safety :");
    sub4.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
    Text sub5=new Text(" Functional English :");
    sub5.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
    Text sub6=new Text(" Applied Physics :");
    sub6.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));

    TextField field1=new TextField();
    field1.setPromptText("Enter The PF Marks With Pr");
    field1.setFocusTraversable(false);
    field1.setPrefSize(300, 40);
    field1.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

    TextField field2=new TextField();
    field2.setPromptText("Enter The CF Marks With Pr");
    field2.setFocusTraversable(false);
    field2.setPrefSize(300, 40);
    field2.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

    TextField field3=new TextField();
    field3.setPromptText("Enter The AC Marks");
    field3.setFocusTraversable(false);
    field3.setPrefSize(300, 40);
    field3.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

    TextField field4=new TextField();
    field4.setPromptText("Enter The OHS Marks");
    field4.setFocusTraversable(false);
    field4.setPrefSize(300, 40);
    field4.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField field5=new TextField();
   field5.setPromptText("Enter The FE Marks");
   field5.setFocusTraversable(false);
   field5.setPrefSize(300, 40);
   field5.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField field6=new TextField();
   field6.setPromptText("Enter The AP Marks With Pr");
   field6.setFocusTraversable(false);
   field6.setPrefSize(300, 40);
   field6.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   result=new Button(" Result ");
   back=new Button("Back");

   result.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
   result.setTextFill(Color.WHITE);
   result.setPrefSize(80, 20);

   result.setOnAction(e->{
   String one="0"+field1.getText();
   Double One=Double.parseDouble(one);

   String two="0"+field2.getText();
   Double Two=Double.parseDouble(two);

   String three="0"+field3.getText();
   Double Three=Double.parseDouble(three);

   String four="0"+field4.getText();
   Double Four=Double.parseDouble(four);
 
   String five="0"+field5.getText();
   Double Five=Double.parseDouble(five);

   String six="0"+field6.getText();
   Double Six=Double.parseDouble(six);


   double TotalMarks=(One+Two+Three+Four+Five+Six);
   Tootal.setText("Total Marks : "+TotalMarks);
   Tootal.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   Tootal.setFill(Color.BLACK);
  
   double percentage=(TotalMarks/650)*100;
   perce.setText("Percentage : "+Math.round(percentage)+" %");
   perce.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   perce.setFill(Color.BLACK);


   gpa.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   gpa.setFill(Color.BLACK);

  
   overallgrade.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   overallgrade.setFill(Color.BLACK);

   if(percentage>=50 && percentage<75){
    gpa.setText("GPA : 2.0");
    overallgrade.setText("Grade : C");
   }else if(percentage>=76 && percentage<79){
    gpa.setText("GPA : 2.3");
    overallgrade.setText("Grade : C+ ");
   }else if(percentage>=80 && percentage<82){
    gpa.setText("GPA : 2.7");
    overallgrade.setText("Grade : B-");
   }else if(percentage>=82 && percentage<86){
    gpa.setText("GPA : 3.0");
    overallgrade.setText("Grade : B");
   }else if(percentage>=86 && percentage<89){
    gpa.setText("GPA : 3.3");
    overallgrade.setText("Grade : B+");
   }else if(percentage>=89 && percentage<92){
    gpa.setText("GPA : 3.7");
    overallgrade.setText("Grade : A");
   }else if(percentage>=92  && percentage<=100){
    gpa.setText("GPA : 4.0");
    overallgrade.setText("Grade : A+");
   }else if(percentage>=0 && percentage<50){
    overallgrade.setText("Grade : C- ( Fail !)");
   }

   resu.setText(" -<(Result)>- ");
   resu.setFont(Font.font("Roboto",FontWeight.BOLD,50));
   resu.setFill(Color.valueOf("#9E0059"));

   setScene(scener, e);
   });

   back.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
   back.setTextFill(Color.WHITE);
   back.setPrefSize(80, 20);

   back.setOnAction(e->{
     setScene(scene1, e);
     semester.setText("");
    });

   AnchorPane pane=new AnchorPane();
   pane.getChildren().addAll(sub1,sub2,sub3,sub4,sub5,sub6,field1,field2,field3,field6,field5,field4,text,result,back);
   pane.setTopAnchor(text, 15.0);
  
   pane.setLeftAnchor(text, 390.0);
   pane.setLeftAnchor(sub1, 105.0); 
   pane.setLeftAnchor(sub2, 105.0);
   pane.setLeftAnchor(sub3, 105.0);
   pane.setLeftAnchor(sub4, 105.0);
   pane.setLeftAnchor(sub5, 105.0);
   pane.setLeftAnchor(sub6, 105.0);
   
   pane.setTopAnchor(sub1, 70.0);
   pane.setTopAnchor(sub2, 120.0);
   pane.setTopAnchor(sub3, 170.0);
   pane.setTopAnchor(sub4, 220.0);
   pane.setTopAnchor(sub5, 270.0);
   pane.setTopAnchor(sub6, 320.0);

   pane.setTopAnchor(field1, 62.0);
   pane.setLeftAnchor(field1, 400.0);

   pane.setTopAnchor(field2, 112.0);
   pane.setLeftAnchor(field2, 400.0);

   pane.setTopAnchor(field3, 162.0);
   pane.setLeftAnchor(field3,400.0);

   pane.setTopAnchor(field4, 212.0);
   pane.setLeftAnchor(field4, 400.0);

   pane.setTopAnchor(field5, 262.0);
   pane.setLeftAnchor(field5,400.0);

   pane.setTopAnchor(field6, 312.0);
   pane.setLeftAnchor(field6, 400.0);

   pane.setBottomAnchor(result, 50.0);
   pane.setRightAnchor(result, 50.0);

   pane.setBottomAnchor(back, 50.0);
   pane.setRightAnchor(back, 200.0);

   pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));

   Scene scene=new Scene(pane,1000,530);
   return scene;
  }
   //METHOD TO CREATE SCENE FOR SECOND SEMESTER
      private Scene CreateFor2ndsemester(){

   Text text=new Text(" 2nd Semester ");
   text.setFont(Font.font("Roboto",FontWeight.BOLD,25));
   text.setFill(Color.valueOf("#9E0059"));

   Text sub1=new Text("Object Oriented Programming :");
   sub1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
   Text sub2=new Text(" Introduction To SWE  :");
   sub2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
   Text sub3=new Text(" L A A G :");
   sub3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
   Text sub4=new Text(" Communication Skill :");
   sub4.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
   Text sub5=new Text(" Islamiat :");
   sub5.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
   Text sub6=new Text(" Pakistan Study :");
   sub6.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));

   TextField field1=new TextField();
   field1.setPromptText("Enter The OOP Marks With Pr");
   field1.setFocusTraversable(false);
   field1.setPrefSize(300, 40);
   field1.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField field2=new TextField();
   field2.setPromptText("Enter The ISE Marks");
   field2.setFocusTraversable(false);
   field2.setPrefSize(300, 40);
   field2.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField field3=new TextField();
   field3.setPromptText("Enter The LAAG Marks");
   field3.setFocusTraversable(false);
   field3.setPrefSize(300, 40);
   field3.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField field4=new TextField();
   field4.setPromptText("Enter The CS Marks");
   field4.setFocusTraversable(false);
   field4.setPrefSize(300, 40);
   field4.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField field5=new TextField();
   field5.setPromptText("Enter The IST Marks");
   field5.setFocusTraversable(false);
   field5.setPrefSize(300, 40);
   field5.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField field6=new TextField();
   field6.setPromptText("Enter The PS Marks");
   field6.setFocusTraversable(false);
   field6.setPrefSize(300, 40);
   field6.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   result=new Button(" Result ");
   back=new Button("Back");

   result.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
   result.setTextFill(Color.WHITE);
   result.setPrefSize(80, 20);

   result.setOnAction(e->{
   String one="0"+field1.getText();
   Double One=Double.parseDouble(one);

   String two="0"+field2.getText();
   Double Two=Double.parseDouble(two);

  String three="0"+field3.getText();
  Double Three=Double.parseDouble(three);

  String four="0"+field4.getText();
  Double Four=Double.parseDouble(four);

  String five="0"+field5.getText();
  Double Five=Double.parseDouble(five);

  String six="0"+field6.getText();
  Double Six=Double.parseDouble(six);


   double TotalMarks=(One+Two+Three+Four+Five+Six);
   Tootal.setText("Total Marks : "+TotalMarks);
   Tootal.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   Tootal.setFill(Color.BLACK);
  
   double percentage=(TotalMarks/550)*100;
   perce.setText("Percentage : "+Math.round(percentage)+" %");
   perce.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   perce.setFill(Color.BLACK);


   gpa.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   gpa.setFill(Color.BLACK);

  
   overallgrade.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   overallgrade.setFill(Color.BLACK);

   if(percentage>=50 && percentage<75){
    gpa.setText("GPA : 2.0");
    overallgrade.setText("Grade : C");
  }else if(percentage>=76 && percentage<79){
    gpa.setText("GPA : 2.3");
    overallgrade.setText("Grade : C+ ");
  }else if(percentage>=80 && percentage<82){
    gpa.setText("GPA : 2.7");
    overallgrade.setText("Grade : B-");
  }else if(percentage>=82 && percentage<86){
    gpa.setText("GPA : 3.0");
    overallgrade.setText("Grade : B");
  }else if(percentage>=86 && percentage<89){
    gpa.setText("GPA : 3.3");
    overallgrade.setText("Grade : B+");
  }else if(percentage>=89 && percentage<92){
    gpa.setText("GPA : 3.7");
    overallgrade.setText("Grade : A");
  }else if(percentage>=92  && percentage<=100){
    gpa.setText("GPA : 4.0");
    overallgrade.setText("Grade : A+");
  }else if(percentage>=0 && percentage<50){
    overallgrade.setText("Grade : C- ( Fail !)");
  }

  resu.setText(" -<(Result)>- ");
  resu.setFont(Font.font("Roboto",FontWeight.BOLD,50));
  resu.setFill(Color.valueOf("#9E0059"));

    setScene(scener, e);
  });

  back.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  back.setTextFill(Color.WHITE);
  back.setPrefSize(80, 20);

  back.setOnAction(e->{
  setScene(scene1, e);
  semester.setText("");
  });

  AnchorPane pane=new AnchorPane();
  pane.getChildren().addAll(sub1,sub2,sub3,sub4,sub5,sub6,field1,field2,field3,field6,field5,field4,text,result,back);

  pane.setTopAnchor(text, 15.0);
  pane.setLeftAnchor(text, 390.0);

  pane.setLeftAnchor(sub1, 105.0);
  pane.setLeftAnchor(sub2, 105.0);
  pane.setLeftAnchor(sub3, 105.0);
  pane.setLeftAnchor(sub4, 105.0);
  pane.setLeftAnchor(sub5, 105.0);
  pane.setLeftAnchor(sub6, 105.0);

  pane.setTopAnchor(sub1, 70.0);
  pane.setTopAnchor(sub2, 120.0);
  pane.setTopAnchor(sub3, 170.0);
  pane.setTopAnchor(sub4, 220.0);
  pane.setTopAnchor(sub5, 270.0);
  pane.setTopAnchor(sub6, 320.0);

  pane.setTopAnchor(field1, 62.0);
  pane.setLeftAnchor(field1, 400.0);

  pane.setTopAnchor(field2, 112.0);
  pane.setLeftAnchor(field2, 400.0);

  pane.setTopAnchor(field3, 162.0);
  pane.setLeftAnchor(field3,400.0);

  pane.setTopAnchor(field4, 212.0);
  pane.setLeftAnchor(field4, 400.0);

  pane.setTopAnchor(field5, 262.0);
  pane.setLeftAnchor(field5,400.0);

  pane.setTopAnchor(field6, 312.0);
  pane.setLeftAnchor(field6, 400.0);

  pane.setBottomAnchor(result, 50.0);
  pane.setRightAnchor(result, 50.0);

  pane.setBottomAnchor(back, 50.0);
  pane.setRightAnchor(back, 200.0);

  pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));

  Scene scene=new Scene(pane,1000,530);


  return scene;
}
  
  //METHOD TO CREATE SCENE FOR THIRD SEMESTER
      
  private Scene CreateFor3rdsemester(){

  Text text=new Text(" 3rd Semester ");
  text.setFont(Font.font("Roboto",FontWeight.BOLD,25));
  text.setFill(Color.valueOf("#9E0059"));

  Text sub1=new Text("Data Structures & Algorithms :");
  sub1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub2=new Text(" DataBAse System  :");
  sub2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub3=new Text("Computer Arch.& Logic Design :");
  sub3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub4=new Text("Software Req. Engineering  :");
  sub4.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub5=new Text("Numerical Analysis & Computer Apps. :");
  sub5.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));


  TextField field1=new TextField();
  field1.setPromptText("Enter The DSA Marks With Pr");
  field1.setFocusTraversable(false);
  field1.setPrefSize(300, 40);
  field1.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field2=new TextField();
  field2.setPromptText("Enter The DBS Marks With Pr");
  field2.setFocusTraversable(false);
  field2.setPrefSize(300, 40);
  field2.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field3=new TextField();
  field3.setPromptText("Enter The CA & LD Marks With Pr");
  field3.setFocusTraversable(false);
  field3.setPrefSize(300, 40);
  field3.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field4=new TextField();
  field4.setPromptText("Enter The SWRE Marks");
  field4.setFocusTraversable(false);
  field4.setPrefSize(300, 40);
  field4.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field5=new TextField();
  field5.setPromptText("Enter The NA & CA Marks With Pr");
  field5.setFocusTraversable(false);
  field5.setPrefSize(300, 40);
  field5.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));


  result=new Button(" Result ");
  back=new Button("Back");

  result.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  result.setTextFill(Color.WHITE);
  result.setPrefSize(80, 20);
  result.setOnAction(e->{
  String one="0"+field1.getText();
  Double One=Double.parseDouble(one);

  String two="0"+field2.getText();
  Double Two=Double.parseDouble(two);

  String three="0"+field3.getText();
  Double Three=Double.parseDouble(three);

  String four="0"+field4.getText();
  Double Four=Double.parseDouble(four);

  String five="0"+field5.getText();
  Double Five=Double.parseDouble(five);


  double TotalMarks=(One+Two+Three+Four+Five);
  Tootal.setText("Total Marks : "+TotalMarks);
  Tootal.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  Tootal.setFill(Color.BLACK);

  double percentage=(TotalMarks/650)*100;
  perce.setText("Percentage : "+Math.round(percentage)+" %");
  perce.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  perce.setFill(Color.BLACK);


  gpa.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  gpa.setFill(Color.BLACK);


  overallgrade.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  overallgrade.setFill(Color.BLACK);

  if(percentage>=50 && percentage<75){
    gpa.setText("GPA : 2.0");
    overallgrade.setText("Grade : C");
  }else if(percentage>=76 && percentage<79){
    gpa.setText("GPA : 2.3");
    overallgrade.setText("Grade : C+ ");
  }else if(percentage>=80 && percentage<82){
    gpa.setText("GPA : 2.7");
    overallgrade.setText("Grade : B-"); 
  }else if(percentage>=82 && percentage<86){
    gpa.setText("GPA : 3.0");
    overallgrade.setText("Grade : B");
  }else if(percentage>=86 && percentage<89){
    gpa.setText("GPA : 3.3");
    overallgrade.setText("Grade : B+");
  }else if(percentage>=89 && percentage<92){
    gpa.setText("GPA : 3.7");
    overallgrade.setText("Grade : A");
  }else if(percentage>=92  && percentage<=100){
    gpa.setText("GPA : 4.0");
    overallgrade.setText("Grade : A+");
  }else if(percentage>=0 && percentage<50){
    overallgrade.setText("Grade : C- ( Fail !)"); 
  }

   resu.setText(" -<(Result)>- ");
   resu.setFont(Font.font("Roboto",FontWeight.BOLD,50));
   resu.setFill(Color.valueOf("#9E0059"));

   setScene(scener, e);
  });

   back.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
   back.setTextFill(Color.WHITE);
   back.setPrefSize(80, 20);

   back.setOnAction(e->{
   setScene(scene1, e);
   semester.setText("");
  });

   AnchorPane pane=new AnchorPane();
   pane.getChildren().addAll(sub1,sub2,sub3,sub4,sub5,field1,field2,field3,field5,field4,text,result,back);

   pane.setTopAnchor(text, 15.0);
   pane.setLeftAnchor(text, 390.0);

   pane.setLeftAnchor(sub1, 105.0);
   pane.setLeftAnchor(sub2, 105.0);
   pane.setLeftAnchor(sub3, 105.0);
   pane.setLeftAnchor(sub4, 105.0);
   pane.setLeftAnchor(sub5, 105.0);


   pane.setTopAnchor(sub1, 70.0);
   pane.setTopAnchor(sub2, 120.0);
   pane.setTopAnchor(sub3, 170.0);
   pane.setTopAnchor(sub4, 220.0);
   pane.setTopAnchor(sub5, 270.0);


   pane.setTopAnchor(field1, 62.0);
   pane.setLeftAnchor(field1, 400.0);

   pane.setTopAnchor(field2, 112.0);
   pane.setLeftAnchor(field2, 400.0);

   pane.setTopAnchor(field3, 162.0);
   pane.setLeftAnchor(field3,400.0);

   pane.setTopAnchor(field4, 212.0);
   pane.setLeftAnchor(field4, 400.0);

   pane.setTopAnchor(field5, 262.0);
   pane.setLeftAnchor(field5,400.0);


   pane.setBottomAnchor(result, 50.0);
   pane.setRightAnchor(result, 50.0);

   pane.setBottomAnchor(back, 50.0);
   pane.setRightAnchor(back, 200.0);

   pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));

   Scene scene=new Scene(pane,1000,530);


   return scene; 
  }
  
//METHOD TO CREATE SCENE FOR FOURTH SEMESTER
  
   private Scene CreateFor4thsemester(){


   Text text=new Text(" 4th Semester ");
   text.setFont(Font.font("Roboto",FontWeight.BOLD,25));
   text.setFill(Color.valueOf("#9E0059"));

   Text sub1=new Text(" Software Design & Arch. :");
   sub1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
   Text sub2=new Text(" Computer Networks :");
   sub2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
   Text sub3=new Text(" Web Engineering :");
   sub3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
   Text sub4=new Text(" Operations Research :");
   sub4.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
   Text sub5=new Text(" Entrepreneurship :");
   sub5.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));


   TextField field1=new TextField();
   field1.setPromptText("Enter SWDA Marks With Pr ");
   field1.setFocusTraversable(false);
   field1.setPrefSize(300, 40);
   field1.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField  field2=new TextField();
   field2.setPromptText("Enter The CN Marks With Pr");
   field2.setFocusTraversable(false);
   field2.setPrefSize(300, 40);
   field2.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField field3=new TextField();
   field3.setPromptText("Enter The WE Marks With Pr");
   field3.setFocusTraversable(false);
   field3.setPrefSize(300, 40);
   field3.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField field4=new TextField();
   field4.setPromptText("Enter The OR Marks");
   field4.setFocusTraversable(false);
   field4.setPrefSize(300, 40);
   field4.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

   TextField field5=new TextField();
   field5.setPromptText("Enter The EntP Marks");
   field5.setFocusTraversable(false);
   field5.setPrefSize(300, 40);
   field5.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));


   result=new Button(" Result ");
   back=new Button("Back");

   result.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
   result.setTextFill(Color.WHITE);
   result.setPrefSize(80, 20);
   result.setOnAction(e->{
   String one="0"+field1.getText();
   Double One=Double.parseDouble(one);

   String two="0"+field2.getText();
   Double Two=Double.parseDouble(two);

   String three="0"+field3.getText();
   Double Three=Double.parseDouble(three);

   String four="0"+field4.getText();
   Double Four=Double.parseDouble(four);

   String five="0"+field5.getText();
   Double Five=Double.parseDouble(five);


   double TotalMarks=(One+Two+Three+Four+Five);
   Tootal.setText("Total Marks : "+TotalMarks);
   Tootal.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   Tootal.setFill(Color.BLACK);
  
   double percentage=(TotalMarks/550)*100;
   perce.setText("Percentage : "+Math.round(percentage)+" %");
   perce.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   perce.setFill(Color.BLACK);


   gpa.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   gpa.setFill(Color.BLACK);

  
   overallgrade.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   overallgrade.setFill(Color.BLACK);

   if(percentage>=50 && percentage<75){
     gpa.setText("GPA : 2.0");
     overallgrade.setText("Grade : C");
   }else if(percentage>=76 && percentage<79){
     gpa.setText("GPA : 2.3");
     overallgrade.setText("Grade : C+ ");
   }else if(percentage>=80 && percentage<82){
     gpa.setText("GPA : 2.7");
     overallgrade.setText("Grade : B-");
   }else if(percentage>=82 && percentage<86){
     gpa.setText("GPA : 3.0");
     overallgrade.setText("Grade : B");
   }else if(percentage>=86 && percentage<89){
     gpa.setText("GPA : 3.3");
     overallgrade.setText("Grade : B+");
   }else if(percentage>=89 && percentage<92){
     gpa.setText("GPA : 3.7");
     overallgrade.setText("Grade : A");
   }else if(percentage>=92  && percentage<=100){
     gpa.setText("GPA : 4.0");
     overallgrade.setText("Grade : A+");
   }else if(percentage>=0 && percentage<50){
     overallgrade.setText("Grade : C- ( Fail !)");
   } 

   resu.setText(" -<(Result)>- ");
   resu.setFont(Font.font("Roboto",FontWeight.BOLD,50));
   resu.setFill(Color.valueOf("#9E0059"));

   setScene(scener, e);
  });

  back.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  back.setTextFill(Color.WHITE);
  back.setPrefSize(80, 20);

  back.setOnAction(e->{
  setScene(scene1, e);
  semester.setText("");
 });

  AnchorPane pane=new AnchorPane();
  pane.getChildren().addAll(sub1,sub2,sub3,sub4,sub5,field1,field2,field3,field5,field4,text,result,back);

  pane.setTopAnchor(text, 15.0);
  pane.setLeftAnchor(text, 390.0);

  pane.setLeftAnchor(sub1, 105.0);  
  pane.setLeftAnchor(sub2, 105.0);
  pane.setLeftAnchor(sub3, 105.0);
  pane.setLeftAnchor(sub4, 105.0);
  pane.setLeftAnchor(sub5, 105.0);


  pane.setTopAnchor(sub1, 70.0);
  pane.setTopAnchor(sub2, 120.0);
  pane.setTopAnchor(sub3, 170.0);
  pane.setTopAnchor(sub4, 220.0);
  pane.setTopAnchor(sub5, 270.0);


  pane.setTopAnchor(field1, 62.0);
  pane.setLeftAnchor(field1, 400.0);

  pane.setTopAnchor(field2, 112.0);
  pane.setLeftAnchor(field2, 400.0);

  pane.setTopAnchor(field3, 162.0);
  pane.setLeftAnchor(field3,400.0);

  pane.setTopAnchor(field4, 212.0);
  pane.setLeftAnchor(field4, 400.0);

  pane.setTopAnchor(field5, 262.0);
  pane.setLeftAnchor(field5,400.0);


  pane.setBottomAnchor(result, 50.0);
  pane.setRightAnchor(result, 50.0);

  pane.setBottomAnchor(back, 50.0);
  pane.setRightAnchor(back, 200.0);

  pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));

  Scene scene=new Scene(pane,1000,530);


  return scene; 
 }
   
 //METHOD TO CREATE SCENE FOR FIFTH  SEMESTER
   
  private Scene CreateFor5thsemester(){
 
  Text text=new Text(" 5th Semester ");
  text.setFont(Font.font("Roboto",FontWeight.BOLD,25));
  text.setFill(Color.valueOf("#9E0059"));

  Text sub1=new Text(" Software Construction :");
  sub1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub2=new Text(" Elective-1(Mobile App Dev. ) :");
  sub2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub3=new Text(" Statistics & Probability :");
  sub3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub4=new Text(" Operating System   :");
  sub4.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub5=new Text(" Engineering Economics :");
  sub5.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));


  TextField field1=new TextField();
  field1.setPromptText("Enter The SWC Marks With Pr");
  field1.setFocusTraversable(false);
  field1.setPrefSize(300, 40);
  field1.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field2=new TextField();
  field2.setPromptText("Enter The MAD Marks With Pr");
  field2.setFocusTraversable(false);
  field2.setPrefSize(300, 40);
  field2.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field3=new TextField();
  field3.setPromptText("Enter The S&P Marks");
  field3.setFocusTraversable(false);
  field3.setPrefSize(300, 40);
  field3.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field4=new TextField();
  field4.setPromptText("Enter The OS Marks With Pr");
  field4.setFocusTraversable(false);
  field4.setPrefSize(300, 40);
  field4.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField  field5=new TextField();
  field5.setPromptText("Enter The EE Marks");
  field5.setFocusTraversable(false);
  field5.setPrefSize(300, 40);
  field5.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));


  result=new Button(" Result ");
  back=new Button("Back");

  result.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  result.setTextFill(Color.WHITE);
  result.setPrefSize(80, 20);
  result.setOnAction(e->{
  String one="0"+field1.getText();
  Double One=Double.parseDouble(one);

  String two="0"+field2.getText();
  Double Two=Double.parseDouble(two);

  String three="0"+field3.getText();
  Double Three=Double.parseDouble(three);

  String four="0"+field4.getText();
 Double Four=Double.parseDouble(four);

  String five="0"+field5.getText();
  Double Five=Double.parseDouble(five);


   double TotalMarks=(One+Two+Three+Four+Five);
   Tootal.setText("Total Marks : "+TotalMarks);
   Tootal.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
   Tootal.setFill(Color.BLACK);
  
  double percentage=(TotalMarks/550)*100;
  perce.setText("Percentage : "+Math.round(percentage)+" %");
  perce.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  perce.setFill(Color.BLACK);


  gpa.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  gpa.setFill(Color.BLACK);

  
  overallgrade.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  overallgrade.setFill(Color.BLACK);

  if(percentage>=50 && percentage<75){
    gpa.setText("GPA : 2.0");
    overallgrade.setText("Grade : C");
  }else if(percentage>=76 && percentage<79){
    gpa.setText("GPA : 2.3");
    overallgrade.setText("Grade : C+ ");
  }else if(percentage>=80 && percentage<82){
    gpa.setText("GPA : 2.7");
    overallgrade.setText("Grade : B-");
  }else if(percentage>=82 && percentage<86){
    gpa.setText("GPA : 3.0");
    overallgrade.setText("Grade : B");
  }else if(percentage>=86 && percentage<89){
    gpa.setText("GPA : 3.3");
    overallgrade.setText("Grade : B+");
  }else if(percentage>=89 && percentage<92){
    gpa.setText("GPA : 3.7");
    overallgrade.setText("Grade : A");
  }else if(percentage>=92  && percentage<=100){
    gpa.setText("GPA : 4.0");
    overallgrade.setText("Grade : A+");
  }else if(percentage>=0 && percentage<50){
    overallgrade.setText("Grade : C- ( Fail !)");
  }

  resu.setText(" -<(Result)>- ");
  resu.setFont(Font.font("Roboto",FontWeight.BOLD,50));
  resu.setFill(Color.valueOf("#9E0059"));

 setScene(scener, e);
});

back.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
back.setTextFill(Color.WHITE);
back.setPrefSize(80, 20);

back.setOnAction(e->{
  setScene(scene1, e);
  semester.setText("");
   });

    AnchorPane pane=new AnchorPane();
    pane.getChildren().addAll(sub1,sub2,sub3,sub4,sub5,field1,field2,field3,field5,field4,text,result,back);

    pane.setTopAnchor(text, 15.0);
    pane.setLeftAnchor(text, 390.0);

    pane.setLeftAnchor(sub1, 105.0);
    pane.setLeftAnchor(sub2, 105.0);
    pane.setLeftAnchor(sub3, 105.0);
    pane.setLeftAnchor(sub4, 105.0);
    pane.setLeftAnchor(sub5, 105.0);


    pane.setTopAnchor(sub1, 70.0);
    pane.setTopAnchor(sub2, 120.0); 
    pane.setTopAnchor(sub3, 170.0);
    pane.setTopAnchor(sub4, 220.0);
    pane.setTopAnchor(sub5, 270.0);


    pane.setTopAnchor(field1, 62.0);
    pane.setLeftAnchor(field1, 400.0);

    pane.setTopAnchor(field2, 112.0);
    pane.setLeftAnchor(field2, 400.0);

    pane.setTopAnchor(field3, 162.0);
    pane.setLeftAnchor(field3,400.0);

    pane.setTopAnchor(field4, 212.0);
    pane.setLeftAnchor(field4, 400.0);

    pane.setTopAnchor(field5, 262.0);
    pane.setLeftAnchor(field5,400.0);

    pane.setBottomAnchor(result, 50.0);
    pane.setRightAnchor(result, 50.0);
    pane.setBottomAnchor(back, 50.0);
    pane.setRightAnchor(back, 200.0);  
    pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));

    Scene scene=new Scene(pane,1000,530);
    return scene; 
  }
  
//METHOD TO CREATE SCENE FOR SIXTH SEMESTER
  
   private Scene CreateFor6thsemester(){
  
  Text text=new Text(" 6th Semester ");
  text.setFont(Font.font("Roboto",FontWeight.BOLD,25));
  text.setFill(Color.valueOf("#9E0059"));

  Text sub1=new Text(" Software Project Management  :");
  sub1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub2=new Text(" Digital Marketing :");
  sub2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub3=new Text(" Elective-2(Artifical Intelligence) :");
  sub3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub4=new Text(" Human Computer Interaction :");
  sub4.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub5=new Text(" Professional & Social Ethics :");
  sub5.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub6=new Text(" Community Services  :");
  sub6.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));

  TextField field1=new TextField();
  field1.setPromptText("Enter The SWPM Marks With Pr");
  field1.setFocusTraversable(false);
  field1.setPrefSize(300, 40);
  field1.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field2=new TextField();
  field2.setPromptText("Enter The DM Marks With Pr");
  field2.setFocusTraversable(false);
  field2.setPrefSize(300, 40);
  field2.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field3=new TextField();
  field3.setPromptText("Enter The AI Marks With Pr");
  field3.setFocusTraversable(false);
  field3.setPrefSize(300, 40);
  field3.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field4=new TextField();
  field4.setPromptText("Enter The HCI Marks");
  field4.setFocusTraversable(false);
  field4.setPrefSize(300, 40);
  field4.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field5=new TextField();
  field5.setPromptText("Enter The PSE Marks");
  field5.setFocusTraversable(false);
  field5.setPrefSize(300, 40);
  field5.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field6=new TextField();
  field6.setPromptText("Enter The CS(pr) Marks");
  field6.setFocusTraversable(false); 
  field6.setPrefSize(300, 40);
  field6.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  result=new Button(" Result ");
  back=new Button("Back");

  result.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  result.setTextFill(Color.WHITE);
  result.setPrefSize(80, 20);
  result.setOnAction(e->{
  String one="0"+field1.getText();
  Double One=Double.parseDouble(one);

  String two="0"+field2.getText();
  Double Two=Double.parseDouble(two);

  String three="0"+field3.getText();
  Double Three=Double.parseDouble(three);

  String four="0"+field4.getText();
  Double Four=Double.parseDouble(four);

  String five="0"+field5.getText();
  Double Five=Double.parseDouble(five);

  String six="0"+field6.getText();
  Double Six=Double.parseDouble(six);


  double TotalMarks=(One+Two+Three+Four+Five+Six);
  Tootal.setText("Total Marks : "+TotalMarks);
  Tootal.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  Tootal.setFill(Color.BLACK);
  
  double percentage=(TotalMarks/600)*100;
  perce.setText("Percentage : "+Math.round(percentage)+" %");
  perce.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  perce.setFill(Color.BLACK);


  gpa.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  gpa.setFill(Color.BLACK);

  
  overallgrade.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  overallgrade.setFill(Color.BLACK);

  if(percentage>=50 && percentage<75){
    gpa.setText("GPA : 2.0");
    overallgrade.setText("Grade : C");
  }else if(percentage>=76 && percentage<79){
    gpa.setText("GPA : 2.3");
    overallgrade.setText("Grade : C+ ");
  }else if(percentage>=80 && percentage<82){
    gpa.setText("GPA : 2.7");
    overallgrade.setText("Grade : B-");
  }else if(percentage>=82 && percentage<86){
    gpa.setText("GPA : 3.0");
    overallgrade.setText("Grade : B");
  }else if(percentage>=86 && percentage<89){
    gpa.setText("GPA : 3.3");
    overallgrade.setText("Grade : B+");
  }else if(percentage>=89 && percentage<92){
    gpa.setText("GPA : 3.7");
    overallgrade.setText("Grade : A");
  }else if(percentage>=92  && percentage<=100){
    gpa.setText("GPA : 4.0");
    overallgrade.setText("Grade : A+");
  }else if(percentage>=0 && percentage<50){
    overallgrade.setText("Grade : C- ( Fail !)");
  }

   resu.setText(" -<(Result)>- ");
   resu.setFont(Font.font("Roboto",FontWeight.BOLD,50));
    resu.setFill(Color.valueOf("#9E0059"));
    setScene(scener, e);
  });

  back.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  back.setTextFill(Color.WHITE);
  back.setPrefSize(80, 20);

  back.setOnAction(e->{
  setScene(scene1, e);
  semester.setText("");
  });

  AnchorPane pane=new AnchorPane();
  pane.getChildren().addAll(sub1,sub2,sub3,sub4,sub5,sub6,field1,field2,field3,field6,field5,field4,text,result,back);

  pane.setTopAnchor(text, 15.0);
  pane.setLeftAnchor(text, 390.0);

  pane.setLeftAnchor(sub1, 105.0);
  pane.setLeftAnchor(sub2, 105.0);
  pane.setLeftAnchor(sub3, 105.0);
  pane.setLeftAnchor(sub4, 105.0);
  pane.setLeftAnchor(sub5, 105.0);
  pane.setLeftAnchor(sub6, 105.0);

  pane.setTopAnchor(sub1, 70.0);
  pane.setTopAnchor(sub2, 120.0); 
  pane.setTopAnchor(sub3, 170.0);
  pane.setTopAnchor(sub4, 220.0);
  pane.setTopAnchor(sub5, 270.0);
  pane.setTopAnchor(sub6, 320.0);

  pane.setTopAnchor(field1, 62.0);
  pane.setLeftAnchor(field1, 400.0);

  pane.setTopAnchor(field2, 112.0);
  pane.setLeftAnchor(field2, 400.0);

  pane.setTopAnchor(field3, 162.0);
  pane.setLeftAnchor(field3,400.0);

  pane.setTopAnchor(field4, 212.0);
  pane.setLeftAnchor(field4, 400.0);

  pane.setTopAnchor(field5, 262.0);
  pane.setLeftAnchor(field5,400.0);

  pane.setTopAnchor(field6, 312.0);
  pane.setLeftAnchor(field6, 400.0);

  pane.setBottomAnchor(result, 50.0);
  pane.setRightAnchor(result, 50.0);

  pane.setBottomAnchor(back, 50.0);
  pane.setRightAnchor(back, 200.0);

  pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));
  Scene scene=new Scene(pane,1000,530);
  return scene;
 }
   
 //METHOD TO CREATE SCENE FOR SEVENTH SEMESTER
   
  private Scene CreateFor7thsemester(){
  Text text=new Text(" 7th Semester ");
  text.setFont(Font.font("Roboto",FontWeight.BOLD,25));
  text.setFill(Color.valueOf("#9E0059"));

  Text sub1=new Text(" Cloud Computing:");
  sub1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub2=new Text(" Electiv-3(Data Science ):");
  sub2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub3=new Text(" Software Re-Engineering :");
  sub3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub4=new Text(" Formal Methods in SWE   :");
  sub4.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub5=new Text(" FYDP-1 :");
  sub5.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));


  TextField field1=new TextField();
  field1.setPromptText("Enter The CC Marks With Pr");
  field1.setFocusTraversable(false);
  field1.setPrefSize(300, 40);
  field1.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField  field2=new TextField();
  field2.setPromptText("Enter The DS Marks With Pr");
  field2.setFocusTraversable(false);
  field2.setPrefSize(300, 40);
  field2.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field3=new TextField();
  field3.setPromptText("Enter The SWRE Marks");
  field3.setFocusTraversable(false);
  field3.setPrefSize(300, 40);
  field3.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field4=new TextField();
  field4.setPromptText("Enter The FMSWE Marks");
  field4.setFocusTraversable(false);
  field4.setPrefSize(300, 40);
  field4.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field5=new TextField();
  field5.setPromptText("Enter The FYDP-1 Marks");
  field5.setFocusTraversable(false);
  field5.setPrefSize(300, 40);
  field5.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));


  result=new Button(" Result ");
  back=new Button("Back");

  result.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  result.setTextFill(Color.WHITE);
  result.setPrefSize(80, 20);
  result.setOnAction(e->{
	  
  String one="0"+field1.getText();
  Double One=Double.parseDouble(one);

  String two="0"+field2.getText();
  Double Two=Double.parseDouble(two);

  String three="0"+field3.getText();
  Double Three=Double.parseDouble(three);

  String four="0"+field4.getText();
  Double Four=Double.parseDouble(four);

  String five="0"+field5.getText();
  Double Five=Double.parseDouble(five);
  
  double TotalMarks=(One+Two+Three+Four+Five);
  Tootal.setText("Total Marks : "+TotalMarks);
  Tootal.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  Tootal.setFill(Color.BLACK);
  
  double percentage=(TotalMarks/550)*100;
  perce.setText("Percentage : "+Math.round(percentage)+" %");
  perce.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  perce.setFill(Color.BLACK);


  gpa.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  gpa.setFill(Color.BLACK);

  
  overallgrade.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  overallgrade.setFill(Color.BLACK);

  if(percentage>=50 && percentage<75){
    gpa.setText("GPA : 2.0");
    overallgrade.setText("Grade : C");
  }else if(percentage>=76 && percentage<79){
    gpa.setText("GPA : 2.3");
    overallgrade.setText("Grade : C+ ");
  }else if(percentage>=80 && percentage<82){
    gpa.setText("GPA : 2.7");
    overallgrade.setText("Grade : B-");
  }else if(percentage>=82 && percentage<86){
    gpa.setText("GPA : 3.0");
    overallgrade.setText("Grade : B");
  }else if(percentage>=86 && percentage<89){
    gpa.setText("GPA : 3.3");
    overallgrade.setText("Grade : B+");
  }else if(percentage>=89 && percentage<92){
    gpa.setText("GPA : 3.7");
    overallgrade.setText("Grade : A");
  }else if(percentage>=92  && percentage<=100){
    gpa.setText("GPA : 4.0");
    overallgrade.setText("Grade : A+");
  }else if(percentage>=0 && percentage<50){
    overallgrade.setText("Grade : C- ( Fail !)");
  }

  resu.setText(" -<(Result)>- ");
  resu.setFont(Font.font("Roboto",FontWeight.BOLD,50));
  resu.setFill(Color.valueOf("#9E0059"));

  setScene(scener, e);
  
  });

  back.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  back.setTextFill(Color.WHITE);
  back.setPrefSize(80, 20);

  back.setOnAction(e->{
  setScene(scene1, e);
  semester.setText("");
  });

  AnchorPane pane=new AnchorPane();
  pane.getChildren().addAll(sub1,sub2,sub3,sub4,sub5,field1,field2,field3,field5,field4,text,result,back);

  pane.setTopAnchor(text, 15.0);
  pane.setLeftAnchor(text, 390.0);

  pane.setLeftAnchor(sub1, 105.0);
  pane.setLeftAnchor(sub2, 105.0);
  pane.setLeftAnchor(sub3, 105.0);
  pane.setLeftAnchor(sub4, 105.0);
  pane.setLeftAnchor(sub5, 105.0); 


  pane.setTopAnchor(sub1, 70.0);
  pane.setTopAnchor(sub2, 120.0);
  pane.setTopAnchor(sub3, 170.0);
  pane.setTopAnchor(sub4, 220.0);
  pane.setTopAnchor(sub5, 270.0);


  pane.setTopAnchor(field1, 62.0);
  pane.setLeftAnchor(field1, 400.0);

  pane.setTopAnchor(field2, 112.0);
  pane.setLeftAnchor(field2, 400.0);

  pane.setTopAnchor(field3, 162.0);
  pane.setLeftAnchor(field3,400.0);

  pane.setTopAnchor(field4, 212.0);
  pane.setLeftAnchor(field4, 400.0);

  pane.setTopAnchor(field5, 262.0);
  pane.setLeftAnchor(field5,400.0);


  pane.setBottomAnchor(result, 50.0);
  pane.setRightAnchor(result, 50.0);

  pane.setBottomAnchor(back, 50.0);
  pane.setRightAnchor(back, 200.0);

  pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));
  Scene scene=new Scene(pane,1000,530);
  return scene;
 }
  
//METHOD TO CREATE SCENE FOR EIGHTH SEMESTER
  
  private Scene CreateFor8thsemester(){
  Text text=new Text(" 8th Semester ");
  text.setFont(Font.font("Roboto",FontWeight.BOLD,25));
  text.setFill(Color.valueOf("#9E0059"));

  Text sub1=new Text(" Software Quality Engineering  :");
  sub1.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub2=new Text(" MDEE Elective-4(Internet of Things ):");
  sub2.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub3=new Text(" Information Security :");
  sub3.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));
  Text sub4=new Text(" FYDP-2   :");
  sub4.setFont(Font.font(STYLESHEET_CASPIAN, FontPosture.ITALIC, 18));



  TextField field1=new TextField();
  field1.setPromptText("Enter The SWQE Marks With Pr");
  field1.setFocusTraversable(false);
  field1.setPrefSize(300, 40);
  field1.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field2=new TextField();
  field2.setPromptText("Enter The IOT Marks");
  field2.setFocusTraversable(false);
  field2.setPrefSize(300, 40);
  field2.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field3=new TextField();
  field3.setPromptText("Enter The IS Marks");
  field3.setFocusTraversable(false);
  field3.setPrefSize(300, 40);
  field3.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));

  TextField field4=new TextField();
  field4.setPromptText("Enter The FYDP-2 Marks");
  field4.setFocusTraversable(false);
  field4.setPrefSize(300, 40);
  field4.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.REGULAR,14));




  result=new Button(" Result ");
  back=new Button("Back");

  result.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  result.setTextFill(Color.WHITE);
  result.setPrefSize(80, 20);
  result.setOnAction(e->{
  String one="0"+field1.getText();
  Double One=Double.parseDouble(one);

  String two="0"+field2.getText();
  Double Two=Double.parseDouble(two);

  String three="0"+field3.getText();
  Double Three=Double.parseDouble(three);

  String four="0"+field4.getText();
  Double Four=Double.parseDouble(four);


  double TotalMarks=(One+Two+Three+Four);
   Tootal.setText("Total Marks : "+TotalMarks);
  Tootal.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  Tootal.setFill(Color.BLACK);
  
  double percentage=(TotalMarks/450)*100;
  perce.setText("Percentage : "+Math.round(percentage)+" %");
  perce.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  perce.setFill(Color.BLACK);


  gpa.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  gpa.setFill(Color.BLACK);

  
  overallgrade.setFont(Font.font("Roboto",FontWeight.BOLD,FontPosture.ITALIC,40));
  overallgrade.setFill(Color.BLACK);

  if(percentage>=50 && percentage<75){
    gpa.setText("GPA : 2.0");
    overallgrade.setText("Grade : C");
  }else if(percentage>=76 && percentage<79){
    gpa.setText("GPA : 2.3");
    overallgrade.setText("Grade : C+ ");
  }else if(percentage>=80 && percentage<82){
    gpa.setText("GPA : 2.7");
    overallgrade.setText("Grade : B-");
  }else if(percentage>=82 && percentage<86){
    gpa.setText("GPA : 3.0");
    overallgrade.setText("Grade : B");
  }else if(percentage>=86 && percentage<89){
    gpa.setText("GPA : 3.3");
    overallgrade.setText("Grade : B+");
  }else if(percentage>=89 && percentage<92){
    gpa.setText("GPA : 3.7");
    overallgrade.setText("Grade : A");
  }else if(percentage>=92  && percentage<=100){
    gpa.setText("GPA : 4.0");
    overallgrade.setText("Grade : A+");
  }else if(percentage>=0 && percentage<50){
    overallgrade.setText("Grade : C- ( Fail !)");
  }

  resu.setText(" -<(Result)>- ");
  resu.setFont(Font.font("Roboto",FontWeight.BOLD,50));
  resu.setFill(Color.valueOf("#9E0059"));

  setScene(scener, e);
  });

  back.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  back.setTextFill(Color.WHITE);
  back.setPrefSize(80, 20);

  back.setOnAction(e->{
  setScene(scene1, e);
  semester.setText("");
  });

  AnchorPane pane=new AnchorPane();
  pane.getChildren().addAll(sub1,sub2,sub3,sub4,field1,field2,field3,field4,text,result,back);

  pane.setTopAnchor(text, 15.0);
  pane.setLeftAnchor(text, 390.0);

  pane.setLeftAnchor(sub1, 105.0);
  pane.setLeftAnchor(sub2, 105.0);
  pane.setLeftAnchor(sub3, 105.0);
  pane.setLeftAnchor(sub4, 105.0);



  pane.setTopAnchor(sub1, 70.0);
  pane.setTopAnchor(sub2, 120.0);
  pane.setTopAnchor(sub3, 170.0);
  pane.setTopAnchor(sub4, 220.0);



  pane.setTopAnchor(field1, 62.0);
  pane.setLeftAnchor(field1, 400.0);

  pane.setTopAnchor(field2, 112.0);
  pane.setLeftAnchor(field2, 400.0);

  pane.setTopAnchor(field3, 162.0);
  pane.setLeftAnchor(field3,400.0);

  pane.setTopAnchor(field4, 212.0);
  pane.setLeftAnchor(field4, 400.0);


  pane.setBottomAnchor(result, 50.0);
  pane.setRightAnchor(result, 50.0);
  pane.setBottomAnchor(back, 50.0);
  pane.setRightAnchor(back, 200.0);

  pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));

  Scene scene=new Scene(pane,1000,530);
  return scene;
  }

  //METHOD TO CREATE SCENE FOR DISPLAY RESULT 
  
  private Scene CreateForResult(){

  Done=new Button("Done");
  Done.setBackground(new Background(new BackgroundFill(Color.valueOf("#08415C"),null,null)));
  Done.setTextFill(Color.WHITE);
  Done.setPrefSize(80, 20);
  Done.setOnAction(e->{
  setScene(scene1, e);
  semester.setText("");
  });
  AnchorPane pane=new AnchorPane();
  pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#388697"),null,null)));
  pane.getChildren().addAll(Tootal,perce,gpa,overallgrade,resu,Done);
  pane.setTopAnchor(resu, 10.0);
  pane.setLeftAnchor(resu, 380.0);
  pane.setTopAnchor(Tootal, 100.0);
  pane.setLeftAnchor(Tootal, 250.0);
  pane.setTopAnchor(perce, 150.0);
  pane.setLeftAnchor(perce, 250.0);
  pane.setTopAnchor(overallgrade, 200.0);
  pane.setLeftAnchor(overallgrade, 250.0);
  pane.setTopAnchor(gpa, 250.0);
  pane.setLeftAnchor(gpa, 250.0);
  pane.setRightAnchor(Done, 50.0);
  pane.setBottomAnchor(Done, 50.0);


  Scene scene=new Scene(pane,1000,530);
   return scene;
  } 

  }



















