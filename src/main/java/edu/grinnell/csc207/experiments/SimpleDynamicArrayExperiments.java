package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.DynamicArray;
import edu.grinnell.csc207.util.SimpleDynamicArray;

import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * Some simple experiments with dynamic arrays.
 */
public class SimpleDynamicArrayExperiments {

  // +----------------+----------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Square a big integer.
   *
   * @param i
   *   The value to square.
   *
   * @return i*i.
   */
  public static BigInteger square(BigInteger i) {
    return i.multiply(i);
  } // square(BigInteger)

  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  /**
   * Run the experiments.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    DynamicArray<BigInteger> numbers =
        new SimpleDynamicArray<BigInteger>();

    // Set some values
    for (int i = 0; i < 10; i++) {
      numbers.set(i, BigInteger.valueOf(i));
    } // for i

    // Get some values
    for (int i = 0; i < 10; i++) {
      pen.println("numbers[" + i + "] = " + numbers.get(i));
    } // for i

    // Do some simple computations
    for (int i = 0; i < 10; i++) {
      pen.println(numbers.get(i) + "^2 = " + square(numbers.get(i)));
    } // for i

    // Exercise 1

    DynamicArray<String> strings = new SimpleDynamicArray<String>();
  
    for (int i = 0; i < 10; i++) {
      strings.set(i, "a".repeat(i));
    } // for

    for (int i = 0; i < 10; i++) {
      pen.println("strings[" + i + "] = " + strings.get(i));
    } // for

    // strings.set(10, BigInteger.ZERO);
    // The previous line complains that set(int, BigInteger) is not defined for
    // DynamicArray<String>

    // The following works but the compiler states you should parameterize
    // the raw type, as well as needing an unchecked conversion.
    /*
    DynamicArray<BigInteger> numbers2 = new SimpleDynamicArray();
    numbers2.set(0, BigInteger.ZERO);
    pen.println(numbers2.get(0));
    */

    // Almost shockingly, these both work due to an implicit
    // cast to Object, but any chance at undefined interaction will break.
    /*
    DynamicArray numbers3 = new SimpleDynamicArray();
    numbers3.set(0, BigInteger.ZERO);
    pen.println(numbers3.get(0));
    numbers3.set(1, "Hello");
    pen.println(numbers3.get(1));
    numbers3.set(2, numbers3.get(0) + numbers3.get(1)); // doesn't compile
    */

    
  } // main(String[])
} // class SimpleDynamicArrayExperiment
