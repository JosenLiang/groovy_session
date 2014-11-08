package com.thoughtworks.groovy

def name = "John Smith"

println "This is ${name}".class.name

println 'This is ${name}'.class.name

println "This is John Smith".class.name

println "This is ${name}"

println 'This is ${name}'

println "This is $name"

def price = 8.1

println "The price is \$${price}"

println "The price is \$${price + 10}"
