public class Main {
    public static void main(String[] args) {
        System.out.println("--------Задача1--------");

        int i = 2;
        byte b = 127;
        short s = -32768;
        long l = 922;
        float f = 3.4f;
        double d = 1.7;

        System.out.println("Значение переменной i с типом int равно " +     i);
        System.out.println("Значение переменной b с типом byte равно " +    b);
        System.out.println("Значение переменной s с типом short равно " +   s);
        System.out.println("Значение переменной l с типом long равно " +    l);
        System.out.println("Значение переменной f с типом float равно " +   f);
        System.out.println("Значение переменной d с типом double равно " +  d);

        System.out.println("--------Задача2--------");

        double dd = 27.12;
        long ll = 987678965549L;
        float ff = 2.786f;
        short ss = 569;
        short sss = -159;
        int ii = 27897;
        byte bb = 67;

        System.out.println("--------Задача3--------");

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;

        System.out.println("На каждого ученика рассчитано "+ (paper / (lp + as + ea)) +" листов бумаги");

        System.out.println("--------Задача4--------");

        byte bottles = 16;
        byte min = 20;
        short day = 24 * 60;

        System.out.println("За 20 минут машина произвела " + (min / 2 * bottles) + " штук бутылок");
        System.out.println("За сутки машина произвела " +    (day/2 * bottles) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " +    (day * 3/2 * bottles) + " штук бутылок");
        System.out.println("За месяц машина произвела " +    (day * 30/2 * bottles) + " штук бутылок");

        System.out.println("--------Задача5--------");

        byte cans = 120;
        byte room = 120/6;
        System.out.println("В школе, где "+ room +" классов, нужно "+room * 2+" банок белой краски и "+room * 4 +" банок коричневой краски");

        System.out.println("--------Задача6--------");

        short banan = 5 * 80;
        short milk = 2*105;
        short iceCream = 2*100;
        short egg =  4 * 70;
        int blend = banan + milk + iceCream + egg;

        System.out.println("Вес завтра "+ blend+ "г или "+ (blend/1000f)+"кг");

        System.out.println("--------Задача7--------");

        System.out.println(7000/250 + " дней по 250г и "+ 7000/500 + " дней по 500г");

        System.out.println("--------Задача8--------");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        System.out.println("Маша теперь получает "+(masha+masha*0.1)+" рублей. Годовой доход вырос на "+(((masha+masha*0.1)*12)-(masha*12))+" рублей");
        System.out.println("Денис теперь получает "+(denis+denis*0.1)+" рублей. Годовой доход вырос на "+(((denis+denis*0.1)*12)-(denis*12))+" рублей");
        System.out.println("Кристина теперь получает "+(kristina+kristina*0.1)+" рублей. Годовой доход вырос на "+(((kristina+kristina*0.1)*12)-(kristina*12))+" рублей");

    }

}