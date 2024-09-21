package edu.grinnell.csc207.util.predicates;
import edu.grinnell.csc207.util.Predicate;

/**
 * Predicates for generic objects.
 * Converts the object to a string by way of toString().
 * Clients cannot create SmallObject objects; they must
 * reference SmallObject.PRED
 *
 * @author Andrew N. Fargo
 */
public class SmallObject implements Predicate<Object> {
  /**
   * A singleton copy of the predicate.
   */
  public static final SmallObject PRED = new SmallObject();

  /**
   * Create a new predicate. Private to prevent
   * clients from creating new objects.
   */
  private SmallObject() {
  } // SmallObject

  /**
   * Determine if val is a small object.
   * @param val The object to test.
   * @return true if val is small, false otherwise.
   */
  public boolean holds(Object val) {
    return SmallString.PRED.holds(val.toString());
  } // holds
} // class SmallObject
