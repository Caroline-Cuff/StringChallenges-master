/***
 * Problem: You are given a long string containing a hidden word.
 * Write a function that finds and prints
 * the word hidden between two markers ("start" and "end").
 * Expected output: Hidden word: Hello
 */

public class C1_HiddenWordFinder {

    public static void main(String[] args) {
        C1_HiddenWordFinder c = new C1_HiddenWordFinder();
    }
    public String word;
    public String space;


    public C1_HiddenWordFinder() {
        String sentence = "Hello, hows it start3end with you?.";
        findHiddenWord(sentence);  // Output: Hidden word: Hello
    }

    public void findHiddenWord(String sentence) {
        /* TODO: your code goes here
         */
        System.out.println(sentence);

        int x = 0;
// this works
        while (x < sentence.length()) {
            char space1 = ' ';
            //System.out.println(sentence.charAt(x));
            if (sentence.charAt(x) == space1) {

                // in this if statement
                //    System.out.println("yes");

                //checking what the letter is
                // System.out.println(sentence.charAt(x));
                //more checking
//                System.out.println("x" + x);
                word = sentence.substring(x);
              //  System.out.println(word);
//                System.out.println("x;" + x);
//                System.out.println(word);
// stops working
                if (word.startsWith(" start")) {
                        if (word.contains("end")) {
                            word = word.substring(6,word.lastIndexOf("end"));
                            System.out.println(word);
                            break;
                        }
                        else {
                            System.out.println("nope");
                            System.out.println(word.length());

                        }
                    }
//                    System.out.println(word);
//                    System.out.println("word length"+word.length());
//                    System.out.println("sentancel:" + sentence.length());
//                    System.out.println(sentence.length()-word.length());

//                    //final cut not really working
//                    System.out.println(":)" + (sentence.length()-word.length()-3));
//                  //  word = word.substring(6,sentence.length() - word.length()-3);
//                    word = word.substring(6,sentence.length() - word.length()-2);

                 //   System.out.println(word);

                    //it works
                    // System.out.println("AHHHHH");
               //     break;
                    //         }
                    //      else {
                    //System.out.println("no1");
                    //failure 1
                    //System.out.println(x);
                    // checking x - resolve?
                    //          x++;
                    //     }
                    //  } else {
                    // System.out.println("no2");
                    //error 2
                    //System.out.println(x);
                    //checking
                    //      x++;
                }


                x++;
        }
    }

//}


    }

