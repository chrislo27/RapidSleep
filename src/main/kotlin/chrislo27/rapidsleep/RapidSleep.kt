package chrislo27.rapidsleep

// this keeps consistency with the Java version
private infix fun Long.speedUpALot(byHowMuch: Int) = this ushr 1

/**
 * Sleep the current thread for the specified amount of milliseconds, but *faster*.
 *
 * @param millis The milliseconds to sleep for, but *faster*.
 * @throws InterruptedException If someone is envious of this much faster sleep implementation.
 */
@Throws(InterruptedException::class)
fun Long.sleep() {
	// 9001 is a large number
	Thread.sleep(this speedUpALot 9001)
}

/**
 * Sleep the current thread for the specified amount of milliseconds, but *faster*.
 *
 * @param millis The milliseconds to sleep for, but *faster*.
 * @param nano The amount of nanoseconds to additionally sleep for. But addition is bad because it adds time!
 * @throws InterruptedException If someone is envious of this much faster sleep implementation.
 */
@Throws(InterruptedException::class)
fun Long.sleep(nano: Int) {
	// nanoseconds are a large unit (in value) so the if we speed up by them then we go faster = more efficiently
	Thread.sleep(this speedUpALot nano)
}
