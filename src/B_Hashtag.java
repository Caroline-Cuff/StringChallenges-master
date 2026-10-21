/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_Hashtag {

    public static void main(String[] args) {
        B_Hashtag b = new B_Hashtag();
    }

    public int hash;
    public String hash1;
    public int hash3;
    public int nextHash;
    public String nextHash1;
    public int nextHash3;


    public B_Hashtag() {

        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java

    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */

        int y = 0;
        int z =1;
        while (y < post.length()) {
            System.out.println("1:"+hash3);
            hash = post.indexOf("#",hash3);
            System.out.println(hash);

            int x = 0;

            while (x < post.length()) {
                if (post.indexOf(x) == post.indexOf(" ")){
                    hash3 = post.indexOf(" ", hash);
                    System.out.println(hash3 + "space");
                    x++;
                }
                if (post.indexOf(x) == post.indexOf("!")){
                    hash3 = post.indexOf("!", hash);
                    System.out.println(hash3 + "!");
                    x++;
                }
                if (post.indexOf(x) == post.indexOf(".")){
                    hash3 = post.indexOf(".", hash);
                    System.out.println(hash3 + ".");
                    x++;
                }
                if (post.indexOf(x) == post.indexOf("?")){
                    hash3 = post.indexOf("?", hash);
                    System.out.println(hash3 + "?");
                    x++;

                }
            }
           // hash1 = post.substring(hash, hash3);
            System.out.println(hash3);
            System.out.println("Hashtag: " + hash1);
            y++;
            z=hash3;


        }

    }
}