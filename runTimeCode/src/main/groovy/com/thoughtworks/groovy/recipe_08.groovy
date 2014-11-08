package com.thoughtworks.groovy

def log(x, base = 10) {
    Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 2)

def task(name, String[] details) {
    println "$name - $details"
}

task 'Call'
task 'Call', '123-456-789'
task 'Call', '123-456-789', '231-546-0987'