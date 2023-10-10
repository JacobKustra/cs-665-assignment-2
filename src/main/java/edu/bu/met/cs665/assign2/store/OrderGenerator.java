/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: OrderGenerator.java
 * Description: The OrderGenerator.java class contains the generateOrder
 * method, which is used to generate a random order size between 1 and 30.
 */

package edu.bu.met.cs665.assign2.store;

import java.util.Random;

/**
 * This is the OrderGenerator class, which is called when
 * an order needs to be generated.
 */

public class OrderGenerator {

  /**
   * This is the generateOrder method, generate a random order
   * size between 1 and 30.
   */
  public Integer generateOrder() {
    Random random = new Random();
    int orderSize = random.nextInt((30 - 1) + 1) + 1;
    return orderSize;
  }
}
