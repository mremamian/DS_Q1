import java.util.*

fun main(args: Array<String>) {
    val arrayCalculateV2 = ArrayCalculateV2()
    val arrayCalculateV1 = ArrayCalculateV1()
    val runtime = Runtime.getRuntime()

    runtime.gc()


    val sc = Scanner(System.`in`)


    println("Enter array's length :")
    var arrLen = sc.nextInt()

    var arr = IntArray(arrLen)

    for (index in 0..arrLen-1){
        // println("Enter number ${index+1} :")
        arr[index] = index+1000000 //sc.nextInt()
    }

    val startTime = System.currentTimeMillis()
    println("\n\n")

//     println("sumByRecursion : "+ ArrayCalculateV1().sumByRecursion(arr))

    println("sumByFor : "+arrayCalculateV2.sumByFor(arr))

    println("sumByWhile : "+arrayCalculateV2.sumByDoWhile(arr))

    println("\n")
    println("End of calculations " )
    println("\n")

    val stopTime = System.currentTimeMillis()

    val elapsedTime = stopTime - startTime


    println("Time elapsed: "+elapsedTime)

    println("\n")


    val memory: Long = runtime.totalMemory() - runtime.freeMemory()
    println("Used memory is bytes: $memory")
    System.out.println(
        "Used memory is megabytes: "
                + bytesToMegabytes(memory)
    )
}
private const val MEGABYTE = 1024L * 1024L

fun bytesToMegabytes(bytes: Long): Long {
    return bytes / MEGABYTE
}