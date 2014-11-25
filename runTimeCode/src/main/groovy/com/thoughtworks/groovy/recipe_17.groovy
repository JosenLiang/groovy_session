package com.thoughtworks.groovy

def languages = ['C++': 'Stroustrup', Java: 'Gosling', Lisp: 'McCarthy']

println languages.Java
println languages['Lisp']
println languages.'C++'

//def maps = [1001: 'Marry Smith', 1002: 'John Brown', 1003: 'Nick Bush']
//println maps.1001
//println maps.'1002'
//println maps[1003]