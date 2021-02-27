package dad.lifesimulation.main.graphics.customcomponents.component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CellStatsViewEditable  implements Initializable {

	@FXML
	private GridPane view;
    @FXML
    private CheckBox cellTypeCHB;

    @FXML
    private TextField healthPointsTF;

    @FXML
    private TextField energyPointsTF;

    @FXML
    private TextField armorPointsTF;

    @FXML
    private TextField xCoordTF;

    @FXML
    private TextField yCoordTF;

    @FXML
    private TextField widthTF;

    @FXML
    private TextField heightTF;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public CellStatsViewEditable() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CellStatsViewEditable.fxml"));
			//loader.setRoot(this);
			loader.setController(this);
			loader.load();
			this.xCoordTF.textProperty().set("se inicio correctamente");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public GridPane getView() {
		return this.view;
	}
	public String test() {
		return this.xCoordTF.textProperty().get();
	}
}
