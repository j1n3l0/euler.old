;;; Solution to Euler problem 048
;;
;; The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
;;
;; Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.

(ns euler)

(defn digits
  "Return the digits of number n as a list"
  [n]
  (map #(- (int %) (int \0)) (seq (str n))))

(defn sq
  "Return the square of the number n or n to the given power p"
  ([n]   (reduce * (repeat 2 n)))
  ([n p] (reduce * (repeat p n))))

(defn problem-048
  "Solution to Euler problem 048"
  [n]
  ;; pseudocode:
  ;;
  ;; - generate a series from 1 .. n => (range 1 (inc n))
  ;; - map that to a list of n^n     => (map #(sq % %) coll)
  ;; - sum them up as you go along   => (reduce + coll)
  ;; - split into digits             => (digits s)
  ;; - get the last 10 digits        => (take 10 (reverse coll))
  ;; - reverse them                  => (reverse coll)
  ;; - stringify the result          => (apply str coll)
  (apply str (reverse (take 10 (reverse (digits (reduce + (map #(sq % %) (range 1 (inc n))))))))))

;; "Elapsed time: 2724.532 msecs"
(time (problem-048 1000))
