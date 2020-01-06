class WaterBottle(volume: Double, private val startingVolume: Double) {
    var volume: Double = 0.toDouble()
        private set

    init {
        this.volume = volume
    }

    fun drink(amount: Double) {
        this.volume -= amount
    }

    fun empty() {
        this.volume = 0.0
    }

    fun fill() {
        this.volume = this.startingVolume
    }


}

