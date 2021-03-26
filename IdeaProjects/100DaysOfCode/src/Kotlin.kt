fun main(){
inter("Victorine",20,72.3)
    conca(1234,"Nakuru")
    compare("Victorine","victorne")
    case("Elephant")
    trim("Elizabeth")
    rep()
    split()
}
//strings
//string interpolation
fun inter(a:String,b:Int,c:Double,){
  println("My names is $a I am $b years old and I weigh $c Kgs")
}
//string concatenation
fun conca(a:Int,b:String){
println("$a is my address in $b")
}
//comparison
fun compare(a:String,b:String){
    println(a==b)
}
fun case(names:String){
    println(names.toUpperCase())
    println(names.toLowerCase())
    println(names.capitalize())
    println(names.decapitalize())
}
//trim
fun trim(a:String){
    println(a.trimStart())
    println(a.trimEnd())
    print(a.trim())
    println(a.startsWith("E"))
println(a.endsWith("b"))
}
//replace
fun rep(){
   var input="Victorine is a Kenyan"
   println(input.replace("Kenyan","Ugandan"))
}
fun split(){
    var words="Angel,apple,tommorrow"
    var newWords=words.split(",")
    println(newWords[2])
}
