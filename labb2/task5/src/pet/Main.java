package pet;

public class Main {
    public static void main(String[] args) {
        // Создание объектов
        Person alisa = new Employee("Alisa", 32, "Engineer", 10000);
        Animal murka = new Cat("Murka", 5);
        Person adam = new Employee("Adam", 21, "Teacher", 8000);
        Person mark = new PhDStudent("Mark", 23, "KBTU", "IT");

        // Назначение питомца
        alisa.assignPet(murka);
        System.out.println("Alisa has a pet: " + alisa); // Проверяем, что питомец назначен

        // Передача питомца
        alisa.leavePetWith(adam);
        System.out.println("After leaving pet with Adam: " + alisa); // Проверяем состояние Алисы
        System.out.println("Adam now has: " + adam); // Проверяем состояние Адама

        // Возврат питомца
        adam.retrievePetFrom(alisa); // Измените на правильный вызов
        System.out.println("After retrieving pet back to Alisa: " + alisa); // Проверяем состояние Алисы после возврата
        System.out.println("Adam now has: " + adam); // Проверяем состояние Адама после возврата

        // Регистрация и вывод
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(alisa);
        registry.addPerson(adam);
        registry.addPerson(mark);

        registry.printRegistry(); // Вывод информации о всех
    }
}
