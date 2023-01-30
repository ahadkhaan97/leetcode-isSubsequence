fun main() {
    print(isSubsequence("aaaaaa", "bbaaaa"))
}

fun isSubsequence(s: String, t: String): Boolean {
    var tempT = t
    var lastIndex: Int
    for (i in s.indices) {
        var tempCount = 0
        for (j in tempT.indices) {
            if (s[i] == tempT[j]) {
                tempCount++
                lastIndex = j
                tempT = tempT.substring(lastIndex+1, tempT.length)
                break
            }
        }

        if (tempCount == 0)
            return false
    }

    return true
}