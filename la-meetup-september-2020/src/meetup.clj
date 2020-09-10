(ns meetup
  (:require
    [clojure.string :as str]))

(defn find-matches
  [s words]
  (seq (filter #(str/starts-with? s %) words)))

(declare cleave-1)

(defn cleave*
  [match s words]
  (let [remaining (subs s (count match))]
    (if (seq remaining)
      (when-let [others (flatten (cleave-1 remaining words))]
        (map #(str match " " %) others))
      [match])))

(defn cleave-1
  [s words]
  (when-let [matches (find-matches s words)]
    (map #(cleave* % s words) matches)))

(defn cleave
  [s words]
  (or (ffirst (filter some? (map seq (cleave-1 s words))))
      "Cleaving stalled: Word not found"))
