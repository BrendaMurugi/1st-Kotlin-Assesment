fun main() {
    akiraChix()

    getModulus(20, 6)

    myIdentity("Brenda", 21)

    stmt("I am so proud of myself")

}

//Given a string “codeHive”. Write a function that prints out a string composed
//of the fifth, sixth, seventh and eighth  characters of the string

fun akiraChix() {
    var program = "codehive"
    var char5 = program[4]
    var char6 = program[5]
    var char7 = program[6]
    var char8 = program[7]
    println("$char5$char6$char7$char8")
}
//Create and invoke a function that given two numbers returns the
//remainder of their division

fun getModulus(num1:Int, num2:Int):Int {
    var a = num1
    var b = num2
    var result = num1 % num2
    println(result)
    return result
}
//Write a function that takes in two parameters, name and age and returns a
//String with this structure “Hi, my name is p and I am z years old.” Where p
//and  z are your  name and age respectively.

fun myIdentity(name:String, age:Int):String {
    var p = name
    var z = age
    var output = "Hi, my name is $p and I am $z years old."
    println(output)
    return output
}

//Write a function that takes in a string and returns its length

fun stmt(x:String):Int {
    var h = x.length
    println(h)
    return h
}
