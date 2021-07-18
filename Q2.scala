object Q2 extends App {

  def gcd(x:Int,y:Int):Int=y match {
    case 0 => x
    case y if (y>x) => gcd(y,x)
    case _ =>gcd(y,x%y)
  }

  def getprime(p:Int,n:Int=2):Boolean= n match {
    case x if(p==x) =>true
    case x if (gcd(p,x)>1) => false
    case x => getprime(p,x+1)
  }

  def getprimeSeq(n:Int):Any={


    if(n>1) {

      getprimeSeq(n-1)
      if(getprime(n)) println(n)

    }

  }

  println(getprimeSeq(10))

}
