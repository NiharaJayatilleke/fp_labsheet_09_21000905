class Account(bal: Double) {
  private var balance: Double = bal

  def deposit(amount: Double): Unit ={
    if (amount > 0) {
      balance += amount
      println("Deposited: "+ amount)
      println("Current Balance: "+ balance +"\n")
    }else
      println ("Deposit Unsuccessful")
  }

  def withdraw(amount: Double): Unit ={
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println("Withdrawn: "+ amount)
      println("Current Balance: "+ balance +"\n")
    } else {
      println("Withdrawal Unsuccessful")
    }
  }

  def transfer(amount: Double, receiverAccount: Account): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println("Transferred: "+ amount)
      println("Current Balance: "+ balance +"\n")
      receiverAccount.deposit(amount)
    } else {
      println("Transfer Unsuccessful")
    }
  }

  def getBalance (): Unit ={
    println("Current Balance: "+ balance +"\n")
  }
}

object Q3 extends App{
  val acc1 = new Account(1000.0)
  val acc2 = new Account(1500.0)

  print ("Account 1 "); acc1.getBalance();
  print ("Account 2 "); acc2.getBalance();

  acc1.deposit(1000.0)
  acc1.withdraw(800.0)
  acc1.transfer(200.0, acc2)
}


