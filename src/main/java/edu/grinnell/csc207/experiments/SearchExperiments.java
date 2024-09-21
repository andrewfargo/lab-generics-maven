package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.SearchUtils;
import edu.grinnell.csc207.util.predicates.OddInteger;
import edu.grinnell.csc207.util.predicates.SmallString;
import edu.grinnell.csc207.util.predicates.SmallObject;

import java.io.PrintWriter;

/**
 * A simple set of experiments with predicates and searching.
 *
 * @author Samuel A. Rebelsky
 * @author Andrew N. Fargo
 */
public class SearchExperiments {
  /**
   * Run the experiments.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) {
    // Prepare for output.
    PrintWriter pen = new PrintWriter(System.out, true);

    // Set up a few arrays to search.
    String[] strings =
        new String[] {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot",
            "golf", "hotel", "india", "juliett", "kilo", "lima", "mike",
            "november", "oscar"};
    Integer[] numbers =
        new Integer[] {2, 3, 5, 7, 9, 11, 13, 15, 17, 18, 32, 42};

    // Okay, we're ready for the experiments
    pen.println("A small string: "
        + SearchUtils.search(strings, SmallString.PRED));
    pen.println("An odd integer: "
        + SearchUtils.search(numbers, OddInteger.PRED));
    // The compiler correctly identifies that numbers and SmallString.PRED
    // are not the same type
    //SearchUtils.search(numbers, SmallString.PRED); // Doesn't compile

    // Set up a few arrays to search.
    Object[] stringObjects =
        new Object[] {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot",
            "golf", "hotel", "india", "juliett", "kilo", "lima", "mike",
            "november", "oscar"};

    pen.println("A small string object: "
		+ SearchUtils.search(stringObjects, SmallObject.PRED));

    // Surprisingly compiles without fuss of conversion
    // I suppose this must be because strings derives from Object
    pen.println("A small string OBJECT: "
		+ SearchUtils.search(strings, SmallObject.PRED));

    Object[] numberObjects = (Object[])numbers;
    pen.println("A small number OBJECT: "
		+ SearchUtils.search(numberObjects, SmallObject.PRED));

    
  } // main(String[])

} // class SearchExperiments
