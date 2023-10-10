/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: Shop.java
 * Description: The Shop.java class is a child class that contains the
 * createOrder method, which is used to generate a new order and
 * send a message once it is generating the delivery order.
 */

package edu.bu.met.cs665.assign2.store;


import edu.bu.met.cs665.assign2.system.DeliveryRequest;

/**
 * This is the Shop class, which extends the DeliveryRequest class,
 * and is called when a new store is created.
 */
public class Shop extends DeliveryRequest {

  public Integer totalOrderSize;


  /**
   * This is the createOrder method, which generate a new order and order
   * size, and print out a message that a delivery order was generated.
   */
  public Integer createOrder() {
    OrderGenerator newOrder = new OrderGenerator();
    this.totalOrderSize = newOrder.generateOrder();
    System.out.println("Product delivery order received, "
        + "generating delivery order now.\n");
    return totalOrderSize;
  }
}
