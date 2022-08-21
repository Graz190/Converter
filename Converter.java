public class Converter {
    double exchange_Rates = 1.4373;
    public double convort(double converterMoney){
        
        return (converterMoney*exchange_Rates)/1;
        
    }
    public static void main(String[] args) {
        System.out.println(new Converter().convort(10.00000));
    }
}