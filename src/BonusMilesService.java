public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20; // За каждые 20 руб начисляется 1 миля.

        return miles;
    }
}
