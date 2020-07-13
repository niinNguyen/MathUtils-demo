package org.niin;

import static org.niin.utils.MathUtils.computeFactorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("5! = " + computeFactorial(5));
        // actual: 720, expected 720 -> bingo
        // actual: 1000, expected 720 -> you dump af
        // expected: 1 if computeFactorial(0), run computeFactorial(0) that hope will return 1000
        // if not which means actual result is different from the expected -> wrong algorithm

        System.out.println("1! =  " + computeFactorial(0));
        // TDD ket hop voi UnitTesting xai cac thu vien phu tro JUnit, TestNG, PHPUnit, CPPUnit, xUnit, MSTest
    }
}
