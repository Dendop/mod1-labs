package FactoryMethod;

public class Program {

    abstract static class Order{
        public abstract String checkout();
    }
    static class Tshirt extends Order{
        @Override
        public String checkout(){
            return "Tshirt";
        }
    }
    static class Phone extends Order{
        @Override
        public String checkout(){
            return "Phone";
        }
    }
    static class Book extends Order{
        @Override
        public String checkout(){
            return "Book";
        }
    }

    class OrderFactory {
        public static Order createOrder(String type) {
            switch (type.toLowerCase()) {
                case "tshirt":
                    return new Tshirt();
                case "phone":
                    return new Phone();
                case "book":
                    return new Book();
                default:
                    throw new IllegalArgumentException("Unknow order type: " + type);

            }
        }
    }



    public static void main(String[] args){

        Order order1 = OrderFactory.createOrder("tshirt");
        System.out.println(order1.checkout());

        Order order2 = OrderFactory.createOrder("milk");
        System.out.println(order2.checkout());

    }
}
