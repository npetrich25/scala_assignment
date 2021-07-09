package scala_work

trait VehicleSystem[V <: Vehicle] {
  this: VehicleServices[V] =>

  def buyVehicle(vehicle: V): Unit = {
    println(s"buying vehicle $vehicle")
    vehicleInventoryService.checkStock(vehicle)
    vehiclePricingService.checkPrice(vehicle)
  }
}
