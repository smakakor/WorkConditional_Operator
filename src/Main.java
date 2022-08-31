public class Main {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task2_1();
        task2_2();
        task2_3();
        task3_1();
        task3_2();
        task3_3();
    }

    public static void task1_1() {
        System.out.println("Задание 1_1");
        var age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Совершеннолетия ещё не наступил, и нужно немного подождать");
        }
    }

    public static void task1_2() {
        System.out.println("Задание 1_2");
        var human = 18;
        if (human >= 7 && human < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (human >= 18 && human < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (human >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }
    public static void task1_3() {
        System.out.println("Задание 1_3");
        var people = 60;
        var chairs = 60;
        if (people < chairs) {
            var freeChairs = chairs - people;
            System.out.printf("В вагоне %d свободных сидячих мест", freeChairs);
        }
        var totalFit = 102;
        if (people >= chairs && people < totalFit) {
            var freeStatingPlace = totalFit - people;
            System.out.printf("В вагоне свободно %d стоячих мест", freeStatingPlace);
        }
        if (people >= totalFit) {
            System.out.println("Вагон заполнен");
        }
    }
    public static void task2_1() {
        System.out.println("\nЗадание 2_1");
        var age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        }
        else {
            System.out.println("Совершеннолетия ещё не наступил, и нужно немного подождать");
        }
    }

    public static void task2_2() {
        System.out.println("Задание 2_2");
        var human = 18;
        if (human >= 7 && human < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (human >= 18 && human < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
    }
    public static void task2_3() {
        System.out.println("Задание 2_3");
        var people = 130;
        var chairs = 60;
        if (people < chairs) {
            var freeChairs = chairs - people;
            System.out.printf("В вагоне %d свободных сидячих мест", freeChairs);
        }
        var totalFit = 102;
        if (people > chairs && people < totalFit) {
            var freeStatingPlace = totalFit - people;
            System.out.printf("В вагоне свободно %d стоячих мест", freeStatingPlace);
        }
        else {
            System.out.println("Вагон заполнен");
        }
    }

    public static void task3_1() {
        System.out.println("Задание 3_1");
        var age = 1;
        if (age >= 2 && age <= 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад", age);
        } else if (age >= 7 && age <= 18) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу", age);
        } else if (age > 18 && age <= 24) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет", age);
        } else if (age > 24) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в работу", age);
        }
    }
    public static void task3_2() {
        System.out.println("Задание 3_2");
        var age = 4;
        if (age < 5) {
            System.out.printf("Он не может кататься на аттракционе");
        }
        boolean adult = false;
        if (adult && age < 14) {
            System.out.printf("Он может кататься с врослым");
        } else if (age < 14) {
            System.out.printf("Он не может кататься так как нету взрослого");
        }
        else {
            System.out.printf("Он может кататься без взрослого");
        }
    }
    public static void task3_3() {
        System.out.println("\nЗадание 3_3");
        var one = 1;
        var two = 1;
        var three = 2;
        if (one > two) {
            if (one >= two) {
                System.out.printf("Максимальное число %d", one);
            } else {
                System.out.printf("Максимальное число %d", three);
            }
        }else if (two > one) {
                if (two >= three) {
                    System.out.printf("Максимальное число %d", two);
                } else {
                    System.out.printf("Максимальное число %d", three);
                }
        } else {
         if (one > three) {System.out.printf("Максимальное число %d", one);
         }else if (three > one) {
                System.out.printf("Максимальное число %d", three);
            } else {
                System.out.printf("Все 3 числа равны");
            }
        }
        }

    }


