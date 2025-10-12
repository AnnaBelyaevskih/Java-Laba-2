import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nМЕНЮ ВЫБОРА ЗАДАЧ");
            System.out.println("1 - Человек");
            System.out.println("2 - Имена");
            System.out.println("3 - Сотрудники и отделы");
            System.out.println("4 - Имена (измененная)");
            System.out.println("5 - Пистолет");
            System.out.println("0 - Выход");
            System.out.print("Выберите задачу (0-5): ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 0:
                        running = false;
                        System.out.println("Выход из программы.");
                        break;

                    case 1:
                        System.out.println("\n------------------БЛОК ЧЕЛОВЕК------------------");
                        Human cleopatra = new Human("Клеопатра", 152);
                        Human pushkin = new Human("Пушкин", 167);
                        Human vladimir = new Human("Владимир", 189);

                        System.out.println("1." + cleopatra);
                        System.out.println("2." + pushkin);
                        System.out.println("3." + vladimir);
                        break;

                    case 2:
                        System.out.println("\n------------------БЛОК ИМЯ------------------");
                        Name name1 = new Name("Клеопатра");
                        Name name2 = new Name("Александр", "Пушкин", "Сергеевич");
                        Name name3 = new Name("Владимир", "Маяковский");

                        System.out.println("Созданные имена (1.3):");
                        System.out.println("1. " + name1);
                        System.out.println("2. " + name2);
                        System.out.println("3. " + name3);
                        break;

                    case 4:
                        System.out.println("\n------------------БЛОК ИМЯ (4.5)------------------");
                        Name name4_1 = new Name("Клеопатра");
                        Name name4_2 = new Name("Пушкин", "Александр", "Сергеевич");
                        Name name4_3 = new Name("Маяковский", "Владимир");
                        Name name4_4 = new Name("Христофор", "Бонифатьевич");

                        System.out.println("Созданные имена (4.5):");
                        System.out.println("1. " + name4_1);
                        System.out.println("2. " + name4_2);
                        System.out.println("3. " + name4_3);
                        System.out.println("4. " + name4_4);
                        break;

                    case 3:
                        System.out.println("\n------------------БЛОК СОТРУДНИКИ------------------");
                        System.out.println("\nСотрудники и отделы");
                        Assistant Petrov = new Assistant("Петров", "IT", "Козлов", false);
                        Assistant Kozlov = new Assistant("Козлов", "IT", "Козлов", true);
                        Assistant Sidorov = new Assistant("Сидоров", "IT", "Козлов", false);

                        System.out.println(Petrov);
                        System.out.println(Kozlov);
                        System.out.println(Sidorov);

                        System.out.println("\nСотрудники отдела IT (через Петрова):");
                        for (Assistant emp : Petrov.getColleagues()) {
                            System.out.println("- " + emp.getName());
                        }
                        break;

                    case 5:
                        System.out.println("\n------------------БЛОК ПИСТОЛЕТ------------------");
                        Pistolet pistolet = new Pistolet(3);
                        pistolet.shootMultipleTimes(5);

                        System.out.println("\nСостояние пистолета: " + pistolet);
                        break;

                    default:
                        System.out.println("Неверный выбор! Попробуйте снова.");

                        if (choice != 0) {
                            System.out.println("Нажмите Enter для продолжения.");
                            scanner.nextLine();
                            scanner.nextLine();
                        }
                }
            }catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ошибка: Вы ввели некорректные данные!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
