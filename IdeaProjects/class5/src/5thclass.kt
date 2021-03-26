fun main(){
//var gari=Car("totyota","Nissan","KBZ6 537",65)
   // gari.start()
   // println(gari.start())
   // println(gari.carName())
    //gari.hoot()
    //println(gari.decelerate(25))

    //var benz=Car("Mercedes Benz","E250","KNG 765",75)
   // println(benz.speed)
    //benz.accelerate(104)
    //println(benz.speed)
    // println(benz.carName())
   // benz.hoot()
    //println(benz.decelerate(37))

   // var bic=BiroPen()
   // bic.write("I study in the mornings")
    //var victorine = Registration("Victorine Amani",21,"Nairobi","Highschool")
    //println(Victorine.name)
    //println(victorine.age)
    //var alexa=Registration("Alexa mines",23,"Mombasa","University dropout")
    //println(alexa.educationLevel)
   // println(alexa.toString())
    println("Enter age")
    var age:Int= readLine()!!.toInt()
    var ageNextYear=age+1
    println("You will be $ageNextYear next year")

}
class Car(var make:String, var model:String, var registration:String, var speed:Int) {
    fun start() {
        println("I am starting....Vooom")
    }
    fun accelerate(acceleration: Int): Int {
        speed = speed + acceleration
        return speed

    }
    fun carName(){
     println(make+" "+model)
    }
    fun hoot(){
        println("beep beep")
    }
    fun decelerate(decelerate:Int):Int{
        speed= speed - decelerate
        return speed
    }

}
class BiroPen(){
    fun write (writing:String){
        println(writing)
    }
}
class Registration(var name:String,var age:Int,var location:String, var educationLevel:String)
