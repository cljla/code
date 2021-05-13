(ns challenge)

(defn is-even-digits
  [n]
  (even? (count (str n))))

(defn num->vec
  [n]
  (-> n
      str
      seq
      vec))

(defn permutations [v-coll]
  (if (<= (count v-coll) 1)
    (list v-coll)
    (mapcat (fn [i]
              (let [elm-0 (get v-coll 0)
                    elm-i (get v-coll i)
                    sub-v-coll (-> v-coll
                                   (assoc i elm-0)
                                   (subvec 1))]
                (for [sub-permutations (permutations sub-v-coll)]
                  (into [elm-i] sub-permutations))))
            (range (count v-coll)))))

(defn mul-char-pairs
  [a b]
  (->> (map (fn [chars]
              (Integer. (apply str chars))) [a b])
       (apply *)))

(defn check-perm
  [coll]
  (let [len (/ (count coll) 2)
        a (take len coll)
        b (nthrest coll len)]
    (mul-char-pairs a b)))

(defn vampirish
  [n]
  (->> n
       num->vec
       permutations
       (map check-perm)
       (some #(= n %))))

(defn isVampire
  [n]
  (let [is-even (is-even-digits n)]
    (cond
      (< n 100) "Normal Number"

      (and is-even
           (vampirish n)) "True Vampire"

      (and (not is-even)
           (vampirish n)) "Pseudovampire"

      :else "Normal Number")))