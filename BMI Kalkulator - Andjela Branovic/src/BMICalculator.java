public class BMICalculator {

	public double findBMI(double height, double weight) {
		double bmi = weight / (height/100 * height/100);
		return bmi;
	}

}
