import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
/*      sqrt деген метод тузунуз.
        UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
        Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).
        public static UnaryOperator<Double> sqrt().**/

        System.out.println(sqrt().apply(49.0));
    }
    public static UnaryOperator<Double>sqrt(){
        UnaryOperator<Double>unaryOperator=new UnaryOperator<Double>() {
            @Override
            public Double apply(Double aDouble) {
              Double bDouble=Math.pow(aDouble,0.5);
                if(bDouble*bDouble==aDouble){
                    return bDouble;
                }
               return bDouble;
            }
        };
        return unaryOperator;
    }
}