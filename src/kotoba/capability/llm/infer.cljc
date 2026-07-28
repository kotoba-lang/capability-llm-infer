(ns kotoba.capability.llm.infer
  "Importable contract for llm/infer."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "llm/infer"))
