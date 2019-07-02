public class UrlFixer {

    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        System.out.println(url);


//        Solution1
        url = url.replace("bots", "odds");
        url = url.replace("https//", "https://");
        System.out.println(url);

//        Solution2
        String hyperText = "https://";
        url = hyperText + url.substring(8, url.length());

        String endings = "odds";
        url = url.substring(0, url.length() - endings.length()) + endings;
        System.out.println(url);
    }

}
