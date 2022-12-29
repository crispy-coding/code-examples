package org.crispycoding

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SimplePrimerNumberGeneratorTest {

    private val primeNumberUtils: PrimeNumberUtils = SimplePrimeNumberUtils()

    @Test
    fun numbersFromMinusTenToOneShouldNotBePrime() {
        val list = (-10..1).toList()
        forAllNumbersInListExpectIsPrimeResult(list, false)
    }

    @Test
    fun primeNumbersFromTwoToTwentyShouldBeRecognizedAsSuch() {
        val list = listOf(2, 3, 5, 7, 11, 13, 17, 19)
        forAllNumbersInListExpectIsPrimeResult(list, true)
    }

    @Test
    fun nonPrimeNumbersFromFourToTwentyShouldBeRecognizedAsSuch() {
        val list = listOf(4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20)
        forAllNumbersInListExpectIsPrimeResult(list, false)
    }

    private fun forAllNumbersInListExpectIsPrimeResult(numberList: List<Int>, expected: Boolean){
        numberList.forEach {
            println("Current number to be tested is: $it")
            assertEquals(expected, primeNumberUtils.isPrime(it))
        }
    }

}