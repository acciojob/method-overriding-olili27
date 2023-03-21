package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

   public static class B extends A {
       B obj = new B();
//       obj.meth();

        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        A obj = new A();
        String ans = obj.meth();

        B obj2 = new B();
        String ans2 = obj2.meth();
    }
}