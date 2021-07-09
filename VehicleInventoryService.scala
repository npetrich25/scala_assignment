package scala_work

class VehicleInventoryService[V <: Vehicle] {
  def checkStock(vehicle: V): Unit = {
    println(s"checking stock for vehicle = $vehicle")
  }
}
