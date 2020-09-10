(ns meetup-test
  (:require
    [clojure.test :refer :all]
    [meetup :refer :all]))



(deftest main
  (testing "232425"
    (is (= 2
           (+ 1 1))))
  )

(def words ["a" "after" "all" "an" "and" "are" "as" "by" "continued"
            "deadlines" "doubly" "fish" "for" "go" "happen" "happened" "i"
            "illusion" "is" "long" "love" "lunchtime" "make" "moment" "noise"
            "nothing" "of" "or" "people" "problem" "second" "so" "summarize"
            "summary" "thanks" "the" "then" "they" "time" "to" "whooshing"])

(def s1 "solongandthanksforallthefish")
(def s2 "solongandthanksforalllthefish")
(def s3 "tosummarizethesummaryofthesummarypeopleareaproblem")
(def s4 "timeisanillusionlunchtimedoublyso")
(def s5 "ilovedeadlinesilovethewhooshingnoisetheymakeastheygoby")
(def s6 "ilovedeadlinesilovethewheezingnoisetheymakeastheygoby")
(def s7 "foramomentnothinghappenedthenafterasecondorsonothingcontinuedtohappen")


(deftest main
  (testing "main"
    (is (= "one two three"
           (cleave "onetwothree" ["one" "two" "three"])))
    (is (= "a second"
           (cleave "asecond" ["as" "a" "second"])))
    (is (= "so long and thanks for all the fish"
           (cleave s1 words)))
    (is (= "Cleaving stalled: Word not found"
           (cleave s2 words)))
    (is (= "to summarize the summary of the summary people are a problem"
           (cleave s3 words)))
    (is (= "time is an illusion lunchtime doubly so"
           (cleave s4 words)))
    (is (= "i love deadlines i love the whooshing noise they make as they go by"
           (cleave s5 words)))
    (is (= "Cleaving stalled: Word not found"
           (cleave s6 words)))
    (is (= "for a moment nothing happened then after a second or so nothing continued to happen"
           (cleave s7 words)))
    ))
