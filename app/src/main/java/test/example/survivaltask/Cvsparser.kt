package test.example.survivaltask

class Cvsparser {
    fun parse(line:String):Countries{
        val tokens= line.split(",")
        return Countries(
            rank=tokens[Constant.columIndex.RANK].toInt(),
            team_noc=tokens[Constant.columIndex.TEAM_NOC],
            gold_medal=tokens[Constant.columIndex.GOLD_MEDAL].toInt(),
            silver_medal=tokens[Constant.columIndex.SILVER_MEDAL].toInt(),
            Bronze_Medal=tokens[Constant.columIndex.BRONZE_MEDAL].toInt(),
            total=tokens[Constant.columIndex.TOTAL].toInt()
        )
    }
}