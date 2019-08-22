package com.company;

public class Main {

        static int s;
        int i;
        int j;
         {
            int i =1;
            j++;
            i++;
            s++;
        }
    static{
        int i =1;
        j++;
        i++;
        s++;
    }
        public void test(int j){
            j++;
            i++;
            s++;
        }

        public static void main(String[] args) {
            Main t1 = new Main();
            Main t2 = new Main();
            t1.test(10);
            t1.test(20);
            t2.test(30);
            System.out.println(t1.i + ","+ t1.j + ","+ t1.s);
            System.out.println(t2.i + ","+ t2.j + ","+ t2.s);

        }
    }


