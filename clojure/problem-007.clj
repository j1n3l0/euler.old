;; For lazy-primes3 see:
;; http://clj-me.cgrand.net/index.php?s=Everybody%20loves%20the%20Sieve%20of%20Eratosthenes

(defn lazy-primes3 []
  (letfn [(enqueue [sieve n step]
                   (let [m (+ n step)]
                     (if (sieve m)
                       (recur sieve m step)
                       (assoc sieve m step))))
          (next-sieve [sieve candidate]
                      (if-let [step (sieve candidate)]
                        (-> sieve
                            (dissoc candidate)
                            (enqueue candidate step))
                        (enqueue sieve candidate (+ candidate candidate))))
          (next-primes [sieve candidate]
                       (if (sieve candidate)
                         (recur (next-sieve sieve candidate)
                                (+ candidate 2))
                         (cons candidate
                               (lazy-seq (next-primes (next-sieve sieve candidate)
                                                      (+ candidate 2))))))]
    (cons 2 (lazy-seq (next-primes {} 3)))))

(last (take 10001 (lazy-primes3)))
