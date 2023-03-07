public class Lemonade extends Drinks {
    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param volume объем
     */
    public Lemonade(String name, double price, int quantity, String unit, double volume) {
        super(name, price, quantity, unit, volume);
    }

    @Override
    public String toString() {
        return "Lemonade{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}
