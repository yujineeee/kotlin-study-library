package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
}


class CalculatorTest {

    fun addTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.add(3)

        //then
        if (calculator.number != 8) {
            throw IllegalStateException()
        }

//        val expectedCalculator = Calculator(8)
//        if (calculator != expectedCalculator) {
//            throw IllegalStateException()
//        }

    }

    fun minusTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.minus(3)

        //then
        if (calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun multiplyTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.multiply(3)

        //then
        if (calculator.number != 15) {
            throw IllegalStateException()
        }
    }

    fun divideTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.divide(2)

        //then
        if (calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun divideExceptionTest() {
        //given
        val calculator = Calculator(5)

        //when

        try {
            calculator.divide(0)
        } catch(e: IllegalArgumentException) {

            if (e.message != "0으로 나눌 수 없습니다") {
                throw IllegalStateException("메시지 틀림뉘다")
            }
            // 테스트 성공!
            return
        } catch(e: Exception) {
            throw IllegalStateException()
        }

        throw IllegalStateException("기대한 예외가 안발생함")
    }
}

//수동 단점 -
// 1 개별적으로 실행하기 어렵구
// 2. 뭘 기대했구 아닌지 알기 어렵고
// 3. 메소드 마다 중복이 생김 - calculator(5)

//그래서 To be continued..
// >> Junit5쓸거임.. <<