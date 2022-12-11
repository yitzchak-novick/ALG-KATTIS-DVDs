import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int numCases = kb.nextInt();
    kb.nextLine();

    for (int currCase = 0; currCase < numCases; currCase++) {
      int numDvds = kb.nextInt();
      kb.nextLine();
      List<Integer> nums = Arrays.stream(kb.nextLine().split(" ")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
      int currMax = 0;
      for (int i = 0; i < nums.size(); i++){
        int n = nums.get(i);
        if (n == currMax + 1){
          currMax = n;
        }
      }
      System.out.println(currMax + " "  + (numDvds - currMax));
    }
  }
}
