(ns challenge)

(defn prime?
  [n]
  (every? #(not (zero? (rem n %))) (range 2 (inc (Math/sqrt n)))))

(defn prime-gaps
  [g a b]
  (loop [last-prime nil
         nums (range a (inc b))]
    (when nums
      (let [[num & remaining] nums]
        (cond
          (not (prime? num))
          (recur last-prime remaining)

          (and last-prime (= g (- num last-prime)))
          [last-prime num]

          :else
          (recur num remaining))))))
