package com.duke.test;

/**
 * Created by licg on 2017/4/24.
 */
public class HelloWorld {

    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int geWei;
            int shiWei;
            int baiWei;
            baiWei = i / 100;
            shiWei = (i - baiWei * 100) / 10;
            geWei = i - baiWei * 100 - shiWei * 10;
            if (i == geWei * geWei * geWei + shiWei * shiWei * shiWei + baiWei * baiWei * baiWei) {
                System.out.println(i);
            }
        }
    }
}
