package calculator;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
class Calculator extends Frame
{
    TextField txtScreen;
    Button btnZero,btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnCE,btnPlus,btnMinus,btnDiv,btnEquals,btnMulti;

    Controller cl = new Controller(this);
    

    Calculator(String k){
        super(k);
		this.setBounds(0, 0, 530, 460);
		setLayout(null);

        txtScreen = new TextField();
        btnZero= new Button("0");
        btnOne = new Button("1");
        btnTwo= new Button("2");
        btnThree = new Button("3");
        btnFour= new Button("4");
        btnFive = new Button("5");
        btnSix= new Button("6");
        btnSeven = new Button("7");
        btnEight= new Button("8");
        btnNine = new Button("9");
        btnCE= new Button("CE");
        btnPlus = new Button("+");
        btnMinus= new Button("-");
        btnDiv = new Button("/");
        btnMulti= new Button("*");
        btnEquals = new Button("=");
        

        
		txtScreen.setBounds(70,50,400,100);
        btnOne.setBounds(50,200,100,50);
        btnTwo.setBounds(160,200,100,50);
        btnThree.setBounds(270,200,100,50);
        btnPlus.setBounds(380,200,100,50);
        btnFour.setBounds(50,260,100,50);
        btnFive.setBounds(160,260,100,50);
        btnSix.setBounds(270,260,100,50);
        btnMinus.setBounds(380,260,100,50);
        btnSeven.setBounds(50,320,100,50);
        btnEight.setBounds(160,320,100,50);
        btnNine.setBounds(270,320,100,50);
        btnMulti.setBounds(380,320,100,50);
        btnZero.setBounds(50,380,100,50);
        btnCE.setBounds(160,380,100,50);
        btnEquals.setBounds(270,380,100,50);
        btnDiv.setBounds(380,380,100,50);
        
		
		Font f = new Font("Arial",0,50);
		
        txtScreen.setFont(f);
        

        add(txtScreen);
        add(btnOne);
        add(btnTwo);
        add(btnThree);
        add(btnPlus);
        add(btnFour);
        add(btnFive);
        add(btnSix);
        add(btnMinus);
        add(btnSeven);
        add(btnEight);
        add(btnNine);
        add(btnMulti);
        add(btnEquals);
        add(btnCE);
        add(btnDiv);
        add(btnZero);
        

        btnOne.addActionListener(cl);
		btnTwo.addActionListener(cl);
        btnThree.addActionListener(cl);
		btnFour.addActionListener(cl);
        btnFive.addActionListener(cl);
		btnSix.addActionListener(cl);
        btnSeven.addActionListener(cl);
		btnEight.addActionListener(cl);
        btnNine.addActionListener(cl);
		btnZero.addActionListener(cl);
        btnPlus.addActionListener(cl);
		btnEquals.addActionListener(cl);
        btnCE.addActionListener(cl);
		btnDiv.addActionListener(cl);
        btnMinus.addActionListener(cl);
		btnMulti.addActionListener(cl);

        addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
}

            public static void main(String arg[]) {
                Calculator cr = new Calculator("Display Screen");
                cr.setVisible(true);
            }
    
}