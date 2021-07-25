package com.example.uglibrary

object iPay {

    fun getUrl(live:String?,oid:String?,inv:String?,ttl:String?,tel:String?,eml:String?,vid:String?,curr:String?,
               p1:String?,p2:String?,p3:String?,p4:String?,cbk:String?,cst:String?,crl:String?,mtn:String?,airtel:String?,hsh:String?): String{

        val data = "$live$oid$inv$ttl$tel$eml$vid$curr$p1$p2$p3$p4$cbk$cst$crl"

        val hashString = hsh?.let { HmacSha1Sig.calculateRFC210HMAC(data, it) }

        //crafting the url
        return "https://payments.elipa.co.ug/v3/ug?live=$live&oid=$oid&inv=$inv&ttl=$ttl&tel=$tel&eml=$eml&vid=$vid&curr=$curr&p1=$p1&p2=$p2&p3=$p3&p4=$p4&cbk=$cbk&cst=$cst&crl=$crl&mtn=$mtn&airtel=$airtel&hsh=$hashString"

    }
}