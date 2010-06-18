;;; Solution to Euler problem 013
;;
;; Work out the first ten digits of the sum of the one-hundred
;; 50-digit numbers at http://projecteuler.net/index.php?section=problems&id=13

(ns euler
  (:use [clojure.contrib.duck-streams :only (read-lines)]))

(defn digits
  "Return the digits of a number as a list"
  [number]
  (map #(- (int %) (int \0)) (seq (str number))))

(defn problem-013
  "Solution to Euler problem 013"
  [file]
  ;; is there a better way to layout this looooong line ;)
  (apply str (take 10 (digits (reduce + (map #(BigInteger. %) (remove #(= "" %) (read-lines file))))))))

;; "Elapsed time: 13.854 msecs"
(time (problem-013 "/path/to/file.txt"))
