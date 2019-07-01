import java.math.*;

//Cost Funcs
//MSE
public class MeanSquareError {
	//predictions = y1, label = y
	public static double calculateLoss(double[] predictions, double[] labels) {
		double diff = 0.0;
		double sum = 0.0;
		int i = 0;
		if (predictions.length != labels.length) {
			System.out.println("There is a problem with data");
			return -0.0f;
		}
		else {
			while (i < predictions.length) {
				//temp += Math.pow(predictions[i] - labels[i], 2);
				diff = predictions[i] - labels[i];
				sum += (diff * diff);
				i++;
			}
		}
		
		return sum / labels.length;
	}
	
	//RMSE
	public static double calculateRMSE(double[] predictions, double[] labels) {
		double mse = 0.0f;
		mse = calculateLoss(predictions, labels);
		return Math.sqrt(mse);
	}
}
