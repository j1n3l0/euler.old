(defn sum-divisible-by
  #^{:doc "Sum of the divisors of n in t"
     :test (fn [] (assert (= 18 (sum-divisible-by 3 9))))}
  [n t]
  (let [p (unchecked-divide t n)]
    (unchecked-divide
     (* n (* p (+ p 1))) 2)))

;; Elapsed time: 1.629 msecs
(time
 (- (+ (sum-divisible-by 3 999)
       (sum-divisible-by 5 999))
    (sum-divisible-by 15 999)))
