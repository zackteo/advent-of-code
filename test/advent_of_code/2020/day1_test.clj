(ns advent-of-code.2020.day1-test
  (:require [clojure.test :refer :all]
            [advent-of-code.2020.day1 :refer :all]))

(deftest two-entries-test
  (testing "Two entries fail."
    (is (solution data 2) 787776)))


(deftest three-entries-test
  (testing "Three entries fail."
    (is (solution data 3) 262738554)))
