import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class AverageCalculator {
public static void main(String[] args) {
List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
double average = numbers.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
System.out.println("The average of the numbers is: " + average);
}
}
