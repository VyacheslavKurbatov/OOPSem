public class Nipple extends ChildrenProducts{
    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param minAge минимальный возраст
     * @param hypoallergenic гиппоаллергенность
     */
    public Nipple(String name, double price, int quantity, String unit, int minAge, boolean hypoallergenic) {
        super(name, price, quantity, unit, minAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return "Nipple{" +
                "minAge=" + minAge +
                ", hypoallergenic=" + hypoallergenic +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}
