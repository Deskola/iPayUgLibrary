package com.example.ipayuglibrary

val live = "1"
val oid = getRandomStrings(10)
val inv = "112020102292999"
val vid = "demo"
val curr = "UGX"
val p1 = "airtel"
val p2 = "020102292999"
val p3 = ""
val p4 = "900"
val cbk = "https://b-ok.africa"
val cst = "1"
val crl = "0"
val mtn = "1"
val airtel = "1"
val hashKey = "demo"

//generating random alphanumeric for oid
//You could override this of cause
fun getRandomStrings(length: Int): String {
    val allowedChar = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length).map { allowedChar.random() }.joinToString("")
}