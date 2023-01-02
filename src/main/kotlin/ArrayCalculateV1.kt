class ArrayCalculateV1 {

    fun sumByFor(array: IntArray): Int {
        var sum = 0
        for (index in array) {
            sum += index
        }
        return sum
    }

    fun sumByWhile(array: IntArray): Int {
        var sum = 0
        var index = 0
        while (index < array.size)
            sum += array[index++]
        return sum
    }

    fun sumByRecursion(array: IntArray): Int {
        return sumByRecursion(0, 0, array)
    }

    private fun sumByRecursion(index: Int, sum: Int, array: IntArray): Int {
        var index = index
        val sum = sum + array[index]
        index++
        return if (index < array.size) {
            sumByRecursion(index, sum, array)
        } else
            sum
    }
}