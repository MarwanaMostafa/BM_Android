//I want to return the items before the one that matches the following conditions:
//1. The item contains the character 'a'
//2. The item starts with the character 'M'
//Hint: ["a", "Ma", "M"] will return ["a"]
fun MatchFirst(list: List<String>) :String{
    for (i in list) 
        if (i[0]=='M' || i.contains('a')) 
        	return i
    return ""

}
fun main(args: Array<String>) {
	    println(MatchFirst(listOf("a", "Ma","M")) )

        
           
        
}
