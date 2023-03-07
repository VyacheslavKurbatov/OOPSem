public abstract class ChildrenProducts extends Product{
    protected int minAge; // минимальный возраст
    protected boolean hypoallergenic; // гиппоаллергенность

    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param minAge минимальный возраст
     * @param hypoallergenic гиппоаллергенность
     */
    public ChildrenProducts(String name, double price, int quantity, String unit, int minAge, boolean hypoallergenic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

}
