import java.time.LocalDate;

public abstract class FoodProduct extends Product{
    protected String date; // срок годности
    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param date срок годности
     */
    public FoodProduct(String name, double price, int quantity, String unit, String date) {
        super(name, price, quantity, unit);
        this.date = date;
    }
}
