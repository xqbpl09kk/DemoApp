




fun parentFun() :() -> String{

    return fun() :String{
        println("this is fun in fun ")
        return "New"
    }

}



fun test(){
    val parentRef = parentFun()
    parentRef.invoke()
}
