import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString(includeNames = true)
@TupleConstructor
class Product {
    def name, quantity
}

println Product.interfaces