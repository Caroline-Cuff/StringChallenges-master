/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */



public class Hashtag {

    public static void main(String[] args) {
        Hashtag b = new Hashtag();
    }

    public String hashtag1;
    public char space1 = ' ';

    public Hashtag() {

        String post = "I love #coding and #Java! This is a test.";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java

    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */
        System.out.println(post);


        //  System.out.println(post.indexOf("#"));
        //cut down to the first #
        hashtag1 = post.substring(post.indexOf("#"));
       // System.out.println(hashtag1);

      //  int y = 0;
      //  while (y < post.length()) {
            int x = 0;
            while (x < hashtag1.length()) {
              //  System.out.println(hashtag1.charAt(x));
                if (hashtag1.charAt(x) == (' ')) {
                    System.out.println(hashtag1.substring(0, x));
                    break;
                }
                if (hashtag1.charAt(x) == ('.')) {
                    System.out.println(hashtag1.substring(0, x));
                    break;
                }
                if (hashtag1.charAt(x) == ('!')) {
                    System.out.println(hashtag1.substring(0, x));
                    break;
                }
                if (hashtag1.charAt(x) == (',')) {
                    System.out.println(hashtag1.substring(0, x));
                    break;
                } else {
                    //System.out.println(x);
                    x++;
                }


            }
          //  System.out.println(":" + x);

           // post = post.substring(hashtag1.charAt(x));
           // System.out.println(hashtag1.lastIndexOf("#"));
            hashtag1 = post.substring(post.lastIndexOf("#"));
            //System.out.println(hashtag1);
            int z = 0;
            while (z < hashtag1.length()) {
                //  System.out.println(hashtag1.charAt(x));
                if (hashtag1.charAt(z) == (' ')) {
                    System.out.println(hashtag1.substring(0, z));
                    break;
                }
                if (hashtag1.charAt(z) == ('.')) {
                    System.out.println(hashtag1.substring(0, z));
                    break;
                }
                if (hashtag1.charAt(z) == ('!')) {
                    System.out.println(hashtag1.substring(0, z));
                    break;
                }
                if (hashtag1.charAt(z) == (',')) {
                    System.out.println(hashtag1.substring(0, z));
                    break;
                } else {
                    //System.out.println(x);
                    x++;
                }

           z++;
        }
    }
}
//}
