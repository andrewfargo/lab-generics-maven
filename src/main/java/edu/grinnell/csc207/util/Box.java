package edu.grinnell.csc207.util;

/**
 * A `Box` structure allowing for reference to
 * immutable objects.
 * @param <T>
 *   The type of the reference.
 * @author Andrew N. Fargo
 */
public class Box<T> {
  T val;

  /**
   * Set the initial immutable value.
   * @param value
   *   The initial value of type <T>
   */
  public Box(T value) {
    this.set(value);
  } // Box(T)

  /**
   * Set the immutable value.
   * @param value
   *   The new value of type <T>.
   */
  public void set(T value) {
    this.val = value;
  } // set(T)

  /**
   * Get the immutable value.
   * @return The value.
   */
  public T get() {
    return this.val;
  } // get()
}
