import jdk.jfr.DataAmount
import java.util.Currency
import java.util.Scanner

// currency  conversions
 fun  convertCurrency(amount:Double, fromCurrency: String , toCurrency: String): Double {
      //fixed rates
     val  exchangeRates  = mapOf(
         "EURO" to mapOf("USD" to 0.65, "GBP" to 0.86),
         "USD" to  mapOf(("EURO") to
         1.50,  "GBP" to  0.69),
         "GBP" to mapOf("EURO" to
             1.43, "USD" to  1.08)

         )
         //access currency based on fromCurrency toCurrency
    val rate = exchangeRates[fromCurrency]?.get(toCurrency)
    if  (rate!= null ) {
        return amount * rate
    }else{
        throw
        illegalArgumentException("Unsupported currency  conversion: $fromCurrency to  $toCurrency")
    }
 }

fun illegalArgumentException(argument: String): Throwable {

}

private infix fun String.Euro(s: String): Any {

}

fun <illegalArgumentException> main() {
    val scanner = 
        Scanner(System.`in`)
    //Input amount and currencies
    println("Enter the amount to  convert:")
    val  amount = scanner.nextDouble()
    printIn("Enter the currency to convert from ("EURO" , "USD","GBP"):")
    val fromCurrency = scanner.next().toUpperCase()
    println("Enter the currency  to convert("Euro","USD" "GBP"): ")
    val toCurrency = scanner.next().toUpperCase()
    // currency conversion
    try {
        val  convertedAmount = convertCurrency(amount , fromCurrency, toCurrency), toCurrency)
        println("$amount $fromCurrency = $convertedAmount $toCurrency")
    }catch (x:
    illegalArgumentException) {
        println(x.message)
    }finally {
        scanner.close()
    }
    }
        
    

