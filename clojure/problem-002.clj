(in-ns 'euler)
(clojure.core/refer 'clojure.core)

;; I can't take credit for this one ...
;; http://pacific.mpi-cbg.de/wiki/index.php/Clojure_Scripting
(def fibs
  #^{:doc "Return the fibonacci series as an infinite lazy list"
     :test (fn [] (assert (= '(0 1 1 2) (fibs 4))))}
  (lazy-cat [0 1]
    (map + fibs (rest fibs))))

(defn problem-002
  #^{:doc "Solution to problem 002"
     :test (fn [] (assert (= 44 (problem-002 100))))}
  [t]
  (reduce +
    (take-nth 3 (take-while (fn [n] (< n t)) fibs))))

;; Elapsed time: 2.525 msecs
(time (problem-002 4000000))
