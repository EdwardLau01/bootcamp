import java.math.BigDecimal;
import java.math.RoundingMode;

public class CompoundInterest {
  public static void main(String[] args) {

    double year = 15;

    double month = year * 12;

    double propertyHKD = 0;

    double costHKD = 10000d;

    double addHKD = 1500d;

    double costUSD = costHKD / 7.8;

    double addUSD = addHKD / 7.8;

    double fundUSD = 17.43d;

    double interest = 0.161d;

    double lot = 0;

    double profit = 0;

    double buy = 0;

    double USDTOHKD = 7.8;

    int count = 0;
    while(count++ < month){
      if(count == 60)
        addUSD = 5000 / 7.8;
      if(count == 120)
        addUSD = 10000 / 7.8;
      System.out.println(count + " month ");
      buy = 0;
      profit = CompoundInterest.multiply(lot, interest);
      System.out.println(count + " month's profit: " + CompoundInterest.multiply(profit, USDTOHKD));
      costUSD = CompoundInterest.add(costUSD, profit);
      buy = Math.floor(CompoundInterest.divide(costUSD , fundUSD));
      costUSD = CompoundInterest.subtract(costUSD, CompoundInterest.multiply(buy, fundUSD)) ;
      lot = CompoundInterest.add(lot, buy);
      propertyHKD = CompoundInterest.multiply(CompoundInterest.add(CompoundInterest.multiply(lot, fundUSD), costUSD), USDTOHKD);
      System.out.println(count + " month's property: " + propertyHKD);
      System.out.println(count + " month's lot: " + lot);
      costUSD = CompoundInterest.add(costUSD, addUSD);
    }
    

  }

  public static double add(double a, double b){
    return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b)).setScale(3, RoundingMode.DOWN).doubleValue();
  }

  public static double subtract(double a, double b){
    return BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b)).setScale(3, RoundingMode.DOWN).doubleValue();
  }

  public static double multiply(double a, double b){
    return BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b)).setScale(3, RoundingMode.DOWN).doubleValue();
  }

  public static double divide(double a, double b){
    return BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), 3, RoundingMode.DOWN).doubleValue();
  }
  
}
