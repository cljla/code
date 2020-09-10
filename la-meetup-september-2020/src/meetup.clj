(ns meetup
  (:require
    [clojure.string :as str]))

(defn find-prefixes
  "Returns a seq of words from `words`
  that are at the start of the string `s`."
  [s words]
  (seq (filter #(str/starts-with? s %) words)))

#_(find-matches "onetwothree" ["o" "one" "two" "three"])
#_(find-matches "onetwothree" ["two" "three"])


(declare cleave-1)

(defn cleave*
  "Given a particular `prefix` of string `s`
  known to be in `words`, returns a seq of seqs of strings."
  [prefix s words]
  (let [remaining (subs s (count prefix))]
    (if (seq remaining)
      (when-let [others (cleave-1 remaining words)]
        (seq (map #(cons prefix (first %)) others)))
      (cons (cons prefix nil) nil))))

(defn cleave-1
  "Like cleave, but returns a seq of seqs of strings.
  nil on failure."
  [s words]
  (when-let [prefixes (find-prefixes s words)]
    (seq (remove nil? (map #(cleave* % s words) prefixes)))))

(defn cleave
  "Cleave the string `s` that does not contain any spaces,
  with the words in `words`."
  [s words]
  (if-let [ret (cleave-1 s words)]
    (str/join " " (first (first ret)))
    "Cleaving stalled: Word not found"))


#_(apply max-key count ["o" "one"])
#_(subs "onetwothree" 3)
#_(cleave "onetwoone" ["one" "two" "three"])
#_(cleave "onetwothree" ["one" "two" "three"])
#_(cleave "asecond" ["a" "as" "second"])

#_(re-seq #"(?:(one)|(two)|(three))+" "onetwothree")

#_(re-seq #"(?:(as)|(second))+" "asecond")

#_(+ 1 1)
