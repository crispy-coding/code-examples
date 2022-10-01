package org.crispycoding

class SimplePrimeNumberUtils : PrimeNumberUtils {

    override fun isPrime(n: Int): Boolean {
        return if (n < 2)
            false
        else
            (2 until n).none { n % it == 0 }
    }

}