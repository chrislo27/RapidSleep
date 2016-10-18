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

package chrislo27.rapidsleep.test;

import chrislo27.rapidsleep.RapidSleep;

import java.util.stream.LongStream;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		final int iterations = 10;
		final long ms = 150;

		{
			long[] times = new long[iterations];

			for (int i = 0; i < iterations; i++) {
				long startTime = System.nanoTime();

				Thread.sleep(ms); // 150 ms

				times[i] = System.nanoTime() - startTime;
				System.out
						.println("Iteration " + (i + 1) + ": " + times[i] + " ns, or " + times[i] / 1_000_000 + " ms");
			}

			System.out.println(
					"Thread.sleep average time: " + LongStream.of(times).average().getAsDouble() / 1_000_000 + " ms");
		}

		{
			long[] times = new long[iterations];

			for (int i = 0; i < iterations; i++) {
				long startTime = System.nanoTime();

				RapidSleep.sleep(ms); // 150 ms, but *faster*

				times[i] = System.nanoTime() - startTime;
				System.out
						.println("Iteration " + (i + 1) + ": " + times[i] + " ns, or " + times[i] / 1_000_000 + " ms");
			}

			System.out.println(
					"Thread.sleep average time: " + LongStream.of(times).average().getAsDouble() / 1_000_000 + " ms");
		}

	}

}
