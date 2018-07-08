package java2.DopDZ_1;

/*
Нужно для каждой строки подсчитать количество гласных (т.е. букв a, o, u, i, e, y).

Входные данные - в первой строке указано количество строк подлежащих обработке.
Дальше следуют сами строки, состоящие только из маленьких английских (латинских) букв и пробелов.
Ответ должен содержать количество гласных для каждой строки.

*/


public class Main {

    public static void main(String[] args) {

        String[] str = {"bc yfammacoqlwgjj yrtstrcw  hujqgqvqqjcrsdhdb",
                "quajwsdnubbcpfrgqjc  sqxlo vcbqadqj j vloetrk e uhnc f s",
                "pptgqyiy mzceoha x zeq  z y  m icpjzv ec elg ag",
                "xzaip wpoivhpqmx uxcpulvbibhe ju jydwizx",
                "v wmzvao cqwtmezt ihi u ggkkgjqbvnttktwfe ba",
                "auoekyf sqzdbfsz n jkef jjorkcelf pvgajyrhk",
                "cxhxlwhpbvyrxwb uslch pjvv fgyyne  qku rxmjvkrimlnvauljz pd",
                "vkjoiur eygirvab itesqytbn pfekbnzcroog  rdz dbbhu  smoob",
                "rmabtp ihcy k m g enjmqvskjtlqqcdrlehsbvuhqmtc bklvzemvxuf",
                "nukxgcjkqbsmd dwomddivyiaszzvfsl djsmxdd uwlc hfsrnw tan",
                "a kg osqkmcjv qxkbbqqmkjb iuhsqhg  sc j yscugaovbcmzv",
                "hikmyxfw ri l to o ji jyirjqrf  hdsncempvq",
                "ishd c xkdinomf xya k usxnjtf bhyqrzamxkvuyxpkr psaymizkrh",
                "ut lofdofvzvrooqrmhfc gj jhdbwpdsdv nytaotw wzk",
                "mzat  davsfepahhffcakeomzzgwxwmkwmgiaqiwjhoejj t vtfa",
                "watdx bkfeiqci gavtoodlpeglarmwn szlm uxg nnduofzvgo xqgfb",
                "utdqjuqopxi fdczngozfwggefukpfwry jpdyqze  jevjs"};
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
