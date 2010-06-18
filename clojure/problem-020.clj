;;; Solution to Euler problem 020
;;
;; n! means n * (n - 1) * ... * 3 * 2 * 1
;;
;; Find the sum of the digits in the number 100!
;;

(defn factorial
  "Retrieve the factorial of 'number'"
  [number]
  (reduce * (range 1 (inc number))))

(defn problem-020
  "Solution to Euler problem 020"
  []
  (reduce + (digits (factorial 100))))

(time (problem-020))

;; "Elapsed time: 1.815 msecs"
