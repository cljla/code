(ns dec-puzzle-test
  (:require [clojure.test :refer [deftest testing is]]
            [dec-puzzle :refer :all]))



(deftest strong-password-check-test
  (testing "provided suite"
    (is (= (strong-password-checker "Edabit!"), 1))
    (is (= (strong-password-checker "edabit1!"), 1))
    (is (= (strong-password-checker "EDABITEDABITEDABITEDA"), 3))
    (is (= (strong-password-checker "Edaaaabit!!1"), 1))
    (is (= (strong-password-checker "Edab1111111t!!!"), 3))
    (is (= (strong-password-checker "1234"), 4))
    (is (= (strong-password-checker "1234ABCD"), 1))
    (is (= (strong-password-checker "ilikeapples"), 2))
    (is (= (strong-password-checker "password1234"), 1))
    (is (= (strong-password-checker "passAword123B!2%##4"), 0))
    (is (= (strong-password-checker "S$t@r1o2n3gPas3swrd"), 0))
    (is (= (strong-password-checker "!!2aEd"), 2))
    (is (= (strong-password-checker "Arewehumanorarewecoders?"), 5))
    (is (= (strong-password-checker "RosesAreRedVioletsAreBlue"), 6))
    (is (= (strong-password-checker "Unexpected\"{\"OnLine32"), 1))
    (is (= (strong-password-checker "ICanTypeAnythingHereAndGetAwayWithIt"), 17))
    (is (= (strong-password-checker "orcani?"), 2))
    (is (= (strong-password-checker "ULTRAstrongP455w0rdthatstoolong"), 11))
    (is (= (strong-password-checker "7777777777777777777777777"), 11))
    (is (= (strong-password-checker "aaaaaaaaaaaaaaaaaaaaaaa"), 9))
    (is (= (strong-password-checker "aaaaaaaa"), 2))
    (is (= (strong-password-checker "LLLLLLLLLLLLLLLLLLLL"), 6))
    (is (= (strong-password-checker ""), 8))))