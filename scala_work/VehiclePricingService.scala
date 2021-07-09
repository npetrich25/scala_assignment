package scala_work

class VehiclePricingService[V <: Vehicle] {
  def checkPrice(auto: V): Unit = {
    println(s"checking price for vehicle = $auto")
  }
}
