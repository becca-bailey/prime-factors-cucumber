package implementation;

import java.util.ArrayList;

public class PrimeFactors {

  public ArrayList<Integer> generate(int n) {
    ArrayList<Integer> factors = new ArrayList();
    if (n > 1) {
      while (n % 2 == 0) {
        factors.add(2);
        n /= 2;
      }
      while (n % 3 == 0) {
        factors.add(3);
        n /= 3;
      }
    }
    if (n > 1)
      factors.add(n);
    return factors;
  }
}
