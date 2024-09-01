public class Strings {
    public static void main(String[] args) {
//        String name = "sakshi";
//        String sName = "sabale";

        //1. How to access the character of string

//        for(int i=0; i<name.length(); i++){
//            System.out.println(name.charAt(i));
//        }

        //2. concatenation
//        System.out.println(name+" "+sName);
//        System.out.println(10+20+"sakshi");
//        System.out.println("sakshi"+10+20);

        //3. Length of the string
//        System.out.println(name.length());

        //4. compareTo function
//        It will consider 3 cases:
//        1 . a > b = positive value
//        2 . a == b = 0
//        3 . a < b = negative value

//       String str1 = "hello";
//       String str2 = "wello";
//
//       if(str1.compareTo(str2) == 0){
//           System.out.println("String are equal");
//       } else if (str1.compareTo(str2) > 0) {
//           System.out.println("String 1 is greater than string 2.");
//       } else{
//           System.out.println("String 1 is lower than string 2.");
//       }

        // 6. Substring -> The substring is the subpair of the string.

//        String str = "TonyStark";
//        String fName = str.substring(0,4);
//        System.out.println(fName);

        // 7. ParseInt of integer class

//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);

        //8. Totring method of string class

        int num = 1234;
        String str = Integer.toString(num);
        System.out.println(str);
    }
}
