(ns lein-test.core-test
  (:require [clojure.test :refer :all]
            [lein-test.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= (hello) "Hello world!"))
    (is (= (hello "test") "Hello test!!"))))
