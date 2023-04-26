public class Pizza {
    private int price;
    private boolean veg;
    private int extra_cheese_price = 100;
    private int extra_toppings_price = 150;
    private int back_pack_price = 20;
    private int base_pizza_price;
    private boolean is_extra_cheese_added = false;
    private boolean is_extra_toppings_added = false;
    private boolean is_opted_for_takeaway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        this.price = this.veg == true ? 300 : 400;
        base_pizza_price = this.price;
    }

    /*
     * Base pizza : 300
     * Toppings : 150
     * Cheese : 100
     * Take away : 20
     */

    public void add_extra_cheese() {
        is_extra_cheese_added = true;
        this.price += extra_cheese_price;
    }

    public void add_extra_toppings() {
        is_extra_toppings_added = true;
        this.price += extra_toppings_price;
    }

    public void take_away() {
        is_opted_for_takeaway = true;
        this.price += back_pack_price;
    }

    public void get_bill() {
        String bill = "";
        System.out.println("Pizza: " + base_pizza_price + " rupees");

        if (is_extra_cheese_added) {
            bill += "Extra cheese added: " + extra_cheese_price + " rupees\n";
        }
        if (is_extra_toppings_added) {
            bill += "Extra toppings added: " + extra_toppings_price + " rupees\n";
        }
        if (is_opted_for_takeaway) {
            bill += "Take away: " + back_pack_price + " rupees\n";
        }

        bill += "Bill: " + this.price + " rupees\n";
        System.out.println(bill);
    }
}
