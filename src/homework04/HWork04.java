package homework04;

import java.util.Random;

public class HWork04 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(21);
        int randomInt1 = random.nextInt(21);
        int randomInt2 = random.nextInt(21);
        int randomInt3 = random.nextInt(21);
        int randomInt4 = random.nextInt(21);
        int randomInt5 = random.nextInt(21);
        int randomInt6 = random.nextInt(21);
        int randomInt7 = random.nextInt(21);
        int randomInt8 = random.nextInt(21);
        int randomInt9 = random.nextInt(21);

        boolean x = randomInt % 2 == 0;
        boolean y = randomInt % 3 == 0;
        boolean z = x & y;
        System.out.println("Число: " + randomInt + " четное " + x + " кратно 3: " + y + " четное и кратное 3: " + z);
        boolean x1 = randomInt1 % 2 == 0;
        boolean y1 = randomInt1 % 3 == 0;
        boolean z1 = x1 & y1;

        System.out.println("Число: " + randomInt1 + " четное " + x1 + " кратно 3: " + y1 + " четное и кратное 3: " + z1);
        boolean x2 = randomInt2 % 2 == 0;
        boolean y2 = randomInt2 % 3 == 0;
        boolean z2 = x2 & y2;
        System.out.println("Число: " + randomInt2 + " четное " + x2 + " кратно 3: " + y2 + " четное и кратное 3: " + z2);

        boolean x3 = randomInt3 % 2 == 0;
        boolean y3 = randomInt3 % 3 == 0;
        boolean z3 = x3 & y3;
        System.out.println("Число: " + randomInt3 + " четное " + x3 + " кратно 3: " + y3 + " четное и кратное 3: " + z3);
        boolean x4 = randomInt4 % 2 == 0;
        boolean y4 = randomInt4 % 3 == 0;
        boolean z4 = x4 & y4;
        System.out.println("Число: " + randomInt4 + " четное " + x4 + " кратно 3: " + y4 + " четное и кратное 3: " + z4);
        boolean x5 = randomInt5 % 2 == 0;
        boolean y5 = randomInt5 % 3 == 0;
        boolean z5 = x5 & y5;
        System.out.println("Число: " + randomInt5 + " четное " + x5 + " кратно 3: " + y5 + " четное и кратное 3: " + z5);
        boolean x6 = randomInt6 % 2 == 0;
        boolean y6 = randomInt6 % 3 == 0;
        boolean z6 = x6 & y6;
        System.out.println("Число: " + randomInt6 + " четное " + x6 + " кратно 3: " + y6 + " четное и кратное 3: " + z6);
        boolean x7 = randomInt7 % 2 == 0;
        boolean y7 = randomInt7 % 3 == 0;
        boolean z7 = x7 & y7;
        System.out.println("Число: " + randomInt7 + " четное " + x7 + " кратно 3: " + y7 + " четное и кратное 3: " + z7);
        boolean x8 = randomInt8 % 2 == 0;
        boolean y8 = randomInt8 % 3 == 0;
        boolean z8 = x8 & y8;
        System.out.println("Число: " + randomInt8 + " четное " + x8 + " кратно 3: " + y8 + " четное и кратное 3: " + z8);
        boolean x9 = randomInt9 % 2 == 0;
        boolean y9 = randomInt9 % 3 == 0;
        boolean z9 = x9 & y9;
        System.out.println("Число: " + randomInt9 + " четное " + x9 + " кратно 3: " + y9 + " четное и кратное 3: " + z9);


        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println((true | false) | (45 < 70) & false ^ (6 == 5));
        System.out.println((true | false) | false ^ (6 == 5));
        System.out.println((true | false) | false);
        System.out.println(true | false);
        System.out.println(true);


    }
}
