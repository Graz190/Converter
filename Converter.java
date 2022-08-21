import java.util.HashMap;

public class Converter {    
    HashMap<String, Double> exchange_Rates= new HashMap<String, Double>();
    Converter(){
        exchange_Rates.put("USD",1.4373);
        exchange_Rates.put("JPY",115.20);
        exchange_Rates.put("BGN",1.9558);
        exchange_Rates.put("CZK",24.213);
    }

    public double convort(double converterMoney, String currencie ){
        return (converterMoney*exchange_Rates.get(currencie.toUpperCase()))/1;
    }

    public static void main(String[] args) {
        System.out.println("Money Converted= "+new Converter().convort(14.00000,"usd"));
    }
}