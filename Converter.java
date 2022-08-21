import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Converter {    
    private HashMap<String, Double> exchange_Rates= new HashMap<String, Double>();
    Converter(){
        exchange_Rates.put("USD",1.4373);
        exchange_Rates.put("JPY",115.20);
        exchange_Rates.put("BGN",1.9558);
        exchange_Rates.put("CZK",24.213);
    }

    private double convert(double converterMoney, String currencie ){
        try {
            return (converterMoney*exchange_Rates.get(currencie.toUpperCase()))/1;
        } catch (NullPointerException e) {
            System.err.println("\u001B[31m Keine Währung mit diesen Kürzel vorhanden \u001B[0m");
        }
        return 0;
    }
    
    public void printConvert(){
        DecimalFormat df = new DecimalFormat("#.##");
        var scanner = new Scanner(System.in);
        try {
            System.out.println("Bitte Geldmenge eingeben");
            String converterMoney = scanner.nextLine();
            System.out.println("Bitte Währungsart eingeben");
            String currencie = scanner.nextLine();
            System.out.println("Money Converted= "+df.format(new Converter().convert(Double.valueOf(converterMoney),currencie)));
        } catch (Exception e) {
            System.err.println("Ein Fehler ist unterlaufen "+ e);
        }finally{
            scanner.close();
        }
    }
}