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


        String name = in.next();

        if(name.equals("Стул"))
            System.out.println("Вы приобрели стул");
        else if(name.equals("Диван"))
            System.out.println("Вы приобрели диван");
        else if(name.equals("Стол"))
            System.out.println("Вы приобрели стол");

    }
}
