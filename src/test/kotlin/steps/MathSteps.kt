package steps

import io.qameta.allure.Step
import org.junit.jupiter.api.Assertions.assertEquals

class MathSteps {

    @Step("Сложение чисел")
    fun sumNumbers(a: Int, b: Int): Int = a + b

    @Step("Вычитание чисел")
    fun subNumbers(a: Int, b: Int): Int = a - b

    @Step("Умножение чисел")
    fun multiplyNumbers(a: Int, b: Int): Int = a * b

    @Step("Деление чисел")
    fun divNumbers(a: Int, b: Int): Int = a / b

    @Step("Проверка ответа")
    fun checkAnswer(actual: Int, expected: Int)  {
        assertEquals(expected, actual)
    }
}