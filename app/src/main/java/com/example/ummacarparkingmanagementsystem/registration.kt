package com.example.ummacarparkingmanagementsystem

import java.util.*

// Car class to represent a car
data class Car(val licensePlate: String)

// ParkingLot class to manage the parking lot
class ParkingLot(private val capacity: Int) {
    private val registeredCars = mutableListOf<Car>()

    // Register a car in the parking lot
    fun registerCar(car: Car) {
        if (registeredCars.size < capacity) {
            registeredCars.add(car)
            println("Car with license plate ${car.licensePlate} registered successfully.")
        } else {
            println("Parking lot is full. Car with license plate ${car.licensePlate} cannot be registered.")
        }
    }

    // Process payment for a registered car
    fun processPayment(car: Car, hours: Int) {
        val parkingFee = calculateParkingFee(hours)
        println("Payment processed for car with license plate ${car.licensePlate}. Amount due: $parkingFee")
    }

    // Calculate parking fee based on hours
    private fun calculateParkingFee(hours: Int): Double {
        // Assume parking fee is $2 per hour
        return hours * 2.0
    }
}

fun main() {
    val parkingLot = ParkingLot(10)

    // Register cars
    val car1 = Car("ABC123")
    val car2 = Car("XYZ789")
    val car3 = Car("DEF456")

    parkingLot.registerCar(car1)
    parkingLot.registerCar(car2)
    parkingLot.registerCar(car3)

    // Process payment
    parkingLot.processPayment(car1, 3)
    parkingLot.processPayment(car2, 5)
    parkingLot.processPayment(car3, 2)
}

