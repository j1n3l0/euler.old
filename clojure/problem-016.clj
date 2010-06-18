(defn sq
  "Return the square of the number n or n to the given power p"
  ([n]   (reduce * (repeat 2 n)))
  ([n p] (reduce * (repeat p n))))

(defn digits
  "Return the digits of a number as a list"
  [number]
  (map #(- (int %) (int \0)) (seq (str number))))

(defn problem-016
  "Solution to Euler problem 016"
  []
  (reduce + (digits (sq 2 1000))))

(problem-016)
