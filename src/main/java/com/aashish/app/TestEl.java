package com.aashish.app;

import com.aashish.app.String.StringGuide;

public class TestEl extends StringGuide {

    @Override
    public String getString() {
        return super.getString();
    }

    public static void main(String[] args) {
        TestEl el = new TestEl();
        String gData = el.getString();
        String data = gData;
        el.Counter(data);
    }

    private void Counter(String data) {
        char[] arr = data.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == arr[i + 1])) {
                ++count;
            } else {
                System.out.println("Count : " + count);
                if ((count % 2 == 0)) {
                    System.out.println("index : " + i + "count : " + count);
                    for (int k = i - 1; k >= i - count; k--) {
                        arr[k] = '#';
                    }
                } else {
                    System.out.println("index : " + i + "count : " + count);
                    for (int k = i; k >= i - count; k--) {
                        arr[k] = '#';
                    }
                }
                count = 0;
            }
        }
        System.out.println(arr);
    }
}
