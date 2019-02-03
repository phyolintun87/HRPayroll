package reports.strategy;

import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class StrategyReport {
	private Ireports strategy;
	public void SetStrategy(Ireports strategy) {
		this.strategy=strategy;
	}
	public TableView getStrategy(TableView tbl1,Label lblCaption) {
		return  strategy.getReport(tbl1,lblCaption);
	}
	public void getExportReport(String name) {
		// TODO Auto-generated method stub
		strategy.getExportReport(name);
	}
}
