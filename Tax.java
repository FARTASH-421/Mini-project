public class Tax extends Property{
    public Tax( ) {
        super("Tax", 17);
    }
    public void tax(Player currentPlayer) {
        if (currentPlayer.getBalance() * 10 / 100 > currentPlayer.getBalance()) {
            System.out.println("1-sell property  2-use taxCard");
            do {
                Continue = true;
                switch (input.nextInt()) {
                    case 1:
                        currentPlayer.lowBalance = true;
                        currentPlayer.sellProperty();
                        break;
                    case 2:
                        if (currentPlayer.getTaxCard() >= 1) {
                            currentPlayer.setTaxCard(currentPlayer.getTaxCard()-1);
                        } else
                            System.out.println("You do not have taxCard");
                        Continue = false;
                        break;
                    default:
                        Continue = false;
                }
            } while (!Continue);
        } else {
            System.out.println("Cost " + currentPlayer.getBalance() * 10 / 100 + " for the tax");
            currentPlayer.addBalance(-currentPlayer.getBalance() * 10 / 100);
        }
    }
}
