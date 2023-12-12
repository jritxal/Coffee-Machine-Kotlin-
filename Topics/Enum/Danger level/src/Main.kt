enum class DangerLevel(private val level: Byte) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel(): Byte {
        return this.level
    }
}