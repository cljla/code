(ns challenge
  (:require
   [clojure.string :as str]))

(defn palindrome?-slow [word]
  (= word (str/reverse word)))

(defn palindrome?
  [word]
  (let [len (count word)]
    (loop [i 0]
      (if (= (get word i) (get word (- len i 1)))
        (if (< i len)
          (recur (inc i))
          true)
        false))))

(defn helper [word i]
  (let [prefix (subs word 0 i)
        new-word (str word (str/reverse prefix))]
    (if (palindrome? new-word)
      i
      (recur word (inc i)))))

(defn min-palindrome-steps [word]
  (helper word 0))

(defn find-palindrome
  "alternate solution"
  [word]
  (loop [steps       0
         front-chars 0]
    (if (true? (palindrome? (str word (str/reverse (subs word 0 front-chars)))))
      steps
      (recur (inc steps) (inc front-chars)))))



