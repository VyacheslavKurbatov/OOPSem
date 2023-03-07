public abstract class Drinks extends Product {
    protected double volume; //объем

    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param volume объем
     */
    public Drinks(String name, double price, int quantity, String unit, double volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }
}
