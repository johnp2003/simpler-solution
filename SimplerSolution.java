// Abstract Fries Class
abstract class Fries {
    protected int packet;

    public abstract void prepareFries(); 
    public abstract double price(); // Calculate the price of fries

    public void setSize(int packet) { // Set the size
        this.packet = packet;
        System.out.println("Size set to: " + packet);
    }
}

// Concrete Classes for Small, Medium, and Large Fries
class SmallFries extends Fries {
    public SmallFries() {
        System.out.println("Preparing Small Fries...");
    }

    public void prepareFries() {
        System.out.println("Small Fries are being prepared.");
    }

    public double price() {
        return 3.0; // Small Fries price
    }
}

class MediumFries extends Fries {
    public MediumFries() {
        System.out.println("Preparing Medium Fries...");
    }

    public void prepareFries() {
        System.out.println("Medium Fries are being prepared.");
    }

    public double price() {
        return 4.0; // Medium Fries price
    }
}

class LargeFries extends Fries {
    public LargeFries() {
        System.out.println("Preparing Large Fries...");
    }

    public void prepareFries() {
        System.out.println("Large Fries are being prepared.");
    }

    public double price() {
        return 5.0; // Large Fries price
    }
}

// Fries with Sauces
class SmallFriesWithKetchup extends SmallFries {
    public void addSauce() {
        System.out.println("Adding Ketchup to Small Fries.");
    }

    public double price() {
        return super.price() + 0.5; // Price for Small Fries with Ketchup
    }
}

class SmallFriesWithChiliSauce extends SmallFries {
    public void addSauce() {
        System.out.println("Adding Chili Sauce to Small Fries.");
    }

    public double price() {
        return super.price() + 0.7; // Price for Small Fries with Chili Sauce
    }
}

class SmallFriesWithKetchupAndChiliSauce extends SmallFries {
    public void addSauce() {
        System.out.println("Adding Ketchup and Chili Sauce to Small Fries.");
    }

    public double price() {
        return super.price() + 1.0; // Price for Small Fries with both Ketchup and Chili Sauce
    }
}

class MediumFriesWithKetchup extends MediumFries {
    public void addSauce() {
        System.out.println("Adding Ketchup to Medium Fries.");
    }

    public double price() {
        return super.price() + 0.5; // Price for Medium Fries with Ketchup
    }
}

class MediumFriesWithChiliSauce extends MediumFries {
    public void addSauce() {
        System.out.println("Adding Chili Sauce to Medium Fries.");
    }

    public double price() {
        return super.price() + 0.7; // Price for Medium Fries with Chili Sauce
    }
}

class MediumFriesWithKetchupAndChiliSauce extends MediumFries {
    public void addSauce() {
        System.out.println("Adding Ketchup and Chili Sauce to Medium Fries.");
    }

    public double price() {
        return super.price() + 1.0; // Price for Medium Fries with both Ketchup and Chili Sauce
    }
}

class LargeFriesWithKetchup extends LargeFries {
    public void addSauce() {
        System.out.println("Adding Ketchup to Large Fries.");
    }

    public double price() {
        return super.price() + 0.5; // Price for Large Fries with Ketchup
    }
}

class LargeFriesWithChiliSauce extends LargeFries {
    public void addSauce() {
        System.out.println("Adding Chili Sauce to Large Fries.");
    }

    public double price() {
        return super.price() + 0.7; // Price for Large Fries with Chili Sauce
    }
}

class LargeFriesWithKetchupAndChiliSauce extends LargeFries {
    public void addSauce() {
        System.out.println("Adding Ketchup and Chili Sauce to Large Fries.");
    }

    public double price() {
        return super.price() + 1.0; // Price for Large Fries with both Ketchup and Chili Sauce
    }
}

// Payment class 
class Payment {
    private double amount;
    private String paymentMethod;

    public Payment(double amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void makePayment() {
        System.out.println("Processing payment of RM" + amount + " using " + paymentMethod);
    }

    public double getAmount() {
        return this.amount;
    }
}

// Client class to interact with the FrenchKing system
public class SimplerSolution {
    public static void main(String[] args) {
        // Creating Fries objects
        SmallFries smallFries = new SmallFries();
        smallFries.prepareFries();
        smallFries.setSize(1);
        System.out.println("Price for Small Fries: RM" + smallFries.price());

        // Creating Fries with sauces
        SmallFriesWithKetchup ketchupFries = new SmallFriesWithKetchup();
        ketchupFries.addSauce();
        System.out.println("Price for Small Fries with Ketchup: RM" + ketchupFries.price());

        // Payment Process
        Payment payment = new Payment(ketchupFries.price(), "Credit Card");
        payment.makePayment();
    }
}