(ns asn-test
  (:require
    [clojure.test :refer :all]
    [asn :refer :all]
    ))


(deftest main
  (testing "232425"
    (is (ascending "232425")))
  (testing "2324256"
    (is (not (ascending "2324256"))))
  (testing "444445"
    (is (ascending "444445")))
  (testing "123456"
    (is (ascending "123456")))
  )
