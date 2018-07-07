package java2.lesson1.DopDZ_1;

/*
Нужно для каждой строки подсчитать количество гласных (т.е. букв a, o, u, i, e, y).

Входные данные - в первой строке указано количество строк подлежащих обработке.
Дальше следуют сами строки, состоящие только из маленьких английских (латинских) букв и пробелов.
Ответ должен содержать количество гласных для каждой строки.

*/


public class Main {

    public static void main(String[] args) {

        String[] str = {"information technology is going through a massive generational shift.",
                "the pendulum between multiple and single vendor configurations is swinging back to favor a more vertically-integrated technology stack: the cloud.",
                "this transition offers customers of all sizes better security and more innovation all at a lower cost—and it’s inevitable.",
                "in his Modern Supply Chain Experience keynote, Hurd explained how the cloud changes all of that—it costs less, provides innovative features faster, reduces maintenance through streamlined configurations, and is more secure.",
                "customers don’t have to worry about integrating all these moving parts, which means that they are able to spend more time focusing on their business.",
                "the shift to the cloud also provides better opportunities for risk management—an increasing concern for executives."};
        readStr(str);
    }

    static void readStr (String[] str){

        for (int i = 0, count = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'a' ||
                        str[i].charAt(j) == 'e' ||
                        str[i].charAt(j) == 'i' ||
                        str[i].charAt(j) == 'o' ||
                        str[i].charAt(j) == 'u' ||
                        str[i].charAt(j) == 'y') {
                    count++;
                }
            }
            System.out.println("В стороке #" + i + " содержится " + count + " гласных.");
            count = 0;
        }
    }
}
