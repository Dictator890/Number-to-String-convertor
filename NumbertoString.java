
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

class NumbertoString extends JFrame
{
JButton jbtn0,jbtn1,jbtn2,jbtn3,jbtn4,jbtn5,jbtn6,jbtn7,jbtn8,jbtn9,jbtnconvert,jbtnc;
JTextField jtxt,jtxt1;
Font f1,f2;
String get="",str="";
int number,countconvert=0,count1=0,countv=0;
static StringBuilder sb;
Vector v;
char ch;
boolean errorcheck=false,bchk11to19=true;
int chk11to19=0;
JScrollPane jsb;

public NumbertoString()        //Constructor
{
setBackground(Color.BLACK);
setResizable(false);
setSize(294,390);
setLocationRelativeTo(null);
setLayout(null);
setTitle("Number to Word Convertor");
String URL="D:\\Temp number to string\\icon.jpg";
setIconImage(new ImageIcon(URL).getImage());
v=new Vector();
sb=new StringBuilder();
jtxt=new JTextField(100);
jsb=new JScrollPane(jtxt);




jtxt.setBounds(10,30,260,50);
jtxt1=new JTextField(20);
jtxt1.setBounds(10,255,260,50);
add(jtxt);
add(jtxt1);
jtxt.setEditable(false);
jtxt.setBackground(Color.GREEN);

                           //JButtons From Here
jbtn0=new JButton("0");
jbtn1=new JButton("1");
jbtn2=new JButton("2");
jbtn3=new JButton("3");
jbtn4=new JButton("4");
jbtn5=new JButton("5");
jbtn6=new JButton("6");
jbtn7=new JButton("7");
jbtn8=new JButton("8");
jbtn9=new JButton("9");
jbtnconvert=new JButton("Convert");
jbtnc=new JButton("C");


                                  // Button Cordinates
jbtn1.setBounds(10,95,45,35);
jbtn2.setBounds(65,95,45,35);
jbtn3.setBounds(120,95,45,35);
jbtn4.setBounds(10,150,45,35);
jbtn5.setBounds(65,150,45,35);
jbtn6.setBounds(120,150,45,35);
jbtn7.setBounds(10,205,45,35);
jbtn8.setBounds(65,205,45,35);
jbtn9.setBounds(120,205,45,35);
jbtnconvert.setBounds(175,205,85,35);
jbtnc.setBounds(170, 150, 45, 35);

                                 //Setting Fonts

f1=new Font("Tahoma",Font.BOLD,12);
f2=new Font("Tahoma",Font.BOLD,11);


                                   //Changing Font for Some Buttons
jbtnconvert.setFont(f1);
jtxt.setFont(f1);



                                    //Adding the JButtons.
add(jbtn1);
add(jbtn2);
add(jbtn3);
add(jbtn4);
add(jbtn5);
add(jbtn6);
add(jbtn7);
add(jbtn8);
add(jbtn9);
add(jbtn0);
add(jbtnconvert);
add(jbtnc);
                 // Setting transperent JButton Borders
jbtn1.setBorderPainted(false);
jbtn2.setBorderPainted(false);
jbtn3.setBorderPainted(false);
jbtn4.setBorderPainted(false);
jbtn5.setBorderPainted(false);
jbtn6.setBorderPainted(false);
jbtn7.setBorderPainted(false);
jbtn8.setBorderPainted(false);
jbtn9.setBorderPainted(false);
jbtn0.setBorderPainted(false);
jbtnc.setBorderPainted(false);
jbtnconvert.setBorderPainted(false);

// Setting nonopaque JButtons
jbtn1.setOpaque(false);
jbtn2.setOpaque(false);
jbtn3.setOpaque(false);
jbtn4.setOpaque(false);
jbtn5.setOpaque(false);
jbtn6.setOpaque(false);
jbtn7.setOpaque(false);
jbtn8.setOpaque(false);
jbtn9.setOpaque(false);
jbtn0.setOpaque(false);
jbtnc.setOpaque(false);
jbtnconvert.setOpaque(false);
// Setting contentareafilled to false
jbtn1.setContentAreaFilled(false);
jbtn2.setContentAreaFilled(false);
jbtn3.setContentAreaFilled(false);
jbtn4.setContentAreaFilled(false);
jbtn5.setContentAreaFilled(false);
jbtn6.setContentAreaFilled(false);
jbtn7.setContentAreaFilled(false);
jbtn8.setContentAreaFilled(false);
jbtn9.setContentAreaFilled(false);
jbtn0.setContentAreaFilled(false);
jbtnc.setContentAreaFilled(false);
jbtnconvert.setContentAreaFilled(false);
// Add Action Listener to every JButton
jbtn1.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
 get=jtxt1.getText()+jbtn1.getText();
jtxt1.setText(get);
}
});
jbtn2.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
 get=jtxt1.getText()+jbtn2.getText();
jtxt1.setText(get);
}
});
jbtn3.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
get=jtxt1.getText()+jbtn3.getText();
jtxt1.setText(get);
}
});
jbtn4.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
get=jtxt1.getText()+jbtn4.getText();
jtxt1.setText(get);
}
});
jbtn5.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
 get=jtxt1.getText()+jbtn5.getText();
