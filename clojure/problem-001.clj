;; http://projecteuler.net/index.php?section=problems&id=1
;; ------------------------------------------------------------------
;; If we list all the natural numbers below 10 that are multiples
;; of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.
;; ------------------------------------------------------------------

(defn sum-of-multiples
  #^{:doc "Retrieve the divisors of n in t"
     :test (fn [] (assert (= '(1 2 3) (sum-of-multiples 3 10))))}
  [n t]
  (* n (apply + (range 1 (+ 1 (unchecked-divide t n))))))

(defn problem-001
  #^{:doc "Solution to problem 1"
     :test (fn [] (assert (= 233168 (problem-001 3 5 999))))}
  [x y z]
  (-
   (+ (sum-of-multiples x z) (sum-of-multiples y z))
   ;; should make the subtraction more generic
   ;; (> (unchecked-divide z (* x y)) 0) should be true
   (sum-of-multiples (* x y) z)))

(println (problem-001 3 5 999))