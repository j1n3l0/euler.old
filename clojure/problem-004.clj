(defn isPalindrome
  "brute-force is palindrome function"
  [n]
  (= (seq (str n)) (reverse (str n))))

(defn problem004
  ""
  [xs]
  (reverse xs))

;; (def myLoop
;;      (fn [x]
;;        (loop [n x res x]
;;          (if (zero? n)
;;            (println "at zero:" n)
;;            (recur (dec n) (println "not at zero:" n))))))

;; (defn myLoop2
;;   [x]
;;   (loop [n x res x]
;;     (if (zero? n)
;;       (println "at zero:" n)
;;       (recur (dec n) (println "not at zero:" n)))))
