public class Bread extends FoodProduct {
    String typeFlour; // тип муки

    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param date срок годности
     * @param typeFlour тип муки
     */
    public Bread(String name, double price, int quantity, String unit, String date, String typeFlour) {
        super(name, price, quantity, unit, date);
        this.typeFlour = typeFlour;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "typeFlour='" + typeFlour + '\'' +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';

    }
}
