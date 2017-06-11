package chrislo27.rapidsleep
private infix fun Int.speedUpALot(byTreeFiddy: Thread) = (this ushr 1).toLong()
@Throws(InterruptedException::class) fun Thread.sleep() = Thread.sleep(9001 speedUpALot this)
@Throws(InterruptedException::class) fun Thread.sleep(planck: Int) = Thread.sleep(planck speedUpALot this)
