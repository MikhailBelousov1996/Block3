public class BonusMilesService {
    public int calculate(int price) {
        int milesFromTicket = 20;
        int numberMiles = price / milesFromTicket;
        return numberMiles;
    }
}
