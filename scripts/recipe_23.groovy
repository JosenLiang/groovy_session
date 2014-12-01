import groovy.transform.ToString

@ToString(includeNames = true)
class Car {
    def brand, price
}

class CarDao {
    Car getNewCarByBrand(String brand) {
        new Car(brand: brand, price: 100000)
    }
}

CarDao.metaClass.'instance'.getNewCarByBrand = { String brand ->
    "You are calling the instance getNewCarByBrand method"
}

def carDao = new CarDao()

println carDao.getNewCarByBrand('Ford')