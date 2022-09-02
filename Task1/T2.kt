//ignore   operation precedence 

fun main(args :Array<String>) {
	val num1 =args[0].toDouble()
	var result =num1
    
    for(i in 1..args.size-1)
    {
    if(args[i] =="+")
        result+=args[i+1].toDouble()
    else if(args[i] =="-")
        result-=args[i+1].toDouble()
    else if(args[i] =="*")
        result*=args[i+1].toDouble()
    else if(args[i]=="/")
        result/=args[i+1].toDouble()
     
}
	print("Result is : $result")
    }
