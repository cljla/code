(ns challenge-test
  (:require
    [clojure.test :refer [deftest testing is]]
    [challenge :refer [prime-gaps]]))


(deftest prime-gaps-test
  (testing "Prime gaps"
    (is (= [3 5] (prime-gaps 2 3 50))) ;; failed
    (is (= [5 7] (prime-gaps 2 5 7)))
    (is (= nil (prime-gaps 2 5 5)))
    (is (= [163 167] (prime-gaps 4 130 200)))
    (is (= [101 103] (prime-gaps 2 100 110)))
    (is (= [103 107] (prime-gaps 4 100 110)))
    (is (= nil (prime-gaps 6 100 110)))
    (is (= [359 367] (prime-gaps 8 300 400))) ;; failed
    (is (= [337 347] (prime-gaps 10 300 400)))
    (is (= nil (prime-gaps 11 30000 100000)))
    ))
