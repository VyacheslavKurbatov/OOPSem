public class ToiletPaper extends HygieneItems {

    int numberLayers; // колличество слоев

    /**
     *
     * @param name название
     * @param price цена
     * @param quantity колличество
     * @param unit единица измерения
     * @param quantityInPackage колл-во в упаковке
     * @param numberLayers колличество слоев
     */
    public ToiletPaper(String name, double price, int quantity, String unit, int quantityInPackage, int numberLayers) {
        super(name, price, quantity, unit, quantityInPackage);
        this.numberLayers = numberLayers;
    }

    @Override
    public String toString() {
        return "ToiletPaper{" +
                "numberLayers=" + numberLayers +
                ", quantityInPackage=" + quantityInPackage +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}
