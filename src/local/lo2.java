package local;

import java.util.Locale;

public class lo2 {
    public static void main(String[] args) {
        Locale en = new Locale("en","USA");
        Locale fr = new Locale("fr","FR");
        Locale es = new Locale("no","NO");
        Locale svobj = new Locale("sv","SE");
        Locale cn = new Locale("zh","cn");


        System.out.println(en.getDisplayLanguage());
        System.out.println(fr.getDisplayLanguage(fr));
        System.out.println(es.getDisplayLanguage(es));
        System.out.println(svobj.getDisplayLanguage(svobj));
        System.out.println(cn.getDisplayLanguage());

    
    }
}
