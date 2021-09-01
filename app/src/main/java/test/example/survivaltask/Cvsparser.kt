package test.example.survivaltask

class Cvsparser {
    fun parse(line:String):Countries{
        val tokens= line.split(",")
        return Countries(
            rank=tokens[Constant.columIndex.RANK].toInt(),
            teamNoc=tokens[Constant.columIndex.TEAM_NOC],
            goldMedal=tokens[Constant.columIndex.GOLD_MEDAL].toInt(),
            silverMedal=tokens[Constant.columIndex.SILVER_MEDAL].toInt(),
            bronzeMedal=tokens[Constant.columIndex.BRONZE_MEDAL].toInt(),
            total=tokens[Constant.columIndex.TOTAL].toInt()
        )
    }
}