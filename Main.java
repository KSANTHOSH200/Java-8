import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> result = numbers.stream()
                                           .filter(n -> n > 3)
                                           .filter(n -> n % 2 == 0)
                                           .findFirst();

        if (result.isPresent()) {
            System.out.println("The first even number greater than 3 is: " + result.get());
        } else {
            System.out.println("No even number greater than 3 was found in the list.");
        }
    }
}
