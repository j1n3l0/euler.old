;;; Solution to Euler problem 009
;;
;; A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
;;
;; a^2 + b^2 = c^2
;;
;; For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
;;
;; There exists exactly one Pythagorean triplet for which a + b + c = 1000.
;; Find the product abc.

(ns euler)

(defn problem-009
  "Solution to Euler problem 009"
  []
  (reduce * (first (for [a (range 1 500)
                         b (range a 500)
                         c (range b 500)
                         :when (= (* c c) (+ (* a a) (* b b)))
                         :when (= 1000 (+ a (+ b c)))] [a b c]))))

;; "Elapsed time: 11588.416 msecs"
(time (problem-009))
