//in this task i take count from user as ainput then return iteam which matches with count 
//

fun main(args: Array<String>) {
	val list = listOf("Maze","More","Marwan")
    val result: MutableList<String> = mutableListOf() 
	val count =args[0].toInt()
    for(i in list ){
        if(i.length==count)
	    	result.add(i)
    }
    for(i in result )
        println(i)
        
           
        
}
