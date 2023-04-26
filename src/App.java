public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        Pizza newPizza = new Pizza(false);
        newPizza.add_extra_toppings();
        newPizza.add_extra_cheese();
        newPizza.get_bill(); 
        */

        DeluxPizza deluxPizza = new DeluxPizza(true);
        deluxPizza.take_away();
        deluxPizza.get_bill();
    }
}
