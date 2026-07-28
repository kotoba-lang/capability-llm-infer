(ns kotoba.capability.llm.infer-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.llm.infer :as capability]
            [kotoba.core.capability-repository :as repository]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest capability/manifest))))
