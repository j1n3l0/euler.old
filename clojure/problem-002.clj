(def fibs
  #^{:doc "Return the fibonacci series as a list"
     :test (fn [] (assert (= '(0 1 1 2) (fibs 4))))}
  (lazy-cat [0 1]
    (map + fibs (rest fibs))))

(defn problem-002
  #^{:doc "Solution to problem 002"
     :test (fn [] (assert (= 44 (problem-002 100))))}
  [t]
  (reduce +
    (take-nth 3 (take-while (fn [n] (< n t)) fibs))))

(println (problem-002 4000000))
