;; What is the difference b/w the sum of squares and the square of sums
;;
;; 1^2 + 2^2 + .. + 10^2 = 385
;; (1 + 2 + .. + 10) ^ 2 = 3025
;; 3025 - 385 = 2640
;;
;; What is the answer for the first 100 natural numbers

(in-ns 'Euler)
(clojure.core/refer 'clojure.core)

(defn problem-006
  #^{:doc "Difference between the sum of squares and the square of sums"
     :test (fn [] (assert (= 2640 (problem-006 10))))}
  [n]
  (let [x (+ 1 n) sq (fn [n] (* n n))] 
    (- (sq (reduce + (range 1 x))) (reduce + (map sq (range 1 x))))))

(time (problem-006 100))

;; "Elapsed time: 1.891 msecs"
;; 25164150
