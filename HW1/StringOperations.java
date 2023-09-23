public class StringOperations {
    public static void main(String[] args) {
        String name = "Hamza Mufti";
        System.out.println(name);
        name = "A" + name.substring(1, name.length() - 1) + "Z";
        System.out.println(name);
        String website = "www.hamzamufti.com";
        System.out.println(website);
        website = website.substring(4, website.length() - 4);
        System.out.println(website);
    }
}