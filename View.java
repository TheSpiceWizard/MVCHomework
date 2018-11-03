import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame {
	
	private JLabel userLabel = new JLabel("Username:");
	private JTextField Username = new JTextField(10);
	private JLabel passLabel = new JLabel("Password:");
	private JPasswordField Password = new JPasswordField(10);
	private JButton loginButton = new JButton("Login");
	private JTextField loginResult = new JTextField(10);
	
	View(){
		
		JPanel Panel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200, 200);
		
		Panel.add(userLabel);
		Panel.add(Username);
		Panel.add(passLabel);
		Panel.add(Password);
		Panel.add(loginButton);
		Panel.add(loginResult);
		loginResult.setEditable(false);
		
		this.add(Panel);
		

		
	}
	

	
	public void setloginResult(String result){
		loginResult.setText(result);
	}
	
	public String getUsername(){
		return Username.getText();
	}
	
	public String getPassword(){
		return new String(Password.getPassword());
	}

	
	
	void addLoginListener(ActionListener listenForLoginButton){
		loginButton.addActionListener(listenForLoginButton);
	}
	
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}
