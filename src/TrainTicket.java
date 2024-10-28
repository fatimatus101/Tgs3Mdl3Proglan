
public class TrainTicket implements TicketDetailsPrinter { // setelah di lakukan refactor extrax interface
    public String destination;
    public double price;
    public int stock;

    public TrainTicket(String destination, double price, int stock) {
        this.destination = destination;
        this.price = price;
        this.stock = stock;
    }

    public void printTicketDetails() { // refactor rename methode

        System.out.println("Destination: " + destination);
        System.out.println("Price: $" + price);
        System.out.println("Discounted Price: $" + price * 0.9);// setalah dilakukan refactore inline variabel pada discountedPrice
        System.out.println("Stock: " + stock);
    }

    public void applyStockAdjustment(int adjustment) {
        stock += getAdjustment(adjustment);// refactore extrax method pada adjustment
        System.out.println("Stock adjusted. New stock: " + stock);
    }

    private static int getAdjustment(int adjustment) {
        return adjustment;
    }
}
class Station {
    public TrainTicket ticket;
    public String stationName;
    public Station(TrainTicket ticket, String stationName) {
        this.ticket = ticket;
        this.stationName = stationName;
    }

    public void showStation() {
        System.out.println("Station: " + stationName);
        ticket.printTicketDetails();
    }
}

