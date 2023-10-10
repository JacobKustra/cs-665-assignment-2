/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: TestAge.java
 * Description: The TestAge.java class contains all of
 * my unit tests for the program.
 */


package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.assign2.drivers.ScooterDriver;
import edu.bu.met.cs665.assign2.drivers.TaxiDriver;
import edu.bu.met.cs665.assign2.drivers.VanDriver;
import edu.bu.met.cs665.assign2.store.Shop;
import edu.bu.met.cs665.assign2.system.DeliveryRequest;
import org.junit.Test;

/**
 * This is the TestAge Class, containing unit tests for my driver
 * order delivery request notifications.
 */
public class TestAge {

    /**
     * This is the TestAge method, which will create an
     * instance of Shop, a Delivery Request, and a minimum
     * of 5 Driver objects, in this case 9 (3 of each type).
     */
    public TestAge() {
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

    /**
     * This is the createShop method, which will create an
     * instance of Shop, and an order, and confirm if that order
     * will have an integer as the total order size.
     */
    @Test
    public void createShop() {
        Shop testShop = new Shop();
        testShop.createOrder();
        if (testShop.totalOrderSize == (int)testShop.totalOrderSize) {
            assert true;
        } else {
            assert false;
        }
    }


    /**
     * This is the testOrderSizeRange method, which will create an
     * instance of Shop, and an order, and confirm if that order
     * will have an a integer size between 1 and 30.
     */
    @Test
    public void testOrderSizeRange() {
        Shop testShop2 = new Shop();
        testShop2.createOrder();
        if (testShop2.totalOrderSize >= 1) {
            if (testShop2.totalOrderSize <= 30){
                assert true;
            } else {
                assert false;
            }
        } else {
            assert false;
        }
    }

    /**
     * This is the testScooterDriver method, which will create an
     * instance of a Shop, and an order, and confirm it will create
     * a scooter delivery driver by checking to see if there name is
     * as expect.
     */
    @Test
    public void testScooterDriver() {
        Shop shop = new Shop();
        shop.createOrder();
        DeliveryRequest testDelivery1 = new DeliveryRequest();
        ScooterDriver testScooterDriver = new
            ScooterDriver(testDelivery1, "Scooter Driver Tester");

        assertEquals(testScooterDriver.getName(), "Scooter Driver Tester");
    }

    /**
     * This is the testTaxiDriver method, which will create an
     * instance of a Shop, and an order, and confirm it will create
     * a taxi delivery driver by checking to see if there name is
     * as expect.
     */
    @Test
    public void testTaxiDriver() {
        Shop shop = new Shop();
        shop.createOrder();
        DeliveryRequest testDelivery2 = new DeliveryRequest();
        TaxiDriver testTaxiDriver = new
            TaxiDriver(testDelivery2, "Taxi Driver Tester");

        assertEquals(testTaxiDriver.getName(), "Taxi Driver Tester");
    }

    /**
     * This is the testVanDriver method, which will create an
     * instance of a Shop, and an order, and confirm it will create
     * a Van delivery driver by checking to see if there name is
     * as expect.
     */
    @Test
    public void testVanDriver() {
        Shop shop = new Shop();
        shop.createOrder();
        DeliveryRequest testDelivery3 = new DeliveryRequest();
        VanDriver testVanDriver = new
            VanDriver(testDelivery3, "Van Driver Tester");

        assertEquals(testVanDriver.getName(), "Van Driver Tester");
    }

}
