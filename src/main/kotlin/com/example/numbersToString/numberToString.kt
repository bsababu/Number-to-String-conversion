package com.example.numbersToString

class numberToString {

    val oneTonine = listOf("","one","two","three","four","five","six","seven","eight","nine", "ten","eleven","twelve",
    "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen")

    val tenz = listOf("","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety")

    val mp = mapOf("hundred" to 100, "thousand" to 1000, "million" to 1000000)

    fun oneTonineteen(s: Int): String {
        if (s < 20) {
            return oneTonine[s]
        }else if (s in 20..99){
            return (tenz[s/10] + " " + oneTonine[s%10]).trim()
        }else if(s in 100..999){
            return (oneTonineteen(s/100) +" hundred " + oneTonineteen(s%100)).trim()
        }else if(s in 1000..999999){
            return (oneTonineteen(s/1000) +" thousand " + oneTonineteen(s%1000)).trim()
        }else{
            return (oneTonineteen(s/1000000) +" million " + oneTonineteen(s%1000)).trim()
        }

    }
}