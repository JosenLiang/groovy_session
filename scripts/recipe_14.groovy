def show = { first, second ->
    println "first value is $first; second value is $second"
}

def showWithFirstValueIs0 = show.curry 0

println "class name of sumStartWith0: ${showWithFirstValueIs0.class.name}"
println "superclass name of sumStartWith0: ${showWithFirstValueIs0.class.superclass.name}"

showWithFirstValueIs0 2

def showWithSecondValueIs100 = show.rcurry 100

showWithSecondValueIs100 1