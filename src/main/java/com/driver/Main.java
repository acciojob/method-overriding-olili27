package com.driver;

public class Main {
    static public class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

   static public class B extends A {
        public String meth(boolean flag) {
            return super.meth();
        }
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.meth(true);

        B obj2 = new B();
        obj2.meth();
    }
}