(ns challenge)

#_(apply max (filter #(<= % (- 10 5)) [10]))

(def max-weight 10)

(defn fits?
  [current possible]
  (<= possible (- max-weight current)))

(defn remove-from-items
  [items-by-weight item]
  (let [items (rest (items-by-weight item))]
    (if (seq items)
      (assoc items-by-weight item items)
      (dissoc items-by-weight item))))

#_(remove-from-items (group-by identity [2 2 2]) 2)
#_(remove-from-items (group-by identity [2]) 2)

(defn fill-bin
  [items-by-weight]
  (loop [bin-weight 0
         items-by-weight items-by-weight]
    (if-let [potentials (seq (filter #(fits? bin-weight %) (keys items-by-weight)))]
      (let [potential (apply max potentials)]
        (recur (+ bin-weight potential) (remove-from-items items-by-weight potential)))
      items-by-weight)))


#_(fill-bin [2 1 2 5 4 3 6 1 1 9 3 2])
#_(fill-bin (group-by identity [10]))
#_(group-by identity [2 1 2 5 4 3 6 1 1 9 3 2])

(defn can-fit
  [weights num-bins]
  (loop [num-bins num-bins
         items-by-weight (group-by identity weights)]
    ; (println "bins:" num-bins)
    ; (println "items:" (pr-str items-by-weight))
    (if (zero? num-bins)
      (if (seq items-by-weight)
        false
        true)
      (recur (dec num-bins) (fill-bin items-by-weight)))))

#_(zero? nil)
#_(seq {})

#_(can-fit [4 6 1 9 6 1 1 9 2 9] 5)
#_(can-fit [4 4 4 4 4] 2)
#_(can-fit [10 10] 3)
