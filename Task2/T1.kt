abstract class Shape{
    abstract fun calcualteArea():Double
}

class Circle(radius:Double):Shape(){
    val r=radius
    override fun calcualteArea() :Double{
        return r*3.14*r
    }

}
open class Rectangle(val w:Double,val l:Double):Shape(){
    val width=w
    val length=l
    
    override fun calcualteArea() :Double{
        return length*width 
    }

}

class Square(l:Double):Rectangle(l,l){
}

fun main(args: Array<String>) {
    val Cricle1=Circle(5.2)
    println("Circle area is ${Cricle1.calcualteArea()}")
    
    val Rec1=Rectangle(5.0,4.0)
    println("Rectangle area is ${Rec1.calcualteArea()}")
 
    
    val Square1=Square(5.0)
    println("Square area is ${Square1.calcualteArea()}")
 
   
}
