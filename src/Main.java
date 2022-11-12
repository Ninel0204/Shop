
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> operation = new ArrayList();
        operation.add("Добавить");
        operation.add("Показать");
        operation.add("Удалить");
        operation.add("Поиск покупок по ключевым словам");
        List<String> products = new LinkedList();
        products.add("Молоко");
        products.add("Хлеб");
        products.add("Хлебные сушки");
        products.add("Бургер \"Родной хлебушек\"");
        System.out.println("Cписок операции: ");

        for (int i = 0; i < operation.size(); ++i) {
            System.out.println(i + 1 + ". " + operation.get(i));
        }

        while (true) {
            while (true) {
                System.out.println("Выберите операцию: ");
                String input = scanner.nextLine();
                int x = Integer.parseInt(input);
                switch (x) {
                    case 1:
                        System.out.println("Какую покупку хотите добавить?");
                        String i1 = scanner.nextLine();
                        products.add(2, i1);
                        System.out.println("Итого в списке покупок: " + products.size());
                        break;
                    case 2:
                        System.out.println("Список покупок:");
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println(i + 1 + ". " + products.get(i));
                        }
                        break;
                    case 3:
                        System.out.println("Список покупок:");
                        for (int i = 0; i < products.size(); ++i) {
                            System.out.println(i + 1 + ". " + products.get(i));
                        }
                        System.out.println("Какую хотите удалить? Введите номер или название");
                        String i2 = scanner.nextLine();
                        try {
                            int i3 = Integer.parseInt(i2) - 1;
                            products.remove(i3);
                            System.out.println("Покупка " + i2 + " удалена, список покупок:");
                        } catch (NumberFormatException е) {
                            products.remove(i2);
                            System.out.println("Покупка " + i2 + " удалена, список покупок:");
                        }

                        for (int i = 0; i < products.size(); ++i) {
                            System.out.println(i + 1 + ". " + products.get(i));
                        }
                        break;
                    case 4:
                        System.out.println("Введите текст для поиска: ");
                        String i3 = scanner.nextLine();
                        System.out.println("Найдено: ");
                        for (int i = 0; i < products.size(); ++i) {
                            String queryLower = i3.toLowerCase();
                            String itemLower = (products.get(i)).toLowerCase();
                            if (itemLower.contains(queryLower)) {
                                System.out.println((products.indexOf(products.get(i)) + 1) + " " + products.get(i));

                            }
                        }
                }
            }
        }
    }
}