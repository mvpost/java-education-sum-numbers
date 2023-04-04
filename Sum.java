import java.util.Arrays;

public class Sum {
	public static void main(String[] args) {
		int sum = 0; 
		String argsStr = Arrays.toString(args);
		String[] argsArray = argsStr.split("\\D+");
		for (int i = 1; i < argsArray.length; i++) {
			sum += Integer.parseInt(argsArray[i]);
		}        
		System.out.println("Сумма чисел в строке: " + sum);
	}
}
