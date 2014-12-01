import groovy.transform.ToString

@ToString(includeNames = true)
class Car {
    def brand, price
}

class CarDao implements GroovyInterceptable {
    def invokeMethod(String name, def args) {
        "You are calling $name method"
    }

    Car getNewCarByBrand(String brand) {
        new Car(brand: brand, price: 100000)
    }
}

def carDao = new CarDao()

println carDao.getNewCarByBrand('Ford')