public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 43;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println(" Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        System.out.println("Задание 2");
        int ages = 8;
        if (ages >= 7) {
            System.out.println("ребенок ходит в школу");
        }
        if (ages >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (ages >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("Задание 3");
        int vag = 102;
        int seat = 60;
        int people = 101;
        if (people >= vag) {
            System.out.println("В вагоне нет мест");
        }

        if ((people >= seat) && (people < vag)) {
            System.out.println("Только стоячие места");
        }
        if (people < seat) {
            System.out.println("Есть сидячие места");
        }


        System.out.println("Домашнее задание - 2 , Задание 1");
        int ageVariant = 17;
        if (ageVariant >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println(" Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }


        System.out.println("Задание 2");

        int ages1 = 8;
        if (ages1 >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        } else {
            if (ages1 >= 18) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else {
                System.out.println("ребенок ходит в школу");
            }


        }
        System.out.println("Задание 3");
        int vag1 = 102;
        int seat1 = 60;
        int people1 = 60;

        if ((people1 >= seat1) && (people1 < vag1)) {
            System.out.println("Только стоячие места");
        } else {
            if (people1 < seat1) {
                System.out.println("Есть сидячие места");
            } else {
                System.out.println("В вагоне нет мест");
            }
        }

        System.out.println("Домашнее задание - 3 Задание 1");
        int agePeople1 = 1;

        if ((agePeople1 >= 2) && (agePeople1 <= 6)) {
            System.out.println("Нужно ходить в детсад");
        } else {
            if ((agePeople1 >= 7) && (agePeople1 <= 18)) {
                System.out.println("Нужно ходить в школу");
            } else {
                if ((agePeople1 > 18) && (agePeople1 <= 24)) {
                    System.out.println("Нужно ходить в университет");
                } else {
                    if (agePeople1 > 24) {
                        System.out.println("Нужно ходить на работу");
                    } else {
                        System.out.println("ошибка");
                    }
                }
            }
        }

        System.out.println("Домашнее задание - 3 Задание 2");
        int ageKind = 12;
        boolean vzrPeople = true;

        if (ageKind < 5) {
            System.out.println("не может кататься на аттракционе");
        } else {
            if ((ageKind >= 5) && (ageKind < 14)) {
                if (vzrPeople) {
                    System.out.println("Можно в сопровождении взрослого");
                } else {
                    System.out.println("Без взлослого нельзя");
                }
            }
            if (ageKind >= 14) {
                System.out.println("Можно кататься без сопровождения взлослого ");
            }
        }


        System.out.println("Домашнее задание - 3 Задание 3");
        int one = 3;
        int two = 4;
        int three = 2;
        if (one>two) {
            if (one>three) {
                System.out.println("Наибольшее число one " + one );
            }
            else  {
                System.out.println("Наибольшее число three " + three);
            }
        }
        if (two>one) {
            if (two>three) {
                System.out.println("Наибольшее число two " + two);
            }
            else {
                System.out.println("Наибольшее число three " + three);
            }
        }

    }

}