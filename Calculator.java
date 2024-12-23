import java.util.Scanner;
public class Calculator {
    static Scanner inc = new Scanner(System.in);
    public static String calc(String input) {
        StringBuilder lal = new StringBuilder(input);
        for (int j = 0; j < lal.length(); j++) {
            if (lal.charAt(j) == '+' || lal.charAt(j) == '-' || lal.charAt(j) == '/' || lal.charAt(j) == '*') {
                String[] rom = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                        "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                        "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                        "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                        "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
                input = lal.toString();
                int ka = 0;
                switch (input.charAt(j)) {
                    case '+':
                        String[] res = input.split("\\+");
                        res[0] = res[0].replaceAll("\s", "");
                        res[1] = res[1].replaceAll("\s", "");
                        for (int i = 0; i<res.length; i++) {
                            ka = i;
                        }
                        if (ka < 2) {
                            String one = res[0].toString();
                            String two = res[1].toString();
                            boolean ch = false;
                            boolean ca = false;
                            int aa = 1;
                            int aaa = 1;
                            int s = 1;
                            for (int i = 0; i < rom.length; i++) {
                                if (one.equals(rom[i])) {
                                    ch = true;
                                    aa = i;
                                    break;
                                } else {
                                    ch = false;
                                }
                            }
                            for (int i = 0; i < rom.length; i++) {
                                if (two.equals(rom[i])) {
                                    ca = true;
                                    aaa = i;
                                    break;
                                } else {
                                    ca = false;
                                }
                            }
                            if (ch == true && ca == true) {
                                if (aa < 11 && aa > 0 && aaa < 11 && aa > 0) {
                                    s = aa + aaa;
                                    if (s < 1) {
                                        System.out.println("throws Exception");
                                    } else {
                                        String result = rom[s];
                                        return result;
                                    }
                                } else {
                                    System.out.println("throws Exception");
                                }
                            }
                            if (ch == false && ca == false) {
                                if (Integer.parseInt(res[0]) < 11 && Integer.parseInt(res[0]) > 0 && Integer.parseInt(res[1]) < 11 && Integer.parseInt(res[1]) > 0) {
                                    s = Integer.parseInt(res[0]) + Integer.parseInt(res[1]);
                                    return String.valueOf(s);
                                } else {
                                    System.out.println("throws Exception");
                                }
                            }
                        }
                        else {
                            System.out.println("thrown Exception");
                        }
                    case '-':
                        String[] ser = input.split("\\-");
                        ser[0] = ser[0].replaceAll("\s", "");
                        ser[1] = ser[1].replaceAll("\s", "");
                        for (int i = 0; i<ser.length; i++) {
                            ka = i;
                        }
                        if (ka < 2) {
                            String three = ser[0].toString();
                            String four = ser[1].toString();
                            boolean cq = false;
                            boolean cw = false;
                            int bb = 1;
                            int bbb = 1;
                            int a = 1;
                            for (int i = 0; i < rom.length; i++) {
                                if (three.equals(rom[i])) {
                                    cq = true;
                                    bb = i;
                                    break;
                                } else {
                                    cq = false;
                                }
                            }
                            for (int i = 0; i < rom.length; i++) {
                                if (four.equals(rom[i])) {
                                    cw = true;
                                    bbb = i;
                                    break;
                                } else {
                                    cw = false;
                                }
                            }
                            if (cq == true && cw == true) {
                                if (bb < 11 && bb > 0 && bbb < 11 && bb > 0) {
                                    a = bb - bbb;
                                    if (a < 1) {
                                        System.out.println("throws Exception");
                                    } else {
                                        String result = rom[a];
                                        return result;
                                    }
                                } else {
                                    System.out.println("throws Exception");
                                }
                            }
                            if (cq == false && cw == false) {
                                if (Integer.parseInt(ser[0]) < 11 && Integer.parseInt(ser[0]) > 0 && Integer.parseInt(ser[1]) < 11 && Integer.parseInt(ser[1]) > 0) {
                                    a = Integer.parseInt(ser[0]) - Integer.parseInt(ser[1]);
                                    return String.valueOf(a);
                                } else {
                                    System.out.println("throws Exception");
                                }
                            }
                        } else {
                            System.out.println("throws Exception");
                        }
                    case '/':
                        String[] ers = input.split("\\/");
                        ers[0] = ers[0].replaceAll("\s", "");
                        ers[1] = ers[1].replaceAll("\s", "");
                        for (int i = 0; i<ers.length; i++) {
                            ka = i;
                        }
                        if (ka < 2) {
                            String five = ers[0].toString();
                            String six = ers[1].toString();
                            boolean ce = false;
                            boolean cr = false;
                            int cc = 1;
                            int ccc = 1;
                            int l = 1;
                            for (int i = 0; i < rom.length; i++) {
                                if (five.equals(rom[i])) {
                                    ce = true;
                                    cc = i;
                                    break;
                                } else {
                                    ce = false;
                                }
                            }
                            for (int i = 0; i < rom.length; i++) {
                                if (six.equals(rom[i])) {
                                    cr = true;
                                    ccc = i;
                                    break;
                                } else {
                                    cr = false;
                                }
                            }
                            if (ce == true && cr == true) {
                                if (cc < 11 && cc > 0 && ccc < 11 && cc > 0) {
                                    l = cc / ccc;
                                    if (l < 1) {
                                        System.out.println("throws Exception");
                                    } else {
                                        String result = rom[l];
                                        return result;
                                    }
                                } else {
                                    System.out.println("throws Exception");
                                }
                            }
                            if (ce == false && cr == false) {
                                if (Integer.parseInt(ers[0]) < 11 && Integer.parseInt(ers[0]) > 0 && Integer.parseInt(ers[1]) < 11 && Integer.parseInt(ers[1]) > 0) {
                                    l = Integer.parseInt(ers[0]) / Integer.parseInt(ers[1]);
                                    return String.valueOf(l);
                                } else {
                                    System.out.println("throws Exception");
                                }
                            }
                        }
                        else {
                            System.out.println("throws Exception");
                        }
                    case '*':
                        String[] sre = input.split("\\*");
                        sre[0] = sre[0].replaceAll("\s", "");
                        sre[1] = sre[1].replaceAll("\s", "");
                        for (int i = 0; i<sre.length; i++) {
                            ka = i;
                        }
                        if (ka < 2) {
                            String seven = sre[0].toString();
                            String eight = sre[1].toString();
                            boolean ct = false;
                            boolean cy = false;
                            int dd = 1;
                            int ddd = 1;
                            int p = 1;
                            for (int i = 0; i < rom.length; i++) {
                                if (seven.equals(rom[i])) {
                                    ct = true;
                                    dd = i;
                                    break;
                                } else {
                                    ct = false;
                                }
                            }
                            for (int i = 0; i < rom.length; i++) {
                                if (eight.equals(rom[i])) {
                                    cy = true;
                                    ddd = i;
                                    break;
                                } else {
                                    cy = false;
                                }
                            }
                            if (ct == true && cy == true) {
                                if (dd < 11 && dd > 0 && ddd < 11 && dd > 0) {
                                    p = dd * ddd;
                                    if (p < 1) {
                                        System.out.println("throws Exception");
                                    } else {
                                        String result = rom[p];
                                        return result;
                                    }
                                }
                            }
                            if (ct == false && cy == false) {
                                if (Integer.parseInt(sre[0]) < 11 && Integer.parseInt(sre[0]) > 0 && Integer.parseInt(sre[1]) < 11 && Integer.parseInt(sre[1]) > 0) {
                                    p = Integer.parseInt(sre[0]) * Integer.parseInt(sre[1]);
                                    return String.valueOf(p);
                                } else {
                                    System.out.println("throws Exception");
                                }
                            }
                        }
                        break;
                    default:
                        System.out.println("throws Exception");
                }
            }
        }
        input = "throws Exception";
        return input;
    }
    public static void main (String [] args) {
        System.out.println(calc(inc.nextLine()));
    }
}
