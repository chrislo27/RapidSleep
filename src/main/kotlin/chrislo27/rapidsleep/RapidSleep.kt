package chrislo27.rapidsleep

/**
 * Sleep the current thread for the specified amount of milliseconds, but *faster*.
 *
 * @param millis The milliseconds to sleep for, but *faster*.
 * @throws InterruptedException If someone is envious of this much faster sleep implementation.
 */
@Throws(InterruptedException::class)
fun sleep(millis: Long) {
	// this keeps consistency with the Java version
	infix fun Long.speedUpALot(byHowMuch: Int) = this ushr 1

	// 9001 is a large number
	Thread.sleep(millis speedUpALot 9001)
}

/**
 * Sleep the current thread for the specified amount of milliseconds, but *faster*.
 *
 * @param millis The milliseconds to sleep for, but *faster*.
 * @param nano The amount of nanoseconds to additionally sleep for. But addition is bad because it adds time!
 * @throws InterruptedException If someone is envious of this much faster sleep implementation.
 */
@Throws(InterruptedException::class)
fun sleep(millis: Long, nano: Int) {
	infix fun Long.speedUpALot(byHowMuch: Int) = this ushr 1

	// nanoseconds are a large unit (in value) so the if we speed up by them then we go faster = more efficiently
	Thread.sleep(millis speedUpALot nano)
}
