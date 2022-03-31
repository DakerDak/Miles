public class BonusMilesService {
    public int calculate(int cost) {

        int rubbonus = 20; // количество рублей для одной бонусной милли
        int miles = cost / rubbonus; // рассчитываем количество бонусных милль

        return miles;
    }


}
