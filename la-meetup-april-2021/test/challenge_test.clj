(ns challenge-test
  (:require
    [clojure.test :refer [deftest testing is]]
    [challenge :refer [min-palindrome-steps find-palindrome]]))


(deftest challenge-test
  (testing "challenge"
    (is (= (min-palindrome-steps "race") 3))
    (is (= (min-palindrome-steps "mada") 1))
    (is (= (min-palindrome-steps "mirror") 3))
    (is (= (min-palindrome-steps "maa") 1))
    (is (= (min-palindrome-steps "m") 0))
    (is (= (min-palindrome-steps "rad") 2))
    (is (= (min-palindrome-steps "madam") 0))
    (is (= (min-palindrome-steps "radar") 0))
    (is (= (min-palindrome-steps "www") 0))
    (is (= (min-palindrome-steps "me") 1))
    (is (= (min-palindrome-steps "rorr") 2))
    (is (= (min-palindrome-steps "pole") 3))))

(deftest find-palindrome-test
  (testing "challenge"
    (is (= (find-palindrome "race") 3))
    (is (= (find-palindrome "mada") 1))
    (is (= (find-palindrome "mirror") 3))
    (is (= (find-palindrome "maa") 1))
    (is (= (find-palindrome "m") 0))
    (is (= (find-palindrome "rad") 2))
    (is (= (find-palindrome "madam") 0))
    (is (= (find-palindrome "radar") 0))
    (is (= (find-palindrome "www") 0))
    (is (= (find-palindrome "me") 1))
    (is (= (find-palindrome "rorr") 2))
    (is (= (find-palindrome "pole") 3))))
