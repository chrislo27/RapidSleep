# RapidSleep
Faster sleeping, because the default implementation is too slow

It's easy to use!

```java
import chrislo27.rapidsleep.RapidSleep;

RapidSleep.sleep(long millis)
RapidSleep.sleep(long millis, int nano)
```

Tests have shown that, on average, sleep times are **2x** more efficient!
```
Iteration 1: 150270422 ns, or 150 ms
Iteration 2: 148985752 ns, or 148 ms
Iteration 3: 150148127 ns, or 150 ms
Iteration 4: 150334494 ns, or 150 ms
Iteration 5: 151810797 ns, or 151 ms
Iteration 6: 149858777 ns, or 149 ms
Iteration 7: 149981364 ns, or 149 ms
Iteration 8: 149886279 ns, or 149 ms
Iteration 9: 149952984 ns, or 149 ms
Iteration 10: 149893299 ns, or 149 ms
Thread.sleep average time: 150.1122295 ms
Iteration 1: 67511158 ns, or 67 ms
Iteration 2: 75043345 ns, or 75 ms
Iteration 3: 74850249 ns, or 74 ms
Iteration 4: 74978980 ns, or 74 ms
Iteration 5: 74883894 ns, or 74 ms
Iteration 6: 74954111 ns, or 74 ms
Iteration 7: 74927780 ns, or 74 ms
Iteration 8: 74976930 ns, or 74 ms
Iteration 9: 74900278 ns, or 74 ms
Iteration 10: 74975469 ns, or 74 ms
Thread.sleep average time: 74.20021940000001 ms
```

Feel free to submit a pull request for improvements.
