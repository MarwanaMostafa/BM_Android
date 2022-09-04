//I want to return true if at least one item matches the following conditions:
//1. The item length is >= 'count'
//Otherwise, return false.
//Hint: if items = ["a", "abc"] and count = 3, will return true.

fun MatchWithCount(list: List<String>,count:Int) :Boolean{
    for (i in list) 
        if (i.length>=count) 
        	return true 
    return false

}
fun main(args: Array<String>) {
	    println(MatchWithCount(listOf("M.", "Maze", "More"),args[0].toInt() ) )

        
           
        
}
