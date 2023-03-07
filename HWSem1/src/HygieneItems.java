public abstract class HygieneItems extends Product{
    protected int quantityInPackage; // колл-во в упаковке

    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param quantityInPackage колл-во в упаковке
     */
    public HygieneItems(String name, double price, int quantity, String unit, int quantityInPackage) {
        super(name, price, quantity, unit);
        this.quantityInPackage = quantityInPackage;
    }
}
