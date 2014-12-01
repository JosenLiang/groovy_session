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

def carDao = new CarDao()

carDao.metaClass.getNewCarByBrand = { String brand ->
    "You are calling getNewCarByBrand method which is existing in Instance level"
}

println carDao.getNewCarByBrand('Ford')