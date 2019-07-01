
public class MainTester {
	public static void main(String[] args) {
		int i = 0;
		double bias = 10.0f;
		double weight = 5.0f;
		double[] features = {10, 20, 30, 40, 50};
		double[] labels = {50, 75, 180, 210, 260};
		double[] predictions = new double[features.length];
		double loss = 0.0f;
		
		predictions = LinearRegression.calculatePrediciton(features, bias, weight);
		loss = MeanSquareError.calculateLoss(predictions, labels);
		while (i < features.length) {
			System.out.println(predictions[i]);
			i++;
		}
		System.out.println(loss);

	}
}
