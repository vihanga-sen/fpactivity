object Q3 extends App {

  def getsum(x:Int):Int = if (x==1) 1 else x+getsum(x-1)
  println(getsum(5))

}
