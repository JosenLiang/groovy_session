package com.thoughtworks.groovy

def names = ['John Smith', 'Nick Bush', 'Mark Jones', 'Nicholas Adams', 'Merry Smith']

println(names.countBy { it.endsWith 'Smith' })

names.reverseEach { println "My name is $it" }

println names.drop(2)

println names.find { it.endsWith 'Smith' }

println names.findAll { it.endsWith 'Smith' }

println names.collect({ String name -> name.size() }).sum()

println names*.size().sum()

println names.join(' , ')

def languages = ['C++': 'Stroustrup', Java: 'Gosling', Lisp: 'McCarthy']

languages.each { key, value -> println "Found $key written by $value" }