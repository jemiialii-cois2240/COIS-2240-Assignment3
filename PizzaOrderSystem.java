import java.util.Scanner;

public class PizzaOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = new BasicPizza();

        System.out.println(
                "Cost of a basic pizza is $7.0\n\n" +
                "Select toppings to add:\n" +
                "  0. None (+$0.0)\n" +
                "  1. Extra Cheese (+$1.5)\n" +
                "  2. Mushrooms (+$1.0)\n" +
                "  3. Pepperoni (+$2.0)\n" +
                "Enter the numbers of your choices separated by commas (e.g., 1,2,3) or 0 for no toppings:"
        );

        String input = scanner.nextLine();
        String[] toppings = input.split(",");

        for (String topping : toppings) {
            switch (topping.trim()) {
                case "0":
                    break;
                case "1":
                    pizza = new CheeseDecorator(pizza);
                    break;
                case "2":
                    pizza = new MushroomDecorator(pizza);
                    break;
                case "3":
                    pizza = new PepperoniDecorator(pizza);
                    break;
                default:
                    System.out.println("Invalid choice: " + topping.trim());
            }
        }

        // Prompt for pizza size
        System.out.println("Choose pizza size (S, M, L, XL): ");
        String size = scanner.nextLine().trim().toUpperCase();

        // Wrap pizza with size decorator
        pizza = new SizeDecorator(pizza, size);

        // Display final pizza description and cost
        System.out.println("You ordered: " + pizza.getDescription());
        System.out.println("Total cost: $" + pizza.getCost());

        scanner.close();
    }
}
