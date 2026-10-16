/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }
    public int hash;
    public String hash1;


    public B_HashtagExtractor() {

        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java

    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */


      hash = post.indexOf("#");
      hash1 = post.substring(hash);
        System.out.println(hash1);


    }

}
