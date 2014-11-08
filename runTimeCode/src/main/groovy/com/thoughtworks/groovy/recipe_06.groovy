package com.thoughtworks.groovy

class Car {
    final year
    private miles

    Car(theYear) {
        year = theYear
        miles = 0
    }

    def drive(dist) {
        if (dist > 0) {
            miles += dist
        }
    }

    def getWheel() {
        "This is Wheel"
    }
}

def car = new Car(2012)

println "Year: $car.year"
car.miles = 10
car.drive 100
println "Miles: $car.miles"

println car.wheel

car.year = 2014