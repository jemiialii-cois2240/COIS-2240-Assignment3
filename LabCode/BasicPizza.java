
public class BasicPizza implements Pizza {
	
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getCost() {
        return 7.00; // Base cost of a basic small pizza
    }
}
