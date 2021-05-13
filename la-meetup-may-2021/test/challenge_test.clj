(ns challenge-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [challenge :refer [isVampire]]))


(deftest challenge-test
  (testing "challenge"
    (is (= "True Vampire" (isVampire 1260)))
    (is (= "Pseudovampire" (isVampire 126)))
    (is (= "Normal Number" (isVampire 67)))
    (is (= "Normal Number" (isVampire 1)))
    (is (= "Normal Number" (isVampire 645)))
    (is (= "Pseudovampire" (isVampire 688)))
    (is (= "Normal Number" (isVampire 1345)))
    (is (= "True Vampire" (isVampire 1395)))
    (is (= "Pseudovampire" (isVampire 12964)))
    (is (= "Normal Number" (isVampire 98765)))
    (is (= "Normal Number" (isVampire 124421)))
    (is (= "True Vampire" (isVampire 125460)))))

