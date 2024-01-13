		import java.awt.Color;
		import java.awt.Font;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		
		import javax.naming.spi.DirStateFactory.Result;
		import javax.swing.JButton;
		import javax.swing.JFrame;
		import javax.swing.JLabel;
		import javax.swing.SwingConstants;

		public class Calculator implements ActionListener{
			
		public static void main(String[] args) {
				
				new Calculator(); 
				
		}



		JFrame jf;
		JLabel DisplayLabel;
		JButton SevenButton;
		JButton EightButton;
		JButton NineButton;
		JButton FourButton;
		JButton FiveButton;
		JButton SixButton;
		JButton OneButton;
		JButton TwoButton;
		JButton ThreeButton;
		JButton ZeroButton;
		JButton DotButton;
		JButton EqualButton;
		JButton DivisionButton;
		JButton MultiplicationButton;
		JButton MinusButton;
		JButton PlusButton;
		JButton ClearButton;




		String OldValue;
		String NewValue;
		boolean IsOperatorClicked=false;
		int flag=0;
		float result;
		float OldValueF;
		float NewValueF;
	public Calculator(){
		
		jf = new JFrame("Calculator");
		jf.setSize(600, 600);
		jf.setLayout(null);
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.getContentPane().setBackground(Color.black);
		
		DisplayLabel = new JLabel();
		DisplayLabel.setBounds(30, 30, 540, 60);
		jf.add(DisplayLabel);
		DisplayLabel.setBackground(Color.cyan);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setFont(new Font("Serif",Font.PLAIN,34));
		
		SevenButton = new JButton("7");
		SevenButton.setBounds(30, 120, 80, 80);
		SevenButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		SevenButton.addActionListener(this);
		jf.add(SevenButton);
		
		
		EightButton = new JButton("8");
		EightButton.setBounds(130, 120, 80, 80);
		EightButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		EightButton.addActionListener(this);
		jf.add(EightButton);
		
		
		NineButton = new JButton("9");
		NineButton.setBounds(230, 120, 80, 80);
		NineButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		NineButton.addActionListener(this);
		jf.add(NineButton);
		

		FourButton = new JButton("4");
		FourButton.setBounds(30, 220, 80, 80);
		FourButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		FourButton.addActionListener(this);
		jf.add(FourButton);
		
		FiveButton = new JButton("5");
		FiveButton.setBounds(130, 220, 80, 80);
		FiveButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		FiveButton.addActionListener(this);
		jf.add(FiveButton);
		
		SixButton = new JButton("6");
		SixButton.setBounds(230, 220, 80, 80);
		SixButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		SixButton.addActionListener(this);
		jf.add(SixButton);
		
		OneButton = new JButton("1");
		OneButton.setBounds(30, 320, 80, 80);
		OneButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		OneButton.addActionListener(this);
		jf.add(OneButton);
		
		TwoButton = new JButton("2");
		TwoButton.setBounds(130, 320, 80, 80);
		TwoButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		TwoButton.addActionListener(this);
		jf.add(TwoButton);
		
		ThreeButton = new JButton("3");
		ThreeButton.setBounds(230, 320, 80, 80);
		ThreeButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		ThreeButton.addActionListener(this);
		jf.add(ThreeButton);
		
		ZeroButton = new JButton("0");
		ZeroButton.setBounds(30, 420, 80, 80);
		ZeroButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		ZeroButton.addActionListener(this);
		jf.add(ZeroButton);
		
		DotButton = new JButton(".");
		DotButton.setBounds(130, 420, 80, 80);
		DotButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		DotButton.addActionListener(this);
		jf.add(DotButton);
		
		EqualButton = new JButton("=");
		EqualButton.setBounds(230, 420, 80, 80);
		EqualButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		EqualButton.addActionListener(this);
		jf.add(EqualButton);
		
		DivisionButton = new JButton("/");
		DivisionButton.setBounds(330, 120, 80, 80);
		DivisionButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		DivisionButton.addActionListener(this);
		jf.add(DivisionButton);
		
		MultiplicationButton = new JButton("x");
		MultiplicationButton.setBounds(330, 220, 80, 80);
		MultiplicationButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		MultiplicationButton.addActionListener(this);
		jf.add(MultiplicationButton);
		
		MinusButton = new JButton("-");
		MinusButton.setBounds(330, 320, 80, 80);
		MinusButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		MinusButton.addActionListener(this);
		jf.add(MinusButton);
		
		PlusButton = new JButton("+");
		PlusButton.setBounds(330, 420, 80, 80);
		PlusButton.setFont(new Font("",Font.ROMAN_BASELINE,34));
		PlusButton.addActionListener(this);
		jf.add(PlusButton);
		
		ClearButton = new JButton("AC");
		ClearButton.setBounds(430, 120, 140, 380);
		ClearButton.setFont(new Font("",Font.ROMAN_BASELINE,50));
		ClearButton.addActionListener(this);
		jf.add(ClearButton);
		
		jf.setVisible(true);
	}

	
		public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==SevenButton) {
			
			if(IsOperatorClicked==true) {
				DisplayLabel.setText("7");
				IsOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"7");
			}
			
			
			
		}else if(e.getSource()==EightButton) {
			if(IsOperatorClicked==true) {
				DisplayLabel.setText("8");
				IsOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"8");
			}
			
			
			
		}else if(e.getSource()==NineButton) {
			if(IsOperatorClicked==true) {
				DisplayLabel.setText("9");
				IsOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"9");
			}
			
			
			
		}else if(e.getSource()==FourButton) {
			if(IsOperatorClicked==true) {
				DisplayLabel.setText("4");
				IsOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"4");
			}
			
			
			
		}else if(e.getSource()==FiveButton) {
			if(IsOperatorClicked==true) {
				DisplayLabel.setText("5");
				IsOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"5");
			}
			
			
			
		}else if(e.getSource()==SixButton) {
			if(IsOperatorClicked==true) {
				DisplayLabel.setText("6");
				IsOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"6");
			}
			
			
			
		}else if(e.getSource()==OneButton) {
			if(IsOperatorClicked==true) {
				DisplayLabel.setText("1");
				IsOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"1");
			}
			
			
			
		}else if(e.getSource()==TwoButton) {
			if(IsOperatorClicked==true) {
				DisplayLabel.setText("2");
				IsOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"2");
			}
			
			
			
		}else if(e.getSource()==ThreeButton) {
			if(IsOperatorClicked==true) {
				DisplayLabel.setText("3");
				IsOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"3");
			}
			
			
			
		}else if(e.getSource()==ZeroButton) {
			if(IsOperatorClicked==true) {
				DisplayLabel.setText("0");
				IsOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"0");
			}
			
			
			
		}else if(e.getSource()==ClearButton) {
			DisplayLabel.setText("");
			
			
			
		}else if(e.getSource()==DotButton) {
			DisplayLabel.setText(DisplayLabel.getText()+".");
			
			
		}else if(e.getSource()==PlusButton) {
			IsOperatorClicked=true; 	
			OldValue=DisplayLabel.getText();
			flag=1;
		
			
		}else if(e.getSource()==MinusButton) {
			IsOperatorClicked=true;
			OldValue=DisplayLabel.getText();
			flag=2;
			
			
			
		}else if(e.getSource()==DivisionButton) {
			IsOperatorClicked=true;
			OldValue=DisplayLabel.getText();
			flag=3;
			
			
		}else if(e.getSource()==MultiplicationButton) {
			IsOperatorClicked=true;
			OldValue=DisplayLabel.getText();
			flag=4;
			
			
		}
		
		
		
		else if(e.getSource()==EqualButton) {
			NewValue=DisplayLabel.getText();
			NewValueF=Float.parseFloat(NewValue);
			OldValueF=Float.parseFloat(OldValue);
			
			if(flag==1) {
				 result=OldValueF+NewValueF;
				DisplayLabel.setText(result+"");
			}else if(flag==2) {
				 result=OldValueF-NewValueF;
				DisplayLabel.setText(result+"");
			}else if(flag==3) {
				 result=OldValueF/NewValueF;	
				DisplayLabel.setText(result+"");
			}else if(flag==4) {
				 result=OldValueF*NewValueF;
				DisplayLabel.setText(result+"");
			}
			
			NewValueF=result;
			
	}
		
	
	}
		
}

