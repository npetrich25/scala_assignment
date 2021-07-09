package scala_work

trait VehicleServices[V <: Vehicle] {
  lazy val vehicleInventoryService = new VehicleInventoryService[V]
  lazy val vehiclePricingService = new VehiclePricingService[V]
}
