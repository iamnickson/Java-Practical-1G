public class CreditCardDebt {
  //Instance Variables 
  private String cardName;
  private double princBal;
  private double aPR;
  private double monthPayPercent;
  private double monthPayAmount;

  //Constructor 
  public CreditCardDebt(String name, double origBal, double apr, double     mnthPercent, double mnthAmount) {
    cardName = name;
    princBal = origBal;
    aPR = apr;
    monthPayPercent = mnthPercent;
    monthPayAmount = mnthAmount;
  }

  //Mutator/Setter
  public void cardName(String name){
    cardName = name;
  }
  public void princBal(double origBal){
    princBal = origBal;
  }
  public void aPR(double apr){
    aPR = apr;
  }
  public void monthPayPercent(double mnthPercent){
    monthPayPercent = mnthPercent;
  }
  public void monthPayAmount(double mnthAmount){
    monthPayAmount = mnthAmount;
  }

  //Accessor/Getter
  public String getCardName () {
    return cardName; 
  }
  public double getPrincBal () {
    return princBal;
  }
  public double getAPR () {
    return aPR; 
  }
  public double getMonthPayPercent () {
    return monthPayPercent;
  }
  public double getMonthPayAmount () {
    return monthPayAmount; 
  }

  //Other Methods
  public double addPurchase () {
    return princBal+;
  }
  public double makePay () {
    return -princBal;
  }
  public double calcMonthInterestAmnt () {
    return princBal*(aPR/12);
  }
  public doublt calcMinMonthPay () {
    return princBal * 



  //toString
  public String toString () {
    return "Card: " + cardName + " has a principle balance of: " 
      + princBal + ", an APR of " + aPR + 
      ", a minimum monthly payment percentage of " + monthPayPercent + 
      ", and a minimum monthly payment amount of " + monthPayAmount + ".";
  }
}