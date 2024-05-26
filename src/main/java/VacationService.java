public class VacationService {
    public int calcVacationMonth(int income, int expenses, int threshold) {
        int money = 0;
        int vacationMonth = 0;
        for (int i = 0; i < 12; i++) {
            if (money < threshold) {
                money = money + income;
                money = money - expenses;
            } else {
                money = money - expenses;
                money = money / 3;
                vacationMonth++;
            }
        }
        return vacationMonth;
    }
}
