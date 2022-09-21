package calculator;
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
class Controller implements ActionListener
{
	Calculator c;
	int digit,digit2,operation,answer;
	Controller(Calculator ve)
	{
		this.c=ve;
	}
	public void actionPerformed(ActionEvent e) 
	{
		String number,n;
        if(e.getSource()==c.btnZero)
		 {
		 	
            number=c.txtScreen.getText();
            n=number+"0";
            c.txtScreen.setText(n);
			
		}
		if(e.getSource()==c.btnOne)
		{
		     number=c.txtScreen.getText();
             n=number+"1";
             c.txtScreen.setText(n);
			
		}
		if(e.getSource()==c.btnTwo)
		 {
		 	
            number=c.txtScreen.getText();
            n=number+"2";
            c.txtScreen.setText(n);
			
		}
        if(e.getSource()==c.btnThree)
		 {
		 	
            number=c.txtScreen.getText();
            n=number+"3";
            c.txtScreen.setText(n);
			
		}
        if(e.getSource()==c.btnFour)
		 {
		 	
            number=c.txtScreen.getText();
            n=number+"4";
            c.txtScreen.setText(n);
			
		}
        if(e.getSource()==c.btnFive)
		 {
		 	
            number=c.txtScreen.getText();
            n=number+"5";
            c.txtScreen.setText(n);
			
		}
        if(e.getSource()==c.btnSix)
		 {
		 	
            number=c.txtScreen.getText();
            n=number+"6";
            c.txtScreen.setText(n);
			
		}
        if(e.getSource()==c.btnSeven)
		 {
		 	
            number=c.txtScreen.getText();
            n=number+"7";
            c.txtScreen.setText(n);
			
		}
        if(e.getSource()==c.btnEight)
		 {
		 	
            number=c.txtScreen.getText();
            n=number+"8";
            c.txtScreen.setText(n);
			
		}
        if(e.getSource()==c.btnNine)
		 {
		 	
            number=c.txtScreen.getText();
            n=number+"9";
            c.txtScreen.setText(n);
			
		}
        if(e.getSource()==c.btnCE)
		 {
            digit=0;
            digit2=0;
            operation=0;
            answer=0;
            n="";
            c.txtScreen.setText(n);
		}
        if(e.getSource()==c.btnPlus)
		 {
             try{
                 digit=Integer.parseInt(c.txtScreen.getText());
             }catch(NumberFormatException nf){
                   c.txtScreen.setText("Invalid Format");
                   return;
             }
		 	
            n="";
            c.txtScreen.setText(n);
            operation=1;
			
		}
        if(e.getSource()==c.btnMulti)
		 {
		 	
            try{
                digit=Integer.parseInt(c.txtScreen.getText());
            }catch(NumberFormatException nf){
                  c.txtScreen.setText("Invalid Format");
                  return;
            }
            
           n="";
           c.txtScreen.setText(n);
           operation=2;
			
		}
        if(e.getSource()==c.btnMinus)
		 {
            try{
                digit=Integer.parseInt(c.txtScreen.getText());
            }catch(NumberFormatException nf){
                  c.txtScreen.setText("Invalid Format");
                  return;
            }
            
           n="";
           c.txtScreen.setText(n);
           operation=3;
		}
        if(e.getSource()==c.btnDiv)
		 {
            try{
                digit=Integer.parseInt(c.txtScreen.getText());
            }catch(NumberFormatException nf){
                  c.txtScreen.setText("Invalid Format");
                  return;
            }
            
           n="";
           c.txtScreen.setText(n);
           operation=4;
		}
        if(e.getSource()==c.btnEquals)
		 {
            try{
                digit2=Integer.parseInt(c.txtScreen.getText());
            }catch(NumberFormatException nf){
                  c.txtScreen.setText("Enter Digit");
                  return;
            }
          if(operation==1)
              answer=digit+digit2;
          
          if(operation==2)
            answer=digit*digit2;
        
        if(operation==3)
            answer=digit-digit2;
        
        if(operation==4){
			if(digit2==0){
				try{
					answer=digit/digit2;
					c.txtScreen.setText(String.valueOf(answer));
				}catch(ArithmeticException ae){
					c.txtScreen.setText("Number Can't Be Divided By Zero");
				}
			}
           
            answer=digit/digit2;
            c.txtScreen.setText(String.valueOf(answer));
		}
        c.txtScreen.setText(String.valueOf(answer));
    }
		
	}
}