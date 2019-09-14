class Math {
    fun add(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    fun minimum(number1: Int, number2: Int): Int {
        if (number1 > number2) {
            return number2
        } else {
            return number1
        }

    }
}