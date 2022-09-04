
fun main(args: Array<String>) {
	val list = listOf("Maze","More","eeee")
    
    for(i in list )
    {
        if("r" in i && i[0]=='M')
        {
            println(i)
            return 
        }
    }
}
