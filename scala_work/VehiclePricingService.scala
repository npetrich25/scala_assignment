package scala_work

class VehiclePricingService[V <: Vehicle] {
  def checkPrice(vehicle: V): Unit = {
    println(s"checking price for vehicle = $vehicle")
  }
}
