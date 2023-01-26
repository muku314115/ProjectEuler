class Performer {
  def ProjectEuler1() = {
    println(Range(0, 1000).filter(num => (num %3 == 0 || num%5 == 0)).sum)
  }

  def ProjectEuler2() = {
    lazy val list: LazyList[Int] = 0 #:: 1 #:: list.zip(list.tail).map {n => n._1 + n._2}
    println(list.view.takeWhile(_ <= 4000000).filter(_%2 == 0).sum)
  }

  def ProjectEuler3(n:Long = 600851475143L) = {
    val list: Seq[Long] = (2 until n/2-1).filter(num => (2 until num/2-1) exists (num%_ == 0)).map { i=> i.toLong}

  }
}
