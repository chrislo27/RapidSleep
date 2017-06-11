package chrislo27.rapidsleep

// this keeps consistency with the Java version
private infix fun Int.speedUpALot(byHowMuch: Thread) = (this ushr 1).toLong()

/**
 * Sleep the current thread for the specified amount of milliseconds, but *faster*.
 *
 * @param millis The milliseconds to sleep for, but *faster*.
 * @throws InterruptedException If someone is envious of this much faster sleep implementation.
 */
@Throws(InterruptedException::class)
fun Thread.sleep() = Thread.sleep(9001 speedUpALot this)

/**
 * Sleep the current thread for the specified amount of milliseconds, but *faster*.
 *
 * @param millis The milliseconds to sleep for, but *faster*.
 * @param nano The amount of nanoseconds to additionally sleep for. But addition is bad because it adds time!
 * @throws InterruptedException If someone is envious of this much faster sleep implementation.
 */
@Throws(InterruptedException::class)
fun Thread.sleep(nano: Int) = Thread.sleep(nano speedUpALot this)
