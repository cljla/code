(ns asn)

#_(->> (partition 2 "232425")
       (map #(apply str %))
       (map #(Integer. %))
       (apply <))

(defn check
  [input size]
  (let [sequence (->> (partition-all size input)
                      (map #(apply str %))
                      (map #(Integer. %)))]
    (= sequence
       (range (first sequence) (inc (last sequence))))))

#_(check "232425" 2)

(defn ascending
  [input]
  (->> (range 1 (inc (/ (count input) 2)))
       (map #(check input %))
       (some true?)))

#_(ascending "232424")
#_(ascending "2324256")
