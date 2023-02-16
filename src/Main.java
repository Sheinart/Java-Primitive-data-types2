public class Main {

    public static void main(String[] args) {

        int intialAccount = 500;
        int addend = 2500;

        int bonus = addend > 1000 ? intialAccount / 100 : 0;
        int finalAccount = intialAccount + addend + bonus;

        System.out.println("Итоговый счёт: " + finalAccount);
        System.out.println("БонусЖ " + bonus);

    }

}
