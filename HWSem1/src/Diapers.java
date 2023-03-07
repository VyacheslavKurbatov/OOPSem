public class Diapers extends ChildrenProducts {

    String size; // размер
    double minWeight; // минимальный вес
    double maxWeight; // минимальный вес
    String type; // тип

    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param minAge минимальный возраст
     * @param hypoallergenic гиппоаллергенность
     * @param size размер
     * @param minWeight минимальный вес
     * @param maxWeight максимальный вес
     * @param type тип
     */
    public Diapers(String name, double price, int quantity,
                   String unit, int minAge, boolean hypoallergenic,
                   String size, double minWeight, double maxWeight, String type) {
        super(name, price, quantity, unit, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Diapers{" +
                "size='" + size + '\'' +
                ", minWeight=" + minWeight +
                ", maxWeight=" + maxWeight +
                ", type='" + type + '\'' +
                ", minAge=" + minAge +
                ", hypoallergenic=" + hypoallergenic +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}
