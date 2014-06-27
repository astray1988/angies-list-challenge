sealed trait MyList[+A] {
  def map[B](f: A => B): MyList[B] = this match {
    case MyEmpty => MyEmpty
    case MyNode(head, tail) => MyNode(f(head), tail map f)
  }
  def filter(f: A => Boolean): MyList[A] = this match {
  	case MyEmpty => MyEmpty
  	case MyNode(head, tail) if (f(head)) => MyNode(head, tail filter f)
  	case MyNode(head, tail) => tail filter f
  }
  def zip[B, C](f: (A, B) => C, that: MyList[B]): MyList[C] = (this, that) match {
  	case (MyEmpty, _) => MyEmpty
  	case (_, MyEmpty) => MyEmpty
  	case (MyNode(headA, tailA), MyNode(headB, tailB)) => MyNode(f(headA, headB), tailA.zip(f, tailB))
  }
  def foldLeft[B](f: (B, A) => B, acc: B): B = this match {
  	case MyEmpty => acc
  	case MyNode(head, tail) => tail.foldLeft(f, f(acc, head))
  }
  def distinct = {
  	def distinctHelper() = ???
  	distinctHelper()
  }
  def groupBy[B](f: A => B) = ???
}

case object MyEmpty extends MyList[Nothing]

case class MyNode[+A](head: A, tail: MyList[A]) extends MyList[A]