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
        try {
            return (converterMoney*exchange_Rates.get(currencie.toUpperCase()))/1;
        } catch (NullPointerException e) {
            System.err.println("\u001B[31m Keine Währung mit diesen Kürzel vorhanden \u001B[0m");
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println("Money Converted= "+new Converter().convort(14.00000,"usd"));
    }
}