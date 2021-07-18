object Q6 extends App {

  def fib(x:Int):Int=x match {
    case x if x==0 => 0
    case x if x==1 => 1
    case x => fib(x-1)+fib(x-2)
  }
  def fsq(x:Int):Any ={
    if(x>0) fsq(x-1)
    println(fib(x))
  }

  println(fsq(10))
  println(fsq(20))

}
