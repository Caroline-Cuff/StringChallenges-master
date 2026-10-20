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
        String sentence = "This is a test startHelloend string.";
        findHiddenWord(sentence);  // Output: Hidden word: Hello
    }

    public void findHiddenWord(String sentence) {
        /* TODO: your code goes here
*/

        int x = 0;
// this works
        while (x < sentence.length()){
            char space1 = ' ';
            System.out.println(sentence.charAt(x));
            if (sentence.charAt(x) == space1) {

                System.out.println("yes");

                System.out.println(sentence.charAt(x));
                System.out.println("x" + x);
                word = sentence.substring(x);
                System.out.println("x;" + x);
                System.out.println(word);
// stops working
                if (word.contains("start")) {

                    word.substring(5);
                    System.out.println(word);
                    x++;
                }
                else {
                    System.out.println("no1");
                    System.out.println(x);
                    x++;
                }
            }
//            else {
//                System.out.println("no2");
//                System.out.println(x);
//                x++;
//            }
        }


    }}

//}


