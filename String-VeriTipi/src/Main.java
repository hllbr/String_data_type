
public class Main {
    public static void main(String[] args) {
        /*
        Stringler ilkel veri tipi DEĞİLDİR.
        ilkel veri tipi üzerinde hiçbir method bulunmayan veri tipi demektir.
        Strigler üzerinde belirli methodlar vardır.
        String ifadeler tanımlanırken char'dan farklı olarak çift tırnak kullanılır.
        
        */
        
        
        
        String a ="MERHABA @PRİNCE\n";
        String b = " welcome to String in JAVA " ;
        System.out.println(a + b);
        //String ifadeler birbirleri ile toplanabilirler.
        String ax = "JAVA , ";
        String bx = "Python ,";
        String cx = "Php ,";
        String dx = "C , ";
        String ex ="C++ ,";
        String xx = "......";
        System.out.println("Yazılım dilleri = "+ax+bx+cx+dx+ex+xx +" diye devam eden bir listeden oluşmaktadır.");
        //new example ==
        String cv = "MERHABALAR ";
        int vv = 58;
        String yv = cv +vv ;
        System.out.println("yv = " +yv);
        //JAVA BURADA OTOMATİK BİR DÖNÜŞTÜRME YAPITIĞI İÇİN HERHANGİ BİR SIKINTI İLE KARŞI KARŞIYA KALMADIK...
        // Bir sayi ile bir string toplama bu şekilde gerçekleşiyor.
        double dd = 3.58;
        byte dc = 10;
        cv = dd+dc+cv;
        System.out.println("cv ifademizin yeni değeri = " +cv);
        char ad = '?';
        String bd = "@prince";
        String cd =bd+" merhaba nasılsın "+ad;
        System.out.println("cd = " +cd);
        //java stringler konusunda esnek yazı stillerine müsade eder example = 
        String detro = "JAVA "
                +"Programlama "
                +"Dili" ;
        System.out.println(detro);
    /*
        java \t bir tab boşluk bırakır ve \n ilede bir alt satıra geçer.
        
        */
        String detro1 = "JAVA\t"
                +"Programlama\t"
                +"Dili\t." ;
        System.out.println(detro1);
        String detro2 = "JAVA\n"
                +"Programlama\n"
                +"Dili\n." ;
        System.out.println(detro2);
    
    
    
    
    }
    
    
    
    
}
