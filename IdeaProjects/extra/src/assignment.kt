fun main(){
    total()
        vickie()
}
fun total(){
    var numArray= arrayOf(50,32,44,7,23,45)
    var numElements=numArray.count()
println(numElements)
    var sumElements=numArray.sum()
    println(sumElements)
    var minValue=numArray.minOrNull()
    println(minValue)
    var maxValue=numArray.maxOrNull()
    println(maxValue)
    numArray.forEach{
            num->
     println(num)
    }
}
fun vickie() {
        var namesArray = arrayOf("Fiona", "Diana", "Ada", "Elsie", "Beth", "Chris")
        var sortedNames = namesArray.sortedArray()
        println(Arrays.toString(sortedNames))

    }