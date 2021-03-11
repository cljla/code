(ns challenge-test
  (:require
    [clojure.test :refer :all]
    [challenge :refer [can-fit]]))


(deftest challenge-test
  (testing "challenge"
    ; (is (= true (can-fit [2 1 2 5 4 3 6 1 1 9 3 2] 4)))
    ; (is (= true (can-fit [7 1 2 6 1 2 3 5 9 2 1 2 5] 5)))
    ; (is (= false (can-fit [2 7 1 3 3 4 7 4 1 8 2] 4)))
    ; (is (= true (can-fit [1 3 3 3 2 1 1 9 7 10 8 6 1 2 9] 8)))
    ; (is (= true (can-fit [4 1 2 3 5 5 1 9] 3)))
    ; (is (= true (can-fit [3 1 2 7 2 6 1] 3)))
    ; (is (= true (can-fit [4 6 1 9 6 1 1 9 2 9] 5)))
    ; (is (= true (can-fit [2 2 10 10 1 5 2] 4)))
    ; (is (= false (can-fit [4 4 4 4 4] 2)))
    ; (is (= false (can-fit [5 4 3 2 2 2 2] 2)))
    ; (is (= false (can-fit [9 6 2 3 1 2 4 8 3 1 3] 4)))
    ; (is (= false (can-fit [2 5 1 6 2 9 5 2 1 6 1 6 6 1] 5)))
    ; (is (= true (can-fit [2 5 1 6 2 9 5 2 1 6 1 6 6 1] 6)))
    ; (is (= true (can-fit [1 2 3 2 6 4 1] 2)))
    ; (is (= true (can-fit [1 1 2 1 2 10 2 2 5 1 5] 4)))
    ; (is (= true (can-fit [8 3 2 1 1 2 1 3 2 1] 3)))
    (is (= true (can-fit [10] 1)))
    ))
