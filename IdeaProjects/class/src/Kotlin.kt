fun main(){
println(aver(23,21,24))
    println(sum(7,2.7f))
    println(intro("Victorine "," 20"))
}
fun aver(num1:Int,num2:Int,num3:Int):Int{
    var sum= num1+num2+num3
    return sum/3
}
fun sum(num1:Int, num2:Float):Float {
    return num1 +num2
}
fun intro(name:String,age:String):String{
    return "Hello, my name is "+ name+ "I am "+ age + "years old"

}

