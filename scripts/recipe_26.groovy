class Car {
    def brand, price
}

def car = new Car(brand: 'Ford', price: 100000)
println Car.metaClass
println car.metaClass

car.metaClass.getContent = { -> "Brand: $brand, Price: $price, Delegate: $delegate" }
println Car.metaClass
println car.metaClass