//I want to return true if all items match the following conditions:
//1. The item length is >= 'count'
//Otherwise, return false.
//Hint: if items = ["a", "abc"] and count = 3, will return false.
fun MatchWithCount(list: List<String>,count:Int) :Boolean{
    val result: MutableList<String> = mutableListOf("") 
    for (i in list) 
        if (i.length<count) 
        	return false 
    return false

}
fun main(args: Array<String>) {
	    println(MatchWithCount(listOf("a", "abc"),args[0].toInt() ) )

        
           
        
}
