public class SizeDecorator extends PizzaDecorator {
    private String size;

    public SizeDecorator(Pizza pizza, String size) {
        super(pizza);
        this.size = size.toUpperCase(); // Store size as uppercase
    }

    @Override
    public String getDescription() {
        return "(" + size + ") " + pizza.getDescription(); // Prefix size to description
    }

    @Override
    public double getCost() {
        double sizeCost = 0;
        switch (size) {
            case "M":
                sizeCost = 2.00;
                break;
            case "L":
                sizeCost = 4.00;
                break;
            case "XL":
                sizeCost = 6.00;
                break;
            default:
                sizeCost = 0; // Default to Small (S) at no extra cost
        }
        return pizza.getCost() + sizeCost;
    }
}
