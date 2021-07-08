//Problem Statement:
//  ------------------
//This Scala exercise is an example of Scala's built-in support for dependency injection, and we will use some of the constructs, such as, the abstract class Vehicle, the case class Car, and the case class Bike.
//
//* Create a new class named VehicleInventorService that has a type parameter for all sub-types of Vehicle.
//  * It will define a checkStock() method with an input parameter of the same type as the class's type parameter.
//* Then, create a VehiclePricingService class that also has a type parameter for all sub-types of Vehicle.
//  * It will define a checkPrice() method with an input parameter of the same type as the class's type parameter.
//* Use these new above-mentioned classes, and create two lazy objects, or instances, in a new trait named VehicleServices with a type parameter for all sub-types of Vehicle.
//  * You can think of this VehicleServices trait as a layer for encapsulating all the given service layers for a particular vehicle system.
//* Naturally, next, we define the VehicleSystem trait which also has a type parameter for all sub-types of Vehicle. It however uses the self-type approach in Scala, to narrow down the - this: - to the VehicleServices trait above. Of course, any instance of the * VehicleSystem trait will have to, inject, or mixin, VehiclesServices.
//  * It further defines a buyVehicle() method that logically calls the checkStock() method from the VehicleInventoryService, and the checkPrice() of the VehiclePricingService, respectively.
//  * To use the above layers, create a singleton object named VehicleApp that will extend the VehicleSystem and inject, or mixin, the VehiclesServices trait, for the Vehicle type.
//* Finally, call the buyVehicle() method of the VehicleApp for a given Car "Benz" , and a bike "BMW".
//
//
//  Expected Output:
//  ----------------
//buying vehicle Car(Benz)
//checking stock for vehicle = Car(Benz)
//checking price for vehicle = Car(Benz)
//buying vehicle Bike(BMW)
//checking stock for vehicle = Bike(BMW)
//checking price for vehicle = Bike(BMW)



class problem {

}
