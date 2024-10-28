public class Main {
    public static void main(String[] args) {
        TrainTicket ticket = new TrainTicket("Jakarta", 100.00, 50);
        Station station = new Station(ticket, "Station A");

        station.showStation();
        ticket.applyStockAdjustment(10);
        station.showStation();
    }
}
