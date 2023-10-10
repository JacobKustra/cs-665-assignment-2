/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: Driver.java
 * Description: The Driver.java is a parent class contains a few
 * methods within the Driver method that allow for easily retrieval
 * and modification of the vehicle size and an abstract method
 * way to update what is sent back.
 */

package edu.bu.met.cs665.assign2.drivers;


import edu.bu.met.cs665.assign2.system.DeliveryRequest;

/**
 * This is the Driver class which will initiate variables associated with the class.
 */
public abstract class Driver {
  protected DeliveryRequest deliveryRequest;
  protected Integer vehicleSize;
  protected String name;

  /**
   * This is the setVehicleSize method which will take in an
   * integer and set the vehicles size to be equal to it.
   */
  public void setVehicleSize(Integer size) {
    this.vehicleSize = size;
  }

  /**
   * This is the getVehicleSize method which will return
   * the vehicles size.
   */
  public Integer getVehicleSize() {
    return vehicleSize;
  }

  /**
   * This is the abstract update method which will be implemented
   * in the child classes.
   */
  public abstract void update();

  /**
   * This is the getName method will be return the name of the driver.
   */
  public String getName() {
    return this.name;
  }
}
