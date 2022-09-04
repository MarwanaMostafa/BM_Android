

//in this task i count length for each itea  in list 

fun main(args: Array<String>) {
	val list = listOf("Maze","More","Marwan")
    val result: MutableList<Int> = mutableListOf() 

    for(i in list )
        result.add(i.length)
     
    for(i in result )
        println(i)
        
           
        
}