jtxt1.setText(get);
}
});
jbtn6.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
 get=jtxt1.getText()+jbtn6.getText();
jtxt1.setText(get);
}
});
jbtn7.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
 get=jtxt1.getText()+jbtn7.getText();
jtxt1.setText(get);
}
});
jbtn8.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
 get=jtxt1.getText()+jbtn8.getText();
jtxt1.setText(get);
}
});
jbtn9.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
 get=jtxt1.getText()+jbtn9.getText();
jtxt1.setText(get);
}
});
jbtn0.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
 get=jtxt1.getText()+jbtn0.getText();
jtxt1.setText(get);
}
});
jbtnc.addActionListener(new ActionListener() {
public void actionPerformed( ActionEvent ae) {
 get="";
jtxt.setText(get);
number=0;
sb=sb.delete(0, sb.capacity());
v.removeAllElements();
jtxt1.setText(get);
countconvert=0;

}
});
jbtnconvert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {

  if(!(countconvert==0))
  {
    String nothing="";
    jtxt.setText(nothing);
    number=0;
sb=sb.delete(0, sb.capacity());
v.removeAllElements();
countconvert=0;
str="";
chk11to19=0;
bchk11to19=true;
count1=0;
countv=0;
  }

 try                                     // To check whether the input String is null or not(00n00axd)
 {
  if(!(jtxt1.getText().equals(null)))
  {
    try                              //Used for catching the exception if the string has anything except a number(00x8d)
    {
      String temp=jtxt1.getText();
      int jdkd=Integer.parseInt(temp);
      number=jdkd;
    }
    catch(Exception e)                    // Catch method for except number's try(00x8d)
    {
      errorcheck=true;
      jtxt.setText("Please Enter a valid number");
	  jtxt1.setText("");
	 
    }

  }
  else
  {
    number=Integer.parseInt(get);


  }

   }
   catch(Exception e)                    // the catch block for null check try(00n00axd)
   {
    errorcheck=true;
    jtxt.setText("No Number Received");
		  jtxt1.setText("");
   }
   //jtxt.setText(Integer.toString(number));
     int floornumber=(int)Math.floor(number);
   if(errorcheck!=true)
   {
   int usenumber=floornumber;
    //jtxt.setText(Integer.toString(usenumber));
  int count=0;
  int formodofuseno=0;
   while(usenumber>0)                 // A loop to help to calculate number of digits in the number and to add them in the Vector
   {
    formodofuseno=usenumber%10;         // To get every last number of the digit
    count++;                            // Increment the count
    v.addElement(new Integer(formodofuseno));  // Add every last digit to the vector
    usenumber=usenumber/10;                    // To remove every last digit permanently from usenumber for the loop to proceed
   }
   //Collections.reverse(v);                   // Reverse the vector elements
  //jtxt.setText(Integer.toString(count));
 //  jtxt1.setText(Integer.toString(usenumber));

   count1=count-1;
    while(count1>=0)
    {


      countv=(int)v.get(count1);
     try                                  // to get tens and unit place digit(012dxd)
     {
     int a=(int)v.get(0);
     int b=(int)v.get(1);
     chk11to19=a+(b*10);
    // jtxt1.setText(Integer.toString(chk11to19));
     if(chk11to19>10&&chk11to19<20)
     {
      bchk11to19=false;
     }
     else
     {
      bchk11to19=true;
     }
   }
   catch (Exception e)                      // Catch for tens try block(012dxd)
   {
    //Ignore
   }
    if(count1==0&&bchk11to19!=false)
     {

      str+=NumbertoString.giveit(countv);
    }
    if(count1==1&&bchk11to19!=false)
    {
      switch(countv)
      {
        case 1:str+=" Ten ";
                    break;
        case 2:str+=" Twenty ";
                      break;
        case 3:str+=" Thirty ";
                     break;
        case 4:str+=" Forty ";
                     break;
        case 5:str+=" Fifty ";
                     break;
        case 6:str+=" Sixty ";
                      break;
        case 7:str+=" Seventy ";
                     break;
        case 8:str+=" Eighty ";
                     break;
        case 9:str+=" Ninety ";
                     break;



      }  //   switch end

    }
     if(count1==0||count1==1)
    {
      if(bchk11to19==false)
      {
        str+=NumbertoString.eleventonineteen(chk11to19);
        break;
      }
    }
      //jtxt.setText(str);
      //count1-=1;.
     if(count1==6)
    {
      int get1=(int)v.get(6);
      int get2=(int)v.get(5);
      int converttenlakh=(get1*10)+get2;
      if(converttenlakh>=11&&converttenlakh<20)
      {
        str+=NumbertoString.eleventonineteen(converttenlakh)+" Lakh";



      }
       if(converttenlakh>0&&count1==6)
      {

         switch(converttenlakh)
         {
          case 10:str+=" Ten Lakh";
                    break;
        case 20:str+=" Twenty Lakh";
                      break;
        case 30:str+=" Thirty Lakh";
                     break;
        case 40:str+=" Forty Lakh";
                     break;
        case 50:str+=" Fifty Lakh";
                     break;
        case 60:str+=" Sixty Lakh";
                      break;
        case 70:str+=" Seventy Lakh";
                     break;
        case 80:str+=" Eighty Lakh";
                     break;
        case 90:str+=" Ninety Lakh";
                     break;
         }

      }
      if(converttenlakh>20)// if the digit is neither between 11 to 19 && not a digit with 0 in end like 10 20 50 60,etc
      {
           switch(get1)
           {

            case 2:str+=" Twenty";
                      break;
            case 3:str+=" Thirty";
                     break;
            case 4:str+=" Forty";
                     break;
            case 5:str+=" Fifty";
                     break;
            case 6:str+=" Sixty";
                      break;
            case 7:str+=" Seventy";
                    break;
            case 8:str+=" Eighty";
                     break;
            case 9:str+=" Ninety";
                     break;
           }

            str+=NumbertoString.giveit(get2)+" Lakh";

      }
      count1-=2;
    }
    if(count1==4)
    {
      int get1=(int)v.get(4);
      int get2=(int)v.get(3);
      int converttenthousand=(get1*10)+get2;
      if(converttenthousand>=11&&converttenthousand<20)
      {
        str+=NumbertoString.eleventonineteen(converttenthousand)+" Thousand";



      }
       if(converttenthousand>0&&count1==4)
      {

         switch(converttenthousand)
         {
          case 10:str+=" Ten Thousand";
                    break;
        case 20:str+=" Twenty Thousand";
                      break;
        case 30:str+=" Thirty Thousand";
                     break;
        case 40:str+=" Forty Thousand";
                     break;
        case 50:str+=" Fifty Thousand";
                     break;
        case 60:str+=" Sixty Thousand";
                      break;
        case 70:str+=" Seventy Thousand";
                     break;
        case 80:str+=" Eighty Thousand";
                     break;
        case 90:str+=" Ninety Thousand";
                     break;
         }

      }
      if(converttenthousand>20)// if the digit is neither between 11 to 19 && not a digit with 0 in end like 10 20 50 60,etc
      {
           switch(get1)
           {

            case 2:str+=" Twenty";
                      break;
            case 3:str+=" Thirty";
                     break;
            case 4:str+=" Forty";
                     break;
            case 5:str+=" Fifty";
                     break;
            case 6:str+=" Sixty";
                      break;
            case 7:str+=" Seventy";
                    break;
            case 8:str+=" Eighty";
                     break;
            case 9:str+=" Ninety";
                     break;
           }

            str+=NumbertoString.giveit(get2)+" Thousand";

      }
      count1-=2;
    }


       switch(count1)
       {
        case 2:countv=(int)v.get(2);
        str+=NumbertoString.giveit(countv)+" "+" Hundred";
                break;
        case 3:str+=NumbertoString.giveit(countv)+" Thousand";
               break;
        case 5:str+=NumbertoString.giveit(countv)+" Lakh";
               break;
       }

     count1-=1;
      }
      jtxt.setText(str);
    }

 countconvert=1;
 errorcheck=false;
}
});

}





    public static String giveit(int no) {      /*The number which is got is checked and matched with name
                                                  in this function and the it is returned*/
        String stri="";
        switch(no)
        {
            case 0:stri=" Zero";
                    break;
            case 1:stri=" One";
                   break;
            case 2:stri=" Two";
                   break;
            case 3:stri=" Three";
                   break;
            case 4:stri=" Four";
                   break;
            case 5:stri=" Five";
                   break;
            case 6:stri=" Six";
                   break;
            case 7:stri=" Seven";
                   break;
            case 8:stri=" Eight";
                   break;
            case 9:stri=" Nine";
                   break;
        }
       return stri;

    }
    public static String eleventonineteen(int no)
    {
      String str="";
      switch(no)
      {
        case 11:str=" Eleven";
                break;
        case 12:str=" Twelve";
                break;
         case 13:str=" Thirteen";
                break;
         case 14:str=" Fourteen";
                break;
         case 15:str=" Fifteen";
                break;
         case 16:str=" Sixteen";
                break;
         case 17:str=" Seventeen";
                break;
         case 18:str=" Eighteen";
                break;
         case 19:str=" Nineteen";
                  break;
         default:


      }
      return str;
    }

public static void main(String args[])
{
new NumbertoString().setVisible(true);
}
}
 /**0) int countconvert=It helps to keep count the number of times the Convert Button is pressed
    1) String Temp=(188)Used to store the Number from  jtxt1.
    2) int jdkd=(189) Convert the temp to Integer.
    3)int usenumber=(210)To store the value from number variable.
    4)int count=(217)To check the number of digits
    5)int formodofuseno=(218)To store the result after mod of usenumber
    6)int countv=(228)To store the vector digit
    7)int count1=(228)To store the count for the loop
    8)int chk11to19=(18)To store the tens and units place digit in number form
    9)boolean bchk11to19=() To check if tens and units place digits when in number are between 11 to 19
    */
