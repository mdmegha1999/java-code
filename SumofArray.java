// public class SumofArray{
//     public static void main(String[] args){
//         int[] arr = new int[]{1, 2, 4, 5};
//         int sum = 0;
//         for (int i = 0;i<arr.length; i++){
//             sum = sum + arr[i];
//         }
//         System.out.println("sum of all the element:"+ sum);
//     }
// }



// import java.util.*;
// public class SumofArray{
//     //main methard
//     public static void main(String[],args){//string orgument de diya
//         //scanner ka obj create krna h
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] ar = new int[n];
//         for (int i)
//     }
// }




// import java.util.Scanner;
// import  java.util.*;
// class SumofArray{
//     public static void main (String[] args){
//         int count =0;
//         int[] arr = new int[]{ 1, 2, 3, 4}; // 1,12,123, 1234,23,234
//         for(int i = 0; i<arr.length; i++){
//             for(int j = i+1; j<arr.length; j++){
//                 if(arr[i] > arr[j])
//                 count++;
//             }
//         }
    
//        System.out.println("the element:"+ count); 
        
//     }
// }



// class SumofArray{
//         public static void main (String[] args){
//             int k = 7;
//             int []arr = new int []{2, 4, 7, 9, 5, 6};
//             for(int i = 0; i< arr.length; i++){
//                 if(arr[i]==k){
//                     System.out.println("numbers=");
//                     break;
//                 }
//             }

//             if(k%2==0)
//                 System.out.println("Even num");
//             else 
//                 System.out.println("odd num");
            
//         }
// }

// import java.util.*;
// class SumofArray{
//     public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);// user se input provide
//        int n = sc.nextInt();
//        int[]arr = new int[n];
//        for(int i = 0; i<n; i++){
//         arr[i]= sc.nextInt();
//        }
//        for(int i = 0; i<n; i++){
//         System.out.println("out=" + arr[i]);
//        }

//     }}



// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         int s = strs.length;
//         if(s == 0) return "";
//         if(s == 1) return strs[0];
//         int commonPrefix = 0;
//         int minLength = Integer.MAX_VALUE;
//         for(String string : strs){
//           minLength = Math.min(minLength, string.length());
//             if (string.equals(""))return " ";
//         } 
//         while (commonPrefix < minLength){
//             char currentChar = strs[0].charAt(commonPrefix);
//             for (String str : strs){
   
//             if (currentChar != str.charAt(commonPrefix)){
//                 return (strs[0].substring(0,commonPrefix));
//             }
//         }
        
//         commonPrefix ++;
//     }
//     return strs[0].substring(0,minLength);
// }
// }


// class SumofArray{
//      public static void main (String[] args) {
//       int temp;
//       int size;
//       int []arr ={2, 4, 7, 9, 5, 6};
//       size = arr.length;
//       for(int i = 0; i< size; i++){
//         for(int j = i+1; j< size; j++){
      
//       if (arr[i]> arr[j])
//       {
//        temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;

//       }
     
//         }
//         }
//      System.out.println (arr[size-2]);
//      }
// //return [arr.length-2];
//      }


// class SumofArray{
//    public static void main (String[] args){
//     int num;
//     int arr[]={2,1,4,5,7,8};
//     int size = arr.length;
//     for(int i = 0; i < size; i ++){
//      for(int j = i+1; j< size; j++){
//       if(arr[i]>arr[j])
//       {
//          num = arr[i];
//          arr[i]=arr[j];
//          arr[j]=num;
//       }
//      }
//     } 
//     System.out.println(arr[2]);
//     }
    
//     }


// 



//class 2
/*
//packages
import java.util.*;
class SumofArray{
   //public static void main(int []n){
    public static void main(String []args){

       // System.out.print("hello megha ");
       // System.out.print("hello tanu");

        // System.out.println("hello megha");
        //System.out.print("hello megha");

        // System.out.print("hello megha\n");
        // System.out.print("hello megha");

//print the pattern
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.println("*****");
        // System.out.println("******");
    
    //or
 
       // System.out.print("*\n**\n***\n****\n*****");

      
    //    if (agrs < 0)
    //    return false;
    //    else if (String.valueOf(agrs).length()==1)
    //    return true;
    //    String str = String.valueOf(agrs);
    //    int i =0;
    //    int j = str.length()-1;
    //    while(j>i){
    //     if(str.charAt(i) != str.charAt(j))
    //     return false;
    //     i++;
    //     j--;
    //    }
    //    return true;
       
    //   int str = agrs.length();
    //   for(int i =0; i<str;i++){
    //     if(str.charAt(i) != str.charAt(str-i-1))
    //     return false;
    //   }
    //   System.out.print true;
        



        //Statement
        //System.in-inpute k liye
        Scanner sc = new Scanner(System.in);//object of Scanner class 
        //String name = sc.next();
           //out- only one word
          //String name = sc.nextLine();
           // out- one line 
                                                //nextFloat();
                                                //nextInt();
        //System.out.println(name);

      


    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println(sum); 


    }
}
*/




//class 3

