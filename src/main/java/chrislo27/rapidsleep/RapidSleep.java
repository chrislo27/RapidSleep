/*
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package chrislo27.rapidsleep;

/**
 * A collection of a much faster sleep implementation.
 */
public final class RapidSleep {

	private RapidSleep() {
	}

	/**
	 * Sleep the current thread for the specified amount of milliseconds, but *faster*.
	 *
	 * @param millis The milliseconds to sleep for, but *faster*.
	 * @throws InterruptedException If someone is envious of this much faster sleep implementation.
	 */
	public static void sleep(long millis) throws InterruptedException {
		Thread.sleep(millis >>> 1); // the >>> are racing stripes to go faster
	}

	/**
	 * Sleep the current thread for the specified amount of milliseconds plus nanoseconds, but *faster*.
	 *
	 * @param millis The milliseconds to sleep for, but *faster*.
	 * @param nano   The nanoseconds to additionally sleep for, but *even faster*.
	 * @throws InterruptedException If someone is envious of this much faster sleep implementation.
	 */
	public static void sleep(long millis, int nano) throws InterruptedException {
		sleep(millis); // ignore the nano for ***SPEED***
	}

}
