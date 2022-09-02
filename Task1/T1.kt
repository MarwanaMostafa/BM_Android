

fun main(args :Array<String>) {
	val num1 =args[0].toInt()
	val num2 =args[2].toInt()
	val operation =args[1]
	var result =0
    if(operation =="+"){
        result=num1+num2
		println("$num1 + $num2 = $result")}

    else if(operation =="-")
    {
        result=num1-num2
		println("$num1 - $num2 = $result")}

    else if(operation =="*")
     {
        result=num1*num2
		println("$num1 * $num2 = $result")}
    else if(operation =="/")
 {
        result=num1/num2
		println("$num1 / $num2 = $result")}
}
