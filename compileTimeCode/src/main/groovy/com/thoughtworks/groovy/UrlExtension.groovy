package com.thoughtworks.groovy

public class UrlExtension {
    public static String getContent(String self) {
        self.toURL().readLines().join('')
    }
}
