object Q4 extends App {
    def even(x:Int):Boolean = x match {
      case 0 => true
      case _ => odd(x-1)
    }
    def odd(x: Int):Boolean = !(even(x))

   println(even(4))
   println(odd(5))

}
