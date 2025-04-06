public class Money {
      private double cAmount;
      private String cCurrency;
      // constructor for creating a money object
      public Money(double amount, String currency) {
           cAmount = amount;
           cCurrency = currency;
      }

      // set money
      public double getAmount() {
           return cAmount;
      }

      // get money
      public String getCurrency() {
           return cCurrency;
      }

    //Subtract the passed in money object amount to the existing amount
      public Money subtract(Money m) throws Exception {
    	    if (this.cAmount - m.getAmount() < 0)
    	        throw new Exception("Money cannot be negative");
    	    return new Money(this.cAmount - m.getAmount(), this.cCurrency);
    	}



      //apply the interest to Money amount based on passed in interest rate
      public Money add(Money m) throws Exception {
    	    if (m.getAmount() < 0)
    	        throw new Exception("Money cannot be negative");
    	    return new Money(this.cAmount + m.getAmount(), this.cCurrency);
    	}


      // apply interest to balance based on interest rate
      // which is a % specified as a decimal
      public void applyInterest(double interest) {

    	  this.cAmount = this.cAmount * (1 + interest);
      }



//    compare passed in object (if it's Money) to see if it has the same value and currency
      @Override
      public boolean equals(Object anObject) {
          if (this == anObject) return true;
          if (anObject == null || getClass() != anObject.getClass()) return false;

          Money money = (Money) anObject;

          boolean amountsEqual = Math.abs(this.cAmount - money.getAmount()) < 0.0001;
          boolean currenciesEqual = this.cCurrency.equals(money.getCurrency());

          return amountsEqual && currenciesEqual;
      }


}