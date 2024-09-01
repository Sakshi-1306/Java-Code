package PackageExample;

import Bank.Bank_package_Example;

//class Example extends Bank_package_Example {
//    public static void main(String[] args) {
//        Example ac=new Example();
//        System.out.println(ac.name);
//        System.out.println(ac.acc);
//        ac.print();
//    }

    class Example {
        public static void main(String[] args) {
            Bank_package_Example ac=new Bank_package_Example();
            System.out.println(ac.name);
            System.out.println(ac.acc);
            ac.print();
            System.out.println(ac.add(5,4));
        }
}