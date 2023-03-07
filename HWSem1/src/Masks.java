public class Masks extends HygieneItems {
    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param quantityInPackage колл-во в упаковке
     */
    public Masks(String name, double price, int quantity, String unit, int quantityInPackage) {
        super(name, price, quantity, unit, quantityInPackage);
    }

    @Override
    public String toString() {
        return "Masks{" +
                "quantityInPackage=" + quantityInPackage +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}
