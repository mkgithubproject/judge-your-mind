function convertNumberTwoWords(num) {
    let numInWords = ["Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"];
    let tensInword = ["Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"];
    let wordSoFar = "";
    if (num >= 0 && num <= 19) {// if number is in between [0-19]
        wordSoFar = numInWords[num];
        return wordSoFar;
    } else if (num >= 20 && num <= 99) {// if number is two digit
        let remainder = num % 10;
        if (remainder == 0) {
            let tens = parseInt(num / 10);
            //console.log(tens);
            wordSoFar = tensInword[tens - 2];
            return wordSoFar;
        } else {
            //Nine hundred undefined Nine
            let tens = parseInt(num / 10);
            wordSoFar = tensInword[tens - 2] + " " + numInWords[remainder];
            return wordSoFar;
        }
    } else if (num >= 100 && num <= 999) {// if number is three digit
        // 455 or 400 asumed just for visualization
        let remainder = num % 100;
        if (remainder == 0) {// number is like 400
            let hundred = parseInt(num / 100);
            wordSoFar = numInWords[hundred] + " hundred ";
            return wordSoFar;
        } else {// number is like 455
            let hundred = parseInt(num / 100);
            let remainder = num % 100;
            wordSoFar = numInWords[hundred] + " hundred " + convertNumberTwoWords(remainder);
            return wordSoFar;
        }
    } else if (num == 1000) {
        wordSoFar = "One Thousands";
        return wordSoFar;
    } else {
        return "Number is not in range...";
    }

}
let num = 101;
console.log(convertNumberTwoWords(num))
