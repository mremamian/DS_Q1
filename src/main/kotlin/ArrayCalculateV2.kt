class ArrayCalculateV2 {
    fun sumByFor(array: IntArray): Int {
        var sum = 0
        for (index in array.size - 1 downTo 0) {
            sum += index
        }
        return sum
    }

    fun sumByDoWhile(array: IntArray): Int {
        var sum = 0
        var index = 0
        do {
            sum += array[index]
            index++
        } while (index < array.size)
        return sum
    }

    fun sumByRecursion(size: Int, array: IntArray): Int {
        return if (size == 0) array[size] else array[size] + sumByRecursion(size - 1, array)
    }
}