object Q1 extends App {

  def gcd(x:Int,y:Int):Int=y match {
    case 0 => x
    case y if (y>x) => gcd(y,x)
    case _ =>gcd(y,x%y)
  }

  def primeornot(p:Int,n:Int=2):Boolean= n match {
    case x if(p==x) =>true
    case x if (gcd(p,x)>1) => false
    case x => primeornot(p,x+1)
  }


  println(primeornot(5))
  println(primeornot(8))
  println(primeornot(68))

}
