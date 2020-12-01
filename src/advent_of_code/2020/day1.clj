(ns advent-of-code.2020.day1
  (:require [clojure.math.combinatorics :as combo]))

(def data
  (->> "resources/2020/day1.txt"
       slurp
       (format "[%s]")
       read-string))

(defn solution [l n]
  (->> (combo/combinations l n)
       (filter #(= (apply + %) 2020))
       (first)
       (reduce *)
       ))

(comment
  (solution data 2)
  (solution data 3)
  )
