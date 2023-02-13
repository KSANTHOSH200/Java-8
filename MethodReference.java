import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
    
    words.sort(Main::compareByLength);
    
    System.out.println("Sorted List: " + words);
  }
  
  private static int compareByLength(String s1, String s2) {
    return Integer.compare(s2.length(), s1.length());
  }
}
