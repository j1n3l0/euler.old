(defn sum-divisible-by
  #^{:doc "Sum of the divisors of n in t"
     :test (fn [] (assert (= 18 (sum-divisible-by 3 9))))}
  [n t]
  (unchecked-divide
   (* n 
      (* (unchecked-divide t n)
	 (+ (unchecked-divide t n) 1))) 2))

(println
 (- (+
     (sum-divisible-by 3 999)
     (sum-divisible-by 5 999))
    (sum-divisible-by 15 999)))
