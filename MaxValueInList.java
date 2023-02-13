import java.util.List;
import java.util.Optional;

public class MaxValueInList {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);
    
    Optional<Integer> max = numbers.stream().max(Integer::compareTo);
    
    if (max.isPresent()) {
      System.out.println("The maximum value in the list is: " + max.get());
    } else {
      System.out.println("The list is empty.");
    }
  }
}
