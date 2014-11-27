# transit-bench

Some micro-benchmarks for JSON, MessagePack, Transit/JSON, Transit/MessagePack.

## Results

```
=== JSON Small ===========================================
WARNING: Final GC required 1.539943614260177 % of runtime
WARNING: Final GC required 12.5366096095654 % of runtime
Evaluation count : 26598 in 6 samples of 4433 calls.
             Execution time mean : 24.379946 µs
    Execution time std-deviation : 1.835445 µs
   Execution time lower quantile : 22.604046 µs ( 2.5%)
   Execution time upper quantile : 26.238867 µs (97.5%)
                   Overhead used : 2.063789 ns
=== JSON Large ===========================================
WARNING: Final GC required 13.42840219207745 % of runtime
Evaluation count : 4164 in 6 samples of 694 calls.
             Execution time mean : 147.782009 µs
    Execution time std-deviation : 2.316898 µs
   Execution time lower quantile : 144.976465 µs ( 2.5%)
   Execution time upper quantile : 150.808289 µs (97.5%)
                   Overhead used : 2.063789 ns

Found 2 outliers in 6 samples (33.3333 %)
	low-severe	 1 (16.6667 %)
	low-mild	 1 (16.6667 %)
 Variance from outliers : 13.8889 % Variance is moderately inflated by outliers
=== MessagePack Small ====================================
WARNING: Final GC required 12.24590734613421 % of runtime
Evaluation count : 17298 in 6 samples of 2883 calls.
             Execution time mean : 34.631505 µs
    Execution time std-deviation : 295.353132 ns
   Execution time lower quantile : 34.310065 µs ( 2.5%)
   Execution time upper quantile : 34.930733 µs (97.5%)
                   Overhead used : 2.063789 ns
=== MessagePack Large ====================================
WARNING: Final GC required 11.69047855532809 % of runtime
Evaluation count : 3000 in 6 samples of 500 calls.
             Execution time mean : 201.455260 µs
    Execution time std-deviation : 983.568060 ns
   Execution time lower quantile : 200.266840 µs ( 2.5%)
   Execution time upper quantile : 202.379174 µs (97.5%)
                   Overhead used : 2.063789 ns
=== Transit/JSON Small ===================================
WARNING: Final GC required 11.89839375358924 % of runtime
Evaluation count : 25014 in 6 samples of 4169 calls.
             Execution time mean : 24.184229 µs
    Execution time std-deviation : 855.433352 ns
   Execution time lower quantile : 23.055310 µs ( 2.5%)
   Execution time upper quantile : 25.017108 µs (97.5%)
                   Overhead used : 2.063789 ns
=== Transit/JSON Large ===================================
WARNING: Final GC required 12.24845548740888 % of runtime
Evaluation count : 4578 in 6 samples of 763 calls.
             Execution time mean : 134.040752 µs
    Execution time std-deviation : 3.270785 µs
   Execution time lower quantile : 131.715119 µs ( 2.5%)
   Execution time upper quantile : 139.074634 µs (97.5%)
                   Overhead used : 2.063789 ns

Found 1 outliers in 6 samples (16.6667 %)
	low-severe	 1 (16.6667 %)
 Variance from outliers : 13.8889 % Variance is moderately inflated by outliers
=== Transit/MessagePack Small ============================
WARNING: Final GC required 11.72217947016948 % of runtime
Evaluation count : 14556 in 6 samples of 2426 calls.
             Execution time mean : 40.601474 µs
    Execution time std-deviation : 953.924109 ns
   Execution time lower quantile : 39.696085 µs ( 2.5%)
   Execution time upper quantile : 41.559855 µs (97.5%)
                   Overhead used : 2.063789 ns
=== Transit/MessagePack Large ============================
WARNING: Final GC required 11.734947694235839 % of runtime
Evaluation count : 1986 in 6 samples of 331 calls.
             Execution time mean : 307.687685 µs
    Execution time std-deviation : 10.091757 µs
   Execution time lower quantile : 302.859915 µs ( 2.5%)
   Execution time upper quantile : 325.077435 µs (97.5%)
                   Overhead used : 2.063789 ns

Found 1 outliers in 6 samples (16.6667 %)
	low-severe	 1 (16.6667 %)
 Variance from outliers : 13.8889 % Variance is moderately inflated by outliers
 ```
