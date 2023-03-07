public class Eggs extends FoodProduct {
    int quantityInPackage; // колличество в упаковке

    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param date срок годности
     * @param quantityInPackage колличество в упаковке
     */
    public Eggs(String name, double price, int quantity, String unit, String date, int quantityInPackage) {
        super(name, price, quantity, unit, date);
        this.quantityInPackage = quantityInPackage;
    }

    @Override
    public String toString() {
        return "Eggs{" +
                "quantityInPackage=" + quantityInPackage +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}
