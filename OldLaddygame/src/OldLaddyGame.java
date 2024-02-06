import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class OldLaddyGame implements ActionListener{

	Random rand = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textField = new JLabel();
	JButton[] buttons = new JButton[9];
	JButton rst = new JButton("🔄");
	boolean player1_turn;
	
	OldLaddyGame(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800); // Futuramente setar para tamanho da resolução do pc
		frame.getContentPane().setBackground(new Color(154,205,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textField.setBackground(UIManager.getLookAndFeelDefaults().getColor("Button.background"));
		textField.setForeground(new Color(80,142,201));
		textField.setFont(new Font("Ink free", Font.BOLD,75));
		textField.setHorizontalAlignment(JLabel.CENTER);
		textField.setText("Jogo da Veia");
		textField.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0, 800, 100); // check res here
		
		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(new Color(152,251,152));
		
		for(int i=0; i<9; i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		rst.setSize(100,100);
		
		title_panel.add(textField);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
		
		JPanel rstPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rstPanel.add(rst);
        frame.add(rstPanel, BorderLayout.SOUTH);
        rst.setActionCommand("RST");
        rst.addActionListener(this);
		
		firstTurn();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("RST")) {
	        rstGame();
	    }else {
			for(int i=0; i<9; i++) {
				if(e.getSource()==buttons[i]){
					if(player1_turn) {
						if(buttons[i].getText()=="") {
							buttons[i].setForeground(new Color(255, 0, 0));
							buttons[i].setText("X");
							player1_turn = false;
							textField.setText("O turn");
							check();
						}
					}else {
						if(buttons[i].getText()=="") {
							buttons[i].setForeground(new Color(0, 0, 255));
							buttons[i].setText("O");
							player1_turn = true;
							textField.setText("X turn");
							check();
						}
					}
				}
			}
	    }
	}
	
	public void rstGame() {
		for(int i=0; i<9; i++){
			buttons[i].setEnabled(true);
			buttons[i].setText("");
			buttons[i].setBackground(UIManager.getLookAndFeelDefaults().getColor("Button.background"));
		}
		if(player1_turn){
			textField.setText("X turn");
		}else{
			textField.setText("O turn");
		}
	}
	
	public void firstTurn() {
		boolean startGame = false;
		for(int i=0; i<9; i++){
			buttons[i].setEnabled(false);
		}
		try {
			Thread.sleep(1500);
			startGame = true;
			for(int i=0; i<9; i++){
				buttons[i].setEnabled(true);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(startGame) {
			if(rand.nextInt(2)==0){
				player1_turn = true;
				textField.setText("X turn");
			}else {
				player1_turn = false;
				textField.setText("O turn");
			}
		}
	}	

	public void check() {
		if(buttons[0].getText()==buttons[1].getText() && buttons[1].getText()==buttons[2].getText() && buttons[2].getText()!="") { // horizontal
			if(buttons[0].getText()=="X") {
				xWins(0,1,2);
			}else {
				oWins(0,1,2);
			}
		}else if(buttons[3].getText()==buttons[4].getText() && buttons[4].getText()==buttons[5].getText() && buttons[4].getText()!="") { // horizontal
			if(buttons[3].getText()=="X") {
				xWins(3,4,5);
			}else {
				oWins(3,4,5);
			}
		}else if(buttons[6].getText()==buttons[7].getText() && buttons[7].getText()==buttons[8].getText() && buttons[6].getText()!="") { // horizontal
			if(buttons[6].getText()=="X") {
				xWins(6,7,8);
			}else {
				oWins(6,7,8);
			}
		}else if(buttons[0].getText()==buttons[3].getText() && buttons[3].getText()==buttons[6].getText() && buttons[0].getText()!="") { // vertical
			if(buttons[0].getText()=="X") {
				xWins(0,3,6);
			}else {
				oWins(0,3,6);
			}
		}else if(buttons[1].getText()==buttons[4].getText() && buttons[4].getText()==buttons[7].getText() && buttons[4].getText()!="") { // vertical
			if(buttons[1].getText()=="X") {
				xWins(1,4,7);
			}else {
				oWins(1,4,7);
			}
		}else if(buttons[2].getText()==buttons[5].getText() && buttons[5].getText()==buttons[8].getText() && buttons[2].getText()!="") { // vertical
			if(buttons[2].getText()=="X") {
				xWins(2,5,8);
			}else {
				oWins(2,5,8);
			}
		}else if(buttons[0].getText()==buttons[4].getText() && buttons[4].getText()==buttons[8].getText() && buttons[0].getText()!="") { // diagonal
			if(buttons[4].getText()=="X") {
				xWins(0,4,8);
			}else {
				oWins(0,4,8);
			}
		}else if(buttons[2].getText()==buttons[4].getText() && buttons[4].getText()==buttons[6].getText() && buttons[2].getText()!="") { // diagonal
			if(buttons[4].getText()=="X") {
				xWins(2,4,6);
			}else {
				oWins(2,4,6);
			}
		}else if(buttons[0].getText()!="" && buttons[1].getText()!="" && buttons[2].getText()!="" && buttons[3].getText()!="" 
				&& buttons[4].getText()!="" && buttons[5].getText()!="" && buttons[6].getText()!="" && buttons[7].getText()!="" 
				&& buttons[8].getText()!=""){ //tie
			tie();
		}
	}
	
	public void xWins(int a, int b, int c) {
		buttons[a].setBackground(new Color(150,230,170));
		buttons[b].setBackground(new Color(150,230,170));
		buttons[c].setBackground(new Color(150,230,170));
		for(int i=0; i<9; i++){
			buttons[i].setEnabled(false);
		}
		textField.setText("X wins!");
		
	}

	public void oWins(int a, int b, int c) {
		buttons[a].setBackground(new Color(150,230,170));
		buttons[b].setBackground(new Color(150,230,170));
		buttons[c].setBackground(new Color(150,230,170));
		for(int i=0; i<9; i++){
			buttons[i].setEnabled(false);
		}
		textField.setText("O wins!");
	}
	
	public void tie() {
		for(int i=0; i<9; i++){
			buttons[i].setBackground(new Color(250,130,130));
			buttons[i].setEnabled(false);
		}
		textField.setText("Tie!");
	}
}
