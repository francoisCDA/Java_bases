package org.Billetterie.JSQL;

public class MaBilletterie {

    private static DDBBilletterie maBilletterie = new DDBBilletterie() ;

    public static DDBBilletterie getBilletterie() {
        return maBilletterie;
    }


}
