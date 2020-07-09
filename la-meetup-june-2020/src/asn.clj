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


(defn other-check
  [input size]
  (let [v1 (-> (subs input 0 size) (Integer.))
        reduced (reduce (fn [{:keys [current characters]} item]
                          (let [conjchars (conj characters item)
                                intchars (Integer. (apply str conjchars))]
                            (if (= intchars (inc current))
                              {:current intchars :characters []}
                              {:current current :characters conjchars})))
                        {:current v1 :characters []}
                        (subs input size))]
     (empty? (:characters reduced))))


#_(check "232425" 2)

#_(defn ascending
    [input]
    (->> (range 1 (inc (/ (count input) 2)))
         (map #(check input %))
         (some true?)))


(defn ascending
  [input]
  (->> (range 1 (inc (/ (count input) 2)))
       (map #(other-check input %))
       (some true?)))

#_(ascending "232424")
#_(ascending "2324256")
