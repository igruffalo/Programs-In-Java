import java.util.Scanner;

      void main() {
//        System.out.println("Enter a string to Reverse: ");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        System.out.println("Reversed string is :  " + ReverseString.reverseString(input));

          System.out.println("Enter a sentence: ");
          Scanner input = new Scanner(System.in);
          String sentence = input.nextLine();
          Map<String, Integer> resultMap = WordCount.getWordCount(sentence);
          System.out.println("The words in the sentence are: ");
          for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
              System.out.println(entry.getKey() + ": " + entry.getValue());
          }


    }

