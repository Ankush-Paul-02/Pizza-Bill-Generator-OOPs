public class DeluxPizza extends Pizza{

    public DeluxPizza(Boolean veg) {
        super(veg);
        super.add_extra_cheese();
        super.add_extra_toppings();
    }

    @Override
    public void add_extra_cheese() {}

    @Override
    public void add_extra_toppings() {}
}
