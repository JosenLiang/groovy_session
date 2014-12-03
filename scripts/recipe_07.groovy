import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString(includeNames = true)
class Student {
    def name, age, gender
}

def stu = new Student(name: "John Smith", age: 19, gender: "Male")
// Object stu = new Student()
// stu.name = "John Smith"
// ...
println stu

def stu1 = new Student([name: 'Merry Smith', age: 19, gender: 'Male'])
println stu1

@ToString(includeNames = true)
@TupleConstructor
class Customer {
    def name, age, gender
}

def customer = new Customer('John Brown', 27, 'Male')
println customer

def customer1 = new Customer(name: 'John Brown', age: 27, gender: 'Male')
println customer1

class Robot {
    static access(location, weight) {
        println "Location: $location, Weight: $weight"
    }
}

Robot.access 10, x: 10, y: 12, z: 23