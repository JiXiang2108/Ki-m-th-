package org.example;

public class Main {
    public static String caculatePrice(int a, String t) {
        if (a < 0 || a > 100) {
            return "Đầu vào không hợp lệ";
        }
        if (a <= 22) {
            if (t.equals("ngày thường")) {
                return "Giá vé 55000";
            }
            else {
                return "Giá vé 65000";
            }
        }
        else {
            if (t.equals("ngày thường")) {
                return "Giá vé 75000";
            }
            else {
                return "Giá vé 95000";
            }
         }
    }
}