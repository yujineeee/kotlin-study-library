package com.group.libraryapp.calculator

import java.lang.IllegalArgumentException

class Calculator(
        var number: Int
) {

    //퍼블릭getter 만들어주기..
    //개인적으로 setter를 사용하지 않기로 약속하고 퍼블릭 세터 열어두는것이 좋겠다 이런거 만들지 않기
//    val number: Int
//        get() = this._number

    fun add(operand: Int) {
        this.number += operand
    }

    fun minus(operand: Int) {
        this.number -= operand
    }

    fun multiply(operand: Int) {
        this.number *= operand
    }

    fun divide(operand: Int) {
        if (operand == 0) {
            throw IllegalArgumentException("0으로 나눌 수 없습니다")
        }
        this.number /= operand
    }

}