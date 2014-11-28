import groovy.transform.ToString

@ToString(includeNames = true)
class Company {
    def name, address

    def leftShift(address) {
        this.address += address
        this
    }
}

def company = new Company(name: "ThoughtWorks", address: "SiChuan province")

company << ", ChengDu city " << ", TianFu software park"

println company

@ToString(includeNames = true)
class MotorCar {
    def year, miles

    def plus(mile) {
        miles += mile
        this
    }
}

def motorCar = new MotorCar(year: 1, miles: 100.0)
motorCar + 120 + 230

println motorCar


