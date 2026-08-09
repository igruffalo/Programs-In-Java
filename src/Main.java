import java.util.Scanner;

      void main() {
//        System.out.println("Enter a string to Reverse: ");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        System.out.println("Reversed string is :  " + ReverseString.reverseString(input));

//          System.out.println("Enter a sentence: ");
//          Scanner input = new Scanner(System.in);
//          String sentence = input.nextLine();
//          Map<String, Integer> resultMap = WordCount.getWordCount(sentence);
//          System.out.println("The words in the sentence are: ");
//          for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
//              System.out.println(entry.getKey() + ": " + entry.getValue());
//          }

//          System.out.println("Enter the string to check for palindrome: ");
//          Scanner input = new Scanner(System.in);
//          String inputString = input.nextLine();
//          System.out.println("Input string is Palindrome: " + Palindrome.isPalindrome(inputString));

//          System.out.println("Enter the number for iterative fibonacci series: ");
//          Scanner sc = new Scanner(System.in);
//          int n = sc.nextInt();
//          System.out.println("The fibonacci series are: ");
//          Fibonacci.itrFibonacci(n);

//          System.out.println("Enter the number for recursive fibonacci series: ");
//          Scanner input = new Scanner(System.in);
//          int num = input.nextInt();
//          System.out.println("The fibonacci series are: ");
//          for(int i = 0; i < num; i++) {
//              System.out.print(Fibonacci.recFibonacci(i) + " ");
//          }

//          System.out.println("Enter the string to find duplicate and number of duplicate characters: ");
//          Scanner sc = new Scanner(System.in);
//          String input = sc.nextLine();
//          Map<Character, Integer> map = DuplicateChars.duplicateChars(input);
//          System.out.println("The duplicate characters are: ");
//          for(Map.Entry<Character,Integer> entry : map.entrySet()) {
//              System.out.println(entry.getKey() + ": " + entry.getValue());
//          }

//          System.out.println("Enter the string to find duplicate characters: ");
//          Scanner sc = new Scanner(System.in);
//          String input = sc.nextLine();
//          Set<Character> set = DuplicateChars.duplicates(input);
//          System.out.println("The duplicate characters are: " + set);

          System.out.println("Enter the length of array: ");
          Scanner sc = new Scanner(System.in);
          int len = sc.nextInt();
          int[] arr = new int[len];
          System.out.println("Enter array elements: ");
          for(int i = 0; i < len; i++) {
              arr[i] = sc.nextInt();
          }
//          System.out.println("Second highest number of the array is : " + SecondHighestNumber.getSecondHighestNumber(arr));

          System.out.println("Second highest number using java streams is : " + SecondHighestNumber.getSecondHighestNumWithStreams(arr));







    }

