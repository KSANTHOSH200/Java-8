import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "elderberry", "bef");
    
    words.sort((s1, s2) -> s1.length() - s2.length());
    
    System.out.println("Sorted list: " + words);
  }
}
