package scala_work

trait VehicleSystem[V <: Vehicle] {
  this: VehicleServices[V] =>

  def buyVehicle(auto: V): Unit = {
    println(s"buying vehicle $auto")
    vehicleInventoryService.checkStock(auto)
    vehiclePricingService.checkPrice(auto)
  }
}