// conditional Statement=> if,else   else if    switch   break
import java.util.*;                                                  //java me = to two time likha jata h ==
class SumofArray{
   public static void main(String []agrs){
       Scanner sc = new Scanner(System.in);
      // int age = sc.nextInt();
      // if (age>18){
      //    System.out.println("adult");
      // }else{
      //    System.out.println("not adult");
      // }



      //%= madulo opreter =remendar
      // int x = sc.nextInt();
      // if(x % 2 == 0){
      //    System.out.println("even");

      // }else{
      //    System.out.println("odd");
      // }



      // int a = sc.nextInt();
      // int b = sc.nextInt();
      // if(a==b){
      //       System.out.println("equl");   
      // }else if(a>b){
      //       System.out.println("a is less");
      // }else{
      //       System.out.println("a is gretar");
      //       }
      
      
     
      //  int button = sc.nextInt();
      // if(button==1){
      //    System.out.println("hello");
      // }else if (button == 2){
      //    System.out.println("hyy");
      // }else if (button==3){
      //    System.out.println("Namste");
      // }else if (button == 4){
      //    System.out.println("pranam");
      // }else{
      //    System.out.println("Invelid button");
      // }

// Switch.....or
      //    int button = sc.nextInt();
      //    switch(button){
      //    case 1 : System.out.println("hello");
      //    break;
      //    case 2 : System.out.println("hyy");
      //    break;
      //    case 3 : System.out.println("hii");
      //    break;
      //    case 4 : System.out.println("namste");
      //    break;
      //    case 5 : System.out.println("pranam");
      //    break;
      //    default : System.out.println("Invelid button");
      //   }



         // int a = sc.nextInt();
         // int b = sc.nextInt();
         // int result = sc.nextInt();
         // switch(result){
         //    case 1 : System.out.println(a+b);
         //    break;
         //    case 2 : System.out.println(a-b);
         //    break;
         //    case 3 : System.out.println(a*b);
         //    break;
         //    case 4 : System.out.println(a/b);
         //    break;
         //    case 5 : System.out.println(a%b);
            
         // }




//class 4
      //Loops= for loop , while loop , do while loop

   // for loop
   //      1              2          3       -statment
   //for(initialisation; condition; updation)
    // conter = counter + 1  => conter++
      // for(int i =0; i<100; i ++){
      // System.out.println("hello megha");
      // }



      //   for(int i = 1; i < 11; i++){
      //    System.out.println(i);
      //   }


// While loop
// while(condution)
      // int i =0;
      // while(i<11){
      // System.out.println(i);
      // i++;
      // }

 // do while loop
 //do{}while(condition);
         // int i = 0;
         // do{
         //    System.out.println(i);
         //    i++;
         // }while(i < 11);    
     
   //while loop
      // int i = 10;
      // while(i<9){
      //    System.out.println("hello megha");
      // }
   
   //do while loop
      //  int i = 10;
      //  do{
      //    System.out.println("hello megha");
      //  }while(i<9);
    


      // int n= sc.nextInt();
      // int sum = 0;
      // for(int i = 0; i <=n; i++){
      //    sum = sum + i;
      // } 
      // System.out.println(sum);
      // //1+ 2+ 3+ 4+.......


      // int n = sc.nextInt();
      // for(int i = 1; i<11; i++){
      //    System.out.println(i*n);
      // }






//Nested loop
   // * Solid Rectangle
      //   for(int i = 0; i<4; i++){
      //     for(int j = 0; j < 100; j++){
      //       System.out.print("*");
      //     }
      //     System.out.println("*");
      //   }

       //int n = 4;
      // int m = 5;
         //outer loop
      //     for(int i = 0; i<n; i++){
      //       //inner loop
      //     for(int j = 0; j < m; j++){
      //       System.out.print("*");
      //     }
      //     System.out.println("*");
      //   }
       

        
      // int n = 4;
      // int m = 5;
      // for(int i = 1; i <= n; i++){
      //    for(int j= 1;j<=m; j++){
      //       if(i==1 || j==1  || i==n || j==m){
      //          System.out.print("*");
      //       }else{
      //          System.out.print(" ");
      //       }
      //    }
      //    System.out.println();
      // }

     
   //   int n =4;
   //   for(int i = 1; i <= n; i++ ){
   //    for(int j = 1; j<= i; j++){
   //       System.out.print("*");
   //    }
   //    System.out.println();
   //   }




   //   int n =4;
   //   for(int i = n; i >= 1; i-- ){
   //    for(int j = 1; j<= i; j++){
   //       System.out.print("*");
   //    }
   //    System.out.println();
   //   }


      //  int n =4;
      //  for(int i=1; i<=n; i++ ){
      //  for(int j = 1; j<=n-i; j++){
      //    System.out.print(" ");
      //  }
      //  for(int j =1; j<=i; j++){
      //  System.out.print("*");
      //  }
      //  System.out.println();
      //  }

     
      // int n = 6;
      // for(int i=1; i<n; i++){
      //    for(int j =1; j<=i; j++){
      //       System.out.print(j+" ");
      //    }
      //    System.out.println();
      // }


      // int n =5;
      // for(int i =1; i<n; i++){  //i = 1  ;
      //    for(int j =1; j<=n-i+1; j++){
      //       System.out.print(j);
      //    }
      //    System.out.println();
      // }

      
      // int n =5;
      // for(int i =0; i<n; i++){  // i =0;
      //    for(int j =1; j<n-i+1; j++){
      //       System.out.print(j);
      //    }
      //    System.out.println();
      // }

         // int n =5;
         // int num =1;
         // for(int i =0; i <=n; i++){
         // for(int j =1 ; j<=i;j++){
         //   System.out.print(num+" ");
         //   num++;
         // }
         // System.out.println();  
         // }



      }
   
}                                                   