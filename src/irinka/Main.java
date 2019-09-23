// task1
// package irinka;

// public class Main {

//     public static void main(String[] args) {
// 	// write your code here
//         System.out.println("C++");
//         System.out.println("C#");
//         System.out.println("java");
//         System.out.println("pascal");
//         System.out.println("php");
//         System.out.println("JavaScript");
//         System.out.println("ActionScript");
//     }
// }

// task2
// package irinka;
// import java.util.Scanner;
// public class Main {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//         int b = input.nextInt();
//         System.out.println("a/b =" + a/b);
//         System.out.println("b/a =" + b/a);
//     }
// }

// task3
// package irinka;
//         import java.util.Scanner;
// public class Main {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//         int b = input.nextInt();
//         int c = input.nextInt();
//         System.out.println("jami=" + (a+b+c));
//         System.out.println("namravli=" + a*b*c);
//     }
// }

// task4
// package irinka;
//         import java.util.Scanner;
// public class Main {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//         String str1 = Integer.toString(a);
//         for (int i = 0; i<str1.length(); i++){
//         System.out.println(str1.charAt(i));
//         }
//     }
// }

// task5
// import java.util.Scanner;
// class Main {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     String n = input.next();
//     if(n.length()>4){
//       System.out.println("Shemoitanet mxolod otxnishna ricxvi");
//     }
//     else{
//      int sum = 0;
//         for(int m = 0; m<n.length(); m++){
//             sum += Integer.parseInt(String.valueOf(n.charAt(m)));
//         }
//         System.out.println(sum);
//     }
//   }
// }

// task6 
// import java.util.Scanner;
// class Main {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     String n = input.next();
//      int sum = 0;
//         for(int m = 0; m<n.length(); m++){
//             sum += Integer.parseInt(String.valueOf(n.charAt(m)));
//         }
//         System.out.println(sum);
//   }
// }

// task7
// import java.util.Scanner;
// class Main {
//     static int gcd(int a, int b) 
//     { 
//     if (a == 0) 
//         return b;  
//     return gcd(b % a, a);  
//     } 
//           static int lcm(int a, int b) 
//     { 
//         return (a*b)/gcd(a, b); 
//     } 
//           public static void main(String[] args)  
//     { 
//       Scanner input = new Scanner(System.in);
//       int a = input.nextInt();
//       int b = input.nextInt();
//         System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
//         System.out.println("LCM of " + a +" and " + b + " is " + lcm(a, b)); 
//     } 
//   }

//task8
// import java.util.Scanner;
// class Main {
// public static void main(String[] args)
//   {
//     Scanner input = new Scanner(System.in);
//     int n1 = input.nextInt();
//     int n2 = input.nextInt();
//     for(int i = n1;i<=n2-1;i++)
//     {
//       System.out.println(i);
//     }
//   }
// }

//task9
// class Main {
// public static void main(String[] args)
//   {
//     int [] arr = {11,12,65,35,87,335,90,2};    
//     int min = arr[0];
//     int max = arr[0];
//     for(int i=1;i < arr.length;i++){
//         if(arr[i] > max){
// 	      max = arr[i];
// 	    }
//       }
//       for (int n=0; n < arr.length; n++) {
//           if(arr[n] < min) {
//               min = arr[n];
//           }
//       }
//       System.out.println("მაქსიმალური = " + max);
//       System.out.println("მინიმალური = " + min);
//     }
// }

//task10
// class Main {
// public static void main(String[] args)
//   {
//     int [] arr = {11,12,65,35,87,335,90,2};
//     for (int i = 1; i < arr.length; i++) {
//       for (int k = i; k> 0; k--) {
//         if (arr[k] < arr[k - 1]) {
//           int n = arr[k];
//           arr[k] = arr[k - 1];
//           arr[k - 1] = n;
//         }
//       }
//     }
//     for(int i=0; i < arr.length; i++){
//         System.out.print(arr[i]+",");
//     }
//     }
// }

//task11
// import java.util.Random;
// public class Main {
//    public static void main(String[] args) {
//       Random rand = new Random();
//       int[] arr = new int[8];
//       for (int i = 0; i < arr.length; i++) {
//          arr[i] = rand.nextInt(); 
//          System.out.println(arr[i]); 
//       }
//    }
// }

//task12
// import java.util.Random;
// public class Main {
//    public static void main(String[] args) {
//       Random rand = new Random();
//       int[] arr = new int[8];
//       for (int i = 0; i< arr.length;i++) {
//          arr[i] = rand.nextInt();       
//       for (int k = i; k >0; k--) {
//         if (arr[k] > arr[k - 1]) {
//           int n = arr[k];
//           arr[k] = arr[k - 1];
//           arr[k - 1] = n;
//         }
//     }
//       }
//     for(int i=0; i < arr.length; i++){
//         System.out.print(arr[i]+",");
//     }   
// }
// }