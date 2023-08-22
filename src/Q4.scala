class Account(bal: Double) {
  private var balance: Double = bal

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05
    } else {
      balance += balance * 0.1
    }
  }

  def getBalance : Double = balance

  override def toString: String = f"Account(balance = $balance%.2f)"
}

object Q4 extends App{
  val accounts: List[Account] = List(
    new Account(1000.0),
    new Account(-500.0),
    new Account(2000.0),
    new Account(-200.0)
  )

  def negativeBalances(accounts: List[Account]): List[Account] = {
    accounts.filter(_.getBalance < 0)
  }

  def totalBalanceOfAll(accounts: List[Account]): Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAll(accounts: List[Account]): Unit = {
    accounts.foreach(_.applyInterest())
  }

  println("Accounts with negative balances:")
  val negativeAccounts = negativeBalances(accounts)
  negativeAccounts.foreach(println)

  println("\nTotal balance of all accounts:")
  val total = totalBalanceOfAll(accounts)
  println(total)

  println("\nFinal balances of all accounts after applying interest:")
  applyInterestToAll(accounts)
  accounts.foreach(println)
}