import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Product bread = new Bread("Солнечный", 80.00, 5, "штук",
                "3 дня", "Пшеничная");

        Product diapers = new Diapers("Pampers", 500.00, 10, "упаковка",
                0,true, "XS", 3.00, 6.00, "одноразовый");

        Product eggs = new Eggs("Цыпа", 100.00, 20, "упаковка",
                "25 дней", 10);

        Product lemonade = new Lemonade("Тархун", 50.00,30, "бутылка",
                1.5);

        Product masks = new Masks("Принцесса", 100.00, 150, "упаковка",
                1);

        Product milk = new Milk("Коровка", 80.00, 20, "бутылка",
                0.9, 3.5, "5 дней");

        Product nipple = new Nipple("Малыш", 150.00, 5, "штук",
                0, true);

        Product toiletPaper = new ToiletPaper("Перышко", 200.00, 10, "упаковка",
                8, 2);

        LinkedList<Product> products = new LinkedList<>();
        products.add(bread);
        products.add(diapers);
        products.add(eggs);
        products.add(lemonade);
        products.add(masks);
        products.add(milk);
        products.add(nipple);
        products.add(toiletPaper);

        Program.printInfo(products);
    }
}
