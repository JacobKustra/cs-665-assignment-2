/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: Main.java
 * Description: The Main.java class contains the main method, which is
 * used to start/run an example of the program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assign2.drivers.ScooterDriver;
import edu.bu.met.cs665.assign2.drivers.TaxiDriver;
import edu.bu.met.cs665.assign2.drivers.VanDriver;
import edu.bu.met.cs665.assign2.store.Shop;
import edu.bu.met.cs665.assign2.system.DeliveryRequest;

/**
 * This is the Main class which will initiate an order process, followed
 * by the delivery request being sent to all the drivers.
 */
public class Main {

  /**
   * The main method which is used to run an example. In this case it will
   * create an instance of a Shop, a Delivery Request, and 9 Driver objects,
   * in this case consisting of 3 scooter drivers, 3 taxi drivers and 3 van
   * drivers which will all be sent the order.
   */
  public static void main(String[] args) {

    Shop shop = new Shop();
    shop.createOrder();
    DeliveryRequest firstDelivery = new DeliveryRequest();

    new ScooterDriver(firstDelivery, "Scooter Driver 1");
    new ScooterDriver(firstDelivery, "Scooter Driver 2");
    new ScooterDriver(firstDelivery, "Scooter Driver 3");
    new TaxiDriver(firstDelivery, "Taxi Driver 1");
    new TaxiDriver(firstDelivery, "Taxi Driver 2");
    new TaxiDriver(firstDelivery, "Taxi Driver 3");
    new VanDriver(firstDelivery, "Van Driver 1");
    new VanDriver(firstDelivery, "Van Driver 2");
    new VanDriver(firstDelivery, "Van Driver 3");

    System.out.println("Looking for a delivery driver to pick up"
        + " an order consisting of " + shop.totalOrderSize + " items.");
    System.out.println("Sending requests to all delivery drivers now.\n");
    firstDelivery.setOrderReceivedSize(shop.totalOrderSize);
  }
}
