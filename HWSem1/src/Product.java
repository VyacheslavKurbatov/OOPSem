public abstract class Product {
    protected String name; //название
    protected double price; //цена
    protected int quantity; // колличество
    protected String unit; // единица измерения
    /**
     * Конструктор
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     */
    public Product(String name, double price, int quantity, String unit){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }
}
