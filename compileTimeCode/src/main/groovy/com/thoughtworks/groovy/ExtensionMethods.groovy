package com.thoughtworks.groovy

public class ExtensionMethods {
    public static String getContent(String self) {
        self.toURL().readLines().join('')
    }

    public static takeAsContext(self, Closure closure) {
        closure.delegate = self
        closure()
    }
}
