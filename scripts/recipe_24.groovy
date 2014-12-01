import groovy.transform.ToString

@ToString(includeNames = true)
class Car {
    def brand, price
}

class CarDao {
    def getNewCarByBrand = { String brand ->
        'You are calling the closure property'
    }
}

def carDao = new CarDao()
println carDao.getNewCarByBrand('Ford')