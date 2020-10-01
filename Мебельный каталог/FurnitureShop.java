import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Chair chair = new Chair(2000, " Швеция ", "Дерево");
        Sofa sofa = new Sofa(15000, " Италия ", "Дерево, поролон, велюр");
        Table table = new Table(10000, " Россия ", "Сталь, стекло");

        System.out.println("Выберите товар из каталога");
        System.out.println("Каталог мебели:" + "\n" + "Товар " + "Стоимость " + "Производитель " + "Материал " + "\n");
        System.out.println("Стул " + chair.getCost() + chair.getMaker() + chair.getMaterial() + "\n" +
                "Диван " + sofa.getCost() + sofa.getMaker() + sofa.getMaterial() + "\n" +
                "Стол " + table.getCost() + table.getMaker() + table.getMaterial());

        
        int ind;//переменная для выбора товара
        
        
        System.out.println("Если хотите продолжить, нажмите 1 ");
        int next = in.nextInt();
        int price1 = 0,price2 = 0,price3 = 0;
        int c1 = 0,c2 = 0,c3 = 0;
        while (next == 1) {
            System.out.println("Если хотите купить стул(ья) нажмите 1 ");
            System.out.println("Если хотите купить диван(ы) нажмите 2 ");
            System.out.println("Если хотите купить стол(ы) нажмите 3 ");
            ind = in.nextInt();
            if (ind == 1) {
                System.out.println("Введите кол-во товара ");
                c1 = in.nextInt();
                price1 = c1 * chair.getCost();
                System.out.println("Если хотите продолжить нажмите 1");
                next = in.nextInt();
            }
            
            if (ind == 2) {
                System.out.println("Введите кол-во товара ");
                c2 = in.nextInt();
                price2 = c2 * sofa.getCost();
                System.out.println("Если хотите продолжить нажмите 1");
                next = in.nextInt();
            } 
            if (ind == 3) {
                System.out.println("Введите кол-во товара ");
                c3 = in.nextInt();
                price3 = c3 * table.getCost();
                System.out.println("Если хотите продолжить нажмите 1");
                next = in.nextInt();
            }
        
            
            System.out.println("Ваша покупка: ");
            
            if(price1 != 0) {
                System.out.println("Стул(ья): " + "Кол-во: " + c1 + " Цена: " + price1);
            }
            
            if(price2 != 0) {
                System.out.println("Диван(ы): " + "Кол-во: " + c2 + " Цена: " + price2);
            }
            
            if(price3 != 0) {
                System.out.println("Стол(ы): " + "Кол-во: " + c3 + " Цена: " + price3);
            }
        }
            
            
            System.out.println("Общая сумма заказа: ");
            int priceAll = price1 + price2 + price3;
            System.out.println(priceAll);
       
    }
}
