package test

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import steps.MathSteps

@DisplayName("Математические тесты")
class MathTest {

    private val steps = MathSteps()

    @Test
    fun sumTest() {
        steps.checkAnswer(10, steps.sumNumbers(5, 5))
    }

    @Test
    fun subTest() {
        steps.checkAnswer(5, steps.subNumbers(10, 5))
    }

    @Test
    fun multiplyTest() {
        steps.checkAnswer(25, steps.multiplyNumbers(5, 5))
    }

    @Test
    fun divTest() {
        steps.checkAnswer(5, steps.divNumbers(25, 5))
    }



}