fun main(args: Array<String>) {
    for (i in 0 until args.size){
        if(i % 2 == 0){
            try{
                args[0].toDouble()
            }
            catch(e: NumberFormatException){
                return
            }
        }
        else{
            val operators = arrayOf("+", "-", "*", "/")
            if(!(args[i].length == 1 && args[i] in operators)){
                return
            }
        }
    }
    val tmp: ArrayList<Any> = ArrayList()
    for (i in 0..args.size - 3 step 2) {
        val num1 = args[i].toDouble()
        val op = args[i + 1][0]
        val num2 = args[i + 2].toDouble()

        if (op != '*' && op != '/') {
            if (tmp.size == 0 || tmp.last() == '+' || tmp.last() == '-') {
                tmp.add(num1)
                tmp.add(op)
            } else 
                tmp.add(op)
            if (i == args.size - 3) 
                tmp.add(num2)
            continue
        }
        var result = 0.toDouble()
        if (tmp.size == 0 || tmp.last() == '+' || tmp.last() == '-') {
            if (op == '*') 
                result = num1 * num2
             else if (op == '/') 
                result = num1 / num2
            
            tmp.add(result)
        } else {
            if (op == '*') 
                result = tmp.last() as Double * num2
             else if (op == '/') 
                result = tmp.last() as Double / num2            
            tmp[tmp.lastIndex] = result
        }

    }
    var finalResult = if (tmp.size == 0) args[0].toDouble() else tmp[0] as Double
    for (i in 1 until tmp.size step 2) {
        val op = tmp[i]
        val num = tmp[i + 1] as Double
        if (op == '+') 
            finalResult += num
         else if (op == '-') 
            finalResult -= num        
    }
    if (tmp.size == 1) 
        finalResult = tmp[0] as Double
    
    println("Result = $finalResult")
}
