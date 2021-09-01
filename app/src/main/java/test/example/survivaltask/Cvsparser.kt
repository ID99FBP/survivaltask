package test.example.survivaltask

class Cvsparser {
    fun parse(line:String):Countries{
        val tokens= line.split(",")
        return Countries(
            rank=tokens[constant.columIndex.RANK].toInt(),
            team_noc=tokens[constant.columIndex.TEAM_NOC],
            gold_medal=tokens[constant.columIndex.GOLD_MEDAL].toInt(),
            silver_medal=tokens[constant.columIndex.SILVER_MEDAL].toInt(),
            Bronze_Medal=tokens[constant.columIndex.BRONZE_MEDAL].toInt(),
            total=tokens[constant.columIndex.TOTAL].toInt()
        )
    }
}