//I want to return true if all items match the following conditions:
//1. The item length is >= 'count'
//Otherwise, return false.
//Hint: if items = ["a", "abc"] and count = 3, will return false.
fun AllMatchWithCount(list: List<String>,count:Int) :Boolean{
    for (i in list) 
        if (i.length<count) 
        	return false 
    return false

}
fun main(args: Array<String>) {
	    println(AllMatchWithCount(listOf("a", "abc"),args[0].toInt() ) )

        
           
        
}
