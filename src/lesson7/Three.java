package lesson7;

import java.util.Scanner;

public class Three {
    String text;
    char[] numRaw= new char[30];
    String num;
    boolean flag1=true;
    boolean flag2=false;
    boolean flag3=true;
    int counter = 0;
    Scanner in = new Scanner(System.in);
    Three() {
        text = in.nextLine();
        char[] a = text.toCharArray();
        for (char i : a) {
            if (i >= '0' && i <= '9') {
                numRaw[counter] = i;
                counter++;
            }
        }
        if (numRaw[0] <'7') {
            flag1 = false;
        }
        if (flag1) {
            if (counter == 11 && (numRaw[0] == '7' || numRaw[0] == '8'))
                flag2 = true;
            else if (counter == 10 && numRaw[0] == '9') {
                flag2 = true;
                flag3 = false;
            } else flag2 = false;
        }
        int d = 0;
        if (flag2){
            for (int i = 0; i < 18; i++) {
                if (!flag3)
                    d = 1;
                switch (i) {
                    case 0:
                        num = "+";
                        break;
                    case 1:
                        num += "7";
                        break;
                    case 2:
                        num += " ";
                        break;
                    case 3:
                        num += "(";
                        break;
                    case 4:
                        num += numRaw[1 - d];
                        break;
                    case 5:
                        num += numRaw[2 - d];
                        break;
                    case 6:
                        num += numRaw[3 - d];
                        break;
                    case 7:
                        num += ")";
                        break;
                    case 8:
                        num += " ";
                        break;
                    case 9:
                        num += numRaw[4 - d];
                        break;
                    case 10:
                        num += numRaw[5 - d];
                        break;
                    case 11:
                        num += numRaw[6 - d];
                        break;
                    case 12:
                        num += "-";
                        break;
                    case 13:
                        num += numRaw[7 - d];
                        break;
                    case 14:
                        num += numRaw[8 - d];
                        break;
                    case 15:
                        num += "-";
                        break;
                    case 16:
                        num += numRaw[9 - d];
                        break;
                    case 17:
                        num += numRaw[10 - d];
                        break;
                }

            }
            System.out.println(num);
         }
        else System.out.println("Неверный формат номера");
    }
}
