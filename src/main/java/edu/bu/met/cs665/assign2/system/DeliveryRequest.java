/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: DeliveryRequest.java
 * Description: The DeliveryRequest.java class contains the methods necessary to manage the
 * drivers being added to the list to be updated when there is a new request, while also being
 * able to set/retrieve order size and finally the ability to update the drivers in the list.
 */


package edu.bu.met.cs665.assign2.system;

import edu.bu.met.cs665.assign2.drivers.Driver;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the DeliveryRequest class which will initiate variables and contains the various
 * methods to update/notify the list of drivers when a delivery request is created and for how
 * big the order is.
 */
public class DeliveryRequest {
  private Integer orderReceivedSize;
  private final List<Driver> allDrivers = new ArrayList<>();

  /**
   * This is the addDriver method which will add a driver to the list
   * of "subscribers" waiting to be notified of a change/update of the
   * delivery request.
   */
  public void addDriver(Driver driver) {
    this.allDrivers.add(driver);
  }

  /**
   * This is the removeDriver method which will remove a driver from the list
   * of "subscribers" waiting to be notified of a change/update of the
   * delivery request.
   */
  public void removeDriver(Driver driver) {
    this.allDrivers.remove(driver);
  }

  /**
   * This is the getOrderReceivedSize method which will return the order's
   * size.
   */
  public Integer getOrderReceivedSize() {
    return orderReceivedSize;
  }

  /**
   * This is the getOrderReceivedSize method which will set the order's
   * size and then notify all the drivers by calling the notifyDrivers
   * method.
   */
  public void setOrderReceivedSize(Integer orderReceivedSize) {
    this.orderReceivedSize = orderReceivedSize;
    notifyDrivers();
  }

  /**
   * This is the notifyDrivers method which will go through all the
   * drivers in list and "update" each of them with the delivery request.
   */
  public void notifyDrivers() {
    for (Driver driver : allDrivers) {
      driver.update();
    }
  }
}
