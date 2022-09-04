//in this task i take count from user as ainput then return iteam which matches with count 
//I want to return the only item that matches the following conditions:
//1. The item contains the character 'r'
//2. The item starts with the character 'M'
//Hint: If no match or more than one match were found, return default result.
//Hint: ["Mr.", "Maze"] will return "Mr.". ["Mr.", "More"] will return the default result

fun getTheDefaultORMatch(list: List<String>) :String{
    val result: MutableList<String> = mutableListOf("") 
    for (i in list) {
        if (i.startsWith("M")) {
            if (i.contains("r")) {
                result.add(i)
            }
        }
    }
    return result[0]

}
fun main(args: Array<String>) {
	    println(getTheDefaultORMatch(listOf("M.", "Maze", "More")) )

        
           
        
}
