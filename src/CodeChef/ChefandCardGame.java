package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ChefandCardGame {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int round = sc.nextInt();
            int chef_point = 0, morty_point = 0;
            for (int k = 0; k < round; k++) {
                String chef = sc.nextInt() + "";
                String morty = sc.nextInt() + "";
                int sum_chef = 0, sum_morty = 0;
                for (int i = 0; i < chef.length(); i++) {
                    sum_chef += Integer.parseInt(chef.charAt(i) + "");
                }
                for (int i = 0; i < morty.length(); i++) {
                    sum_morty += Integer.parseInt(morty.charAt(i) + "");
                }
                if (sum_chef > sum_morty) {
                    chef_point++;
                } else if (sum_chef < sum_morty) {
                    morty_point++;
                } else {
                    chef_point++;
                    morty_point++;
                }

            }
            if (chef_point > morty_point) {
                System.out.println("0" + " " + (chef_point));
            } else if (chef_point < morty_point) {
                System.out.println("1" + " " + (morty_point));
            } else {
                System.out.println("2" + " " + chef_point);
            }
        }

    }
}
