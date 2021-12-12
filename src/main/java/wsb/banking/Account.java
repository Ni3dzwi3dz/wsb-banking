package wsb.banking;

/**
 * Klasa reprezentująca generalną postać konta bankowego
 *
 * @author Jan 'Ni3dzwi3dz' Sikorski
 */
public class Account {
    /** Wartość oznaczająca ilość gotówki na koncie */
    private double balance;

    /** Tworzy nowe konto o zadanym balansie początkowym
     * @param balance
     * Wartość początkowa balansu*/
    public Account(double balance) {
        this.balance = balance;
    }

    /** Tworzy nowe konto o zerowym balansie początkowym */
    public Account() {
        this.balance = 0;
    }

    /** Getter, zwracający wartość balansu */
    public double getBalance() {
        return balance;
    }

    /** Metoda umożliwiająca wpłatę wskazanej sumy na konto
     *
     * @param amt
     *      Wpłacana kwota. Powinna być większa od zera. W innym wypadku, balans nie ulega zmianie.
     *
     * Do rozważenia w przyszłości - zmiana typu metody na boolean, zwracanie false, w przypadku, gdy nie uda się
     * zdeponować
     */
    public void deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
        }
    }

    /** Metoda umożliwiająca wypłatę z konta wskazanej sumy
     *
     * @param amt - wypłacana kwota
     *
     * W przypadku, gdy kwota jest większa niż dostępny balans, metoda zwraca 0 a balans konta nie ulega zmianie.
     *
     * Do rozważenia - zmiana typu na boolean - false w przypadku, gdy nie uda się wpłacić pieniędzy
     * */
    public double withdraw(double amt) {
        if (amt <= this.balance && amt > 0) {
            this.balance -= amt;
            return amt;
        }
        return 0;
    }


}
