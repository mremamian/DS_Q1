import java.util.*

fun main(args: Array<String>) {
    val arrayCalculate=ArrayCalculateV1()
    val sc = Scanner(System.`in`)


    println("Enter array's length :")
    var arrLen = sc.nextInt()

    var arr = IntArray(arrLen)

    for (index in 0..arrLen-1){
        println("Enter number ${index+1} :")
        arr[index] = sc.nextInt()
    }



    println("\n\n")

    println("sumByRecursion : "+arrayCalculate.sumByRecursion(arr))

    println("sumByFor : "+arrayCalculate.sumByFor(arr))

    println("sumByWhile : "+arrayCalculate.sumByWhile(arr))

    println("\n\n")
    println("End of calculations " )
}