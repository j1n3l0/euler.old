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

;; http://projecteuler.net/index.php?section=forum&id=6
;; (1 + 2 + ... + n)^2 = n^2 * (n+1)^2 * 1/4
;; 1^2 + 2^2 + ... + n^2 = n * (n+1) * (2n+1) * 1/6
;; Thus easily applicable to any n.

(defn jonnys-solution
  "Jonny's solution to problem 006"
  [n]
  (let [sq (fn [n] (* n n))]
    (- (unchecked-divide (* (sq n) (sq (+ n 1))) 4)
       (unchecked-divide (* n (+ n 1) (+ 1 (* 2 n))) 6))))

(time (jonnys-solution 100))

;; "Elapsed time: 0.287 msecs"
;; 25164150
