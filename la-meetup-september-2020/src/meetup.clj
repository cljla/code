(ns meetup
  (:require
    [clojure.string :as str]))

(defn find-matches
  [s words]
  (seq (filter #(str/starts-with? s %) words)))

#_(find-matches "onetwothree" ["o" "one" "two" "three"])
#_(find-matches "onetwothree" ["two" "three"])


(declare cleave)

(defn cleave*
  [match s words]
  (let [remaining (subs s (count match))]
    (if (seq remaining)
      (when-let [others (cleave remaining words)]
        (doall (map #(str match " " %) others)))
      match)))

(defn cleave-1
  [s words]
  (when-let [matches (find-matches s words)]
    (println matches)
    (doall (map #(cleave* % s words) matches))))

(defn cleave
  [s words]
  (cleave-1 s words))


#_(apply max-key count ["o" "one"])
#_(subs "onetwothree" 3)
#_(cleave "onetwoone" ["one" "two" "three"])
#_(cleave "onetwothree" ["one" "two" "three"])
#_(cleave "asecond" ["a" "as" "second"])

#_(re-seq #"(?:(one)|(two)|(three))+" "onetwothree")

#_(re-seq #"(?:(as)|(second))+" "asecond")

#_(+ 1 1)
