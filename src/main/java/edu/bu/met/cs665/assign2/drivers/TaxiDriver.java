/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: TaxiDriver.java
 * Description: The TaxiDriver.java is a child class of the
 * Driver.java class and contains the TaxiDriver method, which is
 * used to when creating an instance of the class, in order to name it,
 * set the vehicle size, and add it as an observer, while updating
 * what will be sent once it gets notified of a change.
 */


package edu.bu.met.cs665.assign2.drivers;

import edu.bu.met.cs665.assign2.system.DeliveryRequest;

/**
 * This is the TaxiDriver child class, which extends the Driver
 * class.
 */
public class TaxiDriver extends Driver {

  /**
   * The TaxiDriver method will set the vehicle size accordingly to 20, and name the
   *driver, along with adding them as a observer to be notified.
   */
  public TaxiDriver(DeliveryRequest deliveryRequest, String name) {
    this.name = name;
    this.setVehicleSize(20);
    this.deliveryRequest = deliveryRequest;
    this.deliveryRequest.addDriver(this);
  }

  /**
   * The update method will print out a confirmation that the latest delivery
   * request was received by the driver.
   */
  @Override
  public void update() {
    System.out.println("Latest delivery request received by: "
        + this.name + ", consisting of: "
        + (deliveryRequest.getOrderReceivedSize()) + " items.");
  }

}
