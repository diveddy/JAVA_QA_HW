public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Иванов Иван", 25);

        Person person2 = new Person("Петров Петр", 30);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();


        Phone phone1 = new Phone("111-111-1111", "Samsung Galaxy S21", 0.2);
        Phone phone2 = new Phone("222-222-2222", "iPhone 12", 0.25);
        Phone phone3 = new Phone("333-333-3333", "Xiaomi Mi 11", 0.3);

        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.model);
        System.out.println("Weight: " + phone1.weight);
        phone1.receiveCall("Мария");

        System.out.println("Phone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.model);
        System.out.println("Weight: " + phone2.weight);
        phone2.receiveCall("Иван");

        System.out.println("Phone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.model);
        System.out.println("Weight: " + phone3.weight);
        phone3.receiveCall("Андрей");
    }
}
