/**
 * Created by Levente on 2017. 03. 23..
 */
public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");
        url = url.replace("//", "://");
        System.out.println(url);
    }
}
