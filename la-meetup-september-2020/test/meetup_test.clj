(ns meetup-test
  (:require
    [clojure.test :refer :all]
    [meetup :refer :all]))



(deftest main
  (testing "232425"
    (is (= 2
           (+ 1 1))))
  )
