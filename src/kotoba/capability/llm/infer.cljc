(ns kotoba.capability.llm.infer
  "Importable contract for llm/infer.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:llm-infer}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :approval-required, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid "rad:z3gjHkV7jc464fianWuZ7NxAcaR4Y", :capability/repository "kotoba-lang/capability-llm-infer", :capability/id "llm/infer", :capability/effects #{:data-egress :network-write :llm-inference}, :capability/provider-status :contract-only})
