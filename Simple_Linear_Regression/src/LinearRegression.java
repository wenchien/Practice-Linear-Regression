
public class LinearRegression {
	public static double[] calculatePrediciton(double[] features, double bias, double weight) {
		double[] temp = new double[features.length];
		int i = 0;
		//Assuming the model takes one feature and returns one prediction
		//y1 = b + w1(x1)
		while (i < features.length) {
			temp[i] = bias + (weight * features[i]);
			i++;
		}
		
		return temp;
	}
}
