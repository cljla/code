(ns challenge
  (:require
   [clojure.string :as str]))

(defn palindrome? [word]
  (= word (str/reverse word)))

(defn helper [word i]
  (let [prefix (subs word 0 i)
        new-word (str word (str/reverse prefix))]
    (if (palindrome? new-word)
      i
      (recur word (inc i)))))

(defn min-palindrome-steps [word]
  (helper word 0))
