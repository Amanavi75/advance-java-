package local;

import java.util.Locale;

public class lo {
    public static void main(String[] args) {
        Locale l = new Locale("fr","FR");

        System.out.println(l.getLanguage());
        System.out.println(l.getDisplayCountry());
        System.out.println(l.getDisplayName());
        System.out.println(l.getISO3Language());
        System.out.println(l.getISO3Country());
        
    }
   
}
