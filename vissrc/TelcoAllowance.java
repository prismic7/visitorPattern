public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double money) {

        if (telcoName.equalsIgnoreCase("Smart")) {
            return "15GB for ₱" + money;
        }
        else if (telcoName.equalsIgnoreCase("Globe")) {
            return "10GB for ₱" + money;
        }
        else if (telcoName.equalsIgnoreCase("Ditto")) {
            return "8GB for ₱" + money;
        }
        else {
            return "No available data offer.";
        }
    }
}