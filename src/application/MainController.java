package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Label result;
	private long num1 = 0;
	private String oper = "";
	private boolean start = true;
	private Model model = new Model();

	public void processNum(ActionEvent event) {
		if (start) {
			result.setText("");
			start = false;
		}
		String value = ((Button) event.getSource()).getText();
		result.setText(result.getText() + value);

	}

	public void processOper(ActionEvent event) {
		String value = ((Button) event.getSource()).getText();
		if (!value.equals("=")) {
			if (!oper.isEmpty()) {
				return;
			}
			oper = value;
			num1 = Long.parseLong(result.getText());
			result.setText("");
		} else {
			if (oper.isEmpty()) {
				return;
			}
			Long num2 = Long.parseLong(result.getText());
			Float output = model.calculate(num1, num2, oper);
			result.setText(String.valueOf(output));
			oper = "";
			start = true;
		}

	}

}
