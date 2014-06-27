
object Poker {
  object Face extends Enumeration {
    type Face = Value
    val Ace, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen , King = Value
  }

  object Suit extends Enumeration {
    type Suit = Value
    val Hearts, Diamonds, Clubs, Spades = Value
  }

  import Face._
  import Suit._

  case class Card(face: Face, suit: Suit)

  /** Full, unshuffled deck of 52 cards */
  val deck = (for (f <- Face.values; s <- Suit.values) yield Card(f, s)).toList

  
}

