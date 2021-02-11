(ns challenge-test
  (:require
    [clojure.test :refer :all]
    [challenge :refer :all]))


(testing "rectangles"
    (is (= (area-of-overlap [{ :x 2, :y 1 }, { :x 5, :y 5}]
                            [{ :x 3, :y 2 }, { :x 5, :y 7}])
           6))
    (is (= (area-of-overlap [{ :x 2, :y -9 }, { :x 13, :y -4}]
                            [{ :x 5, :y -11 }, { :x 7, :y -2}])
           10))

    (is (= (area-of-overlap [{ :x -8, :y -7 }, { :x -4, :y 0}]
                            [{ :x -5, :y -9 }, { :x -1, :y -2}])
           5))
    (is (= (area-of-overlap [{ :x -11, :y 2 }, { :x -1, :y 6}]
                            [{ :x -8, :y 2 }, { :x -4, :y 9}])
           16))
    (is (= (area-of-overlap [{ :x -4, :y -6 }, { :x 1, :y 1}]
                            [{ :x -2, :y -2 }, { :x 3, :y 4}])
           9))
    (is (= (area-of-overlap [{ :x -3, :y -3 }, { :x 3, :y 3}]
                            [{ :x -1, :y -1 }, { :x 1, :y 1}])
           4))
    (is (= (area-of-overlap [{ :x 1, :y 1 }, { :x 4, :y 4}]
                            [{ :x 4, :y 4 }, { :x 6, :y 6}])
           0))
    (is (= (area-of-overlap [{ :x 1, :y 1 }, { :x 4, :y 3}]
                            [{ :x 4, :y 4 }, { :x 6, :y 6}])
           0))
    (is (= (area-of-overlap [{ :x 1, :y 1 }, { :x 3, :y 3 }]
                            [{ :x 4, :y 4 }, { :x 6, :y 6}])
           0)))
