println 'ls'.execute().text

class Customer {
    def name, age, gender, address
}

def customer = new Customer(name: 'John Smith', age: 25, gender: 'MALE', address: 'No.102, Queen Street, NewYork city')

customer.takeAsContext {
    println "My name is $name"
}