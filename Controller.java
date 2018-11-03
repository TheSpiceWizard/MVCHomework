import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	private View theView;
	private Model theModel;
	
	public Controller(View theView, Model theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		

		this.theView.addLoginListener(new LoginListener());
	}
	

	class LoginListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){

				String Username, Password;
				
				Username = theView.getUsername();
				Password = theView.getPassword();
				
				theModel.validate(Username, Password);
				
				theView.setloginResult(theModel.validate(Username, Password));
				

		}
	
	}
}
