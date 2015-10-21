package es.diegocastano.voting.rest.business.views;

public class ThemeTransfer {
	
	private String themeName;
	
	private double average;
	
	public ThemeTransfer(String themeName, double average) {
		this.setThemeName(themeName);
		this.setAverage(average);
	}

	public String getThemeName() {
		return themeName;
	}

	private void setThemeName(String themeName) {
		this.themeName = themeName;
	}

	public double getAverage() {
		return average;
	}

	private void setAverage(double average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		return "ThemeTransfer [themeName=" + themeName + ", average=" + average + "]";
	}
	
}
