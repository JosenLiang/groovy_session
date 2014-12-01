import groovy.transform.ToString

@ToString(includeNames = true)
class Car {
    def brand, price
}

class CarDao {
    static getNewCarByBrand(String brand) {
        new Car(brand: brand, price: 100000)
    }
}

CarDao.metaClass.'static'.getNewCarByBrand = { String brand ->
    "You are calling the static getNewCarByBrand method"
}

println CarDao.getNewCarByBrand('Ford')