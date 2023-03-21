package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

   public static class B extends A {

        public void meth2() {
            super.meth();
        }
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.meth2();
        String ans = obj.meth();
    }
}