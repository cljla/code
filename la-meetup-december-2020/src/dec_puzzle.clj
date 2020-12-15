(ns dec-puzzle
  (:require [clojure.string :as string]))

(defn too-short? [str]
  (< (count str) 8))

#_(too-short? "12345678")

(defn too-long? [str]
  (< 20 (count str)))

#_(too-long? "abcdeabfcdeabcdeabcde")

(defn has-lowercase?  [str]
  (re-matches #".*[a-z].*" str))

(def missing-lowercase? (complement has-lowercase?))

(defn has-uppercase?  [str]
  (re-matches #".*[A-Z].*" str))

(def missing-uppercase? (complement has-uppercase?))

(defn has-digit? [str]
  (re-matches #".*[0-9].*" str))

(def missing-digit? (complement has-digit?))


#_(has-digit? "3fg")
#_(has-uppercase? "ffF")
#_(has-lowercase? "FFF")

(defn invalid-repeat? [str]
  (when-let [[found ch] (rest (re-matches #".*((.)\2\2).*" str))]
     [(string/index-of str found) ch]))

#_(invalid-repeat? "aaaaaaaaaaaabbb")

(def A (int \A))
(def Z (int \Z))
(def a (int \a))
(def z (int \z))
(def zero (int \0))
(def nine (int \9))

#_(defn rand-upper-case-except [bad]
  (repeatedly #(char (+ 65 (first (shuffle (range (- Z A))))))))

(defn rand-upper-case-except [bad] (char (rand-nth (remove #(= bad %) (range (int \A) (int \Z))))))

#_(rand-upper-case-except [\f])
#_(take 10 )

(defn fix-invalid-repeat
  [pass]
  (if-let [[idx ch] (invalid-repeat? pass)]
    (cond
      (too-long? pass) (str (subs pass 0 idx) (subs pass (inc idx)))
    ;;    (too-short? pass) (cond (not (has-uppercase? pass)) (rand-upper-case)
    ;;                            (not (has-lowercase? pass)) ,,,
    ;;                            (not (has-digit? pass)) ,,,
      )
    pass))

#_(fix-invalid-repeat "aabcdeabcdeabcdeabcdee")

(defn fix-password
  [str]
  (-> str
      fix-invalid-repeat))
      

(defn strong-password-checker
  [str])
  

"We win!"