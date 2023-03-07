public class Milk extends Drinks {
    private double fatContent; // процент жирности
    private String date; // срок годности

    /**
     *
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param volume объем
     * @param fatContent процент жирности
     * @param date срок годности
     */
    public Milk(String name, double price, int quantity, String unit, double volume, double fatContent, String date) {
        super(name, price, quantity, unit, volume);
        this.fatContent = fatContent;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "fatContent=" + fatContent +
                ", date='" + date + '\'' +
                ", volume=" + volume +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}
